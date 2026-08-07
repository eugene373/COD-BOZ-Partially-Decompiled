package com.facebook.widget

// Auto-emitted from smali source: WebDialog.java.
// 7 fields, 12 methods.

open class WebDialog_BuilderBase {
    private var action: String
    private var applicationId: String
    private var context: android.content.Context
    private var listener: com.facebook.widget.WebDialog.OnCompleteListener
    private var parameters: android.os.Bundle
    private var session: com.facebook.Session
    private var theme: Int

    protected constructor(p0: android.content.Context, p1: com.facebook.Session, p2: String, p3: android.os.Bundle)

    protected constructor(p0: android.content.Context, p1: String)

    protected constructor(p0: android.content.Context, p1: String, p2: String, p3: android.os.Bundle)

    private fun finishInit(p0: android.content.Context, p1: String, p2: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->context:Landroid/content/Context;
    //         iput-object p2, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->action:Ljava/lang/String;
    //         if-eqz p3, :cond_0
    //         iput-object p3, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         goto :goto_0
    */

    public fun build(): com.facebook.widget.WebDialog { return TODO("body: ()Lcom/facebook/widget/WebDialog;") }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         const-string v1, "app_id"
    //         iget-object v2, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->session:Lcom/facebook/Session;
    //         invoke-virtual {v2}, Lcom/facebook/Session;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         const-string v1, "access_token"
    //         iget-object v2, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->session:Lcom/facebook/Session;
    //         invoke-virtual {v2}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         new-instance v0, Lcom/facebook/widget/WebDialog;
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->context:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->action:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         iget v4, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->theme:I
    //         iget-object v5, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->listener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/WebDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/widget/WebDialog$OnCompleteListener;)V
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         const-string v1, "app_id"
    //         iget-object v2, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->applicationId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->applicationId:Ljava/lang/String;
    //         return-object v0
    */

    protected fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->context:Landroid/content/Context;
    //         return-object v0
    */

    protected fun getListener(): com.facebook.widget.WebDialog.OnCompleteListener { return TODO("body: ()Lcom/facebook/widget/WebDialog$OnCompleteListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->listener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         return-object v0
    */

    protected fun getParameters(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->parameters:Landroid/os/Bundle;
    //         return-object v0
    */

    protected fun getTheme(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->theme:I
    //         return v0
    */

    public fun setOnCompleteListener(p0: com.facebook.widget.WebDialog.OnCompleteListener): com.facebook.widget.WebDialog.BuilderBase { return TODO("body: (Lcom/facebook/widget/WebDialog$OnCompleteListener;)Lcom/facebook/widget/WebDialog$BuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/WebDialog$OnCompleteListener;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->listener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         return-object p0
    */

    public fun setTheme(p0: Int): com.facebook.widget.WebDialog.BuilderBase { return TODO("body: (I)Lcom/facebook/widget/WebDialog$BuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)TCONCRETE;"
    //             }
    //         .end annotation
    //         iput p1, p0, Lcom/facebook/widget/WebDialog$BuilderBase;->theme:I
    //         return-object p0
    */

}
