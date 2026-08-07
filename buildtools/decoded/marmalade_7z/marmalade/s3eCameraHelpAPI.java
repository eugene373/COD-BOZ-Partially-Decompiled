package com.ideaworks3d.marmalade;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class s3eCameraHelpAPI {
      static final int S3E_CAMERA_ERR_NONE = 0;
      static final int S3E_CAMERA_ERR_MEM = 8;
      static final int S3E_CAMERA_ERR_OPEN_FILE = 9;
      static final int S3E_CAMERA_ERR_IO = 10;
      static final int S3E_CAMERA_ERR_UNKNOWN = 11;
      static final int S3E_CAMERA_ERR_OPERATION_NA = 12;
      static final int S3E_CAMERA_SAVE_PATH_USER = 0;
      static final int S3E_CAMERA_SAVE_PATH_GALLERY = 1;
      static final int S3E_CAMERA_SAVE_PATH_CAMERA = 2;
      static final int S3E_CAMERA_SAVE_PATH_GALLERY_AND_CAMERA = 3;
      public static String TAG = "s3eCameraHelpAPI";

      private static byte[] SaveToFile_internal(String var0, byte[] var1, AtomicInteger var2) {
            byte[] var3 = null;
            File var4 = new File(var0);
            if (var4 == null) {
                  Log.d(TAG, "onPictureTaken: can not allocate memory for file.");
                  var2.set(8);
            } else {
                  try {
                        FileOutputStream var5 = new FileOutputStream(var4);
                        var5.write(var1);
                        var5.flush();
                        var5.close();
                        var3 = ("raw://" + var4.getPath()).getBytes("UTF-8");
                        Log.d(TAG, "SaveToFile_internal: " + var4.getPath());
                  } catch (UnsupportedEncodingException var6) {
                        Log.d(TAG, "onPictureTaken: Unsupported exception.");
                        var6.printStackTrace();
                        var2.set(11);
                  } catch (FileNotFoundException var7) {
                        Log.d(TAG, "onPictureTaken: can not open file.");
                        var2.set(9);
                        var7.printStackTrace();
                  } catch (IOException var8) {
                        Log.d(TAG, "onPictureTaken: io error.");
                        var2.set(10);
                        var8.printStackTrace();
                  }
            }

            return var3;
      }

      private static byte[] SaveToCameraFolder(String var0, byte[] var1, AtomicInteger var2) {
            Log.d(TAG, "SaveToCameraFolder: start.");
            File var3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Camera");
            if (!var3.exists() && !var3.mkdirs()) {
                  return null;
            } else {
                  String var4 = null;
                  if (var0 != null && !var0.isEmpty()) {
                        var4 = var0;
                  } else {
                        String var5 = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
                        var4 = "IMG_" + var5;
                  }

                  return SaveToFile_internal(var3.getPath() + File.separator + var4 + ".jpg", var1, var2);
            }
      }

      private static byte[] SaveToGalleryFolder(String var0, byte[] var1, AtomicInteger var2) {
            Log.d(TAG, "SaveToGalleryFolder: start.");
            byte[] var3 = null;

            try {
                  String var4 = "Camera image";
                  if (var0 != null) {
                        var4 = var0;
                  }

                  ContentValues var5 = new ContentValues();
                  var5.put("title", var4);
                  var5.put("_display_name", var4);
                  var5.put("description", var4);
                  var5.put("mime_type", "image/jpeg");
                  var5.put("date_added", System.currentTimeMillis());
                  var5.put("datetaken", System.currentTimeMillis());
                  ContentResolver var6 = LoaderAPI.getActivity().getContentResolver();
                  Uri var7 = var6.insert(Media.EXTERNAL_CONTENT_URI, var5);
                  OutputStream var8 = var6.openOutputStream(var7);
                  var8.write(var1);
                  var8.flush();
                  var8.close();
                  String[] var9 = new String[]{"_data"};
                  Cursor var10 = var6.query(var7, var9, (String)null, (String[])null, (String)null);
                  int var11 = var10.getColumnIndexOrThrow("_data");
                  var10.moveToFirst();
                  var3 = ("raw://" + var10.getString(var11)).getBytes("UTF-8");
                  Log.d(TAG, "SaveToGalleryFolder: " + var10.getString(var11));
                  var10.close();
            } catch (UnsupportedEncodingException var12) {
                  Log.d(TAG, "onPictureTaken: Unsupported exception.");
                  var12.printStackTrace();
                  var2.set(11);
            } catch (FileNotFoundException var13) {
                  Log.d(TAG, "onPictureTaken: can not open file.");
                  var2.set(9);
                  var13.printStackTrace();
            } catch (IOException var14) {
                  Log.d(TAG, "onPictureTaken: io error.");
                  var2.set(10);
                  var14.printStackTrace();
            }

            return var3;
      }

      public static byte[] SaveToFile(String var0, byte[] var1, int var2, AtomicInteger var3) {
            byte[] var4 = null;
            Log.d(TAG, "SaveToFile: " + var2);
            switch(var2) {
            case 0:
                  var4 = SaveToFile_internal(var0, var1, var3);
                  break;
            case 1:
                  var4 = SaveToGalleryFolder(var0, var1, var3);
                  break;
            case 2:
                  var4 = SaveToCameraFolder(var0, var1, var3);
            }

            return var4;
      }

      public static int getPermissionGrantedValue(String var0) {
            if (VERSION.SDK_INT >= 23) {
                  return LoaderAPI.getActivity().checkSelfPermission(var0);
            } else {
                  Log.i(TAG, "Warning: getPermissionGrantedValue called in compatibility mode (app is not targeting api level 23)");
                  PackageManager var1 = LoaderAPI.getActivity().getPackageManager();
                  String var2 = LoaderAPI.getActivity().getPackageName();
                  return var1.checkPermission(var0, var2);
            }
      }

      public static boolean hasCameraPermissionGranted() {
            return getPermissionGrantedValue("android.permission.CAMERA") == 0;
      }

      public static boolean hasCameraSystemFeature() {
            PackageManager var0 = LoaderAPI.getActivity().getPackageManager();
            boolean var1 = var0.hasSystemFeature("android.hardware.camera") || var0.hasSystemFeature("android.hardware.camera.front");
            if (!var1 && VERSION.SDK_INT >= 17) {
                  var1 = var0.hasSystemFeature("android.hardware.camera.any");
            }

            return var1;
      }
}
