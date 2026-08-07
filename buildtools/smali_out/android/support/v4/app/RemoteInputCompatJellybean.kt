package android.support.v4.app

// Auto-emitted from smali source: RemoteInputCompatJellybean.java.
// 7 fields, 7 methods.

open class RemoteInputCompatJellybean {
    constructor()

    companion object {
    @JvmField public val EXTRA_RESULTS_DATA: String = "android.remoteinput.resultsData"
    private val KEY_ALLOW_FREE_FORM_INPUT: String = "allowFreeFormInput"
    private val KEY_CHOICES: String = "choices"
    private val KEY_EXTRAS: String = "extras"
    private val KEY_LABEL: String = "label"
    private val KEY_RESULT_KEY: String = "resultKey"
    @JvmField public val RESULTS_CLIP_LABEL: String = "android.remoteinput.results"

    @JvmStatic fun addResultsToIntent(remoteInputs: Array<android.support.v4.app.RemoteInputCompatBase.RemoteInput>, intent: android.content.Intent, results: android.os.Bundle) { /* TODO(body): ([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 8
    //         new-instance v6, Landroid/os/Bundle;
    //         invoke-direct {v6}, Landroid/os/Bundle;-><init>()V
    //         .local v6, "resultsBundle":Landroid/os/Bundle;
    //         move-object v0, p0
    //         .local v0, "arr$":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         array-length v3, v0
    //         .local v3, "len$":I
    //         const/4 v2, 0x0
    //         .local v2, "i$":I
    //         :goto_0
    //         if-ge v2, v3, :cond_1
    //         aget-object v4, v0, v2
    //         .local v4, "remoteInput":Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         invoke-virtual {v4}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {p2, v7}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v5
    //         .local v5, "result":Ljava/lang/Object;
    //         instance-of v7, v5, Ljava/lang/CharSequence;
    //         if-eqz v7, :cond_0
    //         invoke-virtual {v4}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
    //         move-result-object v7
    //         check-cast v5, Ljava/lang/CharSequence;
    //         .end local v5    # "result":Ljava/lang/Object;
    //         invoke-virtual {v6, v7, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         :cond_0
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v4    # "remoteInput":Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         :cond_1
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         .local v1, "clipIntent":Landroid/content/Intent;
    //         const-string v7, "android.remoteinput.resultsData"
    //         invoke-virtual {v1, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         const-string v7, "android.remoteinput.results"
    //         invoke-static {v7, v1}, Landroid/content/ClipData;->newIntent(Ljava/lang/CharSequence;Landroid/content/Intent;)Landroid/content/ClipData;
    //         move-result-object v7
    //         invoke-virtual {p1, v7}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V
    //         return-void
    */

    @JvmStatic fun fromBundle(data: android.os.Bundle, factory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): android.support.v4.app.RemoteInputCompatBase.RemoteInput { return TODO("body: (Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;") }
    /*
    //         .locals 6
    //         const-string v0, "resultKey"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v0, "label"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v2
    //         const-string v0, "choices"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;
    //         move-result-object v3
    //         const-string v0, "allowFreeFormInput"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v4
    //         const-string v0, "extras"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v5
    //         move-object v0, p1
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun fromBundleArray(bundles: Array<android.os.Bundle>, factory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): Array<android.support.v4.app.RemoteInputCompatBase.RemoteInput> { return TODO("body: ([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;") }
    /*
    //         .locals 3
    //         if-nez p0, :cond_1
    //         const/4 v1, 0x0
    //         :cond_0
    //         return-object v1
    //         :cond_1
    //         array-length v2, p0
    //         invoke-interface {p1, v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->newArray(I)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v1
    //         .local v1, "remoteInputs":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         array-length v2, p0
    //         if-ge v0, v2, :cond_0
    //         aget-object v2, p0, v0
    //         invoke-static {v2, p1}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundle(Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v2
    //         aput-object v2, v1, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    @JvmStatic fun getResultsFromIntent(intent: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;
    //         move-result-object v0
    //         .local v0, "clipData":Landroid/content/ClipData;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v2
    //         :cond_1
    //         invoke-virtual {v0}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;
    //         move-result-object v1
    //         .local v1, "clipDescription":Landroid/content/ClipDescription;
    //         const-string v3, "text/vnd.android.intent"
    //         invoke-virtual {v1, v3}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v1}, Landroid/content/ClipDescription;->getLabel()Ljava/lang/CharSequence;
    //         move-result-object v3
    //         const-string v4, "android.remoteinput.results"
    //         invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/ClipData$Item;->getIntent()Landroid/content/Intent;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "android.remoteinput.resultsData"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v2
    //         check-cast v2, Landroid/os/Bundle;
    //         goto :goto_0
    */

    @JvmStatic fun toBundle(remoteInput: android.support.v4.app.RemoteInputCompatBase.RemoteInput): android.os.Bundle { return TODO("body: (Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         .local v0, "data":Landroid/os/Bundle;
    //         const-string v1, "resultKey"
    //         invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "label"
    //         invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getLabel()Ljava/lang/CharSequence;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         const-string v1, "choices"
    //         invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getChoices()[Ljava/lang/CharSequence;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V
    //         const-string v1, "allowFreeFormInput"
    //         invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getAllowFreeFormInput()Z
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         const-string v1, "extras"
    //         invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-object v0
    */

    @JvmStatic fun toBundleArray(remoteInputs: Array<android.support.v4.app.RemoteInputCompatBase.RemoteInput>): Array<android.os.Bundle> { return TODO("body: ([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         if-nez p0, :cond_1
    //         const/4 v0, 0x0
    //         :cond_0
    //         return-object v0
    //         :cond_1
    //         array-length v2, p0
    //         new-array v0, v2, [Landroid/os/Bundle;
    //         .local v0, "bundles":[Landroid/os/Bundle;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         array-length v2, p0
    //         if-ge v1, v2, :cond_0
    //         aget-object v2, p0, v1
    //         invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundle(Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/os/Bundle;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    */

    }
}
