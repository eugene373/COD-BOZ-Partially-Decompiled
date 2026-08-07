package com.google.android.gms.location

// Auto-emitted from smali.
// 1 fields, 13 methods.

open class ActivityRecognitionClient: com.google.android.gms.common.GooglePlayServicesClient {
    private val aea: com.google.android.gms.internal.lz

    public constructor(context: android.content.Context, connectedListener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, connectionFailedListener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)

    public fun connect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->connect()V
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->disconnect()V
    //         return-void
    */

    public fun isConnected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->isConnected()Z
    //         move-result v0
    //         return v0
    */

    public fun isConnecting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->isConnecting()Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionCallbacksRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionFailedListenerRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    //         move-result v0
    //         return v0
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun removeActivityUpdates(callbackIntent: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->removeActivityUpdates(Landroid/app/PendingIntent;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun requestActivityUpdates(detectionIntervalMillis: Long, callbackIntent: android.app.PendingIntent) { /* TODO(body): (JLandroid/app/PendingIntent;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/lz;->requestActivityUpdates(JLandroid/app/PendingIntent;)V
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
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun unregisterConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionClient;->aea:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/lz;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

}
