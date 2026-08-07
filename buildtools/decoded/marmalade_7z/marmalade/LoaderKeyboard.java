package com.ideaworks3d.marmalade;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import java.util.HashMap;

public class LoaderKeyboard implements SuspendResumeListener {
      private boolean m_onScreenKeyboard = false;
      private boolean m_pausing = false;
      private LoaderKeyboard.SoftInputReceiver m_Receiver;
      private LoaderView m_View;
      private int m_keyboardInputType;
      public static final int S3E_KEYBOARD_INPUT_TYPE_DEFAULT = 0;
      public static final int S3E_KEYBOARD_INPUT_TYPE_URL = 1;
      public static final int S3E_KEYBOARD_INPUT_TYPE_EMAIL = 2;
      public static final int S3E_KEYBOARD_INPUT_TYPE_NUMBER = 3;
      public static final int S3E_KEYBOARD_INPUT_TYPE_PHONE = 4;
      private static final HashMap m_InputTypeTransform = new HashMap() {
            {
                  this.put(0, 0);
                  this.put(1, 17);
                  this.put(2, 209);
                  this.put(3, 2);
                  this.put(4, 3);
            }
      };

      private native boolean onKeyEventNative(int var1, int var2, int var3);

      private native void setCharInputEnabledNative(boolean var1);

      public LoaderKeyboard(LoaderView var1) {
            this.m_View = var1;
            this.m_Receiver = new LoaderKeyboard.SoftInputReceiver(this.m_View.m_Handler);
            LoaderAPI.addSuspendResumeListener(this);
            this.m_keyboardInputType = (Integer)m_InputTypeTransform.get(0);
      }

      public void onSuspendResumeEvent(SuspendResumeEvent var1) {
            if (var1.eventType == SuspendResumeEvent.EventType.SUSPEND && this.m_onScreenKeyboard) {
                  this.m_pausing = true;
                  this.setShowOnScreenKeyboard(false);
                  this.m_onScreenKeyboard = true;
            }

            if (var1.eventType == SuspendResumeEvent.EventType.RESUME) {
                  this.m_pausing = false;
                  if (this.m_onScreenKeyboard) {
                        this.setShowOnScreenKeyboard(this.m_onScreenKeyboard);
                  }
            }

      }

      public boolean onKeyEvent(int var1, int var2, KeyEvent var3) {
            int var4 = var3.getUnicodeChar();
            if (var4 == 0 && var3.getCharacters() != null && !var3.getCharacters().isEmpty()) {
                  var4 = var3.getCharacters().charAt(0);
            }

            return this.onKeyEventNative(var1, var4, var2);
      }

      public boolean onKeyPreIme(int var1, KeyEvent var2) {
            if (var1 == 4 && this.m_onScreenKeyboard) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Back key captured, hiding on screen keyboard");
                  this.setCharInputEnabledNative(false);
                  this.setShowOnScreenKeyboard(false);
                  return true;
            } else {
                  return false;
            }
      }

      public void hardKeyboardConfigurationChanged(boolean var1) {
            if (!var1 && this.m_onScreenKeyboard) {
                  this.setShowOnScreenKeyboard(true);
            }

      }

      public int getKeyboardInputType() {
            return this.m_keyboardInputType;
      }

      public void setKeyboardInputType(int var1) {
            int var2 = (Integer)m_InputTypeTransform.get(0);
            if (m_InputTypeTransform.containsKey(var1)) {
                  var2 = (Integer)m_InputTypeTransform.get(var1);
            }

            if (var2 != this.m_keyboardInputType) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "setKeyboardInputType changed to " + this.m_keyboardInputType + " input type.");
                  this.m_keyboardInputType = var2;
                  InputMethodManager var3 = (InputMethodManager)LoaderActivity.m_Activity.getSystemService("input_method");
                  if (var3 != null) {
                        var3.restartInput(this.m_View);
                  }
            }

      }

      public void setShowOnScreenKeyboard(final boolean var1) {
            this.m_onScreenKeyboard = var1;
            final InputMethodManager var2 = (InputMethodManager)LoaderActivity.m_Activity.getSystemService("input_method");
            LoaderActivity.m_Activity.LoaderThread().runOnOSThread(new Runnable() {
                  public void run() {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Showing On Screen Keyboard: " + var1);
                        boolean var1x;
                        if (var1) {
                              LoaderKeyboard.this.m_View.requestFocus();
                              var1x = var2.showSoftInput(LoaderKeyboard.this.m_View, 2, LoaderKeyboard.this.m_Receiver);
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "LoaderKeyboard:Show keyboard result: " + var1x);
                              if (!var1x && LoaderKeyboard.this.m_View.hasWindowFocus()) {
                                    LoaderKeyboard.this.m_View.onWindowFocusChanged(true);
                                    var1x = var2.showSoftInput(LoaderKeyboard.this.m_View, 2, LoaderKeyboard.this.m_Receiver);
                                    LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "LoaderKeyboard:(2)Show keyboard result: " + var1x);
                              }
                        } else {
                              var1x = var2.hideSoftInputFromWindow(LoaderKeyboard.this.m_View.getWindowToken(), 0, LoaderKeyboard.this.m_Receiver);
                              if (!var1x) {
                                    var2.toggleSoftInput(0, 0);
                              }
                        }

                  }
            });
      }

      public boolean getShowOnScreenKeyboard() {
            return this.m_onScreenKeyboard;
      }

      public int getKeyboardInfo() {
            Configuration var1 = this.m_View.getResources().getConfiguration();
            int var2 = 0;
            if (var1.keyboard == 2 && var1.hardKeyboardHidden != 2) {
                  var2 |= 1;
            }

            if (var1.keyboard == 3 && var1.hardKeyboardHidden != 2) {
                  var2 |= 2;
            }

            if (var1.navigation >= 2) {
                  try {
                        Integer var3 = (Integer)var1.getClass().getField("navigationHidden").get(var1);
                        if (var3 == 2) {
                              return var2;
                        }
                  } catch (Exception var4) {
                  }

                  if (!Build.MODEL.equals("Zeus") || var1.hardKeyboardHidden != 2) {
                        var2 |= 4;
                  }
            }

            return var2;
      }

      private class SoftInputReceiver extends ResultReceiver {
            public SoftInputReceiver(Handler var2) {
                  super(var2);
            }

            protected void onReceiveResult(int var1, Bundle var2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Recieved soft input change notification, visibility=" + LoaderKeyboard.this.m_onScreenKeyboard);
                  boolean var3 = false;
                  switch(var1) {
                  case 0:
                  case 2:
                        if (!LoaderKeyboard.this.m_onScreenKeyboard && !LoaderKeyboard.this.m_pausing) {
                              var3 = true;
                        }
                        break;
                  case 1:
                  case 3:
                        if (LoaderKeyboard.this.m_onScreenKeyboard && !LoaderKeyboard.this.m_pausing) {
                              var3 = true;
                        }
                  }

                  if (var3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Toggling on screen keyboard view");
                        InputMethodManager var4 = (InputMethodManager)LoaderActivity.m_Activity.getSystemService("input_method");
                        var4.toggleSoftInput(0, 0);
                  }

            }
      }
}
