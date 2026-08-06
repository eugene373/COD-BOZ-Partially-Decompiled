package com.ideaworks3d.marmalade.event

class ActivityResultListenerList : ListenerList<ActivityResultListener>() {
    fun notifyAll(event: ActivityResultEvent) {
        for (listener in getListeners()) {
            listener.onActivityResultEvent(event)
        }
    }
}
