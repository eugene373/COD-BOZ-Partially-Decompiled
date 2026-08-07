package com.ideaworks3d.marmalade;

import android.media.AudioTrack;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import android.os.SystemClock;

public class SoundPlayer implements OnPlaybackPositionUpdateListener {
      private AudioTrack m_Track;
      private short[] m_SampleData;
      private int m_BufSize;
      private int m_Period;
      private int m_FrameSize;
      private int m_Volume;
      private boolean m_Stereo = false;
      private boolean m_NeedsPrime = false;
      private int m_SampleRate = 0;
      private static final int INITIAL_BUFFER_SIZE_MULTIPLIER = 2;
      private static final int PERIODS_IN_BUFFER = 2;

      private native void generateAudio(short[] var1, int var2);

      int init(int var1, boolean var2, int var3) {
            this.m_SampleRate = var3;
            this.m_Stereo = var2;
            this.m_Volume = var1;
            if (this.m_SampleRate == 0) {
                  this.m_SampleRate = AudioTrack.getNativeOutputSampleRate(3);
            }

            byte var4 = 2;
            byte var5 = 1;
            byte var6 = 4;
            if (this.m_Stereo) {
                  var6 = 12;
            }

            this.m_FrameSize = 2;
            if (this.m_Stereo) {
                  this.m_FrameSize *= 2;
            }

            int var7 = AudioTrack.getMinBufferSize(this.m_SampleRate, var6, var4);
            this.m_BufSize = var7;
            int var8 = this.m_BufSize / this.m_FrameSize;
            this.m_Period = var8 / 2;
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd stereo      = " + this.m_Stereo);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd samplerate  = " + this.m_SampleRate + " native: " + AudioTrack.getNativeOutputSampleRate(3));
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd buf (bytes) = " + this.m_BufSize);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd buf (mills) = " + this.m_BufSize / 2 * 1000 / this.m_SampleRate);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd framesize   = " + this.m_FrameSize);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd period      = " + this.m_Period);

            try {
                  this.m_Track = new AudioTrack(3, this.m_SampleRate, var6, var4, this.m_BufSize * 2, var5);
                  this.applyVolume();
            } catch (IllegalArgumentException var10) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "error creating AudioTrack " + var10.toString());
                  return 0;
            }

            if (this.m_Track.getState() != 1) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "AudioTrack not initialized");
                  return 0;
            } else {
                  this.m_SampleData = new short[this.m_BufSize * 2];
                  this.m_Track.setPlaybackPositionUpdateListener(this);
                  this.m_Track.setPositionNotificationPeriod(this.m_Period);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd chanconfig  = " + this.m_Track.getChannelConfiguration());
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "snd samplerate  = " + this.m_Track.getPlaybackRate());
                  this.m_NeedsPrime = true;
                  return this.m_SampleRate;
            }
      }

      void start() {
            if (this.m_Track == null) {
                  this.init(this.m_Volume, this.m_Stereo, this.m_SampleRate);
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "starting sound");
            this.m_Track.play();
            if (this.m_NeedsPrime) {
                  this.m_NeedsPrime = false;
                  this.writeSamples(this.m_Period * 2 * 2);
            }

      }

      public void onMarkerReached(AudioTrack var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onMarkerReached");
      }

      private boolean writeSamples(int var1) {
            if (this.m_Track != null && this.m_SampleData != null) {
                  this.generateAudio(this.m_SampleData, var1);
                  int var2 = var1;
                  if (this.m_Stereo) {
                        var2 = var1 * 2;
                  }

                  if (this.m_Track != null && this.m_SampleData != null) {
                        long var3 = SystemClock.uptimeMillis();
                        this.m_Track.write(this.m_SampleData, 0, var2);
                        long var5 = SystemClock.uptimeMillis() - var3;
                        if (var5 > 1L) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "write blocked " + var5 + " headpos=" + this.m_Track.getPlaybackHeadPosition());
                        }

                        return true;
                  } else {
                        return false;
                  }
            } else {
                  return false;
            }
      }

      public synchronized void onPeriodicNotification(AudioTrack var1) {
            boolean var2 = this.writeSamples(this.m_Period);
            if (!var2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Sound engine already paused");
            }

      }

      synchronized void stop() {
            if (this.m_Track != null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "stopping sound");
                  this.m_Track.setPlaybackPositionUpdateListener((OnPlaybackPositionUpdateListener)null);
                  this.m_Track.stop();
                  this.m_Track.flush();
                  this.m_Track.release();
                  this.m_Track = null;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "done stopping sound");
            }
      }

      synchronized void pause() {
            if (this.m_Track != null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "pause : " + this.m_Track.getPlayState());
                  if (this.m_Track.getPlayState() == 3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "pausing sound");
                        this.m_Track.pause();
                  }

            }
      }

      synchronized void resume() {
            if (this.m_Track != null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "resume : " + this.m_Track.getPlayState());
                  if (this.m_Track.getPlayState() == 2) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "resuming sound");
                        this.start();
                        this.writeSamples(this.m_Period * 2 * 2);
                  }

            }
      }

      synchronized void setVolume(int var1) {
            this.m_Volume = var1;
            if (this.m_Track != null) {
                  this.applyVolume();
            }
      }

      private synchronized void applyVolume() {
            float var1 = (float)this.m_Volume * AudioTrack.getMaxVolume() / 100.0F;
            this.m_Track.setStereoVolume(var1, var1);
      }
}
