package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 8 fields, 7 methods.

open class n: com.google.android.gms.tagmanager.ContainerHolder {
    private var CM: com.google.android.gms.common.api.Status
    private val IH: android.os.Looper
    private var NU: Boolean
    private var aok: com.google.android.gms.tagmanager.Container
    private var aol: com.google.android.gms.tagmanager.Container
    private var aom: com.google.android.gms.tagmanager.n.b
    private var aon: com.google.android.gms.tagmanager.n.a
    private var aoo: com.google.android.gms.tagmanager.TagManager

    public constructor(p0: com.google.android.gms.common.api.Status)

    public constructor(p0: com.google.android.gms.tagmanager.TagManager, p1: android.os.Looper, p2: com.google.android.gms.tagmanager.Container, p3: com.google.android.gms.tagmanager.n.a)

    private fun nV() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n;->aom:Lcom/google/android/gms/tagmanager/n$b;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n;->aom:Lcom/google/android/gms/tagmanager/n$b;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/n;->aol:Lcom/google/android/gms/tagmanager/Container;
    //         invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/Container;->nS()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/n$b;->cs(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    fun cr(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/n;->NU:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "setCtfeUrlPathAndQuery called on a released ContainerHolder."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n;->aon:Lcom/google/android/gms/tagmanager/n$a;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/n$a;->cr(Ljava/lang/String;)V
    //         goto :goto_0
    */

    fun getContainerId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/n;->NU:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "getContainerId called on a released ContainerHolder."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n;->aok:Lcom/google/android/gms/tagmanager/Container;
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/Container;->getContainerId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    fun nU(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/n;->NU:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "setCtfeUrlPathAndQuery called on a released ContainerHolder."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n;->aon:Lcom/google/android/gms/tagmanager/n$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/tagmanager/n$a;->nU()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

}
