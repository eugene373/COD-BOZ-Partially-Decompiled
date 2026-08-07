package com.google.android.gms.common.images

// Auto-emitted from smali.
// 1 fields, 3 methods.

class a_a {
    public val uri: android.net.Uri

    public constructor(p0: android.net.Uri)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/android/gms/common/images/a$a;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         if-ne p0, p1, :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/common/images/a$a;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p1, Lcom/google/android/gms/common/images/a$a;->uri:Landroid/net/Uri;
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a$a;->uri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/a$a;->uri:Landroid/net/Uri;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

}
