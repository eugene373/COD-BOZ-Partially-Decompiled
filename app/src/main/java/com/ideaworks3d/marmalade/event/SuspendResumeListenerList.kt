package com.ideaworks3d.marmalade.event

import com.ideaworks3d.marmalade.SuspendResumeEvent
import com.ideaworks3d.marmalade.SuspendResumeListener

class SuspendResumeListenerList : ListenerList<SuspendResumeListener>() {
    fun notifyAll(event: SuspendResumeEvent) {
        for (listener in getListeners()) {
            listener.onSuspendResumeEvent(event)
        }
    }
}
