package com.google.android.gms.drive.events

// Auto-emitted from smali.
// 16 fields, 17 methods.

class CompletionEvent: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.drive.events.ResourceEvent {
    val BR: Int
    val Dd: String
    val Fa: Int
    val MW: com.google.android.gms.drive.DriveId
    val NN: android.os.ParcelFileDescriptor
    val NO: android.os.ParcelFileDescriptor
    val NP: com.google.android.gms.drive.metadata.internal.MetadataBundle
    val NQ: java.util.ArrayList
    val NR: android.os.IBinder
    private var NS: Boolean
    private var NT: Boolean
    private var NU: Boolean

    constructor(versionCode: Int, driveId: com.google.android.gms.drive.DriveId, accountName: String, baseParcelFileDescriptor: android.os.ParcelFileDescriptor, modifiedParcelFileDescriptor: android.os.ParcelFileDescriptor, modifiedMetadataBundle: com.google.android.gms.drive.metadata.internal.MetadataBundle, status: java.util.ArrayList, releaseCallback: Int, p8: android.os.IBinder)

    private fun L(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NU:Z
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NN:Landroid/os/ParcelFileDescriptor;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/jy;->a(Landroid/os/ParcelFileDescriptor;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NO:Landroid/os/ParcelFileDescriptor;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/jy;->a(Landroid/os/ParcelFileDescriptor;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NR:Landroid/os/IBinder;
    //         if-nez v0, :cond_1
    //         const-string v1, "CompletionEvent"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No callback on "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         if-eqz p1, :cond_0
    //         const-string v0, "snooze"
    //         :goto_0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/google/android/gms/drive/internal/v;->q(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         const-string v0, "dismiss"
    //         goto :goto_0
    //         :cond_1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NR:Landroid/os/IBinder;
    //         invoke-static {v0}, Lcom/google/android/gms/drive/internal/ae$a;->X(Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/ae;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/drive/internal/ae;->L(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v0
    //         const-string v2, "CompletionEvent"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "RemoteException on "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         if-eqz p1, :cond_2
    //         const-string v0, "snooze"
    //         :goto_2
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, ": "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Lcom/google/android/gms/drive/internal/v;->q(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_2
    //         const-string v0, "dismiss"
    //         goto :goto_2
    */

    private fun hU() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NU:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Event has already been dismissed or snoozed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun dismiss() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/drive/events/CompletionEvent;->L(Z)V
    //         return-void
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBaseContentsInputStream(): java.io.InputStream { return TODO("body: ()Ljava/io/InputStream;") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NN:Landroid/os/ParcelFileDescriptor;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NS:Z
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "getBaseInputStream() can only be called once per CompletionEvent instance."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NS:Z
    //         new-instance v0, Ljava/io/FileInputStream;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NN:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    //         goto :goto_0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->MW:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun getModifiedContentsInputStream(): java.io.InputStream { return TODO("body: ()Ljava/io/InputStream;") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NO:Landroid/os/ParcelFileDescriptor;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NT:Z
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "getModifiedInputStream() can only be called once per CompletionEvent instance."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NT:Z
    //         new-instance v0, Ljava/io/FileInputStream;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NO:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    //         goto :goto_0
    */

    public fun getModifiedMetadataChangeSet(): com.google.android.gms.drive.MetadataChangeSet { return TODO("body: ()Lcom/google/android/gms/drive/MetadataChangeSet;") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NP:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/MetadataChangeSet;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NP:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/MetadataChangeSet;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         iget v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->Fa:I
    //         return v0
    */

    public fun getTrackingTags(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/CompletionEvent;->hU()V
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NQ:Ljava/util/ArrayList;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x2
    //         return v0
    */

    public fun snooze() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/drive/events/CompletionEvent;->L(Z)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NQ:Ljava/util/ArrayList;
    //         if-nez v0, :cond_0
    //         const-string v0, "<null>"
    //         :goto_0
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v2, "CompletionEvent [id=%s, status=%s, trackingTag=%s]"
    //         const/4 v3, 0x3
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->MW:Lcom/google/android/gms/drive/DriveId;
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         iget v5, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->Fa:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x2
    //         aput-object v0, v3, v4
    //         invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "\'"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\',\'"
    //         iget-object v2, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->NQ:Ljava/util/ArrayList;
    //         invoke-static {v1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\'"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/events/b;->a(Lcom/google/android/gms/drive/events/CompletionEvent;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val STATUS_CONFLICT: Int = 0x2
    @JvmField public val STATUS_FAILURE: Int = 0x1
    @JvmField public val STATUS_SUCCESS: Int = 0
    }
}
