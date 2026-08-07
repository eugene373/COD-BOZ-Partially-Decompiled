package com.ideaworks3d.marmalade;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.Image.Plane;
import android.media.ImageReader.OnImageAvailableListener;
import android.util.Size;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class s3eCamera2 implements SuspendResumeListener {
      static final int S3E_RESULT_SUCCESS = 0;
      static final int S3E_RESULT_ERROR = 1;
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
      static final int S3E_CAMERA_PIXEL_TYPE_YV12 = 4098;
      static final int S3E_CAMERA_TYPE_REAR = 0;
      static final int S3E_CAMERA_TYPE_FRONT = 1;
      static final int S3E_CAMERA_ERR_NONE = 0;
      static final int S3E_CAMERA_ERR_MEM = 8;
      static final int S3E_CAMERA_ERR_OPEN_FILE = 9;
      static final int S3E_CAMERA_ERR_IO = 10;
      static final int S3E_CAMERA_ERR_UNKNOWN = 11;
      static final int S3E_CAMERA_ERR_OPERATION_NA = 12;
      static final int S3E_CAMERA_TAKE_PICTURE_TYPE_FILE = 1;
      static final int S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER = 2;
      static final int S3E_CAMERA_FLASH_MODE_OFF = 0;
      static final int S3E_CAMERA_FLASH_MODE_ON = 1;
      static final int S3E_CAMERA_FLASH_MODE_AUTO = 2;
      static final int S3E_CAMERA_FLASH_MODE_RED_EYE_REDUCTION = 3;
      static final int S3E_CAMERA_TORCH_MODE_OFF = 0;
      static final int S3E_CAMERA_TORCH_MODE_ON = 1;
      static final int S3E_CAMERA_TORCH_MODE_AUTO = 2;
      static final int DefaultAutoFocusMode = 4;
      int m_SizeHint = 0;
      int m_Width = 0;
      int m_Height = 0;
      int m_PixelFormat = 0;
      int m_Facing = 0;
      int m_Quality = 0;
      int m_AutoFocus = 0;
      int m_FlashMode = 0;
      int m_TorchMode = 0;
      private s3eCamera2.s3eCameraInfo[] m_CameraInfos = new s3eCamera2.s3eCameraInfo[2];
      private s3eCamera2.s3eCameraInfo m_CurrentCameraInfo = null;
      private CameraDevice m_Camera;
      private boolean m_Running = false;
      private ImageReader m_ImageReader;
      private ImageReader m_ImageReaderJPEG;
      private CameraCaptureSession m_CaptureSession;
      private Builder m_PreviewRequestBuilder;
      private Builder m_PreviewRequestBuilderJPEG;
      private String m_strFile = null;
      private boolean m_bToFile = false;
      private int m_nSaveFilePathType = 0;
      private boolean m_bIsJPEG = false;
      private static final Object m_CameraLock = new Object();
      private static final Semaphore m_CameraOpenSem = new Semaphore(0);
      private static final Semaphore m_TakePictureSem = new Semaphore(0);
      private final OnImageAvailableListener mOnImageAvailableListenerJPEG = new OnImageAvailableListener() {
            public void onImageAvailable(ImageReader var1) {
                  Image var2 = var1.acquireNextImage();
                  Plane[] var3 = var2.getPlanes();
                  byte[] var4 = new byte[var3[0].getBuffer().remaining()];
                  var3[0].getBuffer().get(var4);
                  var2.close();
                  s3eCamera2.this.StartCapture(false);
                  s3eCamera2.m_TakePictureSem.release();
                  s3eCamera2.this.SaveToFile(var4);
            }
      };
      private final OnImageAvailableListener mOnImageAvailableListener = new OnImageAvailableListener() {
            public void onImageAvailable(ImageReader var1) {
                  synchronized(s3eCamera2.m_CameraLock) {
                        if (s3eCamera2.this.m_Camera != null) {
                              Image var3 = var1.acquireNextImage();
                              Plane[] var4 = var3.getPlanes();
                              if (var4.length != 3) {
                                    LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Image was obtained in an unexpected format");
                                    var3.close();
                              } else {
                                    int var5 = var3.getWidth();
                                    int var6 = var3.getHeight();
                                    int var7 = 2 * var4[2].getRowStride() / var5 >= 2 ? var4[2].getRowStride() : 0;
                                    byte[] var8 = new byte[3 * var5 * var6 / 2 + var7];
                                    boolean var9 = false;
                                    byte var10 = 0;
                                    int var14;
                                    int var15;
                                    if (var4[1].getPixelStride() == 1) {
                                          var15 = s3eCamera2.CopyLines(var8, var10, var5, var6, var4[0], 0);
                                          var15 = s3eCamera2.CopyLines(var8, var15, var5 / 2, var6 / 2, var4[1], 0);
                                          s3eCamera2.CopyLines(var8, var15, var5 / 2, var6 / 2, var4[2], 0);
                                          var14 = 842094169;
                                    } else {
                                          var4[0].getBuffer().get();
                                          var4[1].getBuffer().get();
                                          var4[2].getBuffer().get();
                                          byte var11 = 1;
                                          var15 = s3eCamera2.CopyLines(var8, var10, var5, var6, var4[0], var11);
                                          var15 = s3eCamera2.CopyLines(var8, var15, var5, var6 / 2, var4[1], 1 + var11);
                                          var8[var15 - 1] = var4[2].getBuffer().get(var4[2].getBuffer().remaining() - 1);
                                          var14 = 17;
                                    }

                                    s3eCamera2.this.previewCallback(var8, var14, var5, var6, LoaderActivity.m_Activity.LoaderThread().getOrientation());
                                    var3.close();
                              }
                        }
                  }
            }
      };
      private final StateCallback mStateCallback = new StateCallback() {
            public void onOpened(CameraDevice var1) {
                  synchronized(s3eCamera2.m_CameraLock) {
                        s3eCamera2.this.m_Camera = var1;
                        s3eCamera2.this.createCameraPreviewSession();
                        s3eCamera2.m_CameraOpenSem.release();
                  }
            }

            public void onDisconnected(CameraDevice var1) {
                  var1.close();
            }

            public void onError(CameraDevice var1, int var2) {
                  var1.close();
            }
      };

      private native void previewCallback(byte[] var1, int var2, int var3, int var4, int var5);

      private native void onTakeImageCallback(byte[] var1, int var2, int var3);

      public s3eCamera2() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCamera2()");
            LoaderAPI.addSuspendResumeListener(this);
            this.ResetCameraIds();
      }

      private void ResetCameraIds() {
            try {
                  CameraManager var1 = (CameraManager)LoaderActivity.m_Activity.getSystemService(Context.CAMERA_SERVICE);
                  String[] var2 = var1.getCameraIdList();
                  int var3 = var2.length;
                  int var4 = 0;

                  while(var4 < var3) {
                        String var5 = var2[var4];
                        CameraCharacteristics var6 = var1.getCameraCharacteristics(var5);
                        boolean var7 = false;
                        int[] var8 = (int[])var6.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
                        int var9 = var8.length;
                        int var10 = 0;

                        while(true) {
                              if (var10 < var9) {
                                    int var11 = var8[var10];
                                    var7 = var11 == 4;
                                    if (!var7) {
                                          ++var10;
                                          continue;
                                    }
                              }

                              boolean var13 = (Boolean)var6.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                              s3eCamera2.s3eCameraInfo var14 = null;
                              if ((Integer)var6.get(CameraCharacteristics.LENS_FACING) == 0) {
                                    this.m_CameraInfos[1] = new s3eCamera2.s3eCameraInfo();
                                    var14 = this.m_CameraInfos[1];
                              }

                              if ((Integer)var6.get(CameraCharacteristics.LENS_FACING) == 1) {
                                    this.m_CameraInfos[0] = new s3eCamera2.s3eCameraInfo();
                                    var14 = this.m_CameraInfos[0];
                              }

                              if (var14 != null) {
                                    var14.m_CameraId = var5;
                                    var14.m_AutoFocusAvailable = var7;
                                    var14.m_FlashAvailable = var13;
                              }

                              ++var4;
                              break;
                        }
                  }

                  if (this.m_CameraInfos[0] == null && this.m_CameraInfos[1] != null) {
                        this.m_Facing = 1;
                  }

                  this.m_CurrentCameraInfo = this.m_CameraInfos[this.m_Facing];
            } catch (CameraAccessException var12) {
                  var12.printStackTrace();
            }

      }

      private boolean isCameraOpen() {
            synchronized(m_CameraLock) {
                  return this.m_Camera != null;
            }
      }

      private boolean CameraRestart() {
            if (this.isCameraOpen()) {
                  this.CloseCamera();
                  return this.OpenCamera();
            } else {
                  return true;
            }
      }

      private String GetCameraId() {
            return this.m_CurrentCameraInfo != null ? this.m_CurrentCameraInfo.m_CameraId : null;
      }

      private static final int CopyLines(byte[] var0, int var1, int var2, int var3, Plane var4, int var5) {
            int var6 = var4.getRowStride();
            ByteBuffer var7 = var4.getBuffer();
            if (var6 == var2) {
                  var7.get(var0, var1, var6 * var3 - var5);
                  var1 += var2 * var3;
            } else {
                  for(int var8 = 0; var8 < var3 - 1; ++var8) {
                        var7.get(var0, var1, var6);
                        var1 += var2;
                  }

                  var7.get(var0, var1, var2 - var5);
                  var1 += var2;
            }

            return var1;
      }

      private Size GetIdealSize() {
            byte var1 = 1;
            if (this.m_SizeHint == 1) {
                  var1 = 2;
            } else if (this.m_SizeHint == 0) {
                  var1 = 4;
            }

            LoaderView var2 = LoaderActivity.m_Activity.m_View;
            Size var3 = new Size(var2.m_Width / var1, var2.m_Height / var1);
            if (var3.getWidth() < var3.getHeight()) {
                  var3 = new Size(var3.getHeight(), var3.getWidth());
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "IdealSize: " + var3.getWidth() + "x" + var3.getHeight());
            return var3;
      }

      private Size ChooseOptimalSize(Size[] var1) {
            Size var2;
            if (this.m_Width > 0 && this.m_Height > 0) {
                  Size var3 = new Size(this.m_Width, this.m_Height);
                  if (!Arrays.asList(var1).contains(var3)) {
                        throw new RuntimeException("Can't apply desired size.");
                  }

                  var2 = var3;
            } else {
                  var2 = (Size)Collections.min(Arrays.asList(var1), new s3eCamera2.CloseToIdeal(this.GetIdealSize()));
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "SelectedSize: " + var2.getWidth() + "x" + var2.getHeight());
            return var2;
      }

      private Size[] getCameraSizes() throws CameraAccessException {
            if (this.GetCameraId() != null) {
                  CameraManager var1 = (CameraManager)LoaderActivity.m_Activity.getSystemService(Context.CAMERA_SERVICE);
                  CameraCharacteristics var2 = var1.getCameraCharacteristics(this.GetCameraId());
                  StreamConfigurationMap var3 = (StreamConfigurationMap)var2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                  return var3.getOutputSizes(35);
            } else {
                  return new Size[0];
            }
      }

      private void ResetPreviewSize() {
            try {
                  Size var1 = this.ChooseOptimalSize(this.getCameraSizes());
                  this.m_ImageReader = ImageReader.newInstance(var1.getWidth(), var1.getHeight(), ImageFormat.YUV_420_888, 2);
                  this.m_ImageReader.setOnImageAvailableListener(this.mOnImageAvailableListener, LoaderActivity.m_Activity.m_View.m_Handler);
                  this.m_ImageReaderJPEG = ImageReader.newInstance(var1.getWidth(), var1.getHeight(), ImageFormat.JPEG, 2);
                  this.m_ImageReaderJPEG.setOnImageAvailableListener(this.mOnImageAvailableListenerJPEG, LoaderActivity.m_Activity.m_View.m_Handler);
            } catch (CameraAccessException var2) {
                  var2.printStackTrace();
            }

      }

      private void createCameraPreviewSession() {
            try {
                  this.ResetPreviewSize();
                  this.m_PreviewRequestBuilderJPEG = this.m_Camera.createCaptureRequest(CameraDevice.TEMPLATE_STILL_CAPTURE);
                  this.m_PreviewRequestBuilderJPEG.addTarget(this.m_ImageReaderJPEG.getSurface());
                  this.m_PreviewRequestBuilder = this.m_Camera.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW);
                  this.m_PreviewRequestBuilder.addTarget(this.m_ImageReader.getSurface());
                  this.StartCapture(false);
            } catch (CameraAccessException var2) {
                  var2.printStackTrace();
            }

      }

      private void setPreviewRequestBuilderFields(Builder var1) {
            int var2 = this.m_AutoFocus != 0 ? 4 : 0;
            var1.set(CaptureRequest.CONTROL_AF_MODE, var2);
            switch(this.m_TorchMode) {
            case 0:
                  var1.set(CaptureRequest.CONTROL_AE_MODE, 1);
                  var1.set(CaptureRequest.FLASH_MODE, 0);
                  break;
            case 1:
                  var1.set(CaptureRequest.CONTROL_AE_MODE, 1);
                  var1.set(CaptureRequest.FLASH_MODE, 2);
            case 2:
            }

      }

      private void setStillCaptureRequestBuilderFields(Builder var1) {
            int var2 = this.m_AutoFocus != 0 ? 4 : 0;
            var1.set(CaptureRequest.CONTROL_AF_MODE, var2);
            switch(this.m_FlashMode) {
            case 0:
                  var1.set(CaptureRequest.CONTROL_AE_MODE, 1);
                  var1.set(CaptureRequest.FLASH_MODE, 0);
                  break;
            case 1:
                  var1.set(CaptureRequest.CONTROL_AE_MODE, 1);
                  var1.set(CaptureRequest.FLASH_MODE, 2);
                  break;
            case 2:
                  var1.set(CaptureRequest.CONTROL_AE_MODE, 2);
                  break;
            case 3:
                  var1.set(CaptureRequest.CONTROL_AE_MODE, 4);
            }

      }

      private void StartCapture(boolean var1) {
            if (this.m_CaptureSession != null) {
                  this.m_CaptureSession.close();
                  this.m_CaptureSession = null;
            }

            this.m_bIsJPEG = var1;

            try {
                  this.m_Camera.createCaptureSession(Arrays.asList(this.m_bIsJPEG ? this.m_ImageReaderJPEG.getSurface() : this.m_ImageReader.getSurface()), new android.hardware.camera2.CameraCaptureSession.StateCallback() {
                        public void onConfigured(CameraCaptureSession var1) {
                              if (null != s3eCamera2.this.m_Camera) {
                                    try {
                                          if (s3eCamera2.this.m_bIsJPEG) {
                                                s3eCamera2.this.setStillCaptureRequestBuilderFields(s3eCamera2.this.m_PreviewRequestBuilderJPEG);
                                                var1.capture(s3eCamera2.this.m_PreviewRequestBuilderJPEG.build(), (CaptureCallback)null, LoaderActivity.m_Activity.m_View.m_Handler);
                                          } else {
                                                s3eCamera2.this.setPreviewRequestBuilderFields(s3eCamera2.this.m_PreviewRequestBuilder);
                                                var1.setRepeatingRequest(s3eCamera2.this.m_PreviewRequestBuilder.build(), (CaptureCallback)null, LoaderActivity.m_Activity.m_View.m_Handler);
                                          }

                                          s3eCamera2.this.m_CaptureSession = var1;
                                    } catch (CameraAccessException var3) {
                                          var3.printStackTrace();
                                    }

                              }
                        }

                        public void onConfigureFailed(CameraCaptureSession var1) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "mOnImageAvailableListener: OnImageAvailableListener 1");
                        }
                  }, LoaderActivity.m_Activity.m_View.m_Handler);
            } catch (CameraAccessException var3) {
                  var3.printStackTrace();
            }

      }

      private boolean OpenCamera() {
            if (this.isCameraOpen()) {
                  return true;
            } else if (this.GetCameraId() == null) {
                  return false;
            } else {
                  try {
                        CameraManager var1 = (CameraManager)LoaderActivity.m_Activity.getSystemService(Context.CAMERA_SERVICE);
                        var1.openCamera(this.GetCameraId(), this.mStateCallback, LoaderActivity.m_Activity.m_View.m_Handler);
                        m_CameraOpenSem.acquire();
                  } catch (CameraAccessException var2) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CameraAccessException" + var2.getMessage());
                        var2.printStackTrace();
                        return false;
                  } catch (SecurityException var3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "OpenCamera(): no permissions");
                        return false;
                  } catch (InterruptedException var4) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "OpenCamera(): waiting for semaphore failed");
                        return false;
                  }

                  return this.isCameraOpen();
            }
      }

      public int s3eCameraStart(int var1, int var2, int var3, int var4, int var5) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraStart");
            if (!this.s3eCameraIsFormatSupported(var2)) {
                  return 1;
            } else {
                  this.m_SizeHint = var1;
                  this.m_Width = var4;
                  this.m_Height = var5;
                  this.m_PixelFormat = var2;
                  this.m_Quality = var3;
                  this.m_Running = this.OpenCamera();
                  return this.m_Running ? 0 : 1;
            }
      }

      private void CloseCamera() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "CloseCamera start");
            synchronized(m_CameraLock) {
                  if (this.m_Camera != null) {
                        while(this.m_CaptureSession == null) {
                              try {
                                    Thread.sleep(1L);
                              } catch (InterruptedException var5) {
                              }
                        }

                        try {
                              this.m_CaptureSession.stopRepeating();
                        } catch (CameraAccessException var4) {
                              var4.printStackTrace();
                        }

                        this.m_CaptureSession.close();
                        this.m_CaptureSession = null;
                        this.m_Camera.close();
                        this.m_Camera = null;
                        if (this.m_ImageReader != null) {
                              this.m_ImageReader.close();
                              this.m_ImageReader = null;
                        }

                        if (this.m_ImageReaderJPEG != null) {
                              this.m_ImageReaderJPEG.close();
                              this.m_ImageReaderJPEG = null;
                        }

                  }
            }
      }

      public int s3eCameraStop() {
            this.m_Running = false;
            this.CloseCamera();
            return 0;
      }

      public int s3eCameraGetInt(int var1) {
            switch(var1) {
            case 0:
                  boolean var2 = s3eCameraHelpAPI.hasCameraSystemFeature() && s3eCameraHelpAPI.hasCameraPermissionGranted();
                  return var2 ? 1 : 0;
            case 1:
                  return this.isCameraOpen() ? 1 : 0;
            case 2:
            case 4:
            case 5:
            case 6:
            default:
                  return -1;
            case 3:
                  return this.m_AutoFocus;
            case 7:
                  return this.m_Facing;
            case 8:
                  return this.m_FlashMode;
            case 9:
                  return this.m_TorchMode;
            }
      }

      public int s3eCameraSetInt(int var1, int var2) {
            boolean var3 = false;
            if (var1 == 7) {
                  if (this.m_Facing == var2) {
                        var3 = true;
                  } else if (this.m_CameraInfos[var2] != null) {
                        this.m_Facing = var2;
                        this.m_CurrentCameraInfo = this.m_CameraInfos[this.m_Facing];
                        var3 = this.CameraRestart();
                        this.m_AutoFocus = 0;
                        this.m_FlashMode = 0;
                  } else {
                        var3 = false;
                  }
            } else if (var1 == 3) {
                  if (this.m_AutoFocus == var2) {
                        var3 = true;
                  } else if (var2 != 0 && this.m_CurrentCameraInfo != null && !this.m_CurrentCameraInfo.m_AutoFocusAvailable) {
                        var3 = false;
                  } else {
                        this.m_AutoFocus = var2;
                        var3 = this.CameraRestart();
                  }
            } else if (var1 == 8) {
                  if (this.m_FlashMode == var2) {
                        var3 = true;
                  } else if (var2 != 0 && this.m_CurrentCameraInfo != null && !this.m_CurrentCameraInfo.m_FlashAvailable) {
                        var3 = false;
                  } else {
                        this.m_FlashMode = var2;
                        var3 = this.CameraRestart();
                  }
            } else if (var1 == 9) {
                  if (this.m_TorchMode == var2) {
                        var3 = true;
                  } else if (var2 != 0 && !this.m_CurrentCameraInfo.m_FlashAvailable) {
                        var3 = false;
                  } else {
                        this.m_TorchMode = var2;
                        var3 = this.CameraRestart();
                  }
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraSetInt: " + var1 + " <= " + var2 + " -> " + var3);
            return var3 ? 0 : 1;
      }

      public boolean s3eCameraIsFormatSupported(int var1) {
            return var1 == 4098 || var1 == 4097;
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

      void SaveToFile(byte[] var1) {
            AtomicInteger var2 = new AtomicInteger(0);
            if (this.m_bToFile) {
                  byte[] var3 = s3eCameraHelpAPI.SaveToFile(this.m_strFile, var1, this.m_nSaveFilePathType, var2);
                  this.onTakeImageCallback(var3, 1, var2.get());
            } else {
                  this.onTakeImageCallback(var1, 2, var2.get());
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "SaveToFile end");
      }

      public void s3eCameraTakePictureToFile(String var1, int var2) {
            try {
                  if (this.m_bIsJPEG || !this.isCameraOpen()) {
                        this.onTakeImageCallback((byte[])null, 1, 12);
                        return;
                  }

                  this.m_nSaveFilePathType = var2;
                  this.m_strFile = var1;
                  this.m_bToFile = true;
                  this.StartCapture(true);
                  m_TakePictureSem.acquire();
            } catch (InterruptedException var4) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraTakePictureToFile(): waiting for semaphore failed");
            }

      }

      public void s3eCameraTakePictureToBuffer() {
            try {
                  if (this.m_bIsJPEG || !this.isCameraOpen()) {
                        this.onTakeImageCallback((byte[])null, 2, 12);
                        return;
                  }

                  this.m_strFile = null;
                  this.m_bToFile = false;
                  this.StartCapture(true);
                  m_TakePictureSem.acquire();
            } catch (InterruptedException var2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "s3eCameraTakePictureToBuffer(): waiting for semaphore failed");
            }

      }

      public int s3eCameraFetchResolutions(int[][] var1) {
            try {
                  List var2 = Arrays.asList(this.getCameraSizes());
                  var1[0] = new int[var2.size() * 2];

                  for(int var3 = 0; var3 < var2.size(); ++var3) {
                        var1[0][2 * var3] = ((Size)var2.get(var3)).getWidth();
                        var1[0][2 * var3 + 1] = ((Size)var2.get(var3)).getHeight();
                  }

                  return var2.size();
            } catch (CameraAccessException var4) {
                  var4.printStackTrace();
                  return 0;
            }
      }

      static class CloseToIdeal implements Comparator {
            Size m_IdealSize;

            CloseToIdeal(Size var1) {
                  this.m_IdealSize = var1;
            }

            public int compare(Size var1, Size var2) {
                  return Math.abs(var1.getHeight() - this.m_IdealSize.getHeight()) + Math.abs(var1.getWidth() - this.m_IdealSize.getWidth()) - (Math.abs(var2.getHeight() - this.m_IdealSize.getHeight()) + Math.abs(var2.getWidth() - this.m_IdealSize.getWidth()));
            }

            @Override
            public int compare(Object o, Object t1) {
                  return compare((Size)o, (Size)t1);
            }
      }

      private class s3eCameraInfo {
            public String m_CameraId = null;
            public boolean m_AutoFocusAvailable = false;
            public boolean m_FlashAvailable = false;

            public s3eCameraInfo() {
            }
      }
}
