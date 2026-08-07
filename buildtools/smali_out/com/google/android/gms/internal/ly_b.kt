package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ly_b: com.google.android.gms.location.a.a() {
    private var aeV: android.os.Handler

    constructor(p0: com.google.android.gms.location.LocationListener, p1: android.os.Looper)

    public fun onLocationChanged(location: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly$b;->aeV:Landroid/os/Handler;
    //         if-nez v0, :cond_0
    //         const-string v0, "LocationClientHelper"
    //         const-string v1, "Received a location in client after calling removeLocationUpdates."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         iput v1, v0, Landroid/os/Message;->what:I
    //         iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ly$b;->aeV:Landroid/os/Handler;
    //         invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         goto :goto_0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ly$b;->aeV:Landroid/os/Handler;
    //         return-void
    */

}
