package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 13 methods.

class jf: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.internal.ji.b {
    private val BR: Int
    private val Mt: java.util.HashMap
    private val Mu: java.util.HashMap
    private val Mv: java.util.ArrayList

    public constructor()

    constructor(p0: Int, p1: java.util.ArrayList)

    private fun b(p0: java.util.ArrayList) { /* TODO(body): (Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/jf$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/jf$a;
    //         iget-object v2, v0, Lcom/google/android/gms/internal/jf$a;->Mw:Ljava/lang/String;
    //         iget v0, v0, Lcom/google/android/gms/internal/jf$a;->Mx:I
    //         invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/internal/jf;->h(Ljava/lang/String;I)Lcom/google/android/gms/internal/jf;
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun a(p0: Integer): String { return TODO("body: (Ljava/lang/Integer;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jf;->Mu:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jf;->Mt:Ljava/util/HashMap;
    //         const-string v2, "gms_unknown"
    //         invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v0, "gms_unknown"
    //         :cond_0
    //         return-object v0
    */

    public fun convertBack(x0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, Ljava/lang/Integer;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jf;->a(Ljava/lang/Integer;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jf;->CREATOR:Lcom/google/android/gms/internal/jg;
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/jf;->BR:I
    //         return v0
    */

    public fun h(p0: String, p1: Int): com.google.android.gms.internal.jf { return TODO("body: (Ljava/lang/String;I)Lcom/google/android/gms/internal/jf;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jf;->Mt:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jf;->Mu:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object p0
    */

    fun hc(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/jf$a;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jf;->Mt:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v4, Lcom/google/android/gms/internal/jf$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jf;->Mt:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/Integer;
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v1
    //         invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/jf$a;-><init>(Ljava/lang/String;I)V
    //         invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public fun hd(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x7
    //         return v0
    */

    public fun he(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jf;->CREATOR:Lcom/google/android/gms/internal/jg;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jg;->a(Lcom/google/android/gms/internal/jf;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jg = null!!
    }
}
