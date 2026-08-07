package com.ideaworks3d.marmalade.event

import android.content.Intent

class ActivityResultEvent(
    @JvmField var m_intent: Intent?,
    @JvmField var m_requestCode: Int,
    @JvmField var m_resultCode: Int,
)
