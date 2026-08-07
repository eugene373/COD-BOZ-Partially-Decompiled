package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 4 fields, 13 methods.

open class FacebookDialog_PendingCall: android.os.Parcelable {
    private var callId: java.util.UUID
    private var requestCode: Int
    private var requestIntent: android.content.Intent

    public constructor(p0: Int)

    private constructor(p0: android.os.Parcel)

    constructor(p0: android.os.Parcel, p1: com.facebook.widget.FacebookDialog.1)

    private fun setRequestCode(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->requestCode:I
    //         return-void
    */

    private fun setRequestIntent(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->requestIntent:Landroid/content/Intent;
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCallId(): java.util.UUID { return TODO("body: ()Ljava/util/UUID;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->callId:Ljava/util/UUID;
    //         return-object v0
    */

    public fun getRequestCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->requestCode:I
    //         return v0
    */

    public fun getRequestIntent(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->requestIntent:Landroid/content/Intent;
    //         return-object v0
    */

    public fun writeToParcel(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->callId:Ljava/util/UUID;
    //         invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->requestIntent:Landroid/content/Intent;
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
    //         iget v0, p0, Lcom/facebook/widget/FacebookDialog$PendingCall;->requestCode:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
