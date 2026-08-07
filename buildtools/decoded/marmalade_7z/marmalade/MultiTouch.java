package com.ideaworks3d.marmalade;

import android.view.MotionEvent;

class MultiTouch {
      private static final int POINTER_DOWN = 1;
      private static final int POINTER_UP = 2;
      private static final int POINTER_MOVE = 3;
      private static final int TOUCH_DOWN = 4;
      private static final int TOUCH_UP = 5;
      private static final int TOUCH_MOVE = 6;
      private static final int TOUCH_CANCEL = 7;

      public static boolean onTouchEvent(LoaderThread var0, MotionEvent var1) {
            int var2 = var1.getAction();
            var2 &= 255;
            int var4;
            int var5;
            int var6;
            int var7;
            if (var2 == 2) {
                  int var3 = var1.getPointerCount();

                  for(var4 = 0; var4 < var3; ++var4) {
                        var5 = var1.getPointerId(var4);
                        var6 = (int)var1.getX(var4);
                        var7 = (int)var1.getY(var4);
                        var0.onMotionEvent(var5, 6, var6, var7);
                  }
            } else {
                  byte var8 = 0;
                  if (var2 != 0 && var2 != 5) {
                        if (var2 != 1 && var2 != 6) {
                              if (var2 == 3) {
                                    var8 = 7;
                              }
                        } else {
                              var8 = 5;
                        }
                  } else {
                        var8 = 4;
                  }

                  if (var8 != 0) {
                        var4 = var1.getActionIndex();
                        var5 = var1.getPointerId(var4);
                        var6 = (int)var1.getX(var4);
                        var7 = (int)var1.getY(var4);
                        var0.onMotionEvent(var5, var8, var6, var7);
                  }
            }

            return true;
      }
}
