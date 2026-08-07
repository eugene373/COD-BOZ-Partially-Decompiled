package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 7 methods.

open class iv {
    protected val JO: String
    protected val JP: Object
    private var JQ: Object

    protected constructor(p0: String, p1: Object)

    public fun getKey(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iv;->JO:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    private var JN: com.google.android.gms.internal.iv.a
    private val mw: Object = null!!

    public @JvmStatic fun H(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/google/android/gms/internal/iv;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/internal/iv;->JN:Lcom/google/android/gms/internal/iv$a;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/iv$b;
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/internal/iv$b;-><init>(Landroid/content/ContentResolver;)V
    //         sput-object v0, Lcom/google/android/gms/internal/iv;->JN:Lcom/google/android/gms/internal/iv$a;
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun a(p0: String, p1: Integer): com.google.android.gms.internal.iv { return TODO("body: (Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/android/gms/internal/iv;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Integer;",
    //                 ")",
    //                 "Lcom/google/android/gms/internal/iv",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/iv$2;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/iv$2;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V
    //         return-object v0
    */

    public @JvmStatic fun g(p0: String, p1: Boolean): com.google.android.gms.internal.iv { return TODO("body: (Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Z)",
    //                 "Lcom/google/android/gms/internal/iv",
    //                 "<",
    //                 "Ljava/lang/Boolean;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/iv$1;
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/iv$1;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V
    //         return-object v0
    */

    public @JvmStatic fun m(p0: String, p1: String): com.google.android.gms.internal.iv { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iv;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Lcom/google/android/gms/internal/iv",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/iv$3;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/iv$3;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    }
}
