package com.ideaworks3d.marmalade

class SuspendResumeEvent(
    val eventType: EventType,
) {
    enum class EventType {
        SUSPEND,
        RESUME,
        SHUTDOWN,
    }
}
