package com.ideaworks3d.marmalade;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

public class ResourceUtility {
      public static int getResId(String var0, String var1, Context var2) {
            int var3 = 0;

            try {
                  var3 = var2.getResources().getIdentifier(var1, var0, var2.getPackageName());
            } catch (IllegalArgumentException var5) {
                  Log.v("getResId", "unknown class/resourceName : " + var0 + "/" + var1);
                  var5.printStackTrace();
            } catch (SecurityException var6) {
                  Log.v("getResId", "unknown class/resourceName : " + var0 + "/" + var1);
                  var6.printStackTrace();
            }

            return var3;
      }

      public static int getResId(String var0, String var1) {
            boolean var2 = false;
            LoaderActivity var3 = LoaderActivity.m_Activity;
            int var4 = getResId(var0, var1, var3);
            return var4;
      }

      public static final int[] getResourceDeclareStyleableIntArray(String var0) {
            LoaderActivity var1 = LoaderActivity.m_Activity;

            try {
                  Field[] var2 = Class.forName(var1.getPackageName() + ".R$styleable").getFields();
                  Field[] var3 = var2;
                  int var4 = var2.length;

                  for(int var5 = 0; var5 < var4; ++var5) {
                        Field var6 = var3[var5];
                        if (var6.getName().equals(var0)) {
                              int[] var7 = (int[])((int[])var6.get((Object)null));
                              return var7;
                        }
                  }
            } catch (Throwable var8) {
            }

            return null;
      }
}
