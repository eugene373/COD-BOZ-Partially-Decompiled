package com.ideaworks3d.marmalade.event

import com.ideaworks3d.marmalade.NewIntentEvent
import com.ideaworks3d.marmalade.NewIntentListener

class NewIntentListenerList : ListenerList() {

    fun notifyAll(event: NewIntentEvent) {
        val it = m_Listeners.iterator()
        while (it.hasNext()) {
            val listener = it.next() as? NewIntentListener
            if (listener != null) {
                listener.onNewIntentEvent(event)
            }
        }
    }
}
