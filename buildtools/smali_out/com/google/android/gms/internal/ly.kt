package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 13 methods.

open class ly {
    private val Dh: com.google.android.gms.internal.me
    private var aeR: android.content.ContentProviderClient
    private var aeS: Boolean
    private var aeT: java.util.HashMap
    private val mContext: android.content.Context

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.me)

    private fun a(p0: com.google.android.gms.location.LocationListener, p1: android.os.Looper): com.google.android.gms.internal.ly.b { return TODO("body: (Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/internal/ly$b;") }
    /*
    //         .locals 3
    //         if-nez p2, :cond_0
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         const-string v1, "Can\'t create handler inside thread that has not called Looper.prepare()"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ly$b;
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/ly$b;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ly$b;-><init>(Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    //         :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.internal.ma, p1: com.google.android.gms.location.LocationListener, p2: android.os.Looper) { /* TODO(body): (Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/internal/ly$b;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/lx;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/a;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.internal.ma, p1: android.app.PendingIntent) { /* TODO(body): (Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/lx;->a(Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun getLastLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lx;->bW(Ljava/lang/String;)Landroid/location/Location;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun lY() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ly;->aeS:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ly;->setMockMode(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun removeAllListeners() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         monitor-enter v2
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ly$b;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v1}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/lx;->a(Lcom/google/android/gms/location/a;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         throw v0
    //         :try_end_2
    //         .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :cond_1
    //         :try_start_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         monitor-exit v2
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         return-void
    */

    public fun removeLocationUpdates(callbackIntent: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lx;->a(Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun removeLocationUpdates(listener: com.google.android.gms.location.LocationListener) { /* TODO(body): (Lcom/google/android/gms/location/LocationListener;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         const-string v0, "Invalid null listener"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ly$b;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->aeR:Landroid/content/ContentProviderClient;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->aeT:Ljava/util/HashMap;
    //         invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->aeR:Landroid/content/ContentProviderClient;
    //         invoke-virtual {v1}, Landroid/content/ContentProviderClient;->release()Z
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/google/android/gms/internal/ly;->aeR:Landroid/content/ContentProviderClient;
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ly$b;->release()V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v1}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/lx;->a(Lcom/google/android/gms/location/a;)V
    //         :cond_1
    //         monitor-exit v2
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, callbackIntent: android.app.PendingIntent) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/lx;->a(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    //         return-void
    */

    public fun requestLocationUpdates(request: com.google.android.gms.location.LocationRequest, listener: com.google.android.gms.location.LocationListener, looper: android.os.Looper) { /* TODO(body): (Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/internal/ly$b;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/lx;->a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/a;)V
    //         return-void
    */

    public fun setMockLocation(mockLocation: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lx;->setMockLocation(Landroid/location/Location;)V
    //         return-void
    */

    public fun setMockMode(isMockMode: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly;->Dh:Lcom/google/android/gms/internal/me;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/me;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lx;->setMockMode(Z)V
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/ly;->aeS:Z
    //         return-void
    */

}
