package com.google.android.gms.plus

// Auto-emitted from smali.
// 4 fields, 14 methods.

open class PlusShare_Builder {
    private var alr: Boolean
    private var als: java.util.ArrayList
    private val mContext: android.content.Context
    private val mIntent: android.content.Intent

    public constructor(launchingActivity: android.app.Activity)

    public constructor(launchingActivity: android.app.Activity, plusClient: com.google.android.gms.plus.PlusClient)

    public constructor(context: android.content.Context)

    public fun addCallToAction(label: String, uri: android.net.Uri, deepLinkId: String): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         iget-boolean v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->alr:Z
    //         const-string v2, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action"
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         if-eqz p2, :cond_2
    //         invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_0
    //         const-string v2, "Must provide a call to action URL"
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         const-string v2, "label"
    //         invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         const-string v2, "url"
    //         invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         invoke-static {p3}, Lcom/google/android/gms/plus/PlusShare;->cd(Ljava/lang/String;)Z
    //         move-result v2
    //         const-string v3, "The specified deep-link ID was malformed."
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         const-string v2, "deepLinkId"
    //         invoke-virtual {v0, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v3, "com.google.android.apps.plus.CALL_TO_ACTION"
    //         invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v2, "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST"
    //         invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "text/plain"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         return-object p0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun addStream(streamUri: android.net.Uri): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Landroid/net/Uri;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.extra.STREAM"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/PlusShare$Builder;->setStream(Landroid/net/Uri;)Lcom/google/android/gms/plus/PlusShare$Builder;
    //         move-result-object p0
    //         .end local p0    # "this":Lcom/google/android/gms/plus/PlusShare$Builder;
    //         :goto_0
    //         return-object p0
    //         .restart local p0    # "this":Lcom/google/android/gms/plus/PlusShare$Builder;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

    public fun getIntent(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 7
    //         const/4 v0, 0x1
    //         const/4 v2, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         if-eqz v1, :cond_6
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-le v1, v0, :cond_6
    //         move v1, v0
    //         :goto_0
    //         const-string v3, "android.intent.action.SEND_MULTIPLE"
    //         iget-object v4, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         iget-object v3, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v5, "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST"
    //         invoke-virtual {v3, v5, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    //         move-result v5
    //         if-eqz v1, :cond_0
    //         if-nez v5, :cond_7
    //         :cond_0
    //         move v3, v0
    //         :goto_1
    //         const-string v6, "Call-to-action buttons are only available for URLs."
    //         invoke-static {v3, v6}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         if-eqz v5, :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v6, "com.google.android.apps.plus.CONTENT_URL"
    //         invoke-virtual {v3, v6}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_8
    //         :cond_1
    //         move v3, v0
    //         :goto_2
    //         const-string v6, "The content URL is required for interactive posts."
    //         invoke-static {v3, v6}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         if-eqz v5, :cond_2
    //         iget-object v3, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v5, "com.google.android.apps.plus.CONTENT_URL"
    //         invoke-virtual {v3, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_2
    //         iget-object v3, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v5, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"
    //         invoke-virtual {v3, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_9
    //         :cond_2
    //         :goto_3
    //         const-string v3, "Must set content URL or content deep-link ID to use a call-to-action button."
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v3, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"
    //         invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v3, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"
    //         invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/plus/PlusShare;->cd(Ljava/lang/String;)Z
    //         move-result v0
    //         const-string v3, "The specified deep-link ID was malformed."
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         :cond_3
    //         if-nez v1, :cond_4
    //         if-eqz v4, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v3, "android.intent.action.SEND"
    //         invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         if-eqz v0, :cond_a
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_a
    //         iget-object v3, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v5, "android.intent.extra.STREAM"
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Parcelable;
    //         invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         :goto_4
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         :cond_4
    //         if-eqz v1, :cond_5
    //         if-nez v4, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.action.SEND_MULTIPLE"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         if-eqz v0, :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.extra.STREAM"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //         :cond_5
    //         :goto_5
    //         const-string v0, "com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE"
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_c
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         :goto_6
    //         return-object v0
    //         :cond_6
    //         move v1, v2
    //         goto/16 :goto_0
    //         :cond_7
    //         move v3, v2
    //         goto/16 :goto_1
    //         :cond_8
    //         move v3, v2
    //         goto/16 :goto_2
    //         :cond_9
    //         move v0, v2
    //         goto/16 :goto_3
    //         :cond_a
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v2, "android.intent.extra.STREAM"
    //         invoke-virtual {v0, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    //         goto :goto_4
    //         :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.extra.STREAM"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    //         goto :goto_5
    //         :cond_c
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.extra.STREAM"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_d
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms.plus.action.SHARE_GOOGLE"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         goto :goto_6
    //         :cond_d
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.apps.plus"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         goto :goto_6
    */

    public fun setContentDeepLinkId(deepLinkId: String): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0, v0, v0}, Lcom/google/android/gms/plus/PlusShare$Builder;->setContentDeepLinkId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/google/android/gms/plus/PlusShare$Builder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setContentDeepLinkId(deepLinkId: String, title: String, description: String, thumbnailUri: android.net.Uri): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->alr:Z
    //         const-string v1, "Must include the launching activity with PlusShare.Builder constructor before setting deep links"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "The deepLinkId parameter is required."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-static {p2, p3, p4}, Lcom/google/android/gms/plus/PlusShare;->a(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Landroid/os/Bundle;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v2, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"
    //         invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v2, "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA"
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "text/plain"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setContentUrl(uri: android.net.Uri): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Landroid/net/Uri;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.apps.plus.CONTENT_URL"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v2, "com.google.android.apps.plus.CONTENT_URL"
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         goto :goto_0
    */

    public fun setRecipients(user: com.google.android.gms.plus.model.people.Person, p1: java.util.List): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Lcom/google/android/gms/plus/model/people/Person;Ljava/util/List;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 3
    //         .local p2, "recipientList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/people/Person;>;"
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v2, "com.google.android.apps.plus.SENDER_ID"
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/model/people/Person;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/plus/PlusShare$Builder;->setRecipients(Ljava/util/List;)Lcom/google/android/gms/plus/PlusShare$Builder;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "0"
    //         goto :goto_0
    */

    public fun setRecipients(p0: java.util.List): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/model/people/Person;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/PlusShare$Builder;"
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         .local p1, "recipientList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/plus/model/people/Person;>;"
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v0
    //         :goto_0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.apps.plus.RECIPIENT_IDS"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    //         :goto_1
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/model/people/Person;
    //         invoke-interface {v0}, Lcom/google/android/gms/plus/model/people/Person;->getId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-interface {v0}, Lcom/google/android/gms/plus/model/people/Person;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_2
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v3, "com.google.android.apps.plus.RECIPIENT_IDS"
    //         invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES"
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //         goto :goto_1
    */

    public fun setStream(streamUri: android.net.Uri): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Landroid/net/Uri;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->als:Ljava/util/ArrayList;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.extra.STREAM"
    //         invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         return-object p0
    */

    public fun setText(text: CharSequence): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Ljava/lang/CharSequence;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         const-string v1, "android.intent.extra.TEXT"
    //         invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
    //         return-object p0
    */

    public fun setType(mimeType: String): com.google.android.gms.plus.PlusShare.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/PlusShare$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusShare$Builder;->mIntent:Landroid/content/Intent;
    //         invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         return-object p0
    */

}
