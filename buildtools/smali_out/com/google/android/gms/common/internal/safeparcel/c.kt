package com.google.android.gms.common.internal.safeparcel

// Auto-emitted from smali.
// 0 fields, 4 methods.

class c {
    companion object {
    public @JvmStatic fun a(p0: android.content.Intent, p1: String, p2: android.os.Parcelable.Creator): com.google.android.gms.common.internal.safeparcel.SafeParcelable { return TODO("body: (Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;",
    //                 ">(",
    //                 "Landroid/content/Intent;",
    //                 "Ljava/lang/String;",
    //                 "Landroid/os/Parcelable$Creator",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v0, p2}, Lcom/google/android/gms/common/internal/safeparcel/c;->a([BLandroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun a(p0: ByteArray, p1: android.os.Parcelable.Creator): com.google.android.gms.common.internal.safeparcel.SafeParcelable { return TODO("body: ([BLandroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;",
    //                 ">([B",
    //                 "Landroid/os/Parcelable$Creator",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         array-length v0, p0
    //         invoke-virtual {v1, p0, v2, v0}, Landroid/os/Parcel;->unmarshall([BII)V
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->setDataPosition(I)V
    //         invoke-interface {p1, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    */

    public @JvmStatic fun a(p0: com.google.android.gms.common.internal.safeparcel.SafeParcelable, p1: android.content.Intent, p2: String) { /* TODO(body): (Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;Landroid/content/Intent;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;",
    //                 ">(TT;",
    //                 "Landroid/content/Intent;",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;)[B
    //         move-result-object v0
    //         invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;
    //         return-void
    */

    public @JvmStatic fun a(p0: com.google.android.gms.common.internal.safeparcel.SafeParcelable): ByteArray { return TODO("body: (Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;)[B") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;",
    //                 ">(TT;)[B"
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-interface {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;->writeToParcel(Landroid/os/Parcel;I)V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-object v1
    */

    }
}
