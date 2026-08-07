package com.ideaworks3d.marmalade;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

class s3eImagePicker {
      static final int S3E_IMAGEPICKER_FORMAT_ANY = 0;
      static final int S3E_IMAGEPICKER_FORMAT_JPG = 1;
      static final int S3E_IMAGEPICKER_FORMAT_PNG = 2;
      static final int S3E_IMAGEPICKER_FORMAT_BMP = 3;
      static final int S3E_IMAGEPICKER_FORMAT_GIF = 4;
      static final int S3E_IMAGEPICKER_FORMAT_ANYVIDEO = 5;
      static final int S3E_IMAGEPICKER_FORMAT_ANYIMAGE = 6;
      static final int S3E_IMAGEPICKER_FORMAT_UNKNOWN = 7;
      static final int S3E_IMAGEPICKER_ERR_NONE = 0;
      static final int S3E_IMAGEPICKER_ERR_PARAM = 1;
      static final int S3E_IMAGEPICKER_ERR_NOT_FOUND = 4;
      static final int S3E_IMAGEPICKER_ERR_UNAVAIL = 5;
      static final int S3E_IMAGEPICKER_ERR_DEVICE = 6;
      static final int S3E_IMAGEPICKER_ERR_UNSUPPORTED = 7;
      static final int S3E_IMAGEPICKER_ERR_MEM = 8;
      static final int S3E_IMAGEPICKER_ERR_ACCESS = 13;
      static final int S3E_IMAGEPICKER_ERR_CANCELLED = 1001;
      static final int S3E_IMAGEPICKER_ERR_ALREADY_IN_PROGRESS = 1002;
      static final String[] CURSOR_TYPE = new String[]{"_data", "_id"};
      private volatile boolean waitingForFile;

      public native boolean ImagePicker_addResultString(String var1);

      public int s3eImagePickerSaveToGallery(boolean var1, int var2, int var3, String var4, byte[] var5) {
            String var6 = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
            String var7 = "";
            if (var1) {
                  var4 = var4.replace("raw://", "");

                  try {
                        var7 = Media.insertImage(LoaderActivity.m_Activity.getContentResolver(), var4, var6, " ");
                  } catch (FileNotFoundException var11) {
                        String var12 = var11.toString();
                        Log.d("IMAGEPICKER", var12);
                  }

                  return var7 == null ? 6 : 0;
            } else {
                  Log.d("IMAGEPICKER", "saving to gallery from file");
                  BitmapFactory var9 = new BitmapFactory();
                  int var10 = var5.length;
                  Bitmap var8 = BitmapFactory.decodeByteArray(var5, 0, var10);
                  var7 = Media.insertImage(LoaderActivity.m_Activity.getContentResolver(), var8, var6, " ");
                  if (var7 == null) {
                        Log.d("IMAGEPICKER", "insertImage result : error not saved from buffer to galery  " + var7);
                        return 6;
                  } else {
                        Log.d("IMAGEPICKER", "insertImage result :  " + var7);
                        return 0;
                  }
            }
      }

      public String s3eImagePickerToFile(int var1, int var2) {
            Intent var3 = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
            switch(var1) {
            case 0:
                  var3 = new Intent("android.intent.action.PICK");
                  var3.setType("*/*");
                  break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                  var3.setType("image/*");
                  break;
            case 5:
                  var3 = new Intent("android.intent.action.PICK", android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                  var3.setType("video/*");
                  break;
            default:
                  return null;
            }

            Intent var4 = LoaderActivity.m_Activity.ExecuteIntent(var3);
            if (var4 == null) {
                  return null;
            } else {
                  Uri var5 = var4.getData();
                  File var6 = this.convertUriToFile(var5);
                  if (var6 == null) {
                        return null;
                  } else {
                        String var7 = "raw://" + var6.getPath();
                        return !this.ImagePicker_addResultString(var7) ? null : var7;
                  }
            }
      }

      private boolean CopyStream(InputStream var1, OutputStream var2) {
            int var4 = 0;

            try {
                  byte[] var5 = new byte[1024];

                  while(true) {
                        int var6 = var1.read(var5, 0, 1024);
                        if (var6 == -1) {
                              return var4 != 0;
                        }

                        var2.write(var5, 0, var6);
                        var4 += var6;
                  }
            } catch (Exception var7) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Exception: " + var7.getMessage());
                  return false;
            }
      }

      private File getPicasaFile(Uri var1) {
            File var2;
            if (Environment.getExternalStorageState().equals("mounted")) {
                  var2 = new File(LoaderActivity.m_Activity.getExternalCacheDir(), "Picasa");
            } else {
                  var2 = LoaderActivity.m_Activity.getCacheDir();
            }

            if (!var2.exists()) {
                  var2.mkdirs();
            }

            try {
                  File var3 = File.createTempFile("img", ".jpg", var2);
                  InputStream var4 = null;
                  if (!var1.toString().startsWith("content://com.android.gallery3d") && !var1.toString().startsWith("content://com.google.android.gallery3d")) {
                        var4 = (new URL(var1.toString())).openStream();
                  } else {
                        var4 = LoaderActivity.m_Activity.getContentResolver().openInputStream(var1);
                  }

                  FileOutputStream var5 = new FileOutputStream(var3);
                  boolean var6 = this.CopyStream(var4, var5);
                  var5.close();
                  if (!var6) {
                        var3.delete();
                        return null;
                  } else {
                        return var3;
                  }
            } catch (Exception var7) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Exception: " + var7.getMessage());
                  return null;
            }
      }

      private File convertUriToFile(final Uri var1) {
            final File[] var2 = new File[1];
            String[] var3 = new String[]{"_data", "_display_name"};
            Cursor var4 = LoaderActivity.m_Activity.getContentResolver().query(var1, var3, (String)null, (String[])null, (String)null);
            if (var4 != null) {
                  var4.moveToFirst();
                  int var5 = var4.getColumnIndex("_data");
                  if (!var1.toString().startsWith("content://com.android.gallery3d") && !var1.toString().startsWith("content://com.google.android.gallery3d")) {
                        String var6 = var4.getString(var5);
                        var4.close();
                        return new File(var6);
                  }

                  var5 = var4.getColumnIndex("_display_name");
                  if (var5 != -1) {
                        this.waitingForFile = true;
                        LoaderActivity.m_Activity.ShowProgressDialog();
                        (new Thread(new Runnable() {
                              public void run() {
                                    var2[0] = s3eImagePicker.this.getPicasaFile(var1);
                                    s3eImagePicker.this.waitingForFile = false;
                              }
                        })).start();
                  }
            } else if (var1 != null && var1.toString().length() > 0) {
                  this.waitingForFile = true;
                  LoaderActivity.m_Activity.ShowProgressDialog();
                  (new Thread(new Runnable() {
                        public void run() {
                              var2[0] = s3eImagePicker.this.getPicasaFile(var1);
                              s3eImagePicker.this.waitingForFile = false;
                        }
                  })).start();
            }

            while(this.waitingForFile) {
                  LoaderAPI.s3eDeviceYield(1);
            }

            LoaderActivity.m_Activity.HideProgressDialog();
            return var2[0];
      }

      public class ImagePickerResult {
            int format;
            String path;
            int size;
      }
}
