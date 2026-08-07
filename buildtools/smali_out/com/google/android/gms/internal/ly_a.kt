package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ly_a: android.os.Handler() {
    private val aeU: com.google.android.gms.location.LocationListener

    public constructor(p0: com.google.android.gms.location.LocationListener)

    public constructor(p0: com.google.android.gms.location.LocationListener, p1: android.os.Looper)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 2
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         const-string v0, "LocationClientHelper"
    //         const-string v1, "unknown message in LocationHandler.handleMessage"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         new-instance v1, Landroid/location/Location;
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Landroid/location/Location;
    //         invoke-direct {v1, v0}, Landroid/location/Location;-><init>(Landroid/location/Location;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ly$a;->aeU:Lcom/google/android/gms/location/LocationListener;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/location/LocationListener;->onLocationChanged(Landroid/location/Location;)V
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

}
