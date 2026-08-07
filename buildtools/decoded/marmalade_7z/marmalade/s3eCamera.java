package com.ideaworks3d.marmalade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.ShutterCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.WindowManager.LayoutParams;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class s3eCamera implements PreviewCallback, SuspendResumeListener {
      static final int S3E_CAMERA_AVAILABLE = 0;
      static final int S3E_CAMERA_STATUS = 1;
      static final int S3E_CAMERA_AUTO_FOCUS = 3;
      static final int S3E_CAMERA_BRIGHTNESS = 4;
      static final int S3E_CAMERA_CONTRAST = 5;
      static final int S3E_CAMERA_QUALITY = 6;
      static final int S3E_CAMERA_TYPE = 7;
      static final int S3E_CAMERA_FLASH_MODE = 8;
      static final int S3E_CAMERA_TORCH_MODE = 9;
      static final int S3E_CAMERA_IDLE = 0;
      static final int S3E_CAMERA_STREAMING = 1;
      static final int S3E_CAMERA_STREAMING_SIZE_HINT_SMALLEST = 0;
      static final int S3E_CAMERA_STREAMING_SIZE_HINT_MEDIUM = 1;
      static final int S3E_CAMERA_STREAMING_SIZE_HINT_LARGEST = 2;
      static final int S3E_CAMERA_STREAMING_SIZE_HINT_MAXIMUM = 3;
      static final int S3E_CAMERA_PIXEL_TYPE_NV21 = 4097;
      static final int S3E_CAMERA_ERR_NONE = 0;
      static final int S3E_CAMERA_ERR_MEM = 8;
      static final int S3E_CAMERA_ERR_OPEN_FILE = 9;
      static final int S3E_CAMERA_ERR_IO = 10;
      static final int S3E_CAMERA_ERR_UNKNOWN = 11;
      static final int S3E_CAMERA_ERR_OPERATION_NA = 12;
      static final int S3E_CAMERA_TAKE_PICTURE_TYPE_FILE = 1;
      static final int S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER = 2;
      static final int S3E_CAMERA_SAVE_PATH_USER = 0;
      static final int S3E_CAMERA_SAVE_PATH_GALLERY = 1;
      static final int S3E_CAMERA_SAVE_PATH_CAMERA = 2;
      static final int S3E_CAMERA_SAVE_PATH_GALLERY_AND_CAMERA = 3;
      static final int S3E_CAMERA_FLASH_MODE_OFF = 0;
      static final int S3E_CAMERA_FLASH_MODE_ON = 1;
      static final int S3E_CAMERA_FLASH_MODE_AUTO = 2;
      static final int S3E_CAMERA_FLASH_MODE_RED_EYE_REDUCTION = 3;
      static final int S3E_CAMERA_TORCH_MODE_OFF = 0;
      static final int S3E_CAMERA_TORCH_MODE_ON = 1;
      static final int S3E_CAMERA_TORCH_MODE_AUTO = 2;
      int m_SizeHint = 0;
      int m_Width = 0;
      int m_Height = 0;
      int m_PixelFormat = 4097;
      int m_Type = -1;
      int m_Quality = 0;
      int m_AutoFocus = 0;
      int m_FlashMode = 0;
      int m_TorchMode = 0;
      private Camera m_Camera;
      private s3eCamera.Preview m_Preview;
      private boolean m_Running = false;
      private boolean m_NeedsRemovePreview = false;
      private static final Object m_CameraLock = new Object();
      private static final Semaphore m_CameraOpenSem = new Semaphore(0);
      private boolean m_AutoFocusIsOn = false;
      static final int S3E_RESULT_SUCCESS = 0;
      static final int S3E_RESULT_ERROR = 1;
      static final int S3E_CAMERA_TYPE_REAR = 0;
      static final int S3E_CAMERA_TYPE_FRONT = 1;
      static final int S3E_CAMERA_TYPE_UNAVAILABLE = -1;
      private int[] m_TypesToCameraId = new int[]{-1, -1};
      private String[] m_AutoFocusModes = new String[]{"continuous-video", "continuous-picture"};
      private String[] m_NonAutoFocusModes = new String[]{"auto", "fixed"};

      private native void previewCallback(byte[] var1, int var2, int var3, int var4, int var5);

      private native void onTakeImageCallback(byte[] var1, int var2, int var3);

      public s3eCamera() {
            LoaderAPI.addSuspendResumeListener(this);
            PackageManager var1 = LoaderActivity.m_Activity.getPackageManager();
            if (var1.checkPermission("android.permission.CAMERA", LoaderActivity.m_Activity.getPackageName()) == PackageManager.PERMISSION_GRANTED) {
                  CameraInfo var2 = new CameraInfo();

                  int var3;
                  for(var3 = 0; var3 < Camera.getNumberOfCameras(); ++var3) {
                        Camera.getCameraInfo(var3, var2);
                        switch(var2.facing) {
                        case 0:
                              this.m_TypesToCameraId[0] = var3;
                              break;
                        case 1:
                              this.m_TypesToCameraId[1] = var3;
                        }
                  }

                  for(var3 = 0; var3 < this.m_TypesToCameraId.length; ++var3) {
                        if (this.m_TypesToCameraId[var3] != -1) {
                              this.m_Type = var3;
                              break;
                        }
                  }

            }
      }

      private boolean isCameraOpen() {
            synchronized(m_CameraLock) {
                  return this.m_Camera != null;
            }
      }

      private boolean OpenCamera() {
            if (this.isCameraOpen()) {
                  return true;
            } else {
                  this.m_Camera = Camera.open(this.m_TypesToCameraId[this.m_Type]);
                  return this.m_Camera != null;
            }
      }

      private void CloseCamera() {
            synchronized(m_CameraLock) {
                  if (this.m_Camera != null) {
                        this.m_Camera.setPreviewCallback((PreviewCallback)null);
                        this.m_Camera.stopPreview();
                        this.m_Camera.release();
                        this.m_Camera = null;
                  }
            }
      }

      public int s3eCameraGetInt(int var1) {
            switch(var1) {
            case 0:
                  return this.m_Type != -1 ? 1 : 0;
            case 1:
                  return this.isCameraOpen() ? 1 : 0;
            case 2:
            case 4:
            case 5:
            case 6:
            default:
                  return 0;
            case 3:
                  return this.m_AutoFocusIsOn ? 1 : 0;
            case 7:
                  return this.m_Type;
            case 8:
                  return this.getFlashMode();
            case 9:
                  return this.getTorchMode();
            }
      }

      private boolean isFocusModeSupported(String var1) {
            boolean var2 = false;
            if (this.isCameraOpen()) {
                  Parameters var3 = this.m_Camera.getParameters();
                  List var4 = var3.getSupportedFocusModes();
                  var2 = var4.contains(var1);
            }

            return var2;
      }

      private void setFocusMode(String var1) {
            Parameters var2 = this.m_Camera.getParameters();
            var2.setFocusMode(var1);
            this.m_Camera.setParameters(var2);
      }

      private boolean chooseFocusMode(String[] var1) {
            String var2 = null;

            int var3;
            for(var3 = 0; var3 < var1.length && var2 == null; ++var3) {
                  if (this.isFocusModeSupported(var1[var3])) {
                        var2 = var1[var3];
                  }
            }

            if (var2 != null && this.isCameraOpen()) {
                  var3 = 2;

                  while(true) {
                        try {
                              this.setFocusMode(var2);
                              break;
                        } catch (Exception var5) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), var5.toString());
                              --var3;
                              if (var3 == 0) {
                                    break;
                              }
                        }
                  }

                  this.forceRefocus(var2);
            }

            return var2 != null;
      }

      private void forceRefocus(String var1) {
            if (this.m_Camera != null && var1.equals("auto")) {
                  this.m_Camera.autoFocus(new AutoFocusCallback() {
                        public void onAutoFocus(boolean var1, Camera var2) {
                        }
                  });
            }

      }

      private boolean setAutoFocusOnParams() {
            boolean var1 = this.chooseFocusMode(this.m_AutoFocusModes);
            this.m_AutoFocusIsOn = var1;
            return var1;
      }

      private boolean setAutoFocusOffParams() {
            boolean var1 = this.chooseFocusMode(this.m_NonAutoFocusModes);
            this.m_AutoFocusIsOn = !var1;
            return var1;
      }

      public int s3eCameraSetInt(int var1, int var2) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraSetInt: " + var1 + " <= " + var2);
            int var3 = 0;
            if (var1 == 7) {
                  if (var2 < 0 || var2 >= this.m_TypesToCameraId.length || this.m_TypesToCameraId[var2] == -1) {
                        return 1;
                  }

                  if (this.m_Type != var2) {
                        this.m_Type = var2;
                        this.m_AutoFocusIsOn = false;
                        if (this.isCameraOpen()) {
                              this.CloseCamera();
                              var3 = this.OpenCamera() ? 0 : 1;
                        }
                  }
            } else if (var1 == 3) {
                  byte var10000;
                  label40: {
                        label39: {
                              if (var2 == 0) {
                                    if (this.setAutoFocusOffParams()) {
                                          break label39;
                                    }
                              } else if (this.setAutoFocusOnParams()) {
                                    break label39;
                              }

                              var10000 = 1;
                              break label40;
                        }

                        var10000 = 0;
                  }

                  var3 = var10000;
            } else if (var1 == 8) {
                  var3 = this.setFlashMode(var2);
            } else if (var1 == 9) {
                  var3 = this.setTorchMode(var2);
            }

            return var3;
      }

      static final boolean s3eCameraFlashModeToPlatform(int var0, String[] var1) {
            switch(var0) {
            case 0:
                  var1[0] = "off";
                  return true;
            case 1:
                  var1[0] = "on";
                  return true;
            case 2:
                  var1[0] = "auto";
                  return true;
            case 3:
                  var1[0] = "red-eye";
                  return true;
            default:
                  var1[0] = "off";
                  return false;
            }
      }

      static final boolean s3eCameraTorchModeToPlatform(int var0, String[] var1) {
            switch(var0) {
            case 0:
                  var1[0] = "off";
                  return true;
            case 1:
                  var1[0] = "torch";
                  return true;
            case 2:
                  var1[0] = "off";
                  return false;
            default:
                  var1[0] = "off";
                  return false;
            }
      }

      int setFlashMode(int var1) {
            boolean var2 = false;
            if (!this.isCameraOpen()) {
                  if (!this.OpenCamera()) {
                        return 1;
                  }

                  var2 = true;
            }

            String[] var3 = new String[1];
            boolean var4 = s3eCameraFlashModeToPlatform(var1, var3);
            Parameters var5 = this.m_Camera.getParameters();
            List var6 = var5.getSupportedFlashModes();
            boolean var7 = var6 != null ? var6.contains(var3[0]) : false;
            if (var7) {
                  this.m_FlashMode = var1;
            }

            if (var2) {
                  this.CloseCamera();
            } else if (var7) {
                  var5.setFlashMode(var3[0]);
                  this.m_Camera.setParameters(var5);
            }

            return var4 && var7 ? 0 : 1;
      }

      int getFlashMode() {
            return this.m_FlashMode;
      }

      int setTorchMode(int var1) {
            boolean var2 = false;
            if (!this.isCameraOpen()) {
                  if (!this.OpenCamera()) {
                        return 1;
                  }

                  var2 = true;
            }

            String[] var3 = new String[1];
            boolean var4 = s3eCameraTorchModeToPlatform(var1, var3);
            Parameters var5 = this.m_Camera.getParameters();
            List var6 = var5.getSupportedFlashModes();
            boolean var7 = var6 != null ? var6.contains(var3[0]) : false;
            if (var7) {
                  this.m_TorchMode = var1;
            }

            if (var2) {
                  this.CloseCamera();
            } else if (var7) {
                  var5.setFlashMode(var3[0]);
                  this.m_Camera.setParameters(var5);
            }

            return var4 && var7 ? 0 : 1;
      }

      int getTorchMode() {
            return this.m_TorchMode;
      }

      private int s3ePixelFormatToPlatform(int var1) {
            return var1 == 4097 ? 17 : 0;
      }

      public boolean s3eCameraIsFormatSupported(int var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraIsFormatSupported: " + var1);
            return var1 == 4097;
      }

      public void onPreviewFrame(byte[] var1, Camera var2) {
            Parameters var3 = var2.getParameters();
            if (this.m_PixelFormat == 4097 && this.s3ePixelFormatToPlatform(4097) == var3.getPreviewFormat() && var1.length < var3.getPreviewSize().width * var3.getPreviewSize().height * 3 / 2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Corrupted buffer was passed by platform. Skipping frame.");
            } else {
                  this.previewCallback(var1, var3.getPreviewFormat(), var3.getPreviewSize().width, var3.getPreviewSize().height, LoaderActivity.m_Activity.LoaderThread().getOrientation());
            }

      }

      public int s3eCameraStart(int var1, int var2, int var3, int var4, int var5) {
            this.m_SizeHint = var1;
            this.m_Width = var4;
            this.m_Height = var5;
            this.m_PixelFormat = var2;
            this.m_Quality = var3;

            try {
                  if (!this.OpenCamera()) {
                        throw new RuntimeException("Can't open the camera.");
                  } else {
                        Size var6 = this.setCameraParameters();
                        LoaderAPI.trace("Creating image buffer");
                        int var7 = var6.width * var6.height * 2;
                        LoaderAPI.trace("Invoking preview methods");
                        this.m_Camera.setPreviewCallback(this);
                        if (VERSION.SDK_INT >= 11) {
                              try {
                                    LoaderActivity.m_Activity.runOnUiThread(new Runnable() {
                                          public void run() {
                                                s3eCamera.this.createPreview();
                                          }
                                    });
                                    m_CameraOpenSem.acquire();
                              } catch (InterruptedException var9) {
                                    LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraTakePictureToFile(): waiting for semaphore failed");
                                    return 1;
                              }
                        }

                        this.m_Camera.startPreview();
                        this.m_Running = true;
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: done");
                        return 0;
                  }
            } catch (Exception var10) {
                  LoaderAPI.getStackTrace(var10);
                  this.s3eCameraStop();
                  return 1;
            }
      }

      public int s3eCameraStop() {
            this.m_Running = false;
            this.CloseCamera();
            if (this.m_NeedsRemovePreview) {
                  LoaderActivity.m_Activity.runOnUiThread(new Runnable() {
                        public void run() {
                              s3eCamera.this.removePreview();
                        }
                  });
            }

            return 0;
      }

      private Size getOptimalPreviewSize(List var1, int var2, int var3) {
            int var4 = var2 > var3 ? var2 : var3;
            int var5 = var2 < var3 ? var2 : var3;
            Size var6 = null;
            int var7 = Integer.MAX_VALUE;
            Iterator var8 = var1.iterator();

            while(var8.hasNext()) {
                  Size var9 = (Size)var8.next();
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Available size: " + var9.width + "x" + var9.height);
                  int var10 = Math.abs(var9.height - var5) + Math.abs(var9.width - var4);
                  if (var10 < var7) {
                        var6 = var9;
                        var7 = var10;
                  }
            }

            return var6;
      }

      private List getCameraSizes(Parameters var1) {
            return null;
      }

      public Size setCameraParameters() {
            if (this.m_Camera == null) {
                  return null;
            } else {
                  LoaderAPI.trace("Setting camera parameters");
                  Parameters var1 = this.m_Camera.getParameters();
                  List var2 = this.getCameraSizes(var1);

                  try {
                        List var3 = var1.getSupportedPreviewFormats();
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Supported formats: " + var3);
                        int var4 = this.s3ePixelFormatToPlatform(this.m_PixelFormat);
                        if (var3.contains(var4)) {
                              var1.setPreviewFormat(var4);
                        }
                  } catch (Exception var9) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Could not request alternative preview format (OS Version < 2.0?)");
                  }

                  LoaderAPI.trace("Setting preview size");
                  Size var10;
                  if (this.m_SizeHint == 3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Ideal size: maximum available");
                        var10 = (Size)var2.get(var2.size() - 1);
                  } else {
                        byte var11 = 1;
                        if (this.m_SizeHint == 1) {
                              var11 = 2;
                        } else if (this.m_SizeHint == 0) {
                              var11 = 4;
                        }

                        LoaderView var5 = LoaderActivity.m_Activity.m_View;
                        int var6 = var5.m_Width / var11;
                        int var7 = var5.m_Height / var11;
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Ideal size: " + var6 + "x" + var7);
                        var10 = this.getOptimalPreviewSize(var2, var6, var7);
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Got size: " + var10.width + "x" + var10.height);
                  var1.setPreviewSize(var10.width, var10.height);
                  LoaderAPI.trace("Setting camera ID: " + this.m_TypesToCameraId[this.m_Type]);
                  var1.set("camera-id", this.m_TypesToCameraId[this.m_Type]);

                  try {
                        this.m_Camera.stopPreview();
                        this.m_Camera.setParameters(var1);
                        var10 = var1.getPreviewSize();
                        if (this.m_AutoFocusIsOn) {
                              this.setAutoFocusOnParams();
                        } else {
                              this.setAutoFocusOffParams();
                        }

                        this.setTorchMode(this.m_TorchMode);
                  } catch (Exception var8) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraView: Exception setting requested preview size");
                  }

                  return var10;
            }
      }

      public void onSuspendResumeEvent(SuspendResumeEvent var1) {
            if (this.m_Running) {
                  if (var1.eventType == SuspendResumeEvent.EventType.RESUME) {
                        this.s3eCameraStart(this.m_SizeHint, this.m_PixelFormat, this.m_Quality, this.m_Width, this.m_Height);
                  }

                  if (var1.eventType == SuspendResumeEvent.EventType.SUSPEND) {
                        this.s3eCameraStop();
                        this.m_Running = true;
                  }

                  if (var1.eventType == SuspendResumeEvent.EventType.SHUTDOWN) {
                        this.s3eCameraStop();
                  }

            }
      }

      @SuppressLint("WrongConstant")
      public int createPreview() {
            LayoutParams var1 = new LayoutParams();
            var1.flags |= LayoutParams.FLAG_NOT_FOCUSABLE;
            var1.flags |= LayoutParams.FLAG_NOT_TOUCHABLE;
            var1.flags |= LayoutParams.FLAG_LAYOUT_NO_LIMITS;
            var1.flags |= LayoutParams.FLAG_FULLSCREEN;
            var1.gravity = 85;
            var1.x = 0;
            var1.y = 0;
            var1.width = 1;
            var1.height = 1;
            this.m_Preview = new s3eCamera.Preview(LoaderActivity.m_Activity);
            this.m_NeedsRemovePreview = true;
            LoaderActivity.m_Activity.getWindow().getWindowManager().addView(this.m_Preview, var1);
            return 0;
      }

      public int removePreview() {
            if (this.m_Preview != null && this.m_NeedsRemovePreview) {
                  this.m_NeedsRemovePreview = false;
                  LoaderActivity.m_Activity.getWindow().getWindowManager().removeViewImmediate(this.m_Preview);
                  this.m_Preview = null;
                  return 0;
            } else {
                  return 1;
            }
      }

      public void s3eCameraTakePictureToFile(String var1, int var2) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraTakePictureToFile: " + var2);
            if (this.m_Camera != null) {
                  s3eCamera.s3eCameraTakePicture var3 = new s3eCamera.s3eCameraTakePicture();
                  var3.m_nType = var2;
                  var3.m_strFile = var1;
                  var3.m_bToFile = true;
                  this.setFlashMode(this.m_FlashMode);
                  this.m_Camera.takePicture((ShutterCallback)null, (PictureCallback)null, var3);
            } else {
                  this.onTakeImageCallback((byte[])null, 1, 12);
            }

      }

      public void s3eCameraTakePictureToBuffer() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraTakePictureToBuffer");
            if (this.m_Camera != null) {
                  s3eCamera.s3eCameraTakePicture var1 = new s3eCamera.s3eCameraTakePicture();
                  var1.m_bToFile = false;
                  this.setFlashMode(this.m_FlashMode);
                  this.m_Camera.takePicture((ShutterCallback)null, (PictureCallback)null, var1);
            } else {
                  this.onTakeImageCallback((byte[])null, 2, 12);
            }

      }

      public int s3eCameraFetchResolutions(int[][] var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraFetchResolutions");
            boolean var2 = false;
            if (!this.isCameraOpen()) {
                  if (!this.OpenCamera()) {
                        return 0;
                  }

                  var2 = true;
            }

            Parameters var3 = this.m_Camera.getParameters();
            List var4 = this.getCameraSizes(var3);
            var1[0] = new int[var4.size() * 2];

            for(int var5 = 0; var5 < var4.size(); ++var5) {
                  var1[0][2 * var5] = ((Size)var4.get(var5)).width;
                  var1[0][2 * var5 + 1] = ((Size)var4.get(var5)).height;
            }

            if (var2) {
                  this.CloseCamera();
            }

            return var4.size();
      }

      class s3eCameraTakePicture implements PictureCallback {
            public String m_strFile = null;
            public boolean m_bToFile = false;
            public int m_nType = 0;

            public void onPictureTaken(byte[] var1, Camera var2) {
                  new String();
                  AtomicInteger var4 = new AtomicInteger(0);
                  if (this.m_bToFile) {
                        byte[] var5 = s3eCameraHelpAPI.SaveToFile(this.m_strFile, var1, this.m_nType, var4);
                        s3eCamera.this.onTakeImageCallback(var5, 1, var4.get());
                  } else {
                        s3eCamera.this.onTakeImageCallback(var1, 2, var4.get());
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onTakeImageCallback end");
            }
      }

      class Preview extends SurfaceView implements Callback {
            Preview(Context var2) {
                  super(var2);
                  SurfaceHolder var3 = this.getHolder();
                  var3.addCallback(this);
                  var3.setType(3);
            }

            public void surfaceCreated(SurfaceHolder var1) {
                  if (s3eCamera.this.OpenCamera()) {
                        try {
                              s3eCamera.this.m_Camera.setPreviewDisplay(var1);
                              s3eCamera.this.m_Camera.setPreviewCallback(s3eCamera.this);
                        } catch (Exception var3) {
                              s3eCamera.this.CloseCamera();
                        }

                        s3eCamera.m_CameraOpenSem.release();
                  }
            }

            public void surfaceDestroyed(SurfaceHolder var1) {
                  s3eCamera.this.CloseCamera();
            }

            public void surfaceChanged(SurfaceHolder var1, int var2, int var3, int var4) {
                  if (!var1.isCreating()) {
                        synchronized(s3eCamera.m_CameraLock) {
                              if (s3eCamera.this.m_Camera != null) {
                                    s3eCamera.this.setCameraParameters();
                                    s3eCamera.this.m_Camera.startPreview();
                              }
                        }
                  }
            }
      }
}
