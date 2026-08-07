package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 19 fields, 33 methods.

open class s3eCamera: android.hardware.Camera.PreviewCallback, com.ideaworks3d.marmalade.SuspendResumeListener {
        var m_SizeHint: Int
        var m_Width: Int
        var m_Height: Int
        var m_PixelFormat: Int
        var m_Type: Int
        var m_Quality: Int
        var m_AutoFocus: Int
        var m_FlashMode: Int
        var m_TorchMode: Int
        private var m_Camera: android.hardware.Camera
        private var m_Preview: com.ideaworks3d.marmalade.s3eCamera$Preview
        private var m_Running: Boolean
        private var m_NeedsRemovePreview: Boolean
        private var m_AutoFocusIsOn: Boolean
        private var m_TypesToCameraId: Array<Int>
        private var m_AutoFocusModes: Array<String>
        private var m_NonAutoFocusModes: Array<String>

    private external fun previewCallback(p0: Array<Byte>, p1: Int, p2: Int, p3: Int, p4: Int)
    private external fun onTakeImageCallback(p0: Array<Byte>, p1: Int, p2: Int)
    private fun isCameraOpen(): Boolean { return TODO("body: ()Z") }
    private fun OpenCamera(): Boolean { return TODO("body: ()Z") }
    private fun CloseCamera() { /* TODO(body): ()V */ }
    public fun s3eCameraGetInt(p0: Int): Int { return TODO("body: (I)I") }
    private fun isFocusModeSupported(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    private fun setFocusMode(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    private fun chooseFocusMode(p0: Array<String>): Boolean { return TODO("body: ([Ljava/lang/String;)Z") }
    private fun forceRefocus(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    private fun setAutoFocusOnParams(): Boolean { return TODO("body: ()Z") }
    private fun setAutoFocusOffParams(): Boolean { return TODO("body: ()Z") }
    public fun s3eCameraSetInt(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    fun setFlashMode(p0: Int): Int { return TODO("body: (I)I") }
    fun getFlashMode(): Int { return TODO("body: ()I") }
    fun setTorchMode(p0: Int): Int { return TODO("body: (I)I") }
    fun getTorchMode(): Int { return TODO("body: ()I") }
    private fun s3ePixelFormatToPlatform(p0: Int): Int { return TODO("body: (I)I") }
    public fun s3eCameraIsFormatSupported(p0: Int): Boolean { return TODO("body: (I)Z") }
    public fun onPreviewFrame(p0: Array<Byte>, p1: android.hardware.Camera) { /* TODO(body): ([BLandroid/hardware/Camera;)V */ }
    public fun s3eCameraStart(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Int { return TODO("body: (IIIII)I") }
    public fun s3eCameraStop(): Int { return TODO("body: ()I") }
    private fun getOptimalPreviewSize(p0: java.util.List, p1: Int, p2: Int): android.hardware.Camera$Size { return TODO("body: (Ljava/util/List;II)Landroid/hardware/Camera$Size;") }
    private fun getCameraSizes(p0: android.hardware.Camera$Parameters): java.util.List { return TODO("body: (Landroid/hardware/Camera$Parameters;)Ljava/util/List;") }
    public fun setCameraParameters(): android.hardware.Camera$Size { return TODO("body: ()Landroid/hardware/Camera$Size;") }
    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    public fun createPreview(): Int { return TODO("body: ()I") }
    public fun removePreview(): Int { return TODO("body: ()I") }
    public fun s3eCameraTakePictureToFile(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    public fun s3eCameraTakePictureToBuffer() { /* TODO(body): ()V */ }
    public fun s3eCameraFetchResolutions(p0: Array<Array<Int>>): Int { return TODO("body: ([[I)I") }

    companion object {
        private val m_CameraLock: Object = null!!
        private val m_CameraOpenSem: java.util.concurrent.Semaphore = null!!

        @JvmStatic fun s3eCameraFlashModeToPlatform(p0: Int, p1: Array<String>): Boolean { return TODO("body: (I[Ljava/lang/String;)Z") }
        @JvmStatic fun s3eCameraTorchModeToPlatform(p0: Int, p1: Array<String>): Boolean { return TODO("body: (I[Ljava/lang/String;)Z") }
    }
}
