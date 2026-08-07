package com.ideaworks3d.marmalade;

import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

class LoaderGL {
      private boolean m_Started;
      private boolean m_DoneInit;
      private int m_GLVersion;
      EGL10 m_Egl;
      EGLDisplay m_EglDisplay;
      EGLSurface m_EglSurface;
      EGLConfig[] m_EglConfigs;
      EGLContext m_EglContext;
      private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
      private static final int EGL_DEPTH_ENCODING_NV = 12514;

      public boolean started() {
            return this.m_Started;
      }

      public void init() {
            this.m_Egl = (EGL10)EGLContext.getEGL();
            this.m_EglDisplay = this.m_Egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            int[] var1 = new int[2];
            this.m_Egl.eglInitialize(this.m_EglDisplay, var1);
            this.chooseConfigs();
            int[] var2 = null;
            if (this.m_GLVersion >= 2) {
                  int[] var3 = new int[]{12440, this.m_GLVersion, 12344};
                  var2 = var3;
            }

            this.m_EglContext = this.m_Egl.eglCreateContext(this.m_EglDisplay, this.m_EglConfigs[0], EGL10.EGL_NO_CONTEXT, var2);
            this.m_DoneInit = true;
      }

      public GL startGL(SurfaceHolder var1, int var2) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "startGL: " + var1);
            if (var2 != 0) {
                  this.m_GLVersion = var2;
            }

            if (!this.m_DoneInit) {
                  this.init();
            }

            this.m_EglSurface = this.m_Egl.eglCreateWindowSurface(this.m_EglDisplay, this.m_EglConfigs[0], var1, (int[])null);
            boolean var3 = this.m_Egl.eglMakeCurrent(this.m_EglDisplay, this.m_EglSurface, this.m_EglSurface, this.m_EglContext);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "startGL done: " + this.m_EglContext + " eglMakeCurrent: " + var3);
            this.m_Started = true;
            return this.m_EglContext.getGL();
      }

      private static int CountSettingsWithValue(LoaderGL.ConfigSetting[] var0) {
            int var1 = 0;
            LoaderGL.ConfigSetting[] var2 = var0;
            int var3 = var0.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                  LoaderGL.ConfigSetting var5 = var2[var4];
                  if (var5.HasValue()) {
                        ++var1;
                  }
            }

            return var1;
      }

      private static int CopySettingsWithValues(LoaderGL.ConfigSetting[] var0, int[] var1) {
            int var2 = 0;
            LoaderGL.ConfigSetting[] var3 = var0;
            int var4 = var0.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                  LoaderGL.ConfigSetting var6 = var3[var5];
                  if (var6.HasValue()) {
                        var1[2 * var2] = var6.GetSetting();
                        var1[2 * var2 + 1] = var6.GetValue();
                        ++var2;
                  }
            }

            return var2;
      }

      private int[] CreateSpecFromSettings(LoaderGL.ConfigSetting[] var1) {
            int var2 = CountSettingsWithValue(var1);
            if (this.m_GLVersion >= 2) {
                  ++var2;
            }

            int[] var3 = new int[2 * var2 + 1];
            int var4 = CopySettingsWithValues(var1, var3);
            if (this.m_GLVersion >= 2) {
                  var3[2 * var4] = 12352;
                  var3[2 * var4 + 1] = 4;
                  ++var4;
            }

            var3[2 * var4] = 12344;
            return var3;
      }

      private void chooseConfigs() {
            LoaderGL.ConfigSetting[] var1 = new LoaderGL.ConfigSetting[]{new LoaderGL.ConfigSetting("EGL_BUFFER_SIZE", 12320), new LoaderGL.ConfigSetting("EGL_DEPTH_ENCODING_NV", 12514), new LoaderGL.ConfigSetting("EGL_DEPTH_SIZE", 12325), new LoaderGL.ConfigSetting("EGL_SURFACE_TYPE", 12339), new LoaderGL.ConfigSetting("EGL_RED_SIZE", 12324), new LoaderGL.ConfigSetting("EGL_GREEN_SIZE", 12323), new LoaderGL.ConfigSetting("EGL_BLUE_SIZE", 12322), new LoaderGL.ConfigSetting("EGL_ALPHA_SIZE", 12321), new LoaderGL.ConfigSetting("EGL_STENCIL_SIZE", 12326), new LoaderGL.ConfigSetting("EGL_SAMPLE_BUFFERS", 12338), new LoaderGL.ConfigSetting("EGL_SAMPLES", 12337)};
            Object var2 = null;
            int[] var3 = new int[1];
            int var4 = 0;

            while(true) {
                  int[] var13 = this.CreateSpecFromSettings(var1);
                  this.m_Egl.eglChooseConfig(this.m_EglDisplay, var13, (EGLConfig[])null, 0, var3);
                  if (var3[0] != 0) {
                        var4 = var3[0];
                        this.m_EglConfigs = new EGLConfig[var4];
                        this.m_Egl.eglChooseConfig(this.m_EglDisplay, var13, this.m_EglConfigs, var4, var3);
                        EGLConfig var14 = this.m_EglConfigs[0];
                        int var6 = this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12324, 0);
                        int var7 = this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12323, 0);
                        int var8 = this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12322, 0);
                        int var9 = this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12321, 0);
                        int var10 = this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12325, 0);
                        int var11 = this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12352, 0);
                        this.findConfigAttrib(this.m_Egl, this.m_EglDisplay, var14, 12327, 12344);
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "EGLConfig: r: " + var6 + " g: " + var7 + " b: " + var8 + " a: " + var9 + " d: " + var10 + " renderable_type: " + var11);
                        return;
                  }

                  if (var4 >= var1.length) {
                        throw new RuntimeException("Failed to choose an EGL config");
                  }

                  LoaderGL.ConfigSetting var5 = var1[var4];
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "No matching egl configs... reverting setting: " + var5.GetName() + " : " + var5.GetValue() + " -> " + var5.GetDefault());
                  var5.SetValueToDefault();
                  ++var4;
            }
      }

      private int findConfigAttrib(EGL10 var1, EGLDisplay var2, EGLConfig var3, int var4, int var5) {
            int[] var6 = new int[1];
            return var1.eglGetConfigAttrib(var2, var3, var4, var6) ? var6[0] : var5;
      }

      public void swap() {
            this.m_Egl.eglSwapBuffers(this.m_EglDisplay, this.m_EglSurface);
      }

      public GL restartGL(SurfaceHolder var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "restartGL: " + var1);
            this.stop();
            return this.startGL(var1, this.m_GLVersion);
      }

      public void stopGL() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "stopGL");
            this.stop();
            this.term();
      }

      public void pauseGL() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "pauseGL");
            this.stop();
      }

      public GL resumeGL(SurfaceHolder var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "resumeGL: " + var1);
            return this.startGL(var1, this.m_GLVersion);
      }

      private void stop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "stop : " + Thread.currentThread());
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "surface : " + this.m_EglSurface + "display : " + this.m_EglDisplay);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "eglGetDisplay : " + this.m_Egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY));
            this.m_Started = false;
            if (this.m_EglSurface != null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "--> eglMakeCurrent");
                  this.m_Egl.eglMakeCurrent(this.m_EglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "<-- eglMakeCurrent");
                  this.m_Egl.eglDestroySurface(this.m_EglDisplay, this.m_EglSurface);
                  this.m_EglSurface = null;
            }

      }

      public void term() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "term");
            if (this.m_EglContext != null) {
                  this.m_Egl.eglDestroyContext(this.m_EglDisplay, this.m_EglContext);
                  this.m_EglContext = null;
            }

            if (this.m_EglDisplay != null) {
                  this.m_Egl.eglTerminate(this.m_EglDisplay);
                  this.m_EglDisplay = null;
            }

            this.m_DoneInit = false;
      }

      private class ConfigSetting {
            private String mName;
            private int mSetting;
            private int mValue;
            private int mDefault;

            public ConfigSetting(String var2, int var3) {
                  this.Construct(var2, var3, -1);
            }

            public ConfigSetting(String var2, int var3, int var4) {
                  this.Construct(var2, var3, var4);
            }

            private void Construct(String var1, int var2, int var3) {
                  this.mName = var1;
                  this.mSetting = var2;
                  this.mDefault = var3;
                  int[] var4 = new int[]{-1};
                  if (LoaderAPI.s3eConfigGetInt("GL", var1, var4) == 0) {
                        this.mValue = var4[0];
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), var1 + " : 0x" + Integer.toString(this.mValue, 16).toUpperCase());
                  } else {
                        this.mValue = var3;
                  }

            }

            public String GetName() {
                  return this.mName;
            }

            public int GetSetting() {
                  return this.mSetting;
            }

            public int GetValue() {
                  return this.mValue;
            }

            public int GetDefault() {
                  return this.mDefault;
            }

            public void SetValueToDefault() {
                  this.mValue = this.mDefault;
            }

            public boolean HasValue() {
                  return this.mValue != -1;
            }
      }
}
