package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class d: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private var Ly: Boolean

    public constructor()

    protected fun gQ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/internal/d;->Ly:Z
    //         return v0
    */

    companion object {
    private val Lv: Object = null!!
    private var Lw: ClassLoader
    private var Lx: Integer

    private @JvmStatic fun a(p0: Class): Boolean { return TODO("body: (Ljava/lang/Class;)Z") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         :try_start_0
    //         const-string v1, "NULL"
    //         invoke-virtual {p0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v1
    //         const-string v2, "SAFE_PARCELABLE_NULL_STRING"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         goto :goto_0
    */

    protected @JvmStatic fun aV(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/common/internal/d;->gO()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Class;)Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected @JvmStatic fun gO(): ClassLoader { return TODO("body: ()Ljava/lang/ClassLoader;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/common/internal/d;->Lv:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/common/internal/d;->Lw:Ljava/lang/ClassLoader;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected @JvmStatic fun gP(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/common/internal/d;->Lv:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/common/internal/d;->Lx:Ljava/lang/Integer;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
