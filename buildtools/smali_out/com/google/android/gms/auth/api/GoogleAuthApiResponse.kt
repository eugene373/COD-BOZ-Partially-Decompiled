package com.google.android.gms.auth.api

// Auto-emitted from smali.
// 5 fields, 11 methods.

open class GoogleAuthApiResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val DA: ByteArray
    val Dz: android.os.Bundle
    val responseCode: Int
    val versionCode: Int

    public constructor(versionCode: Int, responseCode: Int, headers: android.os.Bundle, body: ByteArray)

    public constructor(responseCode: Int, headers: android.os.Bundle, body: ByteArray)

    public constructor(responseCode: Int, body: java.util.Map, p2: ByteArray)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getBody(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->DA:[B
    //         return-object v0
    */

    public fun getHeaders(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getHeadersAsMap(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;
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
    //         iget-object v3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun getResponseCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->responseCode:I
    //         return v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiResponseCreator;->a(Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.auth.api.GoogleAuthApiResponseCreator = null!!

    private @JvmStatic fun B(p0: java.util.Map): android.os.Bundle { return TODO("body: (Ljava/util/Map;)Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Landroid/os/Bundle;"
    //             }
    //         .end annotation
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    }
}
