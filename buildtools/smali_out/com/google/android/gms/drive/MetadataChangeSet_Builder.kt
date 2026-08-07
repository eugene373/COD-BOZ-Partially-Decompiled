package com.google.android.gms.drive

// Auto-emitted from smali.
// 2 fields, 10 methods.

open class MetadataChangeSet_Builder {
    private val Nu: com.google.android.gms.drive.metadata.internal.MetadataBundle
    private var Nv: com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a

    public constructor()

    public fun build(): com.google.android.gms.drive.MetadataChangeSet { return TODO("body: ()Lcom/google/android/gms/drive/MetadataChangeSet;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nv:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->PO:Lcom/google/android/gms/internal/kd$a;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nv:Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;
    //         invoke-virtual {v2}, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$a;->im()Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/MetadataChangeSet;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/MetadataChangeSet;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    //         return-object v0
    */

    public fun setDescription(description: String): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->PP:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setIndexableText(text: String): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->PU:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setLastViewedByMeDate(date: java.util.Date): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Ljava/util/Date;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kf;->Qu:Lcom/google/android/gms/internal/kf$b;
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setMimeType(mimeType: String): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->Qd:Lcom/google/android/gms/internal/kd$c;
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setPinned(pinned: Boolean): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Z)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->PY:Lcom/google/android/gms/internal/kd$b;
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setStarred(starred: Boolean): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Z)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->Qk:Lcom/google/android/gms/internal/kd$f;
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setTitle(title: String): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->Qm:Lcom/google/android/gms/internal/kd$g;
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

    public fun setViewed(viewed: Boolean): com.google.android.gms.drive.MetadataChangeSet.Builder { return TODO("body: (Z)Lcom/google/android/gms/drive/MetadataChangeSet$Builder;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataChangeSet$Builder;->Nu:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         sget-object v1, Lcom/google/android/gms/internal/kd;->Qc:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-object p0
    */

}
