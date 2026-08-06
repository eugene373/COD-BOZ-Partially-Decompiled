package com.ideaworks3d.marmalade.event

class RequestPermissionsResultEvent(
    var m_requestCode: Int,
    var m_permissions: Array<out String>,
    var m_grantResults: IntArray
)
