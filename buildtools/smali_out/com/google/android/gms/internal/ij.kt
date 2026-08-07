package com.google.android.gms.internal

// Auto-emitted from smali.
// 26 fields, 51 methods.

class ij: com.google.android.gms.common.internal.e() {
    private val EO: com.google.android.gms.cast.Cast.Listener
    private var FA: Double
    private var FB: Boolean
    private var GA: Boolean
    private var GB: Int
    private var GC: Int
    private val GD: java.util.concurrent.atomic.AtomicLong
    private var GE: String
    private var GF: String
    private var GG: android.os.Bundle
    private var GH: java.util.Map
    private var GI: com.google.android.gms.internal.ij.b
    private var GJ: com.google.android.gms.common.api.BaseImplementation.b
    private var GK: com.google.android.gms.common.api.BaseImplementation.b
    private var Gs: com.google.android.gms.cast.ApplicationMetadata
    private val Gt: com.google.android.gms.cast.CastDevice
    private val Gu: java.util.Map
    private val Gv: Long
    private var Gw: com.google.android.gms.internal.ij.c
    private var Gx: String
    private var Gy: Boolean
    private var Gz: Boolean
    private val mHandler: android.os.Handler

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.cast.CastDevice, p3: Long, p4: com.google.android.gms.cast.Cast.Listener, p5: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p6: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

    private fun a(p0: com.google.android.gms.internal.ig) { /* TODO(body): (Lcom/google/android/gms/internal/ig;)V */ }
    /*
    //         .locals 7
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ig;->fy()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ij;->Gx:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_2
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ij;->Gx:Ljava/lang/String;
    //         move v0, v1
    //         :goto_0
    //         sget-object v3, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v4, "hasChanged=%b, mFirstApplicationStatusUpdate=%b"
    //         const/4 v5, 0x2
    //         new-array v5, v5, [Ljava/lang/Object;
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v2
    //         iget-boolean v6, p0, Lcom/google/android/gms/internal/ij;->Gy:Z
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v1
    //         invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         if-eqz v1, :cond_1
    //         if-nez v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij;->Gy:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/Cast$Listener;->onApplicationStatusChanged()V
    //         :cond_1
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/ij;->Gy:Z
    //         return-void
    //         :cond_2
    //         move v0, v2
    //         goto :goto_0
    */

    private fun a(p0: com.google.android.gms.internal.il) { /* TODO(body): (Lcom/google/android/gms/internal/il;)V */ }
    /*
    //         .locals 9
    //         const/4 v8, 0x2
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/il;->getApplicationMetadata()Lcom/google/android/gms/cast/ApplicationMetadata;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ij;->Gs:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/il;->fE()D
    //         move-result-wide v4
    //         const-wide/high16 v6, 0x7ff8000000000000L    # Double.NaN
    //         cmpl-double v0, v4, v6
    //         if-eqz v0, :cond_9
    //         iget-wide v6, p0, Lcom/google/android/gms/internal/ij;->FA:D
    //         cmpl-double v0, v4, v6
    //         if-eqz v0, :cond_9
    //         iput-wide v4, p0, Lcom/google/android/gms/internal/ij;->FA:D
    //         move v0, v1
    //         :goto_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/il;->fM()Z
    //         move-result v3
    //         iget-boolean v4, p0, Lcom/google/android/gms/internal/ij;->FB:Z
    //         if-eq v3, v4, :cond_0
    //         iput-boolean v3, p0, Lcom/google/android/gms/internal/ij;->FB:Z
    //         move v0, v1
    //         :cond_0
    //         sget-object v3, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v4, "hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b"
    //         new-array v5, v8, [Ljava/lang/Object;
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v2
    //         iget-boolean v6, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v1
    //         invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         if-eqz v3, :cond_2
    //         if-nez v0, :cond_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/Cast$Listener;->onVolumeChanged()V
    //         :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/il;->fN()I
    //         move-result v0
    //         iget v3, p0, Lcom/google/android/gms/internal/ij;->GB:I
    //         if-eq v0, v3, :cond_8
    //         iput v0, p0, Lcom/google/android/gms/internal/ij;->GB:I
    //         move v0, v1
    //         :goto_1
    //         sget-object v3, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v4, "hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b"
    //         new-array v5, v8, [Ljava/lang/Object;
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v2
    //         iget-boolean v6, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v1
    //         invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         if-eqz v3, :cond_4
    //         if-nez v0, :cond_3
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         if-eqz v0, :cond_4
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         iget v3, p0, Lcom/google/android/gms/internal/ij;->GB:I
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/cast/Cast$Listener;->W(I)V
    //         :cond_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/il;->fO()I
    //         move-result v0
    //         iget v3, p0, Lcom/google/android/gms/internal/ij;->GC:I
    //         if-eq v0, v3, :cond_7
    //         iput v0, p0, Lcom/google/android/gms/internal/ij;->GC:I
    //         move v0, v1
    //         :goto_2
    //         sget-object v3, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v4, "hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b"
    //         new-array v5, v8, [Ljava/lang/Object;
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v2
    //         iget-boolean v6, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v6
    //         aput-object v6, v5, v1
    //         invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         if-eqz v1, :cond_6
    //         if-nez v0, :cond_5
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         if-eqz v0, :cond_6
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         iget v1, p0, Lcom/google/android/gms/internal/ij;->GC:I
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/Cast$Listener;->X(I)V
    //         :cond_6
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         return-void
    //         :cond_7
    //         move v0, v2
    //         goto :goto_2
    //         :cond_8
    //         move v0, v2
    //         goto :goto_1
    //         :cond_9
    //         move v0, v2
    //         goto/16 :goto_0
    */

    private fun c(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v1, Lcom/google/android/gms/internal/ij;->GL:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GJ:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GJ:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v2, Lcom/google/android/gms/internal/ij$a;
    //         new-instance v3, Lcom/google/android/gms/common/api/Status;
    //         const/16 v4, 0x7d2
    //         invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ij$a;-><init>(Lcom/google/android/gms/common/api/Status;)V
    //         invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->GJ:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun e(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v1, Lcom/google/android/gms/internal/ij;->GM:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GK:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v2, 0x7d1
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->GK:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun fB() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         const/4 v2, 0x0
    //         const/4 v0, -0x1
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/ij;->GA:Z
    //         iput v0, p0, Lcom/google/android/gms/internal/ij;->GB:I
    //         iput v0, p0, Lcom/google/android/gms/internal/ij;->GC:I
    //         iput-object v1, p0, Lcom/google/android/gms/internal/ij;->Gs:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         iput-object v1, p0, Lcom/google/android/gms/internal/ij;->Gx:Ljava/lang/String;
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/ij;->FA:D
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/ij;->FB:Z
    //         return-void
    */

    private fun fF() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "removing all MessageReceivedCallbacks"
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->clear()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun fG() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij;->GA:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij$c;->fL()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Not connected to a device"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    public fun G(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ij;->FA:D
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ij;->FB:Z
    //         invoke-interface {v0, p1, v2, v3, v1}, Lcom/google/android/gms/internal/in;->a(ZDZ)V
    //         return-void
    */

    protected fun L(p0: android.os.IBinder): com.google.android.gms.internal.in { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/in;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/in$a;->M(Landroid/os/IBinder;)Lcom/google/android/gms/internal/in;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: Double) { /* TODO(body): (D)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;,
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Volume cannot be "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/in;
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ij;->FA:D
    //         iget-boolean v6, p0, Lcom/google/android/gms/internal/ij;->FB:Z
    //         move-wide v2, p1
    //         invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/in;->a(DDZ)V
    //         return-void
    */

    protected fun a(p0: Int, p1: android.os.IBinder, p2: android.os.Bundle) { /* TODO(body): (ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         const/16 v6, 0x3e9
    //         const/4 v0, 0x0
    //         const/4 v5, 0x1
    //         sget-object v1, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "in onPostInitHandler; statusCode=%d"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v3, v0
    //         invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         if-eqz p1, :cond_0
    //         if-ne p1, v6, :cond_2
    //         :cond_0
    //         iput-boolean v5, p0, Lcom/google/android/gms/internal/ij;->GA:Z
    //         iput-boolean v5, p0, Lcom/google/android/gms/internal/ij;->Gy:Z
    //         iput-boolean v5, p0, Lcom/google/android/gms/internal/ij;->Gz:Z
    //         :goto_0
    //         if-ne p1, v6, :cond_1
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         iput-object v1, p0, Lcom/google/android/gms/internal/ij;->GG:Landroid/os/Bundle;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->GG:Landroid/os/Bundle;
    //         const-string v2, "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"
    //         invoke-virtual {v1, v2, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         move p1, v0
    //         :cond_1
    //         invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/e;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_2
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/ij;->GA:Z
    //         goto :goto_0
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v5, Landroid/os/Bundle;
    //         invoke-direct {v5}, Landroid/os/Bundle;-><init>()V
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/ij;->GE:Ljava/lang/String;
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         iget-object v4, p0, Lcom/google/android/gms/internal/ij;->GF:Ljava/lang/String;
    //         aput-object v4, v2, v3
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gt:Lcom/google/android/gms/cast/CastDevice;
    //         invoke-virtual {v0, v5}, Lcom/google/android/gms/cast/CastDevice;->putInBundle(Landroid/os/Bundle;)V
    //         const-string v0, "com.google.android.gms.cast.EXTRA_CAST_FLAGS"
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ij;->Gv:J
    //         invoke-virtual {v5, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GE:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const-string v0, "last_application_id"
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->GE:Ljava/lang/String;
    //         invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GF:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const-string v0, "last_session_id"
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->GF:Ljava/lang/String;
    //         invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/ij$c;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ij$c;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij$1;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         const v2, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij$c;->asBinder()Landroid/os/IBinder;
    //         move-result-object v4
    //         move-object v0, p1
    //         move-object v1, p2
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun a(p0: String, p1: com.google.android.gms.cast.Cast.MessageReceivedCallback) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;,
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ik;->aF(Ljava/lang/String;)V
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ij;->aE(Ljava/lang/String;)V
    //         if-eqz p2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/in;->aI(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun a(p0: String, p1: com.google.android.gms.cast.LaunchOptions, p2: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/cast/LaunchOptions;",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ij;->c(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/in;->a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)V
    //         return-void
    */

    public fun a(p0: String, p1: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ij;->e(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/in;->aH(Ljava/lang/String;)V
    //         return-void
    */

    public fun a(p0: String, p1: String, p2: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;,
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "The message payload cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p2}, Ljava/lang/String;->length()I
    //         move-result v0
    //         const/high16 v1, 0x10000
    //         if-le v0, v1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Message exceeds maximum size"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ik;->aF(Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fG()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GD:Ljava/util/concurrent/atomic/AtomicLong;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J
    //         move-result-wide v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GH:Ljava/util/Map;
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1, p2, v2, v3}, Lcom/google/android/gms/internal/in;->a(Ljava/lang/String;Ljava/lang/String;J)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->GH:Ljava/util/Map;
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         throw v0
    */

    public fun a(p0: String, p1: Boolean, p2: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Ljava/lang/String;ZLcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Z",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ij;->c(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/in;->f(Ljava/lang/String;Z)V
    //         return-void
    */

    public fun aE(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Channel namespace cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         :try_start_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/in;->aJ(Ljava/lang/String;)V
    //         :try_end_1
    //         .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_2
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "Error unregistering namespace (%s): %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p1, v3, v4
    //         const/4 v4, 0x1
    //         invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ip;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    */

    public fun b(p0: String, p1: String, p2: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ij;->c(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/in;->l(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun d(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ij;->e(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/in;->fP()V
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x1
    //         const/4 v4, 0x0
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "disconnect(); ServiceListener=%s, isConnected=%b"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         aput-object v3, v2, v4
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->isConnected()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         aput-object v3, v2, v5
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/google/android/gms/internal/ij;->Gw:Lcom/google/android/gms/internal/ij$c;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij$c;->fK()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "already disposed, so short-circuiting"
    //         new-array v2, v4, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fF()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->isConnecting()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/in;->disconnect()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_3
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         sget-object v1, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "Error while disconnecting the controller interface: %s"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         invoke-virtual {v0}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ip;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         throw v0
    */

    public fun fC(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GG:Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GG:Landroid/os/Bundle;
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/google/android/gms/internal/ij;->GG:Landroid/os/Bundle;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->fC()Landroid/os/Bundle;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun fD() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/in;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/in;->fD()V
    //         return-void
    */

    public fun fE(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fG()V
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/ij;->FA:D
    //         return-wide v0
    */

    public fun getApplicationMetadata(): com.google.android.gms.cast.ApplicationMetadata { return TODO("body: ()Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fG()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gs:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         return-object v0
    */

    public fun getApplicationStatus(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fG()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gx:Ljava/lang/String;
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceController"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"
    //         return-object v0
    */

    public fun isMute(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fG()V
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij;->FB:Z
    //         return v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ij;->L(Landroid/os/IBinder;)Lcom/google/android/gms/internal/in;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val GL: Object = null!!
    private val GM: Object = null!!
    private val Gr: com.google.android.gms.internal.ip = null!!

    @JvmStatic fun a(p0: com.google.android.gms.internal.ij, p1: com.google.android.gms.cast.ApplicationMetadata): com.google.android.gms.cast.ApplicationMetadata { return TODO("body: (Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->Gs:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.ij, p1: com.google.android.gms.common.api.BaseImplementation.b): com.google.android.gms.common.api.BaseImplementation.b { return TODO("body: (Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/common/api/BaseImplementation$b;)Lcom/google/android/gms/common/api/BaseImplementation$b;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->GJ:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.ij, p1: String): String { return TODO("body: (Lcom/google/android/gms/internal/ij;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->GE:Ljava/lang/String;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.ij, p1: com.google.android.gms.internal.ig) { /* TODO(body): (Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ig;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ig;)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.ij, p1: com.google.android.gms.internal.il) { /* TODO(body): (Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/il;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/il;)V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.ij, p1: com.google.android.gms.common.api.BaseImplementation.b): com.google.android.gms.common.api.BaseImplementation.b { return TODO("body: (Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/common/api/BaseImplementation$b;)Lcom/google/android/gms/common/api/BaseImplementation$b;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->GK:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         return-object p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.ij, p1: String): String { return TODO("body: (Lcom/google/android/gms/internal/ij;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ij;->GF:Ljava/lang/String;
    //         return-object p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.ij) { /* TODO(body): (Lcom/google/android/gms/internal/ij;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fF()V
    //         return-void
    */

    @JvmStatic fun c(p0: com.google.android.gms.internal.ij) { /* TODO(body): (Lcom/google/android/gms/internal/ij;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ij;->fB()V
    //         return-void
    */

    @JvmStatic fun d(p0: com.google.android.gms.internal.ij): com.google.android.gms.common.api.BaseImplementation.b { return TODO("body: (Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GJ:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.internal.ij): com.google.android.gms.cast.Cast.Listener { return TODO("body: (Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/cast/Cast$Listener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->EO:Lcom/google/android/gms/cast/Cast$Listener;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.internal.ij): android.os.Handler { return TODO("body: (Lcom/google/android/gms/internal/ij;)Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->mHandler:Landroid/os/Handler;
    //         return-object v0
    */

    @JvmStatic fun fH(): com.google.android.gms.internal.ip { return TODO("body: ()Lcom/google/android/gms/internal/ip;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->Gr:Lcom/google/android/gms/internal/ip;
    //         return-object v0
    */

    @JvmStatic fun fI(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->GL:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun fJ(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/ij;->GM:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.internal.ij): java.util.Map { return TODO("body: (Lcom/google/android/gms/internal/ij;)Ljava/util/Map;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gu:Ljava/util/Map;
    //         return-object v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.internal.ij): com.google.android.gms.cast.CastDevice { return TODO("body: (Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/cast/CastDevice;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->Gt:Lcom/google/android/gms/cast/CastDevice;
    //         return-object v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.internal.ij): java.util.Map { return TODO("body: (Lcom/google/android/gms/internal/ij;)Ljava/util/Map;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GH:Ljava/util/Map;
    //         return-object v0
    */

    @JvmStatic fun j(p0: com.google.android.gms.internal.ij): com.google.android.gms.common.api.BaseImplementation.b { return TODO("body: (Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij;->GK:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         return-object v0
    */

    }
}
