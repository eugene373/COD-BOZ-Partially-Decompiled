package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

class RealTimeSocketImpl: com.google.android.gms.games.multiplayer.realtime.RealTimeSocket {
    private var KE: android.os.ParcelFileDescriptor
    private val Xr: String
    private val Ye: android.net.LocalSocket

    constructor(localSocket: android.net.LocalSocket, participantId: String)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->Ye:Landroid/net/LocalSocket;
    //         invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
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
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->Ye:Landroid/net/LocalSocket;
    //         invoke-virtual {v0}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v0
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
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->Ye:Landroid/net/LocalSocket;
    //         invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParcelFileDescriptor(): android.os.ParcelFileDescriptor { return TODO("body: ()Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->KE:Landroid/os/ParcelFileDescriptor;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->Ye:Landroid/net/LocalSocket;
    //         invoke-virtual {v1}, Landroid/net/LocalSocket;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeFileDescriptor(Ljava/io/FileDescriptor;)V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->readFileDescriptor()Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->KE:Landroid/os/ParcelFileDescriptor;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->KE:Landroid/os/ParcelFileDescriptor;
    //         return-object v0
    */

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->Ye:Landroid/net/LocalSocket;
    //         invoke-virtual {v0}, Landroid/net/LocalSocket;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;->Ye:Landroid/net/LocalSocket;
    //         invoke-virtual {v0}, Landroid/net/LocalSocket;->isBound()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
