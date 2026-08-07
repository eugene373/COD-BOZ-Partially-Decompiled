package android.support.v4.app

// Auto-emitted from smali source: RemoteInput.java.
// 5 fields, 7 methods.

class RemoteInput_Builder {
    private var mAllowFreeFormInput: Boolean
    private var mChoices: Array<CharSequence>
    private var mExtras: android.os.Bundle
    private var mLabel: CharSequence
    private val mResultKey: String

    public constructor(resultKey: String)

    public fun addExtras(extras: android.os.Bundle): android.support.v4.app.RemoteInput.Builder { return TODO("body: (Landroid/os/Bundle;)Landroid/support/v4/app/RemoteInput$Builder;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         :cond_0
    //         return-object p0
    */

    public fun build(): android.support.v4.app.RemoteInput { return TODO("body: ()Landroid/support/v4/app/RemoteInput;") }
    /*
    //         .locals 6
    //         new-instance v0, Landroid/support/v4/app/RemoteInput;
    //         iget-object v1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;
    //         iget-object v2, p0, Landroid/support/v4/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;
    //         iget-object v3, p0, Landroid/support/v4/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;
    //         iget-boolean v4, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z
    //         iget-object v5, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/RemoteInput;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)V
    //         return-object v0
    */

    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun setAllowFreeFormInput(allowFreeFormInput: Boolean): android.support.v4.app.RemoteInput.Builder { return TODO("body: (Z)Landroid/support/v4/app/RemoteInput$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z
    //         return-object p0
    */

    public fun setChoices(choices: Array<CharSequence>): android.support.v4.app.RemoteInput.Builder { return TODO("body: ([Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setLabel(label: CharSequence): android.support.v4.app.RemoteInput.Builder { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;
    //         return-object p0
    */

}
