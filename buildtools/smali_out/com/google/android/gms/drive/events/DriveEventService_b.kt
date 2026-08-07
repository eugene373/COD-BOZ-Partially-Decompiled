package com.google.android.gms.drive.events

// Auto-emitted from smali.
// 1 fields, 2 methods.

class DriveEventService_b: com.google.android.gms.drive.internal.ad.a() {
    val NZ: com.google.android.gms.drive.events.DriveEventService

    constructor(p0: com.google.android.gms.drive.events.DriveEventService)

    public fun c(p0: com.google.android.gms.drive.internal.OnEventResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnEventResponse;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/DriveEventService$b;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;
    //         monitor-enter v1
    //         :try_start_0
    //         const-string v0, "DriveEventService"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onEvent: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Lcom/google/android/gms/drive/internal/v;->n(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$b;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;
    //         iget-object v0, v0, Lcom/google/android/gms/drive/events/DriveEventService;->NW:Lcom/google/android/gms/drive/events/DriveEventService$a;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$b;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;
    //         invoke-static {v0}, Lcom/google/android/gms/drive/events/DriveEventService;->a(Lcom/google/android/gms/drive/events/DriveEventService;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$b;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;
    //         iget-object v0, v0, Lcom/google/android/gms/drive/events/DriveEventService;->NW:Lcom/google/android/gms/drive/events/DriveEventService$a;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/drive/events/DriveEventService$a;->a(Lcom/google/android/gms/drive/events/DriveEventService$a;Lcom/google/android/gms/drive/internal/OnEventResponse;)Landroid/os/Message;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/drive/events/DriveEventService$b;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;
    //         iget-object v2, v2, Lcom/google/android/gms/drive/events/DriveEventService;->NW:Lcom/google/android/gms/drive/events/DriveEventService$a;
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/drive/events/DriveEventService$a;->sendMessage(Landroid/os/Message;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
