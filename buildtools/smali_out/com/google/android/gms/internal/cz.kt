package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 11 methods.

class cz: com.google.android.gms.internal.cu.a() {
    private val qG: com.google.ads.mediation.MediationAdapter
    private val qH: com.google.ads.mediation.NetworkExtras

    public constructor(p0: com.google.ads.mediation.MediationAdapter, p1: com.google.ads.mediation.NetworkExtras)

    private fun b(p0: String, p1: Int, p2: String): com.google.ads.mediation.MediationServerParameters { return TODO("body: (Ljava/lang/String;ILjava/lang/String;)Lcom/google/ads/mediation/MediationServerParameters;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "I",
    //                 "Ljava/lang/String;",
    //                 ")TSERVER_PARAMETERS;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         if-eqz p1, :cond_0
    //         :try_start_0
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->length()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not get MediationServerParameters."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         new-instance v0, Ljava/util/HashMap;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V
    //         move-object v1, v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/MediationAdapter;->getServerParametersType()Ljava/lang/Class;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         if-eqz v2, :cond_2
    //         invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/ads/mediation/MediationServerParameters;
    //         invoke-virtual {v0, v1}, Lcom/google/ads/mediation/MediationServerParameters;->load(Ljava/util/Map;)V
    //         :try_end_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    //         :cond_2
    //         return-object v0
    */

    public fun a(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.internal.av, p2: String, p3: com.google.android.gms.internal.cv) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/av;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v4, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p4
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/cz;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/av;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.internal.av, p2: String, p3: String, p4: com.google.android.gms.internal.cv) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/av;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         instance-of v0, v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "MediationAdapter is not a MediationInterstitialAdapter: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    //         :cond_0
    //         const-string v0, "Requesting interstitial ad from adapter."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         check-cast v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;
    //         new-instance v1, Lcom/google/android/gms/internal/da;
    //         invoke-direct {v1, p5}, Lcom/google/android/gms/internal/da;-><init>(Lcom/google/android/gms/internal/cv;)V
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/app/Activity;
    //         iget v3, p2, Lcom/google/android/gms/internal/av;->nX:I
    //         invoke-direct {p0, p3, v3, p4}, Lcom/google/android/gms/internal/cz;->b(Ljava/lang/String;ILjava/lang/String;)Lcom/google/ads/mediation/MediationServerParameters;
    //         move-result-object v3
    //         invoke-static {p2}, Lcom/google/android/gms/internal/db;->d(Lcom/google/android/gms/internal/av;)Lcom/google/ads/mediation/MediationAdRequest;
    //         move-result-object v4
    //         iget-object v5, p0, Lcom/google/android/gms/internal/cz;->qH:Lcom/google/ads/mediation/NetworkExtras;
    //         invoke-interface/range {v0 .. v5}, Lcom/google/ads/mediation/MediationInterstitialAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not request interstitial ad from adapter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.internal.ay, p2: com.google.android.gms.internal.av, p3: String, p4: com.google.android.gms.internal.cv) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/av;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v5, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v6, p5
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/cz;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/av;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.internal.ay, p2: com.google.android.gms.internal.av, p3: String, p4: String, p5: com.google.android.gms.internal.cv) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/av;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         instance-of v0, v0, Lcom/google/ads/mediation/MediationBannerAdapter;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "MediationAdapter is not a MediationBannerAdapter: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    //         :cond_0
    //         const-string v0, "Requesting banner ad from adapter."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         check-cast v0, Lcom/google/ads/mediation/MediationBannerAdapter;
    //         new-instance v1, Lcom/google/android/gms/internal/da;
    //         invoke-direct {v1, p6}, Lcom/google/android/gms/internal/da;-><init>(Lcom/google/android/gms/internal/cv;)V
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/app/Activity;
    //         iget v3, p3, Lcom/google/android/gms/internal/av;->nX:I
    //         invoke-direct {p0, p4, v3, p5}, Lcom/google/android/gms/internal/cz;->b(Ljava/lang/String;ILjava/lang/String;)Lcom/google/ads/mediation/MediationServerParameters;
    //         move-result-object v3
    //         invoke-static {p2}, Lcom/google/android/gms/internal/db;->b(Lcom/google/android/gms/internal/ay;)Lcom/google/ads/AdSize;
    //         move-result-object v4
    //         invoke-static {p3}, Lcom/google/android/gms/internal/db;->d(Lcom/google/android/gms/internal/av;)Lcom/google/ads/mediation/MediationAdRequest;
    //         move-result-object v5
    //         iget-object v6, p0, Lcom/google/android/gms/internal/cz;->qH:Lcom/google/ads/mediation/NetworkExtras;
    //         invoke-interface/range {v0 .. v6}, Lcom/google/ads/mediation/MediationBannerAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not request banner ad from adapter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/MediationAdapter;->destroy()V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not destroy adapter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

    public fun getView(): com.google.android.gms.dynamic.d { return TODO("body: ()Lcom/google/android/gms/dynamic/d;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         instance-of v0, v0, Lcom/google/ads/mediation/MediationBannerAdapter;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "MediationAdapter is not a MediationBannerAdapter: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         check-cast v0, Lcom/google/ads/mediation/MediationBannerAdapter;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/MediationBannerAdapter;->getBannerView()Landroid/view/View;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not get banner view from adapter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

    public fun resume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

    public fun showInterstitial() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         instance-of v0, v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "MediationAdapter is not a MediationInterstitialAdapter: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    //         :cond_0
    //         const-string v0, "Showing interstitial from adapter."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cz;->qG:Lcom/google/ads/mediation/MediationAdapter;
    //         check-cast v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/MediationInterstitialAdapter;->showInterstitial()V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not show interstitial from adapter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Landroid/os/RemoteException;
    //         invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V
    //         throw v0
    */

}
