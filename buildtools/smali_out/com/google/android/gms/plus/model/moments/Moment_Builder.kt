package com.google.android.gms.plus.model.moments

// Auto-emitted from smali.
// 6 fields, 7 methods.

open class Moment_Builder {
    private var BL: String
    private var amP: String
    private var amX: com.google.android.gms.internal.nu
    private var amY: com.google.android.gms.internal.nu
    private val amc: java.util.Set
    private var uO: String

    public constructor()

    public fun build(): com.google.android.gms.plus.model.moments.Moment { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/Moment;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/google/android/gms/internal/nw;
    //         iget-object v1, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amc:Ljava/util/Set;
    //         iget-object v2, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->BL:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amX:Lcom/google/android/gms/internal/nu;
    //         iget-object v4, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amP:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amY:Lcom/google/android/gms/internal/nu;
    //         iget-object v6, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->uO:Ljava/lang/String;
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/nw;-><init>(Ljava/util/Set;Ljava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun setId(id: String): com.google.android.gms.plus.model.moments.Moment.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/Moment$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->BL:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x2
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setResult(result: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.Moment.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/Moment$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "result":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amX:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x4
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setStartDate(startDate: String): com.google.android.gms.plus.model.moments.Moment.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/Moment$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amP:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x5
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setTarget(target: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.Moment.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/Moment$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "target":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amY:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x6
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setType(type: String): com.google.android.gms.plus.model.moments.Moment.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/Moment$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->uO:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/Moment$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x7
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

}
