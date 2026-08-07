package com.google.android.gms.drive

// Auto-emitted from smali.
// 2 fields, 30 methods.

open class Metadata: com.google.android.gms.common.data.Freezable {
    public constructor()

    protected fun a(p0: com.google.android.gms.drive.metadata.MetadataField): Object

    public fun getAlternateLink(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PN:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getContentAvailability(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kh;->Qz:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun getCreatedDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kf;->Qt:Lcom/google/android/gms/internal/kf$a;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Date;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PP:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PM:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun getEmbedLink(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PQ:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getFileExtension(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PR:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getFileSize(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PS:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Long;
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getLastViewedByMeDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kf;->Qu:Lcom/google/android/gms/internal/kf$b;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Date;
    //         return-object v0
    */

    public fun getMimeType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qd:Lcom/google/android/gms/internal/kd$c;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getModifiedByMeDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kf;->Qw:Lcom/google/android/gms/internal/kf$c;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Date;
    //         return-object v0
    */

    public fun getModifiedDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kf;->Qv:Lcom/google/android/gms/internal/kf$d;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Date;
    //         return-object v0
    */

    public fun getOriginalFilename(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qe:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getQuotaBytesUsed(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qj:Lcom/google/android/gms/internal/kd$e;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Long;
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getSharedWithMeDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kf;->Qx:Lcom/google/android/gms/internal/kf$e;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Date;
    //         return-object v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qm:Lcom/google/android/gms/internal/kd$g;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getWebContentLink(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qo:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getWebViewLink(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qp:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun isEditable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PX:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isFolder(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const-string v0, "application/vnd.google-apps.folder"
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/Metadata;->getMimeType()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isInAppFolder(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PV:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isPinnable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kh;->QA:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isPinned(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PY:Lcom/google/android/gms/internal/kd$b;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isRestricted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->PZ:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isShared(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qa:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isStarred(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qk:Lcom/google/android/gms/internal/kd$f;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isTrashed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qn:Lcom/google/android/gms/internal/kd$h;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isViewed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/kd;->Qc:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/Metadata;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CONTENT_AVAILABLE_LOCALLY: Int = 0x1
    @JvmField public val CONTENT_NOT_AVAILABLE_LOCALLY: Int = 0
    }
}
