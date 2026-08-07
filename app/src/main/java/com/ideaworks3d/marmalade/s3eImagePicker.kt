package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 2 fields, 6 methods.

open class s3eImagePicker {
        private var waitingForFile: Boolean

    public external fun ImagePicker_addResultString(p0: String): Boolean
    public fun s3eImagePickerSaveToGallery(p0: Boolean, p1: Int, p2: Int, p3: String, p4: Array<Byte>): Int { return TODO("body: (ZIILjava/lang/String;[B)I") }
    public fun s3eImagePickerToFile(p0: Int, p1: Int): String { return TODO("body: (II)Ljava/lang/String;") }
    private fun CopyStream(p0: java.io.InputStream, p1: java.io.OutputStream): Boolean { return TODO("body: (Ljava/io/InputStream;Ljava/io/OutputStream;)Z") }
    private fun getPicasaFile(p0: android.net.Uri): java.io.File { return TODO("body: (Landroid/net/Uri;)Ljava/io/File;") }
    private fun convertUriToFile(p0: android.net.Uri): java.io.File { return TODO("body: (Landroid/net/Uri;)Ljava/io/File;") }

    companion object {
        val CURSOR_TYPE: Array<String> = null!!
    }
}
