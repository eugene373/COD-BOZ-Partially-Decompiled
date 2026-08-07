package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 10 methods.

open class ab {
    private val mj: com.google.android.gms.internal.ab.a
    private val mk: Runnable
    private var ml: com.google.android.gms.internal.av
    private var mm: Boolean
    private var mn: Boolean
    private var mo: Long

    public constructor(p0: com.google.android.gms.internal.u)

    constructor(p0: com.google.android.gms.internal.u, p1: com.google.android.gms.internal.ab.a)

    public fun a(p0: com.google.android.gms.internal.av, p1: Long) { /* TODO(body): (Lcom/google/android/gms/internal/av;J)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         if-eqz v0, :cond_1
    //         const-string v0, "An ad refresh is already scheduled."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ab;->ml:Lcom/google/android/gms/internal/av;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         iput-wide p2, p0, Lcom/google/android/gms/internal/ab;->mo:J
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mn:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Scheduling ad refresh "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " milliseconds from now."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1, p2, p3}, Lcom/google/android/gms/internal/ab$a;->postDelayed(Ljava/lang/Runnable;J)Z
    //         goto :goto_0
    */

    public fun ay(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         return v0
    */

    public fun c(p0: com.google.android.gms.internal.av) { /* TODO(body): (Lcom/google/android/gms/internal/av;)V */ }
    /*
    //         .locals 2
    //         const-wide/32 v0, 0xea60
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/av;J)V
    //         return-void
    */

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab$a;->removeCallbacks(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mn:Z
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab$a;->removeCallbacks(Ljava/lang/Runnable;)V
    //         :cond_0
    //         return-void
    */

    public fun resume() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Lcom/google/android/gms/internal/ab;->mn:Z
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         if-eqz v0, :cond_0
    //         iput-boolean v1, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab;->ml:Lcom/google/android/gms/internal/av;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ab;->mo:J
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/av;J)V
    //         :cond_0
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.ab): com.google.android.gms.internal.av { return TODO("body: (Lcom/google/android/gms/internal/ab;)Lcom/google/android/gms/internal/av;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab;->ml:Lcom/google/android/gms/internal/av;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.ab, p1: Boolean): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ab;Z)Z") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/ab;->mm:Z
    //         return p1
    */

    }
}
