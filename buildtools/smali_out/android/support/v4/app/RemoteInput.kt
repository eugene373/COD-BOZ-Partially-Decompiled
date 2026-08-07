package android.support.v4.app

// Auto-emitted from smali source: RemoteInput.java.
// 10 fields, 9 methods.

open class RemoteInput: android.support.v4.app.RemoteInputCompatBase.RemoteInput() {
    private val mAllowFreeFormInput: Boolean
    private val mChoices: Array<CharSequence>
    private val mExtras: android.os.Bundle
    private val mLabel: CharSequence
    private val mResultKey: String

    constructor(resultKey: String, label: CharSequence, choices: Array<CharSequence>, allowFreeFormInput: Boolean, extras: android.os.Bundle)

    public fun getAllowFreeFormInput(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/RemoteInput;->mAllowFreeFormInput:Z
    //         return v0
    */

    public fun getChoices(): Array<CharSequence> { return TODO("body: ()[Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mChoices:[Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mExtras:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getLabel(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mLabel:Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun getResultKey(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mResultKey:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    @JvmField public val EXTRA_RESULTS_DATA: String = "android.remoteinput.resultsData"
    @JvmField public val FACTORY: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory = null!!
    private val IMPL: android.support.v4.app.RemoteInput.Impl = null!!
    @JvmField public val RESULTS_CLIP_LABEL: String = "android.remoteinput.results"
    private val TAG: String = "RemoteInput"

    public @JvmStatic fun addResultsToIntent(remoteInputs: Array<android.support.v4.app.RemoteInput>, intent: android.content.Intent, results: android.os.Bundle) { /* TODO(body): ([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/app/RemoteInput$Impl;->addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
    //         return-void
    */

    public @JvmStatic fun getResultsFromIntent(intent: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/RemoteInput$Impl;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
