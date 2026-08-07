package com.google.android.gms.auth

// Auto-emitted from smali.
// 7 fields, 12 methods.

open class AccountChangeEvent: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val Dd: String
    val Di: Int
    val Dj: Long
    val Dk: Int
    val Dl: Int
    val Dm: String

    constructor(version: Int, id: Long, accountName: String, changeType: Int, eventIndex: Int, changeData: String)

    public constructor(id: Long, accountName: String, changeType: Int, eventIndex: Int, changeData: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "that":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "that":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/auth/AccountChangeEvent;
    //         if-eqz v2, :cond_3
    //         check-cast p1, Lcom/google/android/gms/auth/AccountChangeEvent;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Di:I
    //         iget v3, p1, Lcom/google/android/gms/auth/AccountChangeEvent;->Di:I
    //         if-ne v2, v3, :cond_2
    //         iget-wide v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dj:J
    //         iget-wide v4, p1, Lcom/google/android/gms/auth/AccountChangeEvent;->Dj:J
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dd:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/auth/AccountChangeEvent;->Dd:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dk:I
    //         iget v3, p1, Lcom/google/android/gms/auth/AccountChangeEvent;->Dk:I
    //         if-ne v2, v3, :cond_2
    //         iget v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dl:I
    //         iget v3, p1, Lcom/google/android/gms/auth/AccountChangeEvent;->Dl:I
    //         if-ne v2, v3, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dm:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/auth/AccountChangeEvent;->Dm:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         .restart local p1    # "that":Ljava/lang/Object;
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getChangeData(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dm:Ljava/lang/String;
    //         return-object v0
    */

    public fun getChangeType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dk:I
    //         return v0
    */

    public fun getEventIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dl:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x6
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Di:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dj:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dd:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dk:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dl:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dm:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "UNKNOWN"
    //         iget v1, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dk:I
    //         packed-switch v1, :pswitch_data_0
    //         :goto_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "AccountChangeEvent {accountName = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dd:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", changeType = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", changeData = "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dm:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", eventIndex = "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/auth/AccountChangeEvent;->Dl:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :pswitch_0
    //         const-string v0, "ADDED"
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v0, "REMOVED"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "RENAMED_TO"
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "RENAMED_FROM"
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_3
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/AccountChangeEventCreator;->a(Lcom/google/android/gms/auth/AccountChangeEvent;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.auth.AccountChangeEventCreator = null!!
    }
}
