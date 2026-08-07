package com.google.android.gms.cast

// Auto-emitted from smali.
// 8 fields, 16 methods.

class ApplicationMetadata: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var EA: java.util.List
    var EB: java.util.List
    var EC: String
    var ED: android.net.Uri
    var Ez: String
    var mName: String

    private constructor()

    constructor(versionCode: Int, applicationId: String, name: String, senderAppIdentifier: java.util.List, senderAppLaunchUrl: java.util.List, p5: String, p6: android.net.Uri)

    public fun areNamespacesSupported(p0: java.util.List): Boolean { return TODO("body: (Ljava/util/List;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)Z"
    //             }
    //         .end annotation
    //         .local p1, "namespaces":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/cast/ApplicationMetadata;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/cast/ApplicationMetadata;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->Ez:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->Ez:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EA:Ljava/util/List;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->EA:Ljava/util/List;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->mName:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->mName:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EC:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->EC:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->ED:Landroid/net/Uri;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/ApplicationMetadata;->ED:Landroid/net/Uri;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun fu(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->ED:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->Ez:Ljava/lang/String;
    //         return-object v0
    */

    public fun getImages(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/common/images/WebImage;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EA:Ljava/util/List;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSenderAppIdentifier(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EC:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x7
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->BR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->Ez:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->mName:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EA:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EC:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->ED:Landroid/net/Uri;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isNamespaceSupported(namespace: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/a;->a(Lcom/google/android/gms/cast/ApplicationMetadata;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
