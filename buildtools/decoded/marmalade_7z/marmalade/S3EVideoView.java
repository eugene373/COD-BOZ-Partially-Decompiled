package com.ideaworks3d.marmalade;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.VideoView;
import android.widget.FrameLayout.LayoutParams;

public class S3EVideoView extends VideoView implements OnPreparedListener, OnCompletionListener, OnErrorListener, SuspendResumeListener {
      public static final int S3E_VIDEO_STOPPED = 0;
      public static final int S3E_VIDEO_PLAYING = 1;
      public static final int S3E_VIDEO_PAUSED = 2;
      public static final int S3E_VIDEO_FAILED = 3;
      public static final int S3E_VIDEO_MAX_VOLUME = 256;
      private LoaderActivity m_LoaderActivity;
      private String m_Path;
      private Uri m_Uri;
      private int m_Repeats;
      private boolean m_Fullscreen;
      private int m_Width;
      private int m_Height;
      private MediaPlayer m_MediaPlayer;
      private float m_Volume = 1.0F;
      private int m_StoredPos = 0;
      private boolean m_PausedBeforeSuspend = false;
      private FrameLayout m_FullScreenView = null;

      public S3EVideoView(LoaderActivity var1) {
            super(var1);
            this.m_LoaderActivity = var1;
            this.setOnPreparedListener(this);
            this.setOnCompletionListener(this);
            this.setOnErrorListener(this);
            LoaderAPI.addSuspendResumeListener(this);
      }

      public int videoGetPosition() {
            try {
                  return this.getCurrentPosition();
            } catch (IllegalStateException var2) {
                  return 0;
            }
      }

      public int videoPlay(String var1, int var2, long var3, long var5) {
            this.m_Repeats = var2;
            if (var5 == 0L) {
                  this.m_Path = var1;
                  this.setVideoPath(this.m_Path);
            } else {
                  this.m_Uri = Uri.parse(VFSProvider.ASSET_URI + "/" + var1 + "/" + var3 + "/" + var5);
                  this.setVideoURI(this.m_Uri);
            }

            return 0;
      }

      public void videoPause() {
            this.m_StoredPos = this.getCurrentPosition();
            this.pause();
      }

      public void videoResume() {
            this.seekTo(this.m_StoredPos);
            if (this.m_PausedBeforeSuspend) {
                  this.m_PausedBeforeSuspend = false;
                  this.pause();
            } else {
                  this.start();
            }
      }

      public void onSuspendResumeEvent(SuspendResumeEvent var1) {
            if (var1.eventType == SuspendResumeEvent.EventType.SUSPEND) {
                  this.m_PausedBeforeSuspend = this.m_MediaPlayer == null || !this.isPlaying();
                  this.videoPause();
            }

      }

      public void videoStop() {
            this.m_MediaPlayer = null;
            this.m_StoredPos = 0;
            this.stopPlayback();
      }

      public void videoAddView(boolean var1, int var2, int var3, int var4, int var5) {
            this.m_Fullscreen = var1;
            this.m_Width = var4;
            this.m_Height = var5;
            if (var1) {
                  LayoutParams var6 = new LayoutParams(-1, -1, 17);
                  this.m_Width = 0;
                  this.m_Height = 0;
                  this.m_FullScreenView = new FrameLayout(this.m_LoaderActivity);
                  this.m_FullScreenView.addView(this, var6);
                  this.m_FullScreenView.setBackgroundColor(-16777216);
                  this.m_LoaderActivity.m_FrameLayout.addView(this.m_FullScreenView, var6);
            } else {
                  android.widget.RelativeLayout.LayoutParams var7 = new android.widget.RelativeLayout.LayoutParams(var4, var5);
                  var7.leftMargin = var2;
                  var7.topMargin = var3;
                  this.m_LoaderActivity.m_TopLevel.addView(this, var7);
            }

            this.setZOrderOnTop(true);
      }

      public void videoRemoveView() {
            if (this.m_Fullscreen) {
                  this.m_LoaderActivity.m_FrameLayout.removeView(this.m_FullScreenView);
                  this.m_FullScreenView = null;
            } else {
                  this.m_LoaderActivity.m_TopLevel.removeView(this);
            }

      }

      public void videoSetVolume(int var1) {
            this.m_Volume = (float)var1 / 256.0F;
            if (this.m_MediaPlayer != null) {
                  this.m_MediaPlayer.setVolume(this.m_Volume, this.m_Volume);
            }

      }

      public void onPrepared(MediaPlayer var1) {
            this.m_MediaPlayer = var1;
            this.m_MediaPlayer.setVolume(this.m_Volume, this.m_Volume);
            this.videoResume();
      }

      public boolean onError(MediaPlayer var1, int var2, int var3) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "videoError : " + var2);
            this.m_LoaderActivity.m_View.videoStopped();
            return true;
      }

      public void onCompletion(MediaPlayer var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "videoCompletion");
            this.m_MediaPlayer = null;
            --this.m_Repeats;
            if (this.m_Repeats <= 0) {
                  this.videoStop();
                  this.m_LoaderActivity.m_View.videoStopped();
            } else {
                  this.stopPlayback();
                  this.m_StoredPos = 0;
                  if (this.m_Uri != null) {
                        this.setVideoURI(this.m_Uri);
                  } else {
                        this.setVideoPath(this.m_Path);
                  }
            }

      }

      public boolean onTouchEvent(MotionEvent var1) {
            if (this.m_LoaderActivity.LoaderThread() != null) {
                  int[] var2 = new int[2];
                  this.getLocationOnScreen(var2);
                  var1.offsetLocation((float)var2[0], (float)var2[1]);
                  return this.m_LoaderActivity.LoaderThread().onTouchEvent(var1);
            } else {
                  return false;
            }
      }

      protected void onMeasure(int var1, int var2) {
            super.onMeasure(var1, var2);
            if (this.m_Width != 0 && this.m_Height != 0) {
                  this.setMeasuredDimension(this.m_Width, this.m_Height);
            }

      }
}
