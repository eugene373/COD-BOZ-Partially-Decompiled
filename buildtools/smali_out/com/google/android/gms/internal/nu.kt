package com.google.android.gms.internal

// Auto-emitted from smali.
// 58 fields, 122 methods.

class nu: com.google.android.gms.internal.jj(), com.google.android.gms.plus.model.moments.ItemScope {
    var BL: String
    val BR: Int
    var Tr: String
    var aek: Double
    var ael: Double
    var amA: String
    var amB: String
    var amC: com.google.android.gms.internal.nu
    var amD: String
    var amE: String
    var amF: String
    var amG: com.google.android.gms.internal.nu
    var amH: com.google.android.gms.internal.nu
    var amI: com.google.android.gms.internal.nu
    var amJ: java.util.List
    var amK: String
    var amL: String
    var amM: String
    var amN: String
    var amO: com.google.android.gms.internal.nu
    var amP: String
    var amQ: String
    var amR: String
    var amS: com.google.android.gms.internal.nu
    var amT: String
    var amU: String
    var amV: String
    var amW: String
    val amc: java.util.Set
    var amd: com.google.android.gms.internal.nu
    var ame: java.util.List
    var amf: com.google.android.gms.internal.nu
    var amg: String
    var amh: String
    var ami: String
    var amj: java.util.List
    var amk: Int
    var aml: java.util.List
    var amm: com.google.android.gms.internal.nu
    var amn: java.util.List
    var amo: String
    var amp: String
    var amq: com.google.android.gms.internal.nu
    var amr: String
    var ams: String
    var amt: java.util.List
    var amu: String
    var amv: String
    var amw: String
    var amx: String
    var amy: String
    var amz: String
    var mName: String
    var ol: String
    var uO: String
    var uR: String

    public constructor()

    constructor(p0: java.util.Set, p1: Int, p2: com.google.android.gms.internal.nu, p3: java.util.List, p4: com.google.android.gms.internal.nu, p5: String, p6: String, p7: String, p8: java.util.List, p9: Int, p10: java.util.List, p11: com.google.android.gms.internal.nu, p12: java.util.List, p13: String, p14: String, p15: com.google.android.gms.internal.nu, p16: String, p17: String, p18: String, p19: java.util.List, p20: String, p21: String, p22: String, p23: String, p24: String, p25: String, p26: String, p27: String, p28: String, p29: com.google.android.gms.internal.nu, p30: String, p31: String, p32: String, p33: String, p34: com.google.android.gms.internal.nu, p35: Double, p36: com.google.android.gms.internal.nu, p37: Double, p38: String, p39: com.google.android.gms.internal.nu, p40: java.util.List, p41: String, p42: String, p43: String, p44: String, p45: com.google.android.gms.internal.nu, p46: String, p47: String, p48: String, p49: com.google.android.gms.internal.nu, p50: String, p51: String, p52: String, p53: String, p54: String, p55: String)

    public constructor(p0: java.util.Set, p1: com.google.android.gms.internal.nu, p2: java.util.List, p3: com.google.android.gms.internal.nu, p4: String, p5: String, p6: String, p7: java.util.List, p8: Int, p9: java.util.List, p10: com.google.android.gms.internal.nu, p11: java.util.List, p12: String, p13: String, p14: com.google.android.gms.internal.nu, p15: String, p16: String, p17: String, p18: java.util.List, p19: String, p20: String, p21: String, p22: String, p23: String, p24: String, p25: String, p26: String, p27: String, p28: com.google.android.gms.internal.nu, p29: String, p30: String, p31: String, p32: String, p33: com.google.android.gms.internal.nu, p34: Double, p35: com.google.android.gms.internal.nu, p36: Double, p37: String, p38: com.google.android.gms.internal.nu, p39: java.util.List, p40: String, p41: String, p42: String, p43: String, p44: com.google.android.gms.internal.nu, p45: String, p46: String, p47: String, p48: com.google.android.gms.internal.nu, p49: String, p50: String, p51: String, p52: String, p53: String, p54: String)

    protected fun a(p0: com.google.android.gms.internal.ji.a): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ji$a;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amd:Lcom/google/android/gms/internal/nu;
    //         :goto_0
    //         return-object v0
    //         :pswitch_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ame:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amf:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amg:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amh:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ami:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_7
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amj:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_8
    //         iget v0, p0, Lcom/google/android/gms/internal/nu;->amk:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_9
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->aml:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_a
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amm:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amn:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_c
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amo:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_d
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amp:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_e
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amq:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amr:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_10
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ams:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_11
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ol:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_12
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amt:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_13
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amu:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_14
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amv:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_15
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amw:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_16
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->Tr:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_17
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amx:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_18
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amy:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_19
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amz:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_1a
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amA:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_1b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amB:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_1c
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amC:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_1d
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amD:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_1e
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amE:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_1f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->BL:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_20
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amF:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_21
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amG:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_22
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/nu;->aek:D
    //         invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_23
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amH:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_24
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/nu;->ael:D
    //         invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_25
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->mName:Ljava/lang/String;
    //         goto :goto_0
    //         :pswitch_26
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amI:Lcom/google/android/gms/internal/nu;
    //         goto :goto_0
    //         :pswitch_27
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amJ:Ljava/util/List;
    //         goto :goto_0
    //         :pswitch_28
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amK:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_29
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amL:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_2a
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amM:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_2b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amN:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_2c
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amO:Lcom/google/android/gms/internal/nu;
    //         goto/16 :goto_0
    //         :pswitch_2d
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amP:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_2e
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amQ:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_2f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amR:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_30
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amS:Lcom/google/android/gms/internal/nu;
    //         goto/16 :goto_0
    //         :pswitch_31
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amT:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_32
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amU:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_33
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->uO:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_34
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->uR:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_35
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amV:Ljava/lang/String;
    //         goto/16 :goto_0
    //         :pswitch_36
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amW:Ljava/lang/String;
    //         goto/16 :goto_0
    //         nop
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
    //             :pswitch_9
    //             :pswitch_a
    //             :pswitch_b
    //             :pswitch_c
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
    //             :pswitch_19
    //             :pswitch_1a
    //             :pswitch_1b
    //             :pswitch_1c
    //             :pswitch_1d
    //             :pswitch_1e
    //             :pswitch_1f
    //             :pswitch_20
    //             :pswitch_21
    //             :pswitch_0
    //             :pswitch_22
    //             :pswitch_23
    //             :pswitch_24
    //             :pswitch_25
    //             :pswitch_26
    //             :pswitch_27
    //             :pswitch_28
    //             :pswitch_29
    //             :pswitch_2a
    //             :pswitch_2b
    //             :pswitch_2c
    //             :pswitch_2d
    //             :pswitch_2e
    //             :pswitch_2f
    //             :pswitch_30
    //             :pswitch_31
    //             :pswitch_32
    //             :pswitch_33
    //             :pswitch_34
    //             :pswitch_35
    //             :pswitch_36
    //         .end packed-switch
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/nu;->CREATOR:Lcom/google/android/gms/internal/nv;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         instance-of v0, p1, Lcom/google/android/gms/internal/nu;
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
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         sget-object v0, Lcom/google/android/gms/internal/nu;->amb:Ljava/util/HashMap;
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
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v4
    //         if-eqz v4, :cond_4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nu;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nu;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
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
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/ji$a;)Z
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
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/nu;->nr()Lcom/google/android/gms/internal/nu;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAbout(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amd:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getAdditionalName(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ame:Ljava/util/List;
    //         return-object v0
    */

    public fun getAddress(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amf:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getAddressCountry(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amg:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddressLocality(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amh:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddressRegion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ami:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAssociated_media(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amj:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getAttendeeCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nu;->amk:I
    //         return v0
    */

    public fun getAttendees(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->aml:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getAudio(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amm:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getAuthor(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amn:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getBestRating(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amo:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBirthDate(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amp:Ljava/lang/String;
    //         return-object v0
    */

    public fun getByArtist(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amq:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getCaption(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getContentSize(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ams:Ljava/lang/String;
    //         return-object v0
    */

    public fun getContentUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->ol:Ljava/lang/String;
    //         return-object v0
    */

    public fun getContributor(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amt:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getDateCreated(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amu:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDateModified(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amv:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDatePublished(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amw:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDuration(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amx:Ljava/lang/String;
    //         return-object v0
    */

    public fun getEmbedUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amy:Ljava/lang/String;
    //         return-object v0
    */

    public fun getEndDate(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amz:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFamilyName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amA:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGender(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGeo(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amC:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getGivenName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amD:Ljava/lang/String;
    //         return-object v0
    */

    public fun getHeight(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amE:Ljava/lang/String;
    //         return-object v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->BL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getImage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amF:Ljava/lang/String;
    //         return-object v0
    */

    public fun getInAlbum(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amG:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getLatitude(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/nu;->aek:D
    //         return-wide v0
    */

    public fun getLocation(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amH:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getLongitude(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/nu;->ael:D
    //         return-wide v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPartOfTVSeries(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amI:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getPerformers(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amJ:Ljava/util/List;
    //         check-cast v0, Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getPlayerType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amK:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPostOfficeBoxNumber(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPostalCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amM:Ljava/lang/String;
    //         return-object v0
    */

    public fun getRatingValue(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amN:Ljava/lang/String;
    //         return-object v0
    */

    public fun getReviewRating(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amO:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getStartDate(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amP:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStreetAddress(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amQ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amR:Ljava/lang/String;
    //         return-object v0
    */

    public fun getThumbnail(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amS:Lcom/google/android/gms/internal/nu;
    //         return-object v0
    */

    public fun getThumbnailUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amT:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTickerSymbol(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amU:Ljava/lang/String;
    //         return-object v0
    */

    public fun getType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->uO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->uR:Ljava/lang/String;
    //         return-object v0
    */

    public fun getWidth(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amV:Ljava/lang/String;
    //         return-object v0
    */

    public fun getWorstRating(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amW:Ljava/lang/String;
    //         return-object v0
    */

    public fun hasAbout(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/4 v1, 0x2
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAdditionalName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/4 v1, 0x3
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAddress(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/4 v1, 0x4
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAddressCountry(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/4 v1, 0x5
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAddressLocality(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/4 v1, 0x6
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAddressRegion(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/4 v1, 0x7
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAssociated_media(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x8
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAttendeeCount(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x9
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAttendees(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0xa
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAudio(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0xb
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAuthor(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0xc
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasBestRating(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0xd
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasBirthDate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0xe
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasByArtist(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0xf
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasCaption(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x10
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasContentSize(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x11
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasContentUrl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x12
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasContributor(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x13
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasDateCreated(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x14
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasDateModified(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x15
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasDatePublished(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x16
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasDescription(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x17
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasDuration(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x18
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasEmbedUrl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x19
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasEndDate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1a
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasFamilyName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1b
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasGender(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1c
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasGeo(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1d
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasGivenName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1e
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasHeight(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1f
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasId(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x20
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasImage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x21
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasInAlbum(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x22
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasLatitude(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x24
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasLocation(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x25
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasLongitude(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x26
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasName(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x27
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPartOfTVSeries(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x28
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPerformers(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x29
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPlayerType(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2a
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPostOfficeBoxNumber(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2b
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasPostalCode(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2c
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasRatingValue(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2d
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasReviewRating(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2e
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasStartDate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2f
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasStreetAddress(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x30
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasText(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x31
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasThumbnail(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x32
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasThumbnailUrl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x33
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasTickerSymbol(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x34
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasType(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x35
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasUrl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x36
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasWidth(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x37
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun hasWorstRating(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nu;->amc:Ljava/util/Set;
    //         const/16 v1, 0x38
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
    //         sget-object v1, Lcom/google/android/gms/internal/nu;->amb:Ljava/util/HashMap;
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
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/ji$a;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v3
    //         add-int/2addr v1, v3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nu;->b(Lcom/google/android/gms/internal/ji$a;)Ljava/lang/Object;
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
    //         sget-object v0, Lcom/google/android/gms/internal/nu;->amb:Ljava/util/HashMap;
    //         return-object v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun nr(): com.google.android.gms.internal.nu { return TODO("body: ()Lcom/google/android/gms/internal/nu;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/nu;->CREATOR:Lcom/google/android/gms/internal/nv;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/nv;->a(Lcom/google/android/gms/internal/nu;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.nv = null!!
    private val amb: java.util.HashMap = null!!
    }
}
