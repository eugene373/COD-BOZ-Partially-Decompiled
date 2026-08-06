package com.ideaworks3d.marmalade.event

import android.content.Intent

class ActivityResultEvent(
    var m_intent: Intent?,
    var m_requestCode: Int,
    var m_resultCode: Int
)
