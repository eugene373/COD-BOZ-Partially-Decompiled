package com.ideaworks3d.marmalade.event

class RequestPermissionsResultListenerList : ListenerList() {

    fun notifyAll(event: RequestPermissionsResultEvent) {
        val it = m_Listeners.iterator()
        while (it.hasNext()) {
            val listener = it.next() as? RequestPermissionsResultListener
            if (listener != null) {
                listener.onRequestPermissionsResultEvent(event)
            }
        }
    }
}
