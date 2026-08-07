package com.facebook.widget

// Auto-emitted from smali source: UserSettingsFragment.java.
// 13 fields, 33 methods.

open class UserSettingsFragment: com.facebook.widget.FacebookFragment() {
    private var connectedStateLabel: android.widget.TextView
    private var loginButton: com.facebook.widget.LoginButton
    private var loginButtonProperties: com.facebook.widget.LoginButton.LoginButtonProperties
    private var sessionStatusCallback: com.facebook.Session.StatusCallback
    private var user: com.facebook.model.GraphUser
    private var userInfoSession: com.facebook.Session
    private var userProfilePic: android.graphics.drawable.Drawable
    private var userProfilePicID: String

    public constructor()

    private fun fetchUserInfo() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment;->userInfoSession:Lcom/facebook/Session;
    //         if-eq v0, v1, :cond_0
    //         new-instance v1, Lcom/facebook/widget/UserSettingsFragment$1;
    //         invoke-direct {v1, p0, v0}, Lcom/facebook/widget/UserSettingsFragment$1;-><init>(Lcom/facebook/widget/UserSettingsFragment;Lcom/facebook/Session;)V
    //         invoke-static {v0, v1}, Lcom/facebook/Request;->newMeRequest(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)Lcom/facebook/Request;
    //         move-result-object v1
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v3, "fields"
    //         sget-object v4, Lcom/facebook/widget/UserSettingsFragment;->REQUEST_FIELDS:Ljava/lang/String;
    //         invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v1, v2}, Lcom/facebook/Request;->setParameters(Landroid/os/Bundle;)V
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Lcom/facebook/Request;
    //         const/4 v3, 0x0
    //         aput-object v1, v2, v3
    //         invoke-static {v2}, Lcom/facebook/Request;->executeBatchAsync([Lcom/facebook/Request;)Lcom/facebook/RequestAsyncTask;
    //         iput-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->userInfoSession:Lcom/facebook/Session;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->user:Lcom/facebook/model/GraphUser;
    //         goto :goto_0
    */

    private fun getImageRequest(): com.facebook.internal.ImageRequest { return TODO("body: ()Lcom/facebook/internal/ImageRequest;") }
    /*
    //         .locals 7
    //         const/4 v0, 0x0
    //         :try_start_0
    //         new-instance v1, Lcom/facebook/internal/ImageRequest$Builder;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/facebook/widget/UserSettingsFragment;->user:Lcom/facebook/model/GraphUser;
    //         invoke-interface {v3}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v4
    //         sget v5, Lcom/facebook/android/R$dimen;->com_facebook_usersettingsfragment_profile_picture_width:I
    //         invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v4
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v5
    //         sget v6, Lcom/facebook/android/R$dimen;->com_facebook_usersettingsfragment_profile_picture_height:I
    //         invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v5
    //         invoke-static {v3, v4, v5}, Lcom/facebook/internal/ImageRequest;->getProfilePictureUrl(Ljava/lang/String;II)Ljava/net/URI;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Lcom/facebook/internal/ImageRequest$Builder;-><init>(Landroid/content/Context;Ljava/net/URI;)V
    //         invoke-virtual {v1, p0}, Lcom/facebook/internal/ImageRequest$Builder;->setCallerTag(Ljava/lang/Object;)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/widget/UserSettingsFragment$2;
    //         invoke-direct {v2, p0}, Lcom/facebook/widget/UserSettingsFragment$2;-><init>(Lcom/facebook/widget/UserSettingsFragment;)V
    //         invoke-virtual {v1, v2}, Lcom/facebook/internal/ImageRequest$Builder;->setCallback(Lcom/facebook/internal/ImageRequest$Callback;)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/internal/ImageRequest$Builder;->build()Lcom/facebook/internal/ImageRequest;
    //         :try_end_0
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    private fun processImageResponse(p0: String, p1: com.facebook.internal.ImageResponse) { /* TODO(body): (Ljava/lang/String;Lcom/facebook/internal/ImageResponse;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         const/4 v4, 0x0
    //         if-eqz p2, :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/internal/ImageResponse;->getBitmap()Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/graphics/drawable/BitmapDrawable;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v2, Lcom/facebook/android/R$dimen;->com_facebook_usersettingsfragment_profile_picture_width:I
    //         invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         sget v3, Lcom/facebook/android/R$dimen;->com_facebook_usersettingsfragment_profile_picture_height:I
    //         invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v2
    //         invoke-virtual {v1, v5, v5, v0, v2}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V
    //         iput-object v1, p0, Lcom/facebook/widget/UserSettingsFragment;->userProfilePic:Landroid/graphics/drawable/Drawable;
    //         iput-object p1, p0, Lcom/facebook/widget/UserSettingsFragment;->userProfilePicID:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {p2}, Lcom/facebook/internal/ImageResponse;->getRequest()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V
    //         :cond_0
    //         return-void
    */

    private fun updateUI() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         const/4 v6, 0x0
    //         const/4 v5, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->isAdded()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->isSessionOpen()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$color;->com_facebook_usersettingsfragment_connected_text_color:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         const/high16 v1, 0x3f800000    # 1.0f
    //         const/high16 v2, -0x40800000    # -1.0f
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v3
    //         sget v4, Lcom/facebook/android/R$color;->com_facebook_usersettingsfragment_connected_shadow_color:I
    //         invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v3
    //         invoke-virtual {v0, v1, v6, v2, v3}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->user:Lcom/facebook/model/GraphUser;
    //         if-eqz v0, :cond_3
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->getImageRequest()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v2}, Landroid/widget/TextView;->getTag()Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         iget-object v2, p0, Lcom/facebook/widget/UserSettingsFragment;->user:Lcom/facebook/model/GraphUser;
    //         invoke-interface {v2}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/facebook/widget/UserSettingsFragment;->userProfilePicID:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         iget-object v2, p0, Lcom/facebook/widget/UserSettingsFragment;->userProfilePic:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V
    //         :cond_1
    //         :goto_1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment;->user:Lcom/facebook/model/GraphUser;
    //         invoke-interface {v1}, Lcom/facebook/model/GraphUser;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {v0}, Lcom/facebook/internal/ImageDownloader;->downloadAsync(Lcom/facebook/internal/ImageRequest;)V
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$string;->com_facebook_usersettingsfragment_logged_in:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_profile_default_icon:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$dimen;->com_facebook_usersettingsfragment_profile_picture_width:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v1
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         sget v3, Lcom/facebook/android/R$dimen;->com_facebook_usersettingsfragment_profile_picture_height:I
    //         invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v2
    //         invoke-virtual {v0, v7, v7, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
    //         iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v1, v5, v0, v5, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //         goto/16 :goto_0
    //         :cond_4
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$color;->com_facebook_usersettingsfragment_not_connected_text_color:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
    //         iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v1, v6, v6, v6, v0}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$string;->com_facebook_usersettingsfragment_not_logged_in:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v0, v5, v5, v5, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V
    //         goto/16 :goto_0
    */

    public fun clearPermissions() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->clearPermissions()V
    //         return-void
    */

    public fun getDefaultAudience(): com.facebook.SessionDefaultAudience { return TODO("body: ()Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getDefaultAudience()Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLoginBehavior(): com.facebook.SessionLoginBehavior { return TODO("body: ()Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getLoginBehavior()Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getOnErrorListener(): com.facebook.widget.LoginButton.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/LoginButton$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getOnErrorListener()Lcom/facebook/widget/LoginButton$OnErrorListener;
    //         move-result-object v0
    //         return-object v0
    */

    fun getPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSessionStatusCallback(): com.facebook.Session.StatusCallback { return TODO("body: ()Lcom/facebook/Session$StatusCallback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->sessionStatusCallback:Lcom/facebook/Session$StatusCallback;
    //         return-object v0
    */

    public fun onActivityCreated(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/widget/FacebookFragment;->onActivityCreated(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2, p3}, Lcom/facebook/widget/FacebookFragment;->onActivityResult(IILandroid/content/Intent;)V
    //         return-void
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Lcom/facebook/widget/FacebookFragment;->onCreate(Landroid/os/Bundle;)V
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/UserSettingsFragment;->setRetainInstance(Z)V
    //         return-void
    */

    public fun onCreateView(p0: android.view.LayoutInflater, p1: android.view.ViewGroup, p2: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         sget v0, Lcom/facebook/android/R$layout;->com_facebook_usersettingsfragment:I
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //         move-result-object v1
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_usersettingsfragment_login_button:I
    //         invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/LoginButton;
    //         iput-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         iget-object v2, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, v2}, Lcom/facebook/widget/LoginButton;->setProperties(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v0, p0}, Lcom/facebook/widget/LoginButton;->setFragment(Landroid/support/v4/app/Fragment;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         const-string v2, "fb_user_settings_vc_usage"
    //         invoke-virtual {v0, v2}, Lcom/facebook/widget/LoginButton;->setLoginLogoutEventName(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Lcom/facebook/Session;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-object v2, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v2, v0}, Lcom/facebook/widget/LoginButton;->setSession(Lcom/facebook/Session;)V
    //         :cond_0
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_usersettingsfragment_profile_name:I
    //         invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/TextView;
    //         iput-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->connectedStateLabel:Landroid/widget/TextView;
    //         invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v2, Lcom/facebook/android/R$color;->com_facebook_blue:I
    //         invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v0
    //         invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
    //         goto :goto_0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Lcom/facebook/widget/FacebookFragment;->onDestroy()V
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Lcom/facebook/widget/FacebookFragment;->onResume()V
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->fetchUserInfo()V
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->updateUI()V
    //         return-void
    */

    protected fun onSessionStateChange(p0: com.facebook.SessionState, p1: Exception) { /* TODO(body): (Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->fetchUserInfo()V
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->updateUI()V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->sessionStatusCallback:Lcom/facebook/Session$StatusCallback;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->sessionStatusCallback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1, p2}, Lcom/facebook/Session$StatusCallback;->call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         :cond_0
    //         return-void
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience) { /* TODO(body): (Lcom/facebook/SessionDefaultAudience;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)V
    //         return-void
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior) { /* TODO(body): (Lcom/facebook/SessionLoginBehavior;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)V
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.LoginButton.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/LoginButton$OnErrorListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setOnErrorListener(Lcom/facebook/widget/LoginButton$OnErrorListener;)V
    //         return-void
    */

    public fun setPublishPermissions(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setPublishPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setPublishPermissions(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setPublishPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setReadPermissions(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setReadPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setReadPermissions(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButtonProperties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setReadPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Lcom/facebook/widget/FacebookFragment;->setSession(Lcom/facebook/Session;)V
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment;->loginButton:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton;->setSession(Lcom/facebook/Session;)V
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->fetchUserInfo()V
    //         invoke-direct {p0}, Lcom/facebook/widget/UserSettingsFragment;->updateUI()V
    //         return-void
    */

    public fun setSessionStatusCallback(p0: com.facebook.Session.StatusCallback) { /* TODO(body): (Lcom/facebook/Session$StatusCallback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/UserSettingsFragment;->sessionStatusCallback:Lcom/facebook/Session$StatusCallback;
    //         return-void
    */

    companion object {
    private val FIELDS: String = "fields"
    private val ID: String = "id"
    private val NAME: String = "name"
    private val PICTURE: String = "picture"
    private val REQUEST_FIELDS: String = null!!
    }
}
