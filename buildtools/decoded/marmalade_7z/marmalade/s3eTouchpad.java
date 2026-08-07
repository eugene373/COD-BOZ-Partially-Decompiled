package com.ideaworks3d.marmalade;

import android.content.res.Configuration;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.InputDevice.MotionRange;
import java.lang.reflect.Method;

class s3eTouchpad {
      private boolean processPositionEvents;
      private int inputDeviceId = -1;
      private static int m_Width = 0;
      private static int m_Height = 0;
      static final int S3E_TOUCHPAD_AVAILABLE = 0;
      static final int S3E_TOUCHPAD_WIDTH = 1;
      static final int S3E_TOUCHPAD_HEIGHT = 2;

      public static native void onMotionEvent(int var0, int var1, int var2, int var3);

      public static boolean onTouchEvent(MotionEvent var0) {
            if (1048584 != var0.getSource()) {
                  return false;
            } else {
                  int var1 = var0.getAction();
                  int var2 = var0.getActionIndex();
                  int var3;
                  if (var1 == 2) {
                        var3 = var0.getPointerCount();

                        for(int var4 = 0; var4 < var3; ++var4) {
                              onMotionEvent(var0.getPointerId(var4), var1 + 4, (int)var0.getX(var4), m_Height - (int)var0.getY(var4));
                        }
                  } else if (var1 != 0 && var1 != 1) {
                        var3 = var0.getPointerId(var2);
                        var1 &= 255;
                        if (var1 == 6 || var1 == 5) {
                              var1 -= 5;
                              onMotionEvent(var3, var1 + 4, (int)var0.getX(var2), m_Height - (int)var0.getY(var2));
                        }
                  } else {
                        var3 = var0.getPointerId(0);
                        onMotionEvent(var3, var1 + 4, (int)var0.getX(), m_Height - (int)var0.getY());
                  }

                  return true;
            }
      }

      public boolean s3eTouchpadInit() {
            int[] var1 = InputDevice.getDeviceIds();
            int[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var2[var4];
                  InputDevice var6 = InputDevice.getDevice(var5);
                  if ((var6.getSources() & 1048584) > 0) {
                        MotionRange var7 = var6.getMotionRange(0);
                        MotionRange var8 = var6.getMotionRange(1);
                        if (var7 != null && var8 != null) {
                              m_Width = (int)var7.getMax();
                              m_Height = (int)var8.getMax();
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Detected touchpad with m_Width: " + m_Width + " m_Height: " + m_Height);
                              if (m_Width > 0 && m_Height > 0) {
                                    if (this.setProcessPositionEvents(true)) {
                                          this.inputDeviceId = var5;
                                          return true;
                                    }

                                    LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "setProcessPositionEvents failed");
                                    return false;
                              }
                        }
                  }
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Couldn't detect touchpad");
            return false;
      }

      public void s3eTouchpadTerminate() {
            if (this.processPositionEvents) {
                  this.setProcessPositionEvents(false);
            }

      }

      public int s3eTouchpadGetInt(int var1) {
            if (var1 == 0) {
                  LoaderAPI.trace("Touchpad GetInt S3E_TOUCHPAD_AVAILABLE");
                  if (this.inputDeviceId == -1) {
                        return 0;
                  } else {
                        Configuration var2 = LoaderActivity.m_Activity.getResources().getConfiguration();
                        String var3 = "3.0.A.2.";

                        try {
                              LoaderAPI.trace("Android build: " + Build.ID);
                              LoaderAPI.trace("Checking for legacy Xperia Play build ID: " + var3);
                              if (Build.ID.startsWith(var3) && Integer.parseInt(Build.ID.substring(var3.length())) <= 181) {
                                    LoaderAPI.trace("Found... Using legacy Configuration enum");
                                    return var2.hardKeyboardHidden != 2 ? 1 : 0;
                              }
                        } catch (NumberFormatException var5) {
                              LoaderAPI.trace("Error parsing build ID");
                        }

                        int var4 = var2.navigationHidden != 2 ? 1 : 0;
                        LoaderAPI.trace("Touchpad available: " + var4);
                        return var4;
                  }
            } else if (var1 == 1) {
                  return m_Width;
            } else {
                  return var1 == 2 ? m_Height : 0;
            }
      }

      public boolean setProcessPositionEvents(boolean var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "setProcessPositionEvents" + var1);

            try {
                  ViewParent var2 = LoaderActivity.m_Activity.getWindow().getDecorView().getRootView().getParent();
                  Class var3 = Class.forName("android.view.ViewRoot");
                  Method var4 = var3.getMethod("setProcessPositionEvents", Boolean.TYPE);
                  var4.invoke(var2, var1);
                  return true;
            } catch (Exception var5) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Exception accessing trackpad:" + var5.toString());
                  return false;
            }
      }
}
