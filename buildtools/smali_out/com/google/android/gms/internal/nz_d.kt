package com.google.android.gms.internal

// Auto-emitted from smali.
// 10 fields, 25 methods.

class nz_d: com.google.android.gms.internal.jj(), com.google.android.gms.plus.model.people.Person.Name {
    val BR: Int
    var amA: String
    var amD: String
    val amc: java.util.Set
    var anA: String
    var anB: String
    var anC: String
    var anD: String

    public constructor()

    constructor(p0: java.util.Set, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

    protected fun a(p0: com.google.android.gms.internal.ji.a): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ji$a;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    protected fun b(p0: com.google.android.gms.internal.ji.a): Object { return TODO("body: (Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown safe parcelable id="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amA:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anA:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amD:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anB:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anC:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anD:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x2
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //         .end packed-switch
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/nz$d;->CREATOR:Lcom/google/android/gms/internal/og;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         instance-of v0, p1, Lcom/google/android/gms/internal/nz$d;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         if-ne p0, p1, :cond_1
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/internal/nz$d;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         sget-object v0, Lcom/google/android/gms/internal/nz$d;->amb:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz$d;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v4
    //         if-eqz v4, :cond_4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nz$d;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz$d;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nz$d;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nz$d;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_5
    //         move v0, v2
    //         goto :goto_0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/nz$d;->nA()Lcom/google/android/gms/internal/nz$d;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getFamilyName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amA:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFormatted(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anA:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGivenName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amD:Ljava/lang/String;
    //         return-object v0
    */

    public fun getHonorificPrefix(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getHonorificSuffix(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getMiddleName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->anD:Ljava/lang/String;
    //         return-object v0
    */

    public fun hasFamilyName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         const/4 v1, 0x2
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasFormatted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         const/4 v1, 0x3
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasGivenName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         const/4 v1, 0x4
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasHonorificPrefix(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         const/4 v1, 0x5
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasHonorificSuffix(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         const/4 v1, 0x6
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasMiddleName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz$d;->amc:Ljava/util/Set;
    //         const/4 v1, 0x7
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         sget-object v1, Lcom/google/android/gms/internal/nz$d;->amb:Ljava/util/HashMap;
    //         invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz$d;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v3
    //         add-int/2addr v1, v3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz$d;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
    //         move-result v0
    //         add-int/2addr v0, v1
    //         :goto_1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return v1
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    */

    public fun hf(): java.util.HashMap { return TODO("body: ()Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/internal/nz$d;->amb:Ljava/util/HashMap;
    //         return-object v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun nA(): com.google.android.gms.internal.nz.d { return TODO("body: ()Lcom/google/android/gms/internal/nz$d;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/nz$d;->CREATOR:Lcom/google/android/gms/internal/og;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/og;->a(Lcom/google/android/gms/internal/nz$d;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.og = null!!
    private val amb: java.util.HashMap = null!!
    }
}
