package com.google.android.gms.internal

// Auto-emitted from smali.
// 28 fields, 63 methods.

class nz: com.google.android.gms.internal.jj(), com.google.android.gms.plus.model.people.Person {
    var BL: String
    val BR: Int
    var Fc: String
    var NH: String
    val amc: java.util.Set
    var ana: String
    var anb: com.google.android.gms.internal.nz.a
    var anc: String
    var and: String
    var ane: Int
    var anf: com.google.android.gms.internal.nz.b
    var ang: String
    var anh: com.google.android.gms.internal.nz.c
    var ani: Boolean
    var anj: com.google.android.gms.internal.nz.d
    var ank: String
    var anl: Int
    var anm: java.util.List
    var ann: java.util.List
    var ano: Int
    var anp: Int
    var anq: String
    var anr: java.util.List
    var ans: Boolean
    var om: Int
    var uR: String

    public constructor()

    public constructor(p0: String, p1: String, p2: com.google.android.gms.internal.nz.c, p3: Int, p4: String)

    constructor(p0: java.util.Set, p1: Int, p2: String, p3: com.google.android.gms.internal.nz.a, p4: String, p5: String, p6: Int, p7: com.google.android.gms.internal.nz.b, p8: String, p9: String, p10: Int, p11: String, p12: com.google.android.gms.internal.nz.c, p13: Boolean, p14: String, p15: com.google.android.gms.internal.nz.d, p16: String, p17: Int, p18: java.util.List, p19: java.util.List, p20: Int, p21: Int, p22: String, p23: String, p24: java.util.List, p25: Boolean)

    protected fun a(p0: com.google.android.gms.internal.ji.a): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ji$a;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
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
    //         :pswitch_0
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
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ana:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :pswitch_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anb:Lcom/google/android/gms/internal/nz$a;
    //         goto :goto_0
    //         :pswitch_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anc:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->and:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_5
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->ane:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anf:Lcom/google/android/gms/internal/nz$b;
    //         goto :goto_0
    //         :pswitch_7
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ang:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_8
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->NH:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_9
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->om:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_a
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->BL:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anh:Lcom/google/android/gms/internal/nz$c;
    //         goto :goto_0
    //         :pswitch_c
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nz;->ani:Z
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_d
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->Fc:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_e
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anj:Lcom/google/android/gms/internal/nz$d;
    //         goto :goto_0
    //         :pswitch_f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ank:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_10
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->anl:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_11
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anm:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_12
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ann:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_13
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->ano:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_14
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->anp:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_15
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anq:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_16
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->uR:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_17
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anr:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_18
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nz;->ans:Z
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x2
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //             :pswitch_8
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_9
    //             :pswitch_0
    //             :pswitch_a
    //             :pswitch_b
    //             :pswitch_c
    //             :pswitch_0
    //             :pswitch_d
    //             :pswitch_e
    //             :pswitch_f
    //             :pswitch_10
    //             :pswitch_11
    //             :pswitch_12
    //             :pswitch_13
    //             :pswitch_14
    //             :pswitch_15
    //             :pswitch_16
    //             :pswitch_17
    //             :pswitch_18
    //         .end packed-switch
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/nz;->CREATOR:Lcom/google/android/gms/internal/oa;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         instance-of v0, p1, Lcom/google/android/gms/internal/nz;
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
    //         check-cast p1, Lcom/google/android/gms/internal/nz;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         sget-object v0, Lcom/google/android/gms/internal/nz;->amb:Ljava/util/HashMap;
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
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v4
    //         if-eqz v4, :cond_4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nz;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nz;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
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
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nz;->a(Lcom/google/android/gms/internal/ji$a;)Z
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
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/nz;->nu()Lcom/google/android/gms/internal/nz;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAboutMe(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ana:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAgeRange(): com.google.android.gms.plus.model.people.Person.AgeRange { return TODO("body: ()Lcom/google/android/gms/plus/model/people/Person$AgeRange;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anb:Lcom/google/android/gms/internal/nz$a;
    //         return-object v0
    */

    public fun getBirthday(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBraggingRights(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->and:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCircledByCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->ane:I
    //         return v0
    */

    public fun getCover(): com.google.android.gms.plus.model.people.Person.Cover { return TODO("body: ()Lcom/google/android/gms/plus/model/people/Person$Cover;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anf:Lcom/google/android/gms/internal/nz$b;
    //         return-object v0
    */

    public fun getCurrentLocation(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ang:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->NH:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGender(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->om:I
    //         return v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->BL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getImage(): com.google.android.gms.plus.model.people.Person.Image { return TODO("body: ()Lcom/google/android/gms/plus/model/people/Person$Image;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anh:Lcom/google/android/gms/internal/nz$c;
    //         return-object v0
    */

    public fun getLanguage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->Fc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(): com.google.android.gms.plus.model.people.Person.Name { return TODO("body: ()Lcom/google/android/gms/plus/model/people/Person$Name;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anj:Lcom/google/android/gms/internal/nz$d;
    //         return-object v0
    */

    public fun getNickname(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ank:Ljava/lang/String;
    //         return-object v0
    */

    public fun getObjectType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->anl:I
    //         return v0
    */

    public fun getOrganizations(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/people/Person$Organizations;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anm:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getPlacesLived(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/people/Person$PlacesLived;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->ann:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getPlusOneCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->ano:I
    //         return v0
    */

    public fun getRelationshipStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nz;->anp:I
    //         return v0
    */

    public fun getTagline(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anq:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->uR:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUrls(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/people/Person$Urls;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->anr:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun hasAboutMe(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/4 v1, 0x2
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAgeRange(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/4 v1, 0x3
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasBirthday(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/4 v1, 0x4
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasBraggingRights(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/4 v1, 0x5
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasCircledByCount(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/4 v1, 0x6
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasCover(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/4 v1, 0x7
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasCurrentLocation(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x8
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasDisplayName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x9
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasGender(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0xc
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasId(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0xe
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasImage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0xf
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasIsPlusUser(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x10
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasLanguage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x12
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x13
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasNickname(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x14
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasObjectType(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x15
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasOrganizations(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x16
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPlacesLived(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x17
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPlusOneCount(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x18
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasRelationshipStatus(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x19
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasTagline(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1a
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasUrl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1b
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasUrls(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1c
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasVerified(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nz;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1d
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
    //         sget-object v1, Lcom/google/android/gms/internal/nz;->amb:Ljava/util/HashMap;
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
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v3
    //         add-int/2addr v1, v3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nz;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
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
    //         sget-object v0, Lcom/google/android/gms/internal/nz;->amb:Ljava/util/HashMap;
    //         return-object v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun isPlusUser(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nz;->ani:Z
    //         return v0
    */

    public fun isVerified(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nz;->ans:Z
    //         return v0
    */

    public fun nu(): com.google.android.gms.internal.nz { return TODO("body: ()Lcom/google/android/gms/internal/nz;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/nz;->CREATOR:Lcom/google/android/gms/internal/oa;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/oa;->a(Lcom/google/android/gms/internal/nz;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.oa = null!!
    private val amb: java.util.HashMap = null!!

    public @JvmStatic fun i(p0: ByteArray): com.google.android.gms.internal.nz { return TODO("body: ([B)Lcom/google/android/gms/internal/nz;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         array-length v1, p0
    //         invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V
    //         invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V
    //         sget-object v1, Lcom/google/android/gms/internal/nz;->CREATOR:Lcom/google/android/gms/internal/oa;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/oa;->dd(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-object v1
    */

    }
}
