package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 13 fields, 25 methods.

open class DataSource: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val FD: Int
    private val SO: com.google.android.gms.fitness.data.Device
    private val SP: com.google.android.gms.fitness.data.a
    private val SQ: String
    private val SR: Boolean
    private val SS: String
    private val Sp: com.google.android.gms.fitness.data.DataType
    private val mName: String

    constructor(versionCode: Int, dataType: com.google.android.gms.fitness.data.DataType, name: String, type: Int, device: com.google.android.gms.fitness.data.Device, application: com.google.android.gms.fitness.data.a, streamName: String, isObfuscated: Boolean)

    private constructor(builder: com.google.android.gms.fitness.data.DataSource.Builder)

    constructor(x0: com.google.android.gms.fitness.data.DataSource.Builder, x1: com.google.android.gms.fitness.data.DataSource.1)

    private fun a(p0: com.google.android.gms.fitness.data.DataSource): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SS:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataSource;->SS:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    private fun getTypeString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->FD:I
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "invalid type value"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         const-string v0, "raw"
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         const-string v0, "derived"
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    private fun iN(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataSource;->getTypeString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/DataType;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         if-eqz v1, :cond_0
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/a;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         if-eqz v1, :cond_1
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/Device;->getStreamIdentifier()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         if-eqz v1, :cond_2
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/DataSource;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/DataSource;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataSource;->a(Lcom/google/android/gms/fitness/data/DataSource;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getAppPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/a;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    public fun getDevice(): com.google.android.gms.fitness.data.Device { return TODO("body: ()Lcom/google/android/gms/fitness/data/Device;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStreamIdentifier(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SS:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStreamName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->FD:I
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SS:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun iM(): com.google.android.gms.fitness.data.a { return TODO("body: ()Lcom/google/android/gms/fitness/data/a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         return-object v0
    */

    public fun iO(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SR:Z
    //         return v0
    */

    public fun iP(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 9
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         if-nez v1, :cond_0
    //         move-object v5, v0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         if-nez v1, :cond_1
    //         move-object v6, v0
    //         :goto_1
    //         new-instance v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataSource;->mName:Ljava/lang/String;
    //         iget v4, p0, Lcom/google/android/gms/fitness/data/DataSource;->FD:I
    //         iget-object v7, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         invoke-static {v7}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v7
    //         iget-boolean v8, p0, Lcom/google/android/gms/fitness/data/DataSource;->SR:Z
    //         invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/fitness/data/DataSource;-><init>(ILcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;ILcom/google/android/gms/fitness/data/Device;Lcom/google/android/gms/fitness/data/a;Ljava/lang/String;Z)V
    //         return-object v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Device;->iT()Lcom/google/android/gms/fitness/data/Device;
    //         move-result-object v5
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/a;->iA()Lcom/google/android/gms/fitness/data/a;
    //         move-result-object v6
    //         goto :goto_1
    */

    public fun toDebugString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->FD:I
    //         if-nez v0, :cond_0
    //         const-string v0, "r"
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/DataType;->iQ()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         if-nez v0, :cond_1
    //         const-string v0, ""
    //         :goto_1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         if-eqz v0, :cond_3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/Device;->getModel()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/Device;->getUid()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_2
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         if-eqz v0, :cond_4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_3
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "d"
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         sget-object v2, Lcom/google/android/gms/fitness/data/a;->Sw:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/data/a;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, ":gms"
    //         goto :goto_1
    //         :cond_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/a;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_3
    //         const-string v0, ""
    //         goto :goto_2
    //         :cond_4
    //         const-string v0, ""
    //         goto :goto_3
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const-string v1, "DataSource{"
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataSource;->getTypeString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->mName:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->mName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         if-eqz v1, :cond_1
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         if-eqz v1, :cond_2
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         if-eqz v1, :cond_3
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->SQ:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_3
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/internal/kw;->c(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v0
    //         invoke-static {v0, p1, p2}, Lcom/google/android/gms/fitness/data/g;->a(Lcom/google/android/gms/fitness/data/DataSource;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val EXTRA_DATA_SOURCE: String = "vnd.google.fitness.data_source"
    @JvmField public val TYPE_DERIVED: Int = 0x1
    @JvmField public val TYPE_RAW: Int = 0

    public @JvmStatic fun extract(intent: android.content.Intent): com.google.android.gms.fitness.data.DataSource { return TODO("body: (Landroid/content/Intent;)Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "vnd.google.fitness.data_source"
    //         sget-object v1, Lcom/google/android/gms/fitness/data/DataSource;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         goto :goto_0
    */

    }
}
