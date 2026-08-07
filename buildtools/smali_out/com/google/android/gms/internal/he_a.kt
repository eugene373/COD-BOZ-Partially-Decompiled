package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class he_a {
    private var BV: java.util.List
    private var BW: String
    private var BX: Boolean
    private var BY: android.accounts.Account

    public constructor()

    public fun D(p0: Boolean): com.google.android.gms.internal.he.a { return TODO("body: (Z)Lcom/google/android/gms/internal/he$a;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/he$a;->BX:Z
    //         return-object p0
    */

    public fun a(p0: com.google.android.gms.internal.hi): com.google.android.gms.internal.he.a { return TODO("body: (Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun ar(p0: String): com.google.android.gms.internal.he.a { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/internal/he$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/he$a;->BW:Ljava/lang/String;
    //         return-object p0
    */

    public fun fj(): com.google.android.gms.internal.he { return TODO("body: ()Lcom/google/android/gms/internal/he;") }
    /*
    //         .locals 6
    //         new-instance v1, Lcom/google/android/gms/internal/he;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/he$a;->BW:Ljava/lang/String;
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/he$a;->BX:Z
    //         iget-object v4, p0, Lcom/google/android/gms/internal/he$a;->BY:Landroid/accounts/Account;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;
    //         invoke-interface {v5}, Ljava/util/List;->size()I
    //         move-result v5
    //         new-array v5, v5, [Lcom/google/android/gms/internal/hi;
    //         invoke-interface {v0, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/google/android/gms/internal/hi;
    //         :goto_0
    //         invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/he;-><init>(Ljava/lang/String;ZLandroid/accounts/Account;[Lcom/google/android/gms/internal/hi;)V
    //         return-object v1
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
