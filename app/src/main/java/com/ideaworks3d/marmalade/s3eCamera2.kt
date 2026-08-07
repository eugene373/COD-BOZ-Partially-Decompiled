package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 28 fields, 27 methods.

open class s3eCamera2: com.ideaworks3d.marmalade.SuspendResumeListener {
        var m_SizeHint: Int
        var m_Width: Int
        var m_Height: Int
        var m_PixelFormat: Int
        var m_Facing: Int
        var m_Quality: Int
        var m_AutoFocus: Int
        var m_FlashMode: Int
        var m_TorchMode: Int
        private var m_CameraInfos: Array<com.ideaworks3d.marmalade.s3eCamera2$s3eCameraInfo>
        private var m_CurrentCameraInfo: com.ideaworks3d.marmalade.s3eCamera2$s3eCameraInfo
        private var m_Camera: android.hardware.camera2.CameraDevice
        private var m_Running: Boolean
        private var m_ImageReader: android.media.ImageReader
        private var m_ImageReaderJPEG: android.media.ImageReader
        private var m_CaptureSession: android.hardware.camera2.CameraCaptureSession
        private var m_PreviewRequestBuilder: android.hardware.camera2.CaptureRequest$Builder
        private var m_PreviewRequestBuilderJPEG: android.hardware.camera2.CaptureRequest$Builder
        private var m_strFile: String
        private var m_bToFile: Boolean
        private var m_nSaveFilePathType: Int
        private var m_bIsJPEG: Boolean
        private val mOnImageAvailableListenerJPEG: android.media.ImageReader$OnImageAvailableListener
        private val mOnImageAvailableListener: android.media.ImageReader$OnImageAvailableListener
        private val mStateCallback: android.hardware.camera2.CameraDevice$StateCallback

    private external fun previewCallback(p0: Array<Byte>, p1: Int, p2: Int, p3: Int, p4: Int)
    private external fun onTakeImageCallback(p0: Array<Byte>, p1: Int, p2: Int)
    private fun ResetCameraIds() { /* TODO(body): ()V */ }
    private fun isCameraOpen(): Boolean { return TODO("body: ()Z") }
    private fun CameraRestart(): Boolean { return TODO("body: ()Z") }
    private fun GetCameraId(): String { return TODO("body: ()Ljava/lang/String;") }
    private fun GetIdealSize(): android.util.Size { return TODO("body: ()Landroid/util/Size;") }
    private fun ChooseOptimalSize(p0: Array<android.util.Size>): android.util.Size { return TODO("body: ([Landroid/util/Size;)Landroid/util/Size;") }
    private fun getCameraSizes(): Array<android.util.Size> { return TODO("body: ()[Landroid/util/Size;") }
    private fun ResetPreviewSize() { /* TODO(body): ()V */ }
    private fun createCameraPreviewSession() { /* TODO(body): ()V */ }
    private fun setPreviewRequestBuilderFields(p0: android.hardware.camera2.CaptureRequest$Builder) { /* TODO(body): (Landroid/hardware/camera2/CaptureRequest$Builder;)V */ }
    private fun setStillCaptureRequestBuilderFields(p0: android.hardware.camera2.CaptureRequest$Builder) { /* TODO(body): (Landroid/hardware/camera2/CaptureRequest$Builder;)V */ }
    private fun StartCapture(p0: Boolean) { /* TODO(body): (Z)V */ }
    private fun OpenCamera(): Boolean { return TODO("body: ()Z") }
    public fun s3eCameraStart(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Int { return TODO("body: (IIIII)I") }
    private fun CloseCamera() { /* TODO(body): ()V */ }
    public fun s3eCameraStop(): Int { return TODO("body: ()I") }
    public fun s3eCameraGetInt(p0: Int): Int { return TODO("body: (I)I") }
    public fun s3eCameraSetInt(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    public fun s3eCameraIsFormatSupported(p0: Int): Boolean { return TODO("body: (I)Z") }
    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    fun SaveToFile(p0: Array<Byte>) { /* TODO(body): ([B)V */ }
    public fun s3eCameraTakePictureToFile(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    public fun s3eCameraTakePictureToBuffer() { /* TODO(body): ()V */ }
    public fun s3eCameraFetchResolutions(p0: Array<Array<Int>>): Int { return TODO("body: ([[I)I") }

    companion object {
        private val m_CameraLock: Object = null!!
        private val m_CameraOpenSem: java.util.concurrent.Semaphore = null!!
        private val m_TakePictureSem: java.util.concurrent.Semaphore = null!!

        private @JvmStatic fun CopyLines(p0: Array<Byte>, p1: Int, p2: Int, p3: Int, p4: android.media.Image$Plane, p5: Int): Int { return TODO("body: ([BIIILandroid/media/Image$Plane;I)I") }
    }
}
