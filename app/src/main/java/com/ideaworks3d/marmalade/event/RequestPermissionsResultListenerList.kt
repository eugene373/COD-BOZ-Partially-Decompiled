package com.ideaworks3d.marmalade.event

class RequestPermissionsResultListenerList : ListenerList<RequestPermissionsResultListener>() {
    fun notifyAll(event: RequestPermissionsResultEvent) {
        for (listener in getListeners()) {
            listener.onRequestPermissionsResultEvent(event)
        }
    }
}
