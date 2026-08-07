package com.ideaworks3d.marmalade;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;

public class SoundRecord implements OnRecordPositionUpdateListener {
      private AudioRecord m_AudioRecord = null;
      private short[] m_Buffer;
      private int m_BufSize;
      private int m_Period;
      private int m_Frequency;
      private int m_BufferSizeHintMs;
      private static final int PERIODS_IN_BUFFER = 2;

      private native void recordAudio(short[] var1, int var2, int var3);

      public static int available() {
            return LoaderActivity.m_Activity.getPackageManager().hasSystemFeature("android.hardware.microphone") ? 1 : 0;
      }

      public int start(int var1) {
            if (this.m_AudioRecord == null && available() != 0) {
                  if (var1 != -1) {
                        this.m_Frequency = var1;
                  }
                  byte var3 = 16;
                  byte var4 = 2;
                  this.m_BufSize = AudioRecord.getMinBufferSize(this.m_Frequency, var3, var4);
                  if (this.m_BufSize == -2) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Frequency: " + this.m_Frequency + " is unsupported on this device. Defaulting to 8000Hz");
                        this.m_Frequency = 8000;
                        this.m_BufSize = AudioRecord.getMinBufferSize(this.m_Frequency, var3, var4);
                        if (this.m_BufSize == -2) {
                              return 0;
                        }
                  }

                  int var5;
                  if (this.m_BufferSizeHintMs > 0) {
                        var5 = (this.m_Frequency * this.m_BufferSizeHintMs + 999) / 1000;
                        if (var5 > this.m_BufSize) {
                              this.m_BufSize = var5;
                        }
                  } else if (this.m_BufSize <= 4096) {
                        this.m_BufSize *= 2;
                  }

                  this.m_Period = this.m_BufSize / 2;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "record m_Frequency = " + this.m_Frequency);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "record min bufsize (bytes) = " + this.m_BufSize * 2);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "record min delay (mills) = " + this.m_BufSize * 1000 / this.m_Frequency);
                  this.m_Buffer = new short[this.m_BufSize];
                  this.m_AudioRecord = new AudioRecord(1, this.m_Frequency, var3, var4, this.m_BufSize);
                  this.m_AudioRecord.setRecordPositionUpdateListener(this);
                  this.m_AudioRecord.setPositionNotificationPeriod(this.m_Period);

                  try {
                        this.m_AudioRecord.startRecording();
                  } catch (IllegalStateException var6) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Exception: " + var6.toString());
                        return 0;
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "recording ...");
                  var5 = this.m_AudioRecord.read(this.m_Buffer, 0, this.m_Period);
                  this.recordAudio(this.m_Buffer, var5, this.m_Frequency);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "recording working " + var5);
                  return this.m_Frequency;
            } else {
                  return 0;
            }
      }

      public void onMarkerReached(AudioRecord var1) {
      }

      public void onPeriodicNotification(AudioRecord var1) {
            int var2 = var1.read(this.m_Buffer, 0, this.m_Period);
            this.recordAudio(this.m_Buffer, var2, this.m_Frequency);
      }

      public int stop() {
            if (this.m_AudioRecord == null) {
                  return 1;
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "stopping recording");
                  this.m_AudioRecord.setRecordPositionUpdateListener((OnRecordPositionUpdateListener)null);
                  this.m_AudioRecord.stop();
                  this.m_AudioRecord.release();
                  this.m_AudioRecord = null;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "done stopping recording");
                  return 0;
            }
      }
}
