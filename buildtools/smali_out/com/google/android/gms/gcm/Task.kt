package com.google.android.gms.gcm

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class Task: android.os.Parcelable {
    private val adB: String
    private val adC: Boolean
    private val adD: Boolean
    private val mTag: String

    constructor()

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getServiceName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->adB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTag(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;
    //         return-object v0
    */

    public fun isPersisted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->adD:Z
    //         return v0
    */

    public fun isUpdateCurrent(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->adC:Z
    //         return v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, i: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->adB:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->adC:Z
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->adD:Z
    //         if-eqz v0, :cond_1
    //         :goto_1
    //         invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         return-void
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

}
