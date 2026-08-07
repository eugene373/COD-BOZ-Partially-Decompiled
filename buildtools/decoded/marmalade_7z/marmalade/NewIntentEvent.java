package com.ideaworks3d.marmalade;

import android.content.Intent;

public class NewIntentEvent {
      public final NewIntentEvent.EventType eventType;
      public final Intent intent;

      public NewIntentEvent(NewIntentEvent.EventType var1, Intent var2) {
            this.eventType = var1;
            this.intent = var2;
      }

      public static enum EventType {
            NEWINTENT;
      }
}
