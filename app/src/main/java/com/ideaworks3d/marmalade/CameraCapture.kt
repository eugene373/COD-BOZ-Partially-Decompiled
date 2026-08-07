package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 3 fields, 9 methods.

open class CameraCapture {
    private fun CheckCamera(): Int { return TODO("body: ()I") }
    public fun s3eCameraCaptureIsFormatSupported(p0: Int): Int { return TODO("body: (I)I") }
    public fun s3eCameraCaptureToFile(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    private fun startCaptureVideo(): java.io.File { return TODO("body: ()Ljava/io/File;") }
    private fun startCaptureImage(): java.io.File { return TODO("body: ()Ljava/io/File;") }

    companion object {
        private var s_Images: Int
        private var s_Videos: Int
        private var m_WaitingForFile: Boolean

        public @JvmStatic fun convertUriToFile(p0: android.net.Uri, p1: Array<String>): java.io.File { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;") }
        private @JvmStatic fun fixRotatedJpegIssue(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
        private @JvmStatic fun getImageOrientation(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
        private @JvmStatic fun PrintCameraCharacteristics() { /* TODO(body): ()V */ }
    }
}
