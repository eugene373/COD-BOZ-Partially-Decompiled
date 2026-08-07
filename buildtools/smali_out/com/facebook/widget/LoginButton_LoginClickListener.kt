package com.facebook.widget

// Auto-emitted from smali source: LoginButton.java.
// 1 fields, 3 methods.

open class LoginButton_LoginClickListener: android.view.View.OnClickListener {
    val this$0: com.facebook.widget.LoginButton

    private constructor(p0: com.facebook.widget.LoginButton)

    constructor(p0: com.facebook.widget.LoginButton, p1: com.facebook.widget.LoginButton.1)

    public fun onClick(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 10
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         const/4 v5, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v6
    //         if-eqz v6, :cond_4
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$700(Lcom/facebook/widget/LoginButton;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v1}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v4, Lcom/facebook/android/R$string;->com_facebook_loginview_log_out_action:I
    //         invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v1}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v7, Lcom/facebook/android/R$string;->com_facebook_loginview_cancel_action:I
    //         invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v7
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;
    //         move-result-object v1
    //         invoke-interface {v1}, Lcom/facebook/model/GraphUser;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v1}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v8, Lcom/facebook/android/R$string;->com_facebook_loginview_logged_in_as:I
    //         invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         new-array v8, v3, [Ljava/lang/Object;
    //         iget-object v9, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v9}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;
    //         move-result-object v9
    //         invoke-interface {v9}, Lcom/facebook/model/GraphUser;->getName()Ljava/lang/String;
    //         move-result-object v9
    //         aput-object v9, v8, v2
    //         invoke-static {v1, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         :goto_0
    //         new-instance v8, Landroid/app/AlertDialog$Builder;
    //         invoke-direct {v8, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v8, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/widget/LoginButton$LoginClickListener$1;
    //         invoke-direct {v1, p0, v6}, Lcom/facebook/widget/LoginButton$LoginClickListener$1;-><init>(Lcom/facebook/widget/LoginButton$LoginClickListener;Lcom/facebook/Session;)V
    //         invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, v7, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    //         :cond_0
    //         :goto_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         new-instance v4, Landroid/os/Bundle;
    //         invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    //         const-string v7, "logging_in"
    //         if-eqz v6, :cond_a
    //         move v0, v2
    //         :goto_2
    //         invoke-virtual {v4, v7, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1500(Lcom/facebook/widget/LoginButton;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0, v5, v4}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1600(Lcom/facebook/widget/LoginButton;)Landroid/view/View$OnClickListener;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1600(Lcom/facebook/widget/LoginButton;)Landroid/view/View$OnClickListener;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v1}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v8, Lcom/facebook/android/R$string;->com_facebook_loginview_logged_in_using_facebook:I
    //         invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v6}, Lcom/facebook/Session;->closeAndClearTokenInformation()V
    //         goto :goto_1
    //         :cond_4
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_5
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v4
    //         invoke-virtual {v4}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v4
    //         if-eqz v4, :cond_6
    //         :cond_5
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;
    //         move-result-object v1
    //         invoke-virtual {v1, v5}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V
    //         new-instance v1, Lcom/facebook/Session$Builder;
    //         invoke-direct {v1, v0}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v4, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton;->access$800(Lcom/facebook/widget/LoginButton;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v1, v4}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V
    //         :cond_6
    //         invoke-virtual {v1}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         iget-object v4, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton;->access$900(Lcom/facebook/widget/LoginButton;)Landroid/support/v4/app/Fragment;
    //         move-result-object v4
    //         if-eqz v4, :cond_7
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         iget-object v4, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton;->access$900(Lcom/facebook/widget/LoginButton;)Landroid/support/v4/app/Fragment;
    //         move-result-object v4
    //         invoke-direct {v0, v4}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/support/v4/app/Fragment;)V
    //         :goto_3
    //         if-eqz v0, :cond_0
    //         iget-object v4, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         move-result-object v4
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1100(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v4
    //         invoke-virtual {v0, v4}, Lcom/facebook/Session$OpenRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$OpenRequest;
    //         iget-object v4, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         move-result-object v4
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1200(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Ljava/util/List;
    //         move-result-object v4
    //         invoke-virtual {v0, v4}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         iget-object v4, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         move-result-object v4
    //         invoke-static {v4}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1300(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v4
    //         invoke-virtual {v0, v4}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;
    //         sget-object v4, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         iget-object v7, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v7}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         move-result-object v7
    //         invoke-static {v7}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1400(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/internal/SessionAuthorizationType;
    //         move-result-object v7
    //         invoke-virtual {v4, v7}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_9
    //         invoke-virtual {v1, v0}, Lcom/facebook/Session;->openForPublish(Lcom/facebook/Session$OpenRequest;)V
    //         goto/16 :goto_1
    //         :cond_7
    //         instance-of v4, v0, Landroid/app/Activity;
    //         if-eqz v4, :cond_8
    //         new-instance v4, Lcom/facebook/Session$OpenRequest;
    //         check-cast v0, Landroid/app/Activity;
    //         invoke-direct {v4, v0}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         move-object v0, v4
    //         goto :goto_3
    //         :cond_8
    //         instance-of v4, v0, Landroid/content/ContextWrapper;
    //         if-eqz v4, :cond_b
    //         check-cast v0, Landroid/content/ContextWrapper;
    //         invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
    //         move-result-object v0
    //         instance-of v4, v0, Landroid/app/Activity;
    //         if-eqz v4, :cond_b
    //         new-instance v4, Lcom/facebook/Session$OpenRequest;
    //         check-cast v0, Landroid/app/Activity;
    //         invoke-direct {v4, v0}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         move-object v0, v4
    //         goto :goto_3
    //         :cond_9
    //         invoke-virtual {v1, v0}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    //         goto/16 :goto_1
    //         :cond_a
    //         move v0, v3
    //         goto/16 :goto_2
    //         :cond_b
    //         move-object v0, v5
    //         goto :goto_3
    */

}
