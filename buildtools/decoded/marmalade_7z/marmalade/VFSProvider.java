package com.ideaworks3d.marmalade;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

public class VFSProvider extends ContentProvider {
      private static String EXP_PATH = "/Android/obb/";
      private static String CONTENT_PREFIX = "content://";
      private static String AUTHORITY;
      public static Uri ASSET_URI;

      public boolean onCreate() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Creating VFSProvider");
            return true;
      }

      public AssetFileDescriptor openAssetFile(Uri var1, String var2) throws FileNotFoundException {
            String var3 = var1.getEncodedPath();
            if (var3.startsWith("/")) {
                  var3 = var3.substring(1);
            }

            return this.getAssetFileDescriptor(var3);
      }

      public ParcelFileDescriptor openFile(Uri var1, String var2) throws FileNotFoundException {
            AssetFileDescriptor var3 = this.openAssetFile(var1, var2);
            return null != var3 ? var3.getParcelFileDescriptor() : null;
      }

      public Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
            return null;
      }

      public AssetFileDescriptor getAssetFileDescriptor(String var1) {
            String[] var2 = var1.split("/");
            if (var2.length < 3) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Invalid URi");
                  return null;
            } else {
                  try {
                        long var4 = Long.parseLong(var2[var2.length - 2]);
                        long var6 = Long.parseLong(var2[var2.length - 1]);
                        String var8 = var2[0];

                        for(int var9 = 1; var9 < var2.length - 2; ++var9) {
                              var8 = var8 + "/" + var2[var9];
                        }

                        File var12 = new File(var8);
                        ParcelFileDescriptor var3 = ParcelFileDescriptor.open(var12, 268435456);
                        return new AssetFileDescriptor(var3, var4, var6);
                  } catch (NumberFormatException var10) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Failed to parse file offset / length from URI");
                  } catch (FileNotFoundException var11) {
                        var11.printStackTrace();
                  }

                  return null;
            }
      }

      public int update(Uri var1, ContentValues var2, String var3, String[] var4) {
            return 0;
      }

      public int delete(Uri var1, String var2, String[] var3) {
            return 0;
      }

      public Uri insert(Uri var1, ContentValues var2) {
            return null;
      }

      public String getType(Uri var1) {
            return "vnd.android.cursor.item/asset";
      }

      static {
            AUTHORITY = "zzzz3cbc70bb20f852f289fb0ebc606135c5.VFSProvider"; //idn how to do this, it's in android manifest
            ASSET_URI = Uri.parse(CONTENT_PREFIX + AUTHORITY);
      }
}
