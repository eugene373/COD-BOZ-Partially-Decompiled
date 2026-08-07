package com.google.android.gms.analytics

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class j {
    var mContext: android.content.Context
    var xV: com.google.android.gms.analytics.j.a

    public constructor(p0: android.content.Context, p1: com.google.android.gms.analytics.j.a)

    private fun a(p0: android.content.res.XmlResourceParser): com.google.android.gms.analytics.i { return TODO("body: (Landroid/content/res/XmlResourceParser;)Lcom/google/android/gms/analytics/i;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/res/XmlResourceParser;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->next()I
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->getEventType()I
    //         move-result v0
    //         :goto_0
    //         const/4 v1, 0x1
    //         if-eq v0, v1, :cond_2
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->getEventType()I
    //         move-result v0
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "screenname"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const/4 v0, 0x0
    //         const-string v1, "name"
    //         invoke-interface {p1, v0, v1}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/j;->xV:Lcom/google/android/gms/analytics/j$a;
    //         invoke-interface {v2, v0, v1}, Lcom/google/android/gms/analytics/j$a;->f(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_1
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->next()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "string"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         const/4 v0, 0x0
    //         const-string v1, "name"
    //         invoke-interface {p1, v0, v1}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         if-eqz v1, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/j;->xV:Lcom/google/android/gms/analytics/j$a;
    //         invoke-interface {v2, v0, v1}, Lcom/google/android/gms/analytics/j$a;->g(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error parsing tracker configuration file: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         :cond_2
    //         :goto_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/j;->xV:Lcom/google/android/gms/analytics/j$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/j$a;->dW()Lcom/google/android/gms/analytics/i;
    //         move-result-object v0
    //         return-object v0
    //         :cond_3
    //         :try_start_1
    //         const-string v1, "bool"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         const/4 v0, 0x0
    //         const-string v1, "name"
    //         invoke-interface {p1, v0, v1}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         :try_end_1
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :try_start_2
    //         invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
    //         move-result v2
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/j;->xV:Lcom/google/android/gms/analytics/j$a;
    //         invoke-interface {v3, v0, v2}, Lcom/google/android/gms/analytics/j$a;->d(Ljava/lang/String;Z)V
    //         :try_end_2
    //         .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         :try_start_3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error parsing bool configuration value: "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         :try_end_3
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    //         goto/16 :goto_1
    //         :catch_2
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error parsing tracker configuration file: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_2
    //         :cond_4
    //         :try_start_4
    //         const-string v1, "integer"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         const-string v1, "name"
    //         invoke-interface {p1, v0, v1}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         :try_end_4
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :try_start_5
    //         invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v2
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/j;->xV:Lcom/google/android/gms/analytics/j$a;
    //         invoke-interface {v3, v0, v2}, Lcom/google/android/gms/analytics/j$a;->c(Ljava/lang/String;I)V
    //         :try_end_5
    //         .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_3
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    //         goto/16 :goto_1
    //         :catch_3
    //         move-exception v0
    //         :try_start_6
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error parsing int configuration value: "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         :try_end_6
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    //         goto/16 :goto_1
    */

    public fun w(p0: Int): com.google.android.gms.analytics.i { return TODO("body: (I)Lcom/google/android/gms/analytics/i;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)TT;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/j;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/j;->a(Landroid/content/res/XmlResourceParser;)Lcom/google/android/gms/analytics/i;
    //         :try_end_0
    //         .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "inflate() called with unknown resourceId: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
