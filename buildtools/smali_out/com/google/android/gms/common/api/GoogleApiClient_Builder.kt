package com.google.android.gms.common.api

// Auto-emitted from smali.
// 14 fields, 16 methods.

class GoogleApiClient_Builder {
    private var Dd: String
    private var IH: android.os.Looper
    private val IJ: java.util.Set
    private var IK: Int
    private var IL: android.view.View
    private var IM: String
    private val IN: java.util.Map
    private var IO: android.support.v4.app.FragmentActivity
    private var IP: Int
    private var IQ: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    private var IR: Int
    private val IS: java.util.Set
    private val IT: java.util.Set
    private val mContext: android.content.Context

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, connectedListener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, connectionFailedListener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

    private fun gl(): com.google.android.gms.common.api.GoogleApiClient { return TODO("body: ()Lcom/google/android/gms/common/api/GoogleApiClient;") }
    /*
    //         .locals 10
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IO:Landroid/support/v4/app/FragmentActivity;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/d;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/google/android/gms/common/api/d;
    //         move-result-object v9
    //         iget v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IP:I
    //         invoke-virtual {v9, v0}, Lcom/google/android/gms/common/api/d;->ak(I)Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/b;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IH:Landroid/os/Looper;
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->gk()Lcom/google/android/gms/common/internal/ClientSettings;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IN:Ljava/util/Map;
    //         iget-object v5, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IS:Ljava/util/Set;
    //         iget-object v6, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IT:Ljava/util/Set;
    //         iget v7, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IP:I
    //         iget v8, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IR:I
    //         invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/api/b;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;II)V
    //         :cond_0
    //         iget v1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IP:I
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IQ:Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
    //         invoke-virtual {v9, v1, v0, v2}, Lcom/google/android/gms/common/api/d;->a(ILcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    //         return-object v0
    */

    public fun addApi(p0: com.google.android.gms.common.api.Api): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/Api",
    //                 "<+",
    //                 "Lcom/google/android/gms/common/api/Api$ApiOptions$NotRequiredOptions;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "api":Lcom/google/android/gms/common/api/Api;, "Lcom/google/android/gms/common/api/Api<+Lcom/google/android/gms/common/api/Api$ApiOptions$NotRequiredOptions;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IN:Ljava/util/Map;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Api;->gd()Ljava/util/List;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         iget-object v4, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IJ:Ljava/util/Set;
    //         invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/Scope;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Scope;->gs()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun addApi(p0: com.google.android.gms.common.api.Api, p1: com.google.android.gms.common.api.Api.ApiOptions.HasOptions): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<O::",
    //                 "Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;",
    //                 ">(",
    //                 "Lcom/google/android/gms/common/api/Api",
    //                 "<TO;>;TO;)",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "api":Lcom/google/android/gms/common/api/Api;, "Lcom/google/android/gms/common/api/Api<TO;>;"
    //         .local p2, "options":Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;, "TO;"
    //         const-string v0, "Null options are not permitted for this Api"
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IN:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Api;->gd()Ljava/util/List;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         iget-object v4, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IJ:Ljava/util/Set;
    //         invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/Scope;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Scope;->gs()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun addConnectionCallbacks(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IS:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addOnConnectionFailedListener(listener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IT:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addScope(scope: com.google.android.gms.common.api.Scope): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IJ:Ljava/util/Set;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Scope;->gs()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun build(): com.google.android.gms.common.api.GoogleApiClient { return TODO("body: ()Lcom/google/android/gms/common/api/GoogleApiClient;") }
    /*
    //         .locals 9
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IN:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "must call addApi() to add at least one API"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IP:I
    //         if-ltz v0, :cond_1
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->gl()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/api/b;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IH:Landroid/os/Looper;
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->gk()Lcom/google/android/gms/common/internal/ClientSettings;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IN:Ljava/util/Map;
    //         iget-object v5, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IS:Ljava/util/Set;
    //         iget-object v6, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IT:Ljava/util/Set;
    //         const/4 v7, -0x1
    //         iget v8, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IR:I
    //         invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/api/b;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;II)V
    //         goto :goto_1
    */

    public fun enableAutoManage(fragmentActivity: android.support.v4.app.FragmentActivity, clientId: Int, unresolvedConnectionFailedListener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Landroid/support/v4/app/FragmentActivity;ILcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 2
    //         if-ltz p2, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "clientId must be non-negative"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput p2, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IP:I
    //         const-string v0, "Null activity is not permitted."
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/FragmentActivity;
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IO:Landroid/support/v4/app/FragmentActivity;
    //         iput-object p3, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IQ:Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun gk(): com.google.android.gms.common.internal.ClientSettings { return TODO("body: ()Lcom/google/android/gms/common/internal/ClientSettings;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/google/android/gms/common/internal/ClientSettings;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->Dd:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IJ:Ljava/util/Set;
    //         iget v3, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IK:I
    //         iget-object v4, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IL:Landroid/view/View;
    //         iget-object v5, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IM:Ljava/lang/String;
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/ClientSettings;-><init>(Ljava/lang/String;Ljava/util/Collection;ILandroid/view/View;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun setAccountName(accountName: String): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->Dd:Ljava/lang/String;
    //         return-object p0
    */

    public fun setGravityForPopups(gravityForPopups: Int): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (I)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IK:I
    //         return-object p0
    */

    public fun setHandler(handler: android.os.Handler): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Landroid/os/Handler;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 1
    //         const-string v0, "Handler must not be null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IH:Landroid/os/Looper;
    //         return-object p0
    */

    public fun setViewForPopups(viewForPopups: android.view.View): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: (Landroid/view/View;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->IL:Landroid/view/View;
    //         return-object p0
    */

    public fun useDefaultAccount(): com.google.android.gms.common.api.GoogleApiClient.Builder { return TODO("body: ()Lcom/google/android/gms/common/api/GoogleApiClient$Builder;") }
    /*
    //         .locals 1
    //         const-string v0, "<<default account>>"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->setAccountName(Ljava/lang/String;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         move-result-object v0
    //         return-object v0
    */

}
