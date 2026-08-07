package com.google.android.gms.drive

// Auto-emitted from smali.
// 6 fields, 9 methods.

class ExecutionOptions {
    private val Nn: String
    private val No: Boolean
    private val Np: Int

    private constructor(trackingTag: String, notifyOnCompletion: Boolean, conflictStrategy: Int)

    constructor(x0: String, x1: Boolean, x2: Int, x3: com.google.android.gms.drive.ExecutionOptions.1)

    public fun hO(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/ExecutionOptions;->Nn:Ljava/lang/String;
    //         return-object v0
    */

    public fun hP(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/ExecutionOptions;->No:Z
    //         return v0
    */

    public fun hQ(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/ExecutionOptions;->Np:I
    //         return v0
    */

    companion object {
    @JvmField public val CONFLICT_STRATEGY_KEEP_REMOTE: Int = 0x1
    @JvmField public val CONFLICT_STRATEGY_OVERWRITE_REMOTE: Int = 0x0
    @JvmField public val MAX_TRACKING_TAG_STRING_LENGTH: Int = 0x10000

    public @JvmStatic fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.ExecutionOptions) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/ExecutionOptions;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/ExecutionOptions;->hP()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->ib()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun aV(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun aW(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun bh(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         if-eqz p0, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         const/high16 v1, 0x10000
    //         if-gt v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
