package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class v {
    private var lZ: com.google.android.gms.internal.v.a
    private var ma: Boolean
    private var mb: Boolean

    public constructor()

    public constructor(p0: Boolean)

    public fun a(p0: com.google.android.gms.internal.v.a) { /* TODO(body): (Lcom/google/android/gms/internal/v$a;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/v;->lZ:Lcom/google/android/gms/internal/v$a;
    //         return-void
    */

    public fun ar() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/v;->ma:Z
    //         return-void
    */

    public fun av(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/v;->mb:Z
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/v;->ma:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun d(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "Action was blocked because no click was detected."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/v;->lZ:Lcom/google/android/gms/internal/v$a;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/v;->lZ:Lcom/google/android/gms/internal/v$a;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/v$a;->e(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

}
