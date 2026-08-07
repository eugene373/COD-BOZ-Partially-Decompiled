package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class kg: com.google.android.gms.drive.metadata.internal.j() {
    private constructor()

    protected fun c(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): Object { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/kg;->m(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun m(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): com.google.android.gms.drive.DriveId { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 6
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->gy()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "dbInstanceId"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         const-string v0, "resourceId"
    //         invoke-virtual {p1, v0, p2, p3}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const-string v0, "generated-android-"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v1, 0x0
    //         :cond_0
    //         const-string v0, "sqlId"
    //         invoke-virtual {p1, v0, p2, p3}, Lcom/google/android/gms/common/data/DataHolder;->a(Ljava/lang/String;II)J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         new-instance v0, Lcom/google/android/gms/drive/DriveId;
    //         invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/DriveId;-><init>(Ljava/lang/String;JJ)V
    //         return-object v0
    */

    companion object {
    @JvmField public val Qy: com.google.android.gms.internal.kg = null!!
    }
}
