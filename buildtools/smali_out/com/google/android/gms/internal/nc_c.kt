package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 2 methods.

class nc_c: com.google.android.gms.internal.na.a() {
    private val De: com.google.android.gms.common.api.BaseImplementation.b

    public constructor(p0: com.google.android.gms.common.api.BaseImplementation.b)

    public fun a(p0: Int, p1: android.os.Bundle, p2: Int, p3: android.content.Intent) { /* TODO(body): (ILandroid/os/Bundle;ILandroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         if-eqz p2, :cond_0
    //         const-string v0, "pendingIntent"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_0
    //         new-instance v2, Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v2, p1, v1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nc$c;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v1, Lcom/google/android/gms/internal/ne;
    //         invoke-direct {v1, v2, p4}, Lcom/google/android/gms/internal/ne;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    //         :cond_0
    //         move-object v0, v1
    //         goto :goto_0
    */

}
