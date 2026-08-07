package com.ideaworks3d.marmalade.event

class ActivityResultListenerList : ListenerList() {

    fun notifyAll(event: ActivityResultEvent) {
        val it = m_Listeners.iterator()
        while (it.hasNext()) {
            val listener = it.next() as? ActivityResultListener
            if (listener != null) {
                listener.onActivityResultEvent(event)
            }
        }
    }
}
