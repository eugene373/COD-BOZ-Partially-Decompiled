package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 26 methods.

open class lz: com.google.android.gms.common.internal.e() {
    private val Dh: com.google.android.gms.internal.me
    private val aeW: com.google.android.gms.internal.ly
    private val aeX: com.google.android.gms.internal.mw
    private val aeY: com.google.android.gms.internal.lp
    private val aeZ: com.google.android.gms.internal.ie
    private val afa: String

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: String, p3: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p4: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p5: String)

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: String, p3: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p4: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p5: String, p6: String)

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: String, p3: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p4: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p5: String, p6: String, p7: String)

    public constructor(p0: android.content.Context, p1: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, p2: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, p3: String)

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "client_name"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/lz;->afa:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const v1, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/common/internal/l;->e(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.ma, p1: com.google.android.gms.location.LocationListener) { /* TODO(body): (Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.ma, p1: com.google.android.gms.location.LocationListener, p2: android.os.Looper) { /* TODO(body): (Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun aL(p0: android.os.IBinder): com.google.android.gms.internal.lx { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/lx$a;->aK(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;
    //         move-result-object v0
    //         return-object v0
    */

    public fun addGeofences(pendingIntent: java.util.List, listener: android.app.PendingIntent, p2: com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener) { /* TODO(body): (Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         .local p1, "geofences":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/internal/mc;>;"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "At least one geofence must be specified."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const-string v0, "PendingIntent must be specified."
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "OnAddGeofencesResultListener not provided."
    //         invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         if-nez p3, :cond_1
    //         const/4 v0, 0x0
    //         move-object v1, v0
    //         :goto_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/lx;->a(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/lz$b;
    //         invoke-direct {v0, p3, p0}, Lcom/google/android/gms/internal/lz$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;Lcom/google/android/gms/internal/lz;)V
    //         move-object v1, v0
    //         goto :goto_1
    */

    public fun b(p0: com.google.android.gms.internal.ma, p1: android.app.PendingIntent) { /* TODO(body): (Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ly;->b(Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ly;->removeAllListeners()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ly;->lY()V
    //         :cond_0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getLastLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ly;->getLastLocation()Landroid/location/Location;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lz;->aL(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeActivityUpdates(callbackIntent: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lx;->removeActivityUpdates(Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun removeGeofences(pendingIntent: android.app.PendingIntent, listener: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener) { /* TODO(body): (Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V
    //         const-string v0, "PendingIntent must be specified."
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "OnRemoveGeofencesResultListener not provided."
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         move-object v1, v0
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/lx;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/lz$b;
    //         invoke-direct {v0, p2, p0}, Lcom/google/android/gms/internal/lz$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;Lcom/google/android/gms/internal/lz;)V
    //         move-object v1, v0
    //         goto :goto_0
    */

    public fun removeGeofences(listener: java.util.List, p1: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener) { /* TODO(body): (Ljava/util/List;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         .local p1, "geofenceRequestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v2, "geofenceRequestIds can\'t be null nor empty."
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const-string v0, "OnRemoveGeofencesResultListener not provided."
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         new-array v0, v1, [Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/String;
    //         if-nez p2, :cond_1
    //         const/4 v1, 0x0
    //         move-object v2, v1
    //         :goto_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/lx;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/lx;->a([Ljava/lang/String;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         return-void
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         new-instance v1, Lcom/google/android/gms/internal/lz$b;
    //         invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/lz$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;Lcom/google/android/gms/internal/lz;)V
    //         move-object v2, v1
    //         goto :goto_1
    */

    public fun removeLocationUpdates(callbackIntent: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->removeLocationUpdates(Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun removeLocationUpdates(listener: com.google.android.gms.location.LocationListener) { /* TODO(body): (Lcom/google/android/gms/location/LocationListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V
    //         return-void
    */

    public fun requestActivityUpdates(detectionIntervalMillis: Long, callbackIntent: android.app.PendingIntent) { /* TODO(body): (JLandroid/app/PendingIntent;)V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V
    //         invoke-static {p3}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, p1, v2
    //         if-ltz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v2, "detectionIntervalMillis must be >= 0"
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1, p2, v1, p3}, Lcom/google/android/gms/internal/lx;->a(JZLandroid/app/PendingIntent;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, callbackIntent: android.app.PendingIntent) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ly;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, listener: com.google.android.gms.location.LocationListener, looper: android.os.Looper) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ly;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun setMockLocation(mockLocation: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->setMockLocation(Landroid/location/Location;)V
    //         return-void
    */

    public fun setMockMode(isMockMode: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->setMockMode(Z)V
    //         return-void
    */

    companion object {
    @JvmStatic fun b(p0: com.google.android.gms.internal.lz) { /* TODO(body): (Lcom/google/android/gms/internal/lz;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V
    //         return-void
    */

    }
}
