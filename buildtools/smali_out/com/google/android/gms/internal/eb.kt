package com.google.android.gms.internal

// Auto-emitted from smali.
// 7 fields, 8 methods.

class eb: com.google.android.gms.internal.ek.a(), android.content.ServiceConnection {
    private var mContext: android.content.Context
    private var sD: Boolean
    private var sE: Int
    private var sF: android.content.Intent
    private var sn: com.google.android.gms.internal.dw
    private var su: String
    private var sy: com.google.android.gms.internal.ea

    public constructor(p0: android.content.Context, p1: String, p2: Boolean, p3: Int, p4: android.content.Intent, p5: com.google.android.gms.internal.ea)

    public fun finishPurchase() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->sF:Landroid/content/Intent;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ed;->d(Landroid/content/Intent;)I
    //         move-result v0
    //         iget v1, p0, Lcom/google/android/gms/internal/eb;->sE:I
    //         const/4 v2, -0x1
    //         if-ne v1, v2, :cond_0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/dw;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/eb;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dw;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/eb;->sn:Lcom/google/android/gms/internal/dw;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->mContext:Landroid/content/Context;
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "com.android.vending.billing.InAppBillingService.BIND"
    //         invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/eb;->mContext:Landroid/content/Context;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         goto :goto_0
    */

    public fun getProductId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->su:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPurchaseData(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->sF:Landroid/content/Intent;
    //         return-object v0
    */

    public fun getResultCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/eb;->sE:I
    //         return v0
    */

    public fun isVerified(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/eb;->sD:Z
    //         return v0
    */

    public fun onServiceConnected(name: android.content.ComponentName, service: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "In-app billing service connected."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/dw;->r(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->sF:Landroid/content/Intent;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ed;->e(Landroid/content/Intent;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ed;->E(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/eb;->sn:Lcom/google/android/gms/internal/dw;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/eb;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ec;->j(Landroid/content/Context;)Lcom/google/android/gms/internal/ec;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/eb;->sy:Lcom/google/android/gms/internal/ea;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ec;->a(Lcom/google/android/gms/internal/ea;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dw;->destroy()V
    //         goto :goto_0
    */

    public fun onServiceDisconnected(name: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "In-app billing service disconnected."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eb;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dw;->destroy()V
    //         return-void
    */

}
