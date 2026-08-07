package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class y: com.google.android.gms.drive.internal.ad.a() {
    private val Oa: Int
    private val Pe: com.google.android.gms.drive.events.c
    private val Pf: com.google.android.gms.drive.internal.y.a
    private val Pg: java.util.List

    public constructor(p0: android.os.Looper, p1: android.content.Context, p2: Int, p3: com.google.android.gms.drive.events.c)

    public fun bq(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/y;->Pg:Ljava/util/List;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun br(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/y;->Pg:Ljava/util/List;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun c(p0: com.google.android.gms.drive.internal.OnEventResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnEventResponse;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnEventResponse;->ih()Lcom/google/android/gms/drive/events/DriveEvent;
    //         move-result-object v1
    //         iget v0, p0, Lcom/google/android/gms/drive/internal/y;->Oa:I
    //         invoke-interface {v1}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I
    //         move-result v2
    //         if-ne v0, v2, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->I(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/y;->Pg:Ljava/util/List;
    //         invoke-interface {v1}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->I(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/y;->Pf:Lcom/google/android/gms/drive/internal/y$a;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/y;->Pe:Lcom/google/android/gms/drive/events/c;
    //         invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/drive/internal/y$a;->a(Lcom/google/android/gms/drive/events/c;Lcom/google/android/gms/drive/events/DriveEvent;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
