package com.google.android.gms.location

// Auto-emitted from smali.
// 3 fields, 27 methods.

open class LocationClient: com.google.android.gms.common.GooglePlayServicesClient {
    private val aea: com.google.android.gms.internal.lz

    public constructor(context: android.content.Context, connectionCallbacks: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, connectionFailedListener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)

    public fun addGeofences(pendingIntent: java.util.List, listener: android.app.PendingIntent, p2: com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener) { /* TODO(body): (Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V */ }
    /*
    //         .locals 5
    //         .local p1, "geofences":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/location/Geofence;>;"
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_1
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/location/Geofence;
    //         instance-of v3, v0, Lcom/google/android/gms/internal/mc;
    //         const-string v4, "Geofence must be created using Geofence.Builder."
    //         invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         check-cast v0, Lcom/google/android/gms/internal/mc;
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         move-object v0, v1
    //         :cond_1
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v1, v0, p2, p3}, Lcom/google/android/gms/internal/lz;->addGeofences(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun connect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->connect()V
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->disconnect()V
    //         return-void
    */

    public fun getLastLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->getLastLocation()Landroid/location/Location;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isConnected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->isConnected()Z
    //         move-result v0
    //         return v0
    */

    public fun isConnecting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->isConnecting()Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionCallbacksRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionFailedListenerRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    //         move-result v0
    //         return v0
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun removeGeofences(pendingIntent: android.app.PendingIntent, listener: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener) { /* TODO(body): (Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/lz;->removeGeofences(Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun removeGeofences(listener: java.util.List, p1: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener) { /* TODO(body): (Ljava/util/List;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V */ }
    /*
    //         .locals 2
    //         .local p1, "geofenceRequestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/lz;->removeGeofences(Ljava/util/List;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun removeLocationUpdates(callbackIntent: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->removeLocationUpdates(Landroid/app/PendingIntent;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun removeLocationUpdates(listener: com.google.android.gms.location.LocationListener) { /* TODO(body): (Lcom/google/android/gms/location/LocationListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, callbackIntent: android.app.PendingIntent) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ma;->b(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/ma;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/lz;->b(Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, listener: com.google.android.gms.location.LocationListener) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ma;->b(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/ma;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, listener: com.google.android.gms.location.LocationListener, looper: android.os.Looper) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ma;->b(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/ma;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2, p3}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun setMockLocation(mockLocation: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->setMockLocation(Landroid/location/Location;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun setMockMode(isMockMode: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->setMockMode(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun unregisterConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun unregisterConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/LocationClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    companion object {
    @JvmField public val KEY_LOCATION_CHANGED: String = "com.google.android.location.LOCATION"
    @JvmField public val KEY_MOCK_LOCATION: String = "mockLocation"

    public @JvmStatic fun getErrorCode(intent: android.content.Intent): Int { return TODO("body: (Landroid/content/Intent;)I") }
    /*
    //         .locals 2
    //         const-string v0, "gms_error_code"
    //         const/4 v1, -0x1
    //         invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getGeofenceTransition(intent: android.content.Intent): Int { return TODO("body: (Landroid/content/Intent;)I") }
    /*
    //         .locals 3
    //         const/4 v0, -0x1
    //         const-string v1, "com.google.android.location.intent.extra.transition"
    //         invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    //         move-result v1
    //         if-ne v1, v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v2, 0x1
    //         if-eq v1, v2, :cond_2
    //         const/4 v2, 0x2
    //         if-eq v1, v2, :cond_2
    //         const/4 v2, 0x4
    //         if-ne v1, v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun getTriggeringGeofences(intent: android.content.Intent): java.util.List { return TODO("body: (Landroid/content/Intent;)Ljava/util/List;") }
    /*
    //         .locals 3
    //         const-string v0, "com.google.android.location.intent.extra.geofence_list"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/ArrayList;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [B
    //         invoke-static {v0}, Lcom/google/android/gms/internal/mc;->h([B)Lcom/google/android/gms/internal/mc;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun getTriggeringLocation(intent: android.content.Intent): android.location.Location { return TODO("body: (Landroid/content/Intent;)Landroid/location/Location;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.location.intent.extra.triggering_location"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/location/Location;
    //         return-object v0
    */

    public @JvmStatic fun hasError(intent: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "gms_error_code"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    }
}
