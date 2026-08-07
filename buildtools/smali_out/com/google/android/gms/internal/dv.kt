package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 11 methods.

class dv: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val lM: com.google.android.gms.internal.el
    public val lT: com.google.android.gms.internal.ee
    public val si: com.google.android.gms.internal.eg
    public val sj: android.content.Context
    public val versionCode: Int

    constructor(p0: Int, p1: android.os.IBinder, p2: android.os.IBinder, p3: android.os.IBinder, p4: android.os.IBinder)

    public constructor(p0: com.google.android.gms.internal.eg, p1: com.google.android.gms.internal.el, p2: com.google.android.gms.internal.ee, p3: android.content.Context)

    fun ck(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dv;->lM:Lcom/google/android/gms/internal/el;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    fun cl(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dv;->lT:Lcom/google/android/gms/internal/ee;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    fun cm(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dv;->si:Lcom/google/android/gms/internal/eg;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    fun cn(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dv;->sj:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/du;->a(Lcom/google/android/gms/internal/dv;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.du = null!!

    public @JvmStatic fun a(p0: android.content.Intent, p1: com.google.android.gms.internal.dv) { /* TODO(body): (Landroid/content/Intent;Lcom/google/android/gms/internal/dv;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Bundle;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v1, "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const-string v1, "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo"
    //         invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         return-void
    */

    public @JvmStatic fun c(p0: android.content.Intent): com.google.android.gms.internal.dv { return TODO("body: (Landroid/content/Intent;)Lcom/google/android/gms/internal/dv;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-class v1, Lcom/google/android/gms/internal/dv;
    //         invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         const-string v1, "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/dv;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
