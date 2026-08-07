package com.google.android.gms.plus

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class PlusClient_Builder {
    private val ali: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks
    private val alj: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    private val alk: com.google.android.gms.plus.internal.i
    private val mContext: android.content.Context

    public constructor(context: android.content.Context, connectionCallbacks: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, connectionFailedListener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)

    public fun build(): com.google.android.gms.plus.PlusClient { return TODO("body: ()Lcom/google/android/gms/plus/PlusClient;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/google/android/gms/plus/PlusClient;
    //         new-instance v1, Lcom/google/android/gms/plus/internal/e;
    //         iget-object v2, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->mContext:Landroid/content/Context;
    //         iget-object v3, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->ali:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    //         iget-object v4, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->alj:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    //         iget-object v5, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->alk:Lcom/google/android/gms/plus/internal/i;
    //         invoke-virtual {v5}, Lcom/google/android/gms/plus/internal/i;->nq()Lcom/google/android/gms/plus/internal/h;
    //         move-result-object v5
    //         invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/plus/internal/e;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;Lcom/google/android/gms/plus/internal/h;)V
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/plus/PlusClient;-><init>(Lcom/google/android/gms/plus/internal/e;)V
    //         return-object v0
    */

    public fun clearScopes(): com.google.android.gms.plus.PlusClient.Builder { return TODO("body: ()Lcom/google/android/gms/plus/PlusClient$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->alk:Lcom/google/android/gms/plus/internal/i;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/i;->np()Lcom/google/android/gms/plus/internal/i;
    //         return-object p0
    */

    public fun setAccountName(accountName: String): com.google.android.gms.plus.PlusClient.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/PlusClient$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->alk:Lcom/google/android/gms/plus/internal/i;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/i;->ch(Ljava/lang/String;)Lcom/google/android/gms/plus/internal/i;
    //         return-object p0
    */

    public fun setActions(actions: Array<String>): com.google.android.gms.plus.PlusClient.Builder { return TODO("body: ([Ljava/lang/String;)Lcom/google/android/gms/plus/PlusClient$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->alk:Lcom/google/android/gms/plus/internal/i;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/i;->h([Ljava/lang/String;)Lcom/google/android/gms/plus/internal/i;
    //         return-object p0
    */

    public fun setScopes(scopes: Array<String>): com.google.android.gms.plus.PlusClient.Builder { return TODO("body: ([Ljava/lang/String;)Lcom/google/android/gms/plus/PlusClient$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->alk:Lcom/google/android/gms/plus/internal/i;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/i;->g([Ljava/lang/String;)Lcom/google/android/gms/plus/internal/i;
    //         return-object p0
    */

}
