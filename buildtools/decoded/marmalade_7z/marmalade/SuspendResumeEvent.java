package com.ideaworks3d.marmalade;

public class SuspendResumeEvent {
      public final SuspendResumeEvent.EventType eventType;

      public SuspendResumeEvent(SuspendResumeEvent.EventType var1) {
            this.eventType = var1;
      }

      public static enum EventType {
            SUSPEND,
            RESUME,
            SHUTDOWN;
      }
}
