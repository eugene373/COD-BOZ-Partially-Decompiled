package com.google.android.gms.internal

// Auto-emitted from smali.
// 7 fields, 7 methods.

open class gc {
    private val mw: Object
    private val vL: String
    private var vX: Int
    private var vY: Long
    private var vZ: Long
    private var wa: Int
    private var wb: Int

    public constructor(p0: String)

    public fun b(p0: android.content.Context, p1: String): android.os.Bundle { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gc;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "session_id"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gc;->vL:Ljava/lang/String;
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "basets"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/gc;->vZ:J
    //         invoke-virtual {v0, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v2, "currts"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/gc;->vY:J
    //         invoke-virtual {v0, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v2, "seq_num"
    //         invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "preqs"
    //         iget v3, p0, Lcom/google/android/gms/internal/gc;->wb:I
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v2, "pclick"
    //         iget v3, p0, Lcom/google/android/gms/internal/gc;->vX:I
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v2, "pimp"
    //         iget v3, p0, Lcom/google/android/gms/internal/gc;->wa:I
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v2, "support_transparent_background"
    //         invoke-static {p1}, Lcom/google/android/gms/internal/gc;->m(Landroid/content/Context;)Z
    //         move-result v3
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.internal.av, p1: Long) { /* TODO(body): (Lcom/google/android/gms/internal/av;J)V */ }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gc;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/gc;->vZ:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-nez v0, :cond_0
    //         iput-wide p2, p0, Lcom/google/android/gms/internal/gc;->vZ:J
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/gc;->vZ:J
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/gc;->vY:J
    //         :goto_0
    //         iget-object v0, p1, Lcom/google/android/gms/internal/av;->extras:Landroid/os/Bundle;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p1, Lcom/google/android/gms/internal/av;->extras:Landroid/os/Bundle;
    //         const-string v2, "gw"
    //         const/4 v3, 0x2
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         const/4 v2, 0x1
    //         if-ne v0, v2, :cond_1
    //         monitor-exit v1
    //         :goto_1
    //         return-void
    //         :cond_0
    //         iput-wide p2, p0, Lcom/google/android/gms/internal/gc;->vY:J
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         iget v0, p0, Lcom/google/android/gms/internal/gc;->wb:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/gc;->wb:I
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    */

    public fun cO() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gc;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/gc;->wa:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/gc;->wa:I
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cP() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gc;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/gc;->vX:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/gc;->vX:I
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun dh(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/gc;->vZ:J
    //         return-wide v0
    */

    companion object {
    public @JvmStatic fun m(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         const-string v2, "Theme.Translucent"
    //         const-string v3, "style"
    //         const-string v4, "android"
    //         invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         :goto_0
    //         return v0
    //         :cond_0
    //         new-instance v2, Landroid/content/ComponentName;
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "com.google.android.gms.ads.AdActivity"
    //         invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //         move-result-object v2
    //         iget v2, v2, Landroid/content/pm/ActivityInfo;->theme:I
    //         if-ne v1, v2, :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v1, "Fail to fetch AdActivity theme"
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         const-string v1, "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         goto :goto_0
    */

    }
}
