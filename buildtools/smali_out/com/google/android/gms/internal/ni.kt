package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 7 methods.

open class ni: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val akH: Long
    public val akI: ByteArray
    public val akJ: android.os.Bundle
    public val tag: String
    public val versionCode: Int

    constructor(p0: Int, p1: Long, p2: String, p3: ByteArray, p4: android.os.Bundle)

    public constructor(p0: Long, p1: String, p2: ByteArray, p3: Array<String>)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v0, "tag="
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ni;->tag:Ljava/lang/String;
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ","
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, "eventTime="
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ni;->akH:J
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ","
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ni;->akJ:Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ni;->akJ:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "keyValues="
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ni;->akJ:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v3, "("
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ","
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ni;->akJ:Landroid/os/Bundle;
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, ")"
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, " "
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/nk;->a(Lcom/google/android/gms/internal/ni;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.nk = null!!

    private @JvmStatic fun f(p0: Array<String>): android.os.Bundle { return TODO("body: ([Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         return-object v0
    //         :cond_1
    //         array-length v1, p0
    //         rem-int/lit8 v1, v1, 0x2
    //         if-eqz v1, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "extras must have an even number of elements"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         array-length v1, p0
    //         div-int/lit8 v2, v1, 0x2
    //         if-eqz v2, :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0, v2}, Landroid/os/Bundle;-><init>(I)V
    //         const/4 v1, 0x0
    //         :goto_0
    //         if-ge v1, v2, :cond_0
    //         mul-int/lit8 v3, v1, 0x2
    //         aget-object v3, p0, v3
    //         mul-int/lit8 v4, v1, 0x2
    //         add-int/lit8 v4, v4, 0x1
    //         aget-object v4, p0, v4
    //         invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    */

    }
}
