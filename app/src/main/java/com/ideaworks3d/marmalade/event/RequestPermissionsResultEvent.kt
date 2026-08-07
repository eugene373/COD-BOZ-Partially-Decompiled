package com.ideaworks3d.marmalade.event

class RequestPermissionsResultEvent(
    @JvmField var m_requestCode: Int,
    @JvmField var m_permissions: Array<String>?,
    @JvmField var m_grantResults: IntArray?,
)
