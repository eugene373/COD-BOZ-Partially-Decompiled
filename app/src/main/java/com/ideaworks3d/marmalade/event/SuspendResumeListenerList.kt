package com.ideaworks3d.marmalade.event

import com.ideaworks3d.marmalade.SuspendResumeEvent
import com.ideaworks3d.marmalade.SuspendResumeListener

class SuspendResumeListenerList : ListenerList() {

    fun notifyAll(event: SuspendResumeEvent) {
        val it = m_Listeners.iterator()
        while (it.hasNext()) {
            val listener = it.next() as? SuspendResumeListener
            if (listener != null) {
                listener.onSuspendResumeEvent(event)
            }
        }
    }
}
