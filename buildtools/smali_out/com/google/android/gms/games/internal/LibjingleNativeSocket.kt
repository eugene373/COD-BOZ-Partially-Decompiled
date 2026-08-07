package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

class LibjingleNativeSocket: com.google.android.gms.games.multiplayer.realtime.RealTimeSocket {
    private val KE: android.os.ParcelFileDescriptor
    private val XX: java.io.InputStream
    private val XY: java.io.OutputStream

    constructor(parcelFileDescriptor: android.os.ParcelFileDescriptor)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;->KE:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    //         return-void
    */

    public fun getInputStream(): java.io.InputStream { return TODO("body: ()Ljava/io/InputStream;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;->XX:Ljava/io/InputStream;
    //         return-object v0
    */

    public fun getOutputStream(): java.io.OutputStream { return TODO("body: ()Ljava/io/OutputStream;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;->XY:Ljava/io/OutputStream;
    //         return-object v0
    */

    public fun getParcelFileDescriptor(): android.os.ParcelFileDescriptor { return TODO("body: ()Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;->KE:Landroid/os/ParcelFileDescriptor;
    //         return-object v0
    */

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;->XX:Ljava/io/InputStream;
    //         invoke-virtual {v0}, Ljava/io/InputStream;->available()I
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    companion object {
    private val TAG: String = null!!
    }
}
