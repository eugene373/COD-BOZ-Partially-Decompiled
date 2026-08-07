package com.google.android.gms.wearable

// Auto-emitted from smali.
// 7 fields, 21 methods.

open class PutDataRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private var acH: ByteArray
    private val ava: android.os.Bundle
    private val mUri: android.net.Uri

    private constructor(versionCode: Int, uri: android.net.Uri)

    constructor(versionCode: Int, uri: android.net.Uri, assets: android.os.Bundle, data: ByteArray)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAsset(key: String): com.google.android.gms.wearable.Asset { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/Asset;
    //         return-object v0
    */

    public fun getAssets(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/wearable/Asset;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->acH:[B
    //         return-object v0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->mUri:Landroid/net/Uri;
    //         return-object v0
    */

    public fun hasAsset(key: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun pT(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun putAsset(key: String, value: com.google.android.gms.wearable.Asset): com.google.android.gms.wearable.PutDataRequest { return TODO("body: (Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {p2}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         return-object p0
    */

    public fun removeAsset(key: String): com.google.android.gms.wearable.PutDataRequest { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setData(data: ByteArray): com.google.android.gms.wearable.PutDataRequest { return TODO("body: ([B)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/wearable/PutDataRequest;->acH:[B
    //         return-object p0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "DataMap"
    //         const/4 v1, 0x3
    //         invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->toString(Z)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun toString(verbose: Boolean): String { return TODO("body: (Z)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const-string v0, "PutDataRequest["
    //         invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "dataSz="
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->acH:[B
    //         if-nez v0, :cond_0
    //         const-string v0, "null"
    //         :goto_0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, ", numAssets="
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v2}, Landroid/os/Bundle;->size()I
    //         move-result v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, ", uri="
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/PutDataRequest;->mUri:Landroid/net/Uri;
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         if-nez p1, :cond_1
    //         const-string v0, "]"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->acH:[B
    //         array-length v0, v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "]\n  assets: "
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "\n    "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ": "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/wearable/PutDataRequest;->ava:Landroid/os/Bundle;
    //         invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_2
    //         :cond_2
    //         const-string v0, "\n  ]"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/e;->a(Lcom/google/android/gms/wearable/PutDataRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val WEAR_URI_SCHEME: String = "wear"
    private val auZ: java.util.Random = null!!

    public @JvmStatic fun create(path: String): com.google.android.gms.wearable.PutDataRequest { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/wearable/PutDataRequest;->dg(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->k(Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createFromDataItem(source: com.google.android.gms.wearable.DataItem): com.google.android.gms.wearable.PutDataRequest { return TODO("body: (Lcom/google/android/gms/wearable/DataItem;)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 4
    //         invoke-interface {p0}, Lcom/google/android/gms/wearable/DataItem;->getUri()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->k(Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/wearable/DataItem;->getAssets()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/wearable/DataItemAsset;
    //         invoke-interface {v1}, Lcom/google/android/gms/wearable/DataItemAsset;->getId()Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Cannot create an asset for a put request without a digest: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/DataItemAsset;
    //         invoke-interface {v0}, Lcom/google/android/gms/wearable/DataItemAsset;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/Asset;->createFromRef(Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;
    //         move-result-object v0
    //         invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;
    //         goto :goto_0
    //         :cond_1
    //         invoke-interface {p0}, Lcom/google/android/gms/wearable/DataItem;->getData()[B
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->setData([B)Lcom/google/android/gms/wearable/PutDataRequest;
    //         return-object v2
    */

    public @JvmStatic fun createWithAutoAppendedId(pathPrefix: String): com.google.android.gms.wearable.PutDataRequest { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v1, "/"
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         const-string v1, "PN"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         sget-object v2, Lcom/google/android/gms/wearable/PutDataRequest;->auZ:Ljava/util/Random;
    //         invoke-virtual {v2}, Ljava/util/Random;->nextLong()J
    //         move-result-wide v2
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->dg(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/wearable/PutDataRequest;
    //         const/4 v2, 0x1
    //         invoke-direct {v1, v2, v0}, Lcom/google/android/gms/wearable/PutDataRequest;-><init>(ILandroid/net/Uri;)V
    //         return-object v1
    */

    private @JvmStatic fun dg(p0: String): android.net.Uri { return TODO("body: (Ljava/lang/String;)Landroid/net/Uri;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "An empty path was supplied."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "/"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "A path must start with a single / ."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const-string v0, "//"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "A path must start with a single / ."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         new-instance v0, Landroid/net/Uri$Builder;
    //         invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V
    //         const-string v1, "wear"
    //         invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun k(p0: android.net.Uri): com.google.android.gms.wearable.PutDataRequest { return TODO("body: (Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/wearable/PutDataRequest;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, v1, p0}, Lcom/google/android/gms/wearable/PutDataRequest;-><init>(ILandroid/net/Uri;)V
    //         return-object v0
    */

    }
}
