package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ee {
    private val oA: String

    public constructor(p0: String)

    public fun a(p0: String, p1: Int, p2: android.content.Intent): Boolean { return TODO("body: (Ljava/lang/String;ILandroid/content/Intent;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_0
    //         if-nez p3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-static {p3}, Lcom/google/android/gms/internal/ed;->e(Landroid/content/Intent;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {p3}, Lcom/google/android/gms/internal/ed;->f(Landroid/content/Intent;)Ljava/lang/String;
    //         move-result-object v2
    //         if-eqz v1, :cond_0
    //         if-eqz v2, :cond_0
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ed;->D(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_2
    //         const-string v1, "Developer payload not match."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ee;->oA:Ljava/lang/String;
    //         if-eqz v3, :cond_3
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ee;->oA:Ljava/lang/String;
    //         invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/ef;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         const-string v1, "Fail to verify signature."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun ct(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/gj;->do()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
