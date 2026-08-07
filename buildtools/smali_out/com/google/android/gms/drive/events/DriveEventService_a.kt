package com.google.android.gms.drive.events

// Auto-emitted from smali.
// 1 fields, 6 methods.

class DriveEventService_a: android.os.Handler() {
    val NZ: com.google.android.gms.drive.events.DriveEventService

    constructor(p0: com.google.android.gms.drive.events.DriveEventService)

    private fun b(p0: com.google.android.gms.drive.internal.OnEventResponse): android.os.Message { return TODO("body: (Lcom/google/android/gms/drive/internal/OnEventResponse;)Landroid/os/Message;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/drive/events/DriveEventService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         return-object v0
    */

    private fun hW(): android.os.Message { return TODO("body: ()Landroid/os/Message;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x2
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/events/DriveEventService$a;->obtainMessage(I)Landroid/os/Message;
    //         move-result-object v0
    //         return-object v0
    */

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "DriveEventService"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "handleMessage message type:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Landroid/os/Message;->what:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->n(Ljava/lang/String;Ljava/lang/String;)V
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         const-string v0, "DriveEventService"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unexpected message type:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Landroid/os/Message;->what:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/DriveEventService$a;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Lcom/google/android/gms/drive/internal/OnEventResponse;
    //         invoke-static {v1, v0}, Lcom/google/android/gms/drive/events/DriveEventService;->a(Lcom/google/android/gms/drive/events/DriveEventService;Lcom/google/android/gms/drive/internal/OnEventResponse;)V
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/events/DriveEventService$a;->getLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/os/Looper;->quit()V
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.events.DriveEventService.a): android.os.Message { return TODO("body: (Lcom/google/android/gms/drive/events/DriveEventService$a;)Landroid/os/Message;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/DriveEventService$a;->hW()Landroid/os/Message;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.drive.events.DriveEventService.a, p1: com.google.android.gms.drive.internal.OnEventResponse): android.os.Message { return TODO("body: (Lcom/google/android/gms/drive/events/DriveEventService$a;Lcom/google/android/gms/drive/internal/OnEventResponse;)Landroid/os/Message;") }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/drive/events/DriveEventService$a;->b(Lcom/google/android/gms/drive/internal/OnEventResponse;)Landroid/os/Message;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
