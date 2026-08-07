package com.google.android.gms.drive.events

// Auto-emitted from smali.
// 5 fields, 12 methods.

open class DriveEventService: android.app.Service(), com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.drive.events.CompletionListener {
    private var NV: java.util.concurrent.CountDownLatch
    var NW: com.google.android.gms.drive.events.DriveEventService.a
    var NX: Int
    private val mName: String

    protected constructor()

    protected constructor(name: String)

    private fun a(p0: com.google.android.gms.drive.internal.OnEventResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnEventResponse;)V */ }
    /*
    //         .locals 6
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnEventResponse;->ih()Lcom/google/android/gms/drive/events/DriveEvent;
    //         move-result-object v2
    //         const-string v1, "DriveEventService"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "handleEventMessage: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v1, v3}, Lcom/google/android/gms/drive/internal/v;->n(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-interface {v2}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I
    //         move-result v1
    //         packed-switch v1, :pswitch_data_0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Unhandled event: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v1, v3}, Lcom/google/android/gms/drive/internal/v;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         move-object v0, v2
    //         check-cast v0, Lcom/google/android/gms/drive/events/ChangeEvent;
    //         move-object v1, v0
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/drive/events/DriveEventService;->onChange(Lcom/google/android/gms/drive/events/ChangeEvent;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         iget-object v3, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Error handling event: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v3, v1, v2}, Lcom/google/android/gms/drive/internal/v;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //         goto :goto_0
    //         :pswitch_1
    //         :try_start_1
    //         move-object v0, v2
    //         check-cast v0, Lcom/google/android/gms/drive/events/CompletionEvent;
    //         move-object v1, v0
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/drive/events/DriveEventService;->onCompletion(Lcom/google/android/gms/drive/events/CompletionEvent;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    private fun bc(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         const-string v2, "com.google.android.gms"
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/events/DriveEventService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         array-length v4, v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v4, :cond_0
    //         aget-object v5, v3, v1
    //         invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-eqz v5, :cond_1
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    //         :cond_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    */

    private fun hV() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/SecurityException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/events/DriveEventService;->getCallingUid()I
    //         move-result v0
    //         iget v1, p0, Lcom/google/android/gms/drive/events/DriveEventService;->NX:I
    //         if-ne v0, v1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/events/DriveEventService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const-string v2, "com.google.android.gms"
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/drive/events/DriveEventService;->bc(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iput v0, p0, Lcom/google/android/gms/drive/events/DriveEventService;->NX:I
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/SecurityException;
    //         const-string v1, "Caller is not GooglePlayServices"
    //         invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    protected fun getCallingUid(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/os/Binder;->getCallingUid()I
    //         move-result v0
    //         return v0
    */

    public fun onChange(event: com.google.android.gms.drive.events.ChangeEvent) { /* TODO(body): (Lcom/google/android/gms/drive/events/ChangeEvent;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unhandled change event: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun onCompletion(event: com.google.android.gms.drive.events.CompletionEvent) { /* TODO(body): (Lcom/google/android/gms/drive/events/CompletionEvent;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unhandled completion event: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun onUnbind(intent: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    @JvmField public val ACTION_HANDLE_EVENT: String = "com.google.android.gms.drive.events.HANDLE_EVENT"

    @JvmStatic fun a(p0: com.google.android.gms.drive.events.DriveEventService) { /* TODO(body): (Lcom/google/android/gms/drive/events/DriveEventService;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/SecurityException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/drive/events/DriveEventService;->hV()V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.drive.events.DriveEventService, p1: com.google.android.gms.drive.internal.OnEventResponse) { /* TODO(body): (Lcom/google/android/gms/drive/events/DriveEventService;Lcom/google/android/gms/drive/internal/OnEventResponse;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/drive/events/DriveEventService;->a(Lcom/google/android/gms/drive/internal/OnEventResponse;)V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.drive.events.DriveEventService): java.util.concurrent.CountDownLatch { return TODO("body: (Lcom/google/android/gms/drive/events/DriveEventService;)Ljava/util/concurrent/CountDownLatch;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService;->NV:Ljava/util/concurrent/CountDownLatch;
    //         return-object v0
    */

    }
}
