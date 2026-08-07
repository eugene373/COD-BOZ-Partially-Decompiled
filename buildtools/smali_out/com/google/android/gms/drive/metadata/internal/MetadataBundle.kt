package com.google.android.gms.drive.metadata.internal

// Auto-emitted from smali.
// 3 fields, 15 methods.

class MetadataBundle: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val PL: android.os.Bundle

    constructor(versionCode: Int, valueBundle: android.os.Bundle)

    private constructor(valueBundle: android.os.Bundle)

    public fun a(p0: com.google.android.gms.drive.metadata.MetadataField): Object { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/drive/metadata/MetadataField;->f(Landroid/os/Bundle;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun b(p0: com.google.android.gms.drive.metadata.MetadataField, p1: Object) { /* TODO(body): (Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<TT;>;TT;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/e;->bj(Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/MetadataField;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unregistered field: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-interface {p1, p2, v0}, Lcom/google/android/gms/drive/metadata/MetadataField;->a(Ljava/lang/Object;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-ne p0, p1, :cond_0
    //         move v0, v1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         if-nez v0, :cond_1
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         iget-object v3, p1, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v3
    //         invoke-interface {v0, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_2
    //         move v0, v2
    //         goto :goto_0
    //         :cond_2
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_3
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v4, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v4
    //         iget-object v5, p1, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v4, v0}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         move v0, v2
    //         goto :goto_0
    //         :cond_4
    //         move v0, v1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         mul-int/lit8 v1, v1, 0x1f
    //         iget-object v3, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
    //         move-result v0
    //         add-int/2addr v0, v1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return v1
    */

    public fun ip(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<*>;>;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
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
    //         invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/e;->bj(Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/MetadataField;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun setContext(context: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Ql:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/data/a;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/data/a;->a(Ljava/io/File;)V
    //         :cond_0
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "MetadataBundle [values="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/h;->a(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun a(p0: com.google.android.gms.drive.metadata.MetadataField, p1: Object): com.google.android.gms.drive.metadata.internal.MetadataBundle { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;"
    //             }
    //         .end annotation
    //         invoke-static {}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->io()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v0
    //         invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun a(p0: com.google.android.gms.drive.metadata.internal.MetadataBundle): com.google.android.gms.drive.metadata.internal.MetadataBundle { return TODO("body: (Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         new-instance v1, Landroid/os/Bundle;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->PL:Landroid/os/Bundle;
    //         invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;-><init>(Landroid/os/Bundle;)V
    //         return-object v0
    */

    public @JvmStatic fun io(): com.google.android.gms.drive.metadata.internal.MetadataBundle { return TODO("body: ()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;-><init>(Landroid/os/Bundle;)V
    //         return-object v0
    */

    }
}
