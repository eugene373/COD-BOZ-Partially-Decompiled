package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 8 fields, 16 methods.

class g_a {
    private val LV: String
    private val LW: com.google.android.gms.common.internal.g.a.a
    private val LX: java.util.HashSet
    private var LY: Boolean
    private var LZ: android.os.IBinder
    private var Ma: android.content.ComponentName
    val Mb: com.google.android.gms.common.internal.g
    private var mState: Int

    public constructor(p0: com.google.android.gms.common.internal.g, p1: String)

    public fun J(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/common/internal/g$a;->LY:Z
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.internal.e.f) { /* TODO(body): (Lcom/google/android/gms/common/internal/e$f;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/internal/e",
    //                 "<*>.f;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LX:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.internal.e.f) { /* TODO(body): (Lcom/google/android/gms/common/internal/e$f;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/internal/e",
    //                 "<*>.f;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LX:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun c(p0: com.google.android.gms.common.internal.e.f): Boolean { return TODO("body: (Lcom/google/android/gms/common/internal/e$f;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/internal/e",
    //                 "<*>.f;)Z"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LX:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun gW(): com.google.android.gms.common.internal.g.a.a { return TODO("body: ()Lcom/google/android/gms/common/internal/g$a$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LW:Lcom/google/android/gms/common/internal/g$a$a;
    //         return-object v0
    */

    public fun gX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LV:Ljava/lang/String;
    //         return-object v0
    */

    public fun gY(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LX:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z
    //         move-result v0
    //         return v0
    */

    public fun getBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LZ:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun getComponentName(): android.content.ComponentName { return TODO("body: ()Landroid/content/ComponentName;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->Ma:Landroid/content/ComponentName;
    //         return-object v0
    */

    public fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/internal/g$a;->mState:I
    //         return v0
    */

    public fun isBound(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/internal/g$a;->LY:Z
    //         return v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.common.internal.g.a, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/common/internal/g$a;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/common/internal/g$a;->mState:I
    //         return p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.g.a, p1: android.content.ComponentName): android.content.ComponentName { return TODO("body: (Lcom/google/android/gms/common/internal/g$a;Landroid/content/ComponentName;)Landroid/content/ComponentName;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/internal/g$a;->Ma:Landroid/content/ComponentName;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.g.a, p1: android.os.IBinder): android.os.IBinder { return TODO("body: (Lcom/google/android/gms/common/internal/g$a;Landroid/os/IBinder;)Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/internal/g$a;->LZ:Landroid/os/IBinder;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.g.a): java.util.HashSet { return TODO("body: (Lcom/google/android/gms/common/internal/g$a;)Ljava/util/HashSet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a;->LX:Ljava/util/HashSet;
    //         return-object v0
    */

    }
}
