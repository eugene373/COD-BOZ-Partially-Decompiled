package com.google.android.gms.plus.model.moments

// Auto-emitted from smali.
// 55 fields, 56 methods.

open class ItemScope_Builder {
    private var BL: String
    private var Tr: String
    private var aek: Double
    private var ael: Double
    private var amA: String
    private var amB: String
    private var amC: com.google.android.gms.internal.nu
    private var amD: String
    private var amE: String
    private var amF: String
    private var amG: com.google.android.gms.internal.nu
    private var amH: com.google.android.gms.internal.nu
    private var amI: com.google.android.gms.internal.nu
    private var amJ: java.util.List
    private var amK: String
    private var amL: String
    private var amM: String
    private var amN: String
    private var amO: com.google.android.gms.internal.nu
    private var amP: String
    private var amQ: String
    private var amR: String
    private var amS: com.google.android.gms.internal.nu
    private var amT: String
    private var amU: String
    private var amV: String
    private var amW: String
    private val amc: java.util.Set
    private var amd: com.google.android.gms.internal.nu
    private var ame: java.util.List
    private var amf: com.google.android.gms.internal.nu
    private var amg: String
    private var amh: String
    private var ami: String
    private var amj: java.util.List
    private var amk: Int
    private var aml: java.util.List
    private var amm: com.google.android.gms.internal.nu
    private var amn: java.util.List
    private var amo: String
    private var amp: String
    private var amq: com.google.android.gms.internal.nu
    private var amr: String
    private var ams: String
    private var amt: java.util.List
    private var amu: String
    private var amv: String
    private var amw: String
    private var amx: String
    private var amy: String
    private var amz: String
    private var mName: String
    private var ol: String
    private var uO: String
    private var uR: String

    public constructor()

    public fun build(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 60
    //         new-instance v2, Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         move-object/from16 v0, p0
    //         iget-object v4, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amd:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v0, p0
    //         iget-object v5, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ame:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amf:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v0, p0
    //         iget-object v7, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amg:Ljava/lang/String;
    //         move-object/from16 v0, p0
    //         iget-object v8, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amh:Ljava/lang/String;
    //         move-object/from16 v0, p0
    //         iget-object v9, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ami:Ljava/lang/String;
    //         move-object/from16 v0, p0
    //         iget-object v10, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amj:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget v11, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amk:I
    //         move-object/from16 v0, p0
    //         iget-object v12, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->aml:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amm:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v0, p0
    //         iget-object v14, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amn:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget-object v15, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amo:Ljava/lang/String;
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amp:Ljava/lang/String;
    //         move-object/from16 v16, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amq:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v17, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amr:Ljava/lang/String;
    //         move-object/from16 v18, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ams:Ljava/lang/String;
    //         move-object/from16 v19, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ol:Ljava/lang/String;
    //         move-object/from16 v20, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amt:Ljava/util/List;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amu:Ljava/lang/String;
    //         move-object/from16 v22, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amv:Ljava/lang/String;
    //         move-object/from16 v23, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amw:Ljava/lang/String;
    //         move-object/from16 v24, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->Tr:Ljava/lang/String;
    //         move-object/from16 v25, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amx:Ljava/lang/String;
    //         move-object/from16 v26, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amy:Ljava/lang/String;
    //         move-object/from16 v27, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amz:Ljava/lang/String;
    //         move-object/from16 v28, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amA:Ljava/lang/String;
    //         move-object/from16 v29, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amB:Ljava/lang/String;
    //         move-object/from16 v30, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amC:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v31, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amD:Ljava/lang/String;
    //         move-object/from16 v32, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amE:Ljava/lang/String;
    //         move-object/from16 v33, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->BL:Ljava/lang/String;
    //         move-object/from16 v34, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amF:Ljava/lang/String;
    //         move-object/from16 v35, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amG:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v36, v0
    //         move-object/from16 v0, p0
    //         iget-wide v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->aek:D
    //         move-wide/from16 v37, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amH:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v39, v0
    //         move-object/from16 v0, p0
    //         iget-wide v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ael:D
    //         move-wide/from16 v40, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->mName:Ljava/lang/String;
    //         move-object/from16 v42, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amI:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v43, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amJ:Ljava/util/List;
    //         move-object/from16 v44, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amK:Ljava/lang/String;
    //         move-object/from16 v45, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amL:Ljava/lang/String;
    //         move-object/from16 v46, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amM:Ljava/lang/String;
    //         move-object/from16 v47, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amN:Ljava/lang/String;
    //         move-object/from16 v48, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amO:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v49, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amP:Ljava/lang/String;
    //         move-object/from16 v50, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amQ:Ljava/lang/String;
    //         move-object/from16 v51, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amR:Ljava/lang/String;
    //         move-object/from16 v52, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amS:Lcom/google/android/gms/internal/nu;
    //         move-object/from16 v53, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amT:Ljava/lang/String;
    //         move-object/from16 v54, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amU:Ljava/lang/String;
    //         move-object/from16 v55, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->uO:Ljava/lang/String;
    //         move-object/from16 v56, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->uR:Ljava/lang/String;
    //         move-object/from16 v57, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amV:Ljava/lang/String;
    //         move-object/from16 v58, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amW:Ljava/lang/String;
    //         move-object/from16 v59, v0
    //         invoke-direct/range {v2 .. v59}, Lcom/google/android/gms/internal/nu;-><init>(Ljava/util/Set;Lcom/google/android/gms/internal/nu;Ljava/util/List;Lcom/google/android/gms/internal/nu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lcom/google/android/gms/internal/nu;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nu;DLcom/google/android/gms/internal/nu;DLjava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v2
    */

    public fun setAbout(about: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "about":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amd:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x2
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAdditionalName(p0: java.util.List): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "additionalName":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ame:Ljava/util/List;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x3
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAddress(address: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "address":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amf:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x4
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAddressCountry(addressCountry: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amg:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x5
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAddressLocality(addressLocality: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amh:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x6
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAddressRegion(addressRegion: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ami:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/4 v1, 0x7
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAssociated_media(p0: java.util.List): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "associated_media":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/moments/ItemScope;>;"
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amj:Ljava/util/List;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x8
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAttendeeCount(attendeeCount: Int): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (I)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amk:I
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x9
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAttendees(p0: java.util.List): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "attendees":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/moments/ItemScope;>;"
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->aml:Ljava/util/List;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0xa
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAudio(audio: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "audio":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amm:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0xb
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setAuthor(p0: java.util.List): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "author":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/moments/ItemScope;>;"
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amn:Ljava/util/List;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0xc
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setBestRating(bestRating: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amo:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0xd
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setBirthDate(birthDate: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amp:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0xe
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setByArtist(byArtist: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "byArtist":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amq:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0xf
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setCaption(caption: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amr:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x10
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setContentSize(contentSize: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ams:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x11
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setContentUrl(contentUrl: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ol:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x12
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setContributor(p0: java.util.List): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "contributor":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/moments/ItemScope;>;"
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amt:Ljava/util/List;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x13
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setDateCreated(dateCreated: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amu:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x14
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setDateModified(dateModified: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amv:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x15
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setDatePublished(datePublished: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amw:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x16
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setDescription(description: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->Tr:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x17
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setDuration(duration: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amx:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x18
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setEmbedUrl(embedUrl: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amy:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x19
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setEndDate(endDate: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amz:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1a
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setFamilyName(familyName: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amA:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1b
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setGender(gender: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amB:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1c
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setGeo(geo: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "geo":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amC:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1d
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setGivenName(givenName: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amD:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1e
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setHeight(height: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amE:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x1f
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setId(id: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->BL:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x20
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setImage(image: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amF:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x21
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setInAlbum(inAlbum: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "inAlbum":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amG:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x22
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setLatitude(latitude: Double): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (D)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 3
    //         iput-wide p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->aek:D
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x24
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setLocation(location: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "location":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amH:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x25
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setLongitude(longitude: Double): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (D)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 3
    //         iput-wide p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->ael:D
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x26
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setName(name: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->mName:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x27
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setPartOfTVSeries(partOfTVSeries: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "partOfTVSeries":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amI:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x28
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setPerformers(p0: java.util.List): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "performers":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/moments/ItemScope;>;"
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amJ:Ljava/util/List;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x29
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setPlayerType(playerType: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amK:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2a
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setPostOfficeBoxNumber(postOfficeBoxNumber: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amL:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2b
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setPostalCode(postalCode: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amM:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2c
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setRatingValue(ratingValue: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amN:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2d
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setReviewRating(reviewRating: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "reviewRating":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amO:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2e
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setStartDate(startDate: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amP:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x2f
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setStreetAddress(streetAddress: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amQ:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x30
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setText(text: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amR:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x31
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setThumbnail(thumbnail: com.google.android.gms.plus.model.moments.ItemScope): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/moments/ItemScope;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         check-cast p1, Lcom/google/android/gms/internal/nu;
    //         .end local p1    # "thumbnail":Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amS:Lcom/google/android/gms/internal/nu;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x32
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setThumbnailUrl(thumbnailUrl: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amT:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x33
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setTickerSymbol(tickerSymbol: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amU:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x34
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setType(type: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->uO:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x35
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setUrl(url: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->uR:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x36
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setWidth(width: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amV:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x37
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setWorstRating(worstRating: String): com.google.android.gms.plus.model.moments.ItemScope.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;") }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amW:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/model/moments/ItemScope$Builder;->amc:Ljava/util/Set;
    //         const/16 v1, 0x38
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

}
