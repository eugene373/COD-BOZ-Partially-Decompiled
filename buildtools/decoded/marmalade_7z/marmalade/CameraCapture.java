package com.ideaworks3d.marmalade;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Bitmap.CompressFormat;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class CameraCapture {
      private static int s_Images = 0;
      private static int s_Videos = 0;
      private static volatile boolean m_WaitingForFile;
      static final int S3E_CAMERACAPTURE_JPG = 1;
      static final int S3E_CAMERACAPTURE_PNG = 2;
      static final int S3E_CAMERACAPTURE_BMP = 3;
      static final int S3E_CAMERACAPTURE_VIDEO = 4;

      private int CheckCamera() {
            Camera var1 = Camera.open(0);
            if (var1 == null) {
                  return 0;
            } else {
                  var1.release();
                  return 1;
            }
      }

      public int s3eCameraCaptureIsFormatSupported(int var1) {
            if (1 != var1 && 4 != var1) {
                  return 0;
            } else {
                  try {
                        return this.CheckCamera();
                  } catch (RuntimeException var3) {
                        return 0;
                  }
            }
      }

      public String s3eCameraCaptureToFile(int var1) {
            File var2 = null;
            if (var1 == 4) {
                  var2 = this.startCaptureVideo();
            } else if (var1 == 1) {
                  var2 = this.startCaptureImage();
            }

            return var2 == null ? null : "raw://" + var2.getPath();
      }

      private File startCaptureVideo() {
            Intent var1 = new Intent("android.media.action.VIDEO_CAPTURE");
            var1.putExtra("android.intent.extra.videoQuality", 1);
            Intent var2 = LoaderActivity.m_Activity.ExecuteIntent(var1);
            if (var2 != null && var2.getData() != null) {
                  String[] var3 = new String[]{"_data", "_id"};
                  return convertUriToFile(var2.getData(), var3);
            } else {
                  return null;
            }
      }

      private File startCaptureImage() {
            ContentValues var2 = new ContentValues();
            Intent var3 = new Intent("android.media.action.IMAGE_CAPTURE");
            var2.put("title", "New image " + s_Videos++);
            var2.put("description", "Image captured by s3eCamera");

            Uri var1;
            File var5;
            try {
                  var1 = LoaderActivity.m_Activity.getContentResolver().insert(Media.EXTERNAL_CONTENT_URI, var2);
            } catch (UnsupportedOperationException var6) {
                  var5 = new File(String.format("%s/image%d", Environment.getExternalStorageDirectory().getPath(), s_Images++));
                  var1 = Uri.fromFile(var5);
            }

            var3.putExtra("output", var1);
            var3.putExtra("android.intent.extra.videoQuality", 1);
            LoaderAPI.trace("Executing Camera Capture intent");
            if (LoaderActivity.m_Activity.ExecuteIntent(var3) == null) {
                  LoaderAPI.trace("Activity returned null, assuming cancelled");
                  LoaderActivity.m_Activity.getApplicationContext().getContentResolver().delete(var1, (String)null, (String[])null);
                  return null;
            } else {
                  LoaderAPI.trace("Retrieving image url");
                  String[] var4 = new String[]{"_data", "_id"};
                  var5 = convertUriToFile(var1, var4);
                  fixRotatedJpegIssue(var5.getAbsolutePath());
                  return var5;
            }
      }

      public static File convertUriToFile(Uri var0, String[] var1) {
            final File[] var2 = new File[1];
            m_WaitingForFile = true;
            LoaderActivity.m_Activity.getCursor(var0, var1, new LoaderActivity.CursorCompleteListener() {
                  public void cursorLoadComplete(Cursor var1) {
                        try {
                              int var2x = var1.getColumnIndexOrThrow("_data");
                              if (var1.moveToFirst()) {
                                    var2[0] = new File(var1.getString(var2x));
                              }
                        } catch (RuntimeException var6) {
                              LoaderAPI.trace("Exception in convertUriToFile: " + var6 + " " + var6.getMessage());
                        } finally {
                              if (var1 != null) {
                                    var1.close();
                              }

                              LoaderAPI.trace("Finished waiting for file cursor");
                              CameraCapture.m_WaitingForFile = false;
                        }

                  }
            });

            while(m_WaitingForFile) {
                  LoaderAPI.s3eDeviceYield(1);
            }

            return var2[0];
      }

      private static void fixRotatedJpegIssue(String var0) {
            int var1 = getImageOrientation(var0);
            if (var1 != 0) {
                  Matrix var2 = new Matrix();
                  var2.postRotate((float)var1);
                  Bitmap var3 = BitmapFactory.decodeFile(var0);
                  Bitmap var4 = Bitmap.createBitmap(var3, 0, 0, var3.getWidth(), var3.getHeight(), var2, true);

                  try {
                        FileOutputStream var6 = new FileOutputStream(var0);
                        var4.compress(CompressFormat.JPEG, 90, var6);
                        var6.close();
                  } catch (Exception var7) {
                        var7.printStackTrace();
                  }

            }
      }

      private static int getImageOrientation(String var0) {
            short var1 = 0;

            try {
                  ExifInterface var2 = new ExifInterface(var0);
                  int var3 = var2.getAttributeInt("Orientation", 1);
                  switch(var3) {
                  case 3:
                        var1 = 180;
                        break;
                  case 6:
                        var1 = 90;
                        break;
                  case 8:
                        var1 = 270;
                  }
            } catch (IOException var4) {
                  var4.printStackTrace();
            }

            return var1;
      }

      private static void PrintCameraCharacteristics() {
            if (VERSION.SDK_INT >= 21) {
                  Context var0 = LoaderAPI.getActivity().getApplicationContext();
                  CameraManager var1 = (CameraManager)var0.getSystemService("camera");

                  try {
                        String[] var2 = var1.getCameraIdList();
                        String[] var3 = var2;
                        int var4 = var2.length;

                        for(int var5 = 0; var5 < var4; ++var5) {
                              String var6 = var3[var5];
                              CameraCharacteristics var7 = var1.getCameraCharacteristics(var6);
                              int var8 = (Integer)var7.get(CameraCharacteristics.SENSOR_ORIENTATION);
                              LoaderAPI.trace(String.format("Camera %s orientation = %d", var6, var8));
                        }
                  } catch (CameraAccessException var9) {
                        var9.printStackTrace();
                  }
            }

      }
}
