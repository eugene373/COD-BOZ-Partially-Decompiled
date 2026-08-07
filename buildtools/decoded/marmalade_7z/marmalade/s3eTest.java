package com.ideaworks3d.marmalade;

import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.View;

public class s3eTest {
      private Handler m_Handler;
      Thread thread;
      private boolean suspendResumeCompletionFlag = false;
      private final Object suspendResumeLock = new Object();

      public s3eTest() {
            LoaderActivity.m_Activity.LoaderThread().runOnOSThread(new Runnable() {
                  public void run() {
                        s3eTest.this.m_Handler = new Handler();
                  }
            });
      }

      public void PostSuspend() {
            LoaderAPI.trace("PostSuspend");
            this.m_Handler.post(new Runnable() {
                  public void run() {
                        LoaderActivity.m_Activity.onStop();
                  }
            });
      }

      public void PostResume() {
            LoaderAPI.trace("PostResume");
            this.m_Handler.post(new Runnable() {
                  public void run() {
                        LoaderActivity.m_Activity.onResume();
                        synchronized(s3eTest.this.suspendResumeLock) {
                              s3eTest.this.suspendResumeCompletionFlag = true;
                              s3eTest.this.suspendResumeLock.notifyAll();
                        }
                  }
            });
      }

      public void PostSetFocus(final boolean var1) {
            LoaderAPI.trace("PostSetFocus");
            this.m_Handler.post(new Runnable() {
                  public void run() {
                        LoaderActivity.m_Activity.m_View.onWindowFocusChanged(var1);
                  }
            });
      }

      public void PostSuspendResume(final int var1, final int var2) {
            this.thread = new Thread(new Runnable() {
                  public void run() {
                        try {
                              for(int var1x = 0; var1x < var2; ++var1x) {
                                    s3eTest.this.suspendResumeCompletionFlag = false;
                                    s3eTest.this.PostSuspend();
                                    s3eTest.this.PostSetFocus(false);
                                    Thread.sleep((long)var1);
                                    s3eTest.this.PostResume();
                                    s3eTest.this.PostSetFocus(true);
                                    synchronized(s3eTest.this.suspendResumeLock) {
                                          while(!s3eTest.this.suspendResumeCompletionFlag) {
                                                s3eTest.this.suspendResumeLock.wait();
                                          }
                                    }
                              }
                        } catch (InterruptedException var9) {
                        } finally {
                              s3eTest.this.PostResume();
                              s3eTest.this.thread = null;
                        }

                  }
            });
            this.thread.start();
      }

      public boolean QueryThreadFinished() {
            return this.thread == null;
      }

      public void PostRotate(final int var1, final int var2) {
            LoaderAPI.trace("PostRotate");
            this.m_Handler.post(new Runnable() {
                  public void run() {
                        LoaderActivity.m_Activity.m_View.surfaceChanged((SurfaceHolder)null, 0, var1, var2);
                  }
            });
      }

      public int[] TakeScreenShot(int[] var1) {
            LoaderAPI.trace("TakeScreenShot");
            View var2 = LoaderAPI.getActivity().getWindow().getDecorView().findViewById(16908290);
            var2.setDrawingCacheEnabled(true);
            Bitmap var3 = Bitmap.createBitmap(var2.getDrawingCache());
            int var4 = var3.getWidth();
            int var5 = var3.getHeight();
            int var6 = var4 * var5;
            int[] var7 = new int[var6];
            var3.getPixels(var7, 0, var4, 0, 0, var4, var5);
            var1[0] = var4;
            var1[1] = var5;
            var2.setDrawingCacheEnabled(false);
            return var7;
      }

      public int GetAndroidTargetAPILevel() {
            int var1 = 0;

            try {
                  ApplicationInfo var2 = LoaderAPI.getActivity().getApplicationInfo();
                  if (var2 != null) {
                        var1 = var2.targetSdkVersion;
                  }
            } catch (Exception var3) {
                  var3.printStackTrace();
            }

            return var1;
      }
}
