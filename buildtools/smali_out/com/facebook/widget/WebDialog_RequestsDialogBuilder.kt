package com.facebook.widget

// Auto-emitted from smali source: WebDialog.java.
// 5 fields, 9 methods.

open class WebDialog_RequestsDialogBuilder: com.facebook.widget.WebDialog.BuilderBase() {
    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: com.facebook.Session)

    public constructor(p0: android.content.Context, p1: com.facebook.Session, p2: android.os.Bundle)

    public constructor(p0: android.content.Context, p1: String, p2: android.os.Bundle)

    public fun build(): com.facebook.widget.WebDialog { return TODO("body: ()Lcom/facebook/widget/WebDialog;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/facebook/widget/WebDialog$BuilderBase;->build()Lcom/facebook/widget/WebDialog;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setData(p0: String): com.facebook.widget.WebDialog.RequestsDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "data"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setMessage(p0: String): com.facebook.widget.WebDialog.RequestsDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "message"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTitle(p0: String): com.facebook.widget.WebDialog.RequestsDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "title"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTo(p0: String): com.facebook.widget.WebDialog.RequestsDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$RequestsDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "to"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    companion object {
    private val APPREQUESTS_DIALOG: String = "apprequests"
    private val DATA_PARAM: String = "data"
    private val MESSAGE_PARAM: String = "message"
    private val TITLE_PARAM: String = "title"
    private val TO_PARAM: String = "to"
    }
}
