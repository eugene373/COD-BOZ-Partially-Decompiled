package com.ideaworks3d.marmalade

import android.content.Intent

class NewIntentEvent(
    val eventType: EventType,
    val intent: Intent?,
) {
    enum class EventType {
        NEWINTENT,
    }
}
