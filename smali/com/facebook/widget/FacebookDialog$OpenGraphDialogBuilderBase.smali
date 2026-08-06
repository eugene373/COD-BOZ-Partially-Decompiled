.class abstract Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
.super Lcom/facebook/widget/FacebookDialog$Builder;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "OpenGraphDialogBuilderBase"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CONCRETE:",
        "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase",
        "<*>;>",
        "Lcom/facebook/widget/FacebookDialog$Builder",
        "<TCONCRETE;>;"
    }
.end annotation


# instance fields
.field private action:Lcom/facebook/model/OpenGraphAction;

.field private actionType:Ljava/lang/String;

.field private dataErrorsFatal:Z

.field private previewPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/model/OpenGraphAction;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1472
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;-><init>(Landroid/app/Activity;)V

    .line 1474
    const-string v0, "action"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1475
    invoke-interface {p2}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "action.getType()"

    invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1476
    const-string v0, "previewPropertyName"

    invoke-static {p3, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1477
    invoke-interface {p2, p3}, Lcom/facebook/model/OpenGraphAction;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1478
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A property named \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" was not found on the action.  The name of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "the preview property must match the name of an action property."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1483
    :cond_0
    iput-object p2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    .line 1484
    invoke-interface {p2}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    .line 1485
    iput-object p3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    .line 1486
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/model/OpenGraphAction;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1439
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;-><init>(Landroid/app/Activity;)V

    .line 1441
    const-string v0, "action"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1442
    const-string v0, "actionType"

    invoke-static {p3, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1443
    const-string v0, "previewPropertyName"

    invoke-static {p4, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1444
    invoke-interface {p2, p4}, Lcom/facebook/model/OpenGraphAction;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1445
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A property named \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" was not found on the action.  The name of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "the preview property must match the name of an action property."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1449
    :cond_0
    invoke-interface {p2}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;

    move-result-object v0

    .line 1450
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1451
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'actionType\' must match the type of \'action\' if it is specified. Consider using OpenGraphDialogBuilderBase(Activity activity, OpenGraphAction action, String previewPropertyName) instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1455
    :cond_1
    iput-object p2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    .line 1456
    iput-object p3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    .line 1457
    iput-object p4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    .line 1458
    return-void
.end method

.method private flattenChildrenOfGraphObject(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .prologue
    .line 1819
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1822
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 1823
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1824
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1826
    const-string v3, "image"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1827
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 1829
    invoke-direct {p0, v3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1830
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1835
    :catch_0
    move-exception v0

    .line 1836
    new-instance v1, Lcom/facebook/FacebookException;

    invoke-direct {v1, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 1834
    :cond_1
    return-object v1
.end method

.method private flattenObject(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1841
    if-nez p1, :cond_1

    .line 1842
    const/4 p1, 0x0

    .line 1869
    :cond_0
    :goto_0
    return-object p1

    .line 1845
    :cond_1
    instance-of v0, p1, Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    move-object v0, p1

    .line 1846
    check-cast v0, Lorg/json/JSONObject;

    .line 1849
    const-string v1, "fbsdk:create_object"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1852
    const-string v1, "id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1853
    const-string v1, "id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1854
    :cond_2
    const-string v1, "url"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1855
    const-string v1, "url"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1857
    :cond_3
    instance-of v0, p1, Lorg/json/JSONArray;

    if-eqz v0, :cond_0

    .line 1858
    check-cast p1, Lorg/json/JSONArray;

    .line 1859
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 1860
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 1862
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_4

    .line 1863
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1862
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    move-object p1, v0

    .line 1866
    goto :goto_0
.end method

.method private updateActionAttachmentUrls(Ljava/util/List;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 1603
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v0}, Lcom/facebook/model/OpenGraphAction;->getImage()Ljava/util/List;

    move-result-object v0

    .line 1604
    if-nez v0, :cond_2

    .line 1605
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, v0

    .line 1608
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1609
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 1611
    :try_start_0
    const-string v4, "url"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1612
    if-eqz p2, :cond_0

    .line 1613
    const-string v0, "user_generated"

    const/4 v4, 0x1

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1618
    :cond_0
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1615
    :catch_0
    move-exception v0

    .line 1616
    new-instance v1, Lcom/facebook/FacebookException;

    const-string v2, "Unable to attach images"

    invoke-direct {v1, v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1620
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v0, v1}, Lcom/facebook/model/OpenGraphAction;->setImage(Ljava/util/List;)V

    .line 1621
    return-void

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method


# virtual methods
.method protected getMethodArguments()Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 1801
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1803
    const-string v1, "PREVIEW_PROPERTY_NAME"

    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1804
    const-string v1, "ACTION_TYPE"

    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1805
    const-string v1, "DATA_FAILURES_FATAL"

    iget-boolean v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->dataErrorsFatal:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1807
    iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v1}, Lcom/facebook/model/OpenGraphAction;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    .line 1808
    invoke-direct {p0, v1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenChildrenOfGraphObject(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1810
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1811
    const-string v2, "ACTION"

    invoke-virtual {p0, v0, v2, v1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1813
    return-object v0
.end method

.method protected setBundleExtras(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 1786
    const-string v0, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME"

    iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1787
    const-string v0, "com.facebook.platform.extra.ACTION_TYPE"

    iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1788
    const-string v0, "com.facebook.platform.extra.DATA_FAILURES_FATAL"

    iget-boolean v1, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->dataErrorsFatal:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1790
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v0}, Lcom/facebook/model/OpenGraphAction;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 1791
    invoke-direct {p0, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenChildrenOfGraphObject(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1793
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1794
    const-string v1, "com.facebook.platform.extra.ACTION"

    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1796
    return-object p1
.end method

.method public setDataErrorsFatal(Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1496
    iput-boolean p1, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->dataErrorsFatal:Z

    .line 1499
    return-object p0
.end method

.method public setImageAttachmentFilesForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1567
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentFilesForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1589
    const-string v0, "bitmapFiles"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1590
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v0, :cond_0

    .line 1591
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Can not set attachments prior to setting action."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1594
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachmentFiles(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1595
    invoke-direct {p0, v0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateActionAttachmentUrls(Ljava/util/List;Z)V

    .line 1599
    return-object p0
.end method

.method public setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1711
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1740
    const-string v0, "objectProperty"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1741
    const-string v0, "bitmapFiles"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1742
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v0, :cond_0

    .line 1743
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Can not set attachments prior to setting action."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1746
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachmentFiles(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1747
    invoke-virtual {p0, p1, v0, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateObjectAttachmentUrls(Ljava/lang/String;Ljava/util/List;Z)V

    .line 1751
    return-object p0
.end method

.method public setImageAttachmentsForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1517
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentsForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1539
    const-string v0, "bitmaps"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1540
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v0, :cond_0

    .line 1541
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Can not set attachments prior to setting action."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1544
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachments(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1545
    invoke-direct {p0, v0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateActionAttachmentUrls(Ljava/util/List;Z)V

    .line 1549
    return-object p0
.end method

.method public setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1645
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1675
    const-string v0, "objectProperty"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1676
    const-string v0, "bitmaps"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1677
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v0, :cond_0

    .line 1678
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Can not set attachments prior to setting action."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1681
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachments(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1682
    invoke-virtual {p0, p1, v0, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateObjectAttachmentUrls(Ljava/lang/String;Ljava/util/List;Z)V

    .line 1686
    return-object p0
.end method

.method updateObjectAttachmentUrls(Ljava/lang/String;Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 1757
    :try_start_0
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    const-class v1, Lcom/facebook/model/OpenGraphObject;

    invoke-interface {v0, p1, v1}, Lcom/facebook/model/OpenGraphAction;->getPropertyAs(Ljava/lang/String;Ljava/lang/Class;)Lcom/facebook/model/GraphObject;

    move-result-object v0

    check-cast v0, Lcom/facebook/model/OpenGraphObject;

    .line 1758
    if-nez v0, :cond_0

    .line 1759
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Action does not contain a property \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/facebook/FacebookGraphObjectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1761
    :catch_0
    move-exception v0

    .line 1762
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Property \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' is not a graph object"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1764
    :cond_0
    invoke-interface {v0}, Lcom/facebook/model/OpenGraphObject;->getCreateObject()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1765
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The Open Graph object in \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' is not marked for creation"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1769
    :cond_1
    invoke-interface {v0}, Lcom/facebook/model/OpenGraphObject;->getImage()Lcom/facebook/model/GraphObjectList;

    move-result-object v1

    .line 1770
    if-nez v1, :cond_4

    .line 1771
    const-class v1, Lcom/facebook/model/GraphObject;

    invoke-static {v1}, Lcom/facebook/model/GraphObject$Factory;->createList(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;

    move-result-object v1

    move-object v2, v1

    .line 1773
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1774
    invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;

    move-result-object v4

    .line 1775
    const-string v5, "url"

    invoke-interface {v4, v5, v1}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1776
    if-eqz p3, :cond_2

    .line 1777
    const-string v1, "user_generated"

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v4, v1, v5}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1779
    :cond_2
    invoke-interface {v2, v4}, Lcom/facebook/model/GraphObjectList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1781
    :cond_3
    invoke-interface {v0, v2}, Lcom/facebook/model/OpenGraphObject;->setImage(Lcom/facebook/model/GraphObjectList;)V

    .line 1782
    return-void

    :cond_4
    move-object v2, v1

    goto :goto_0
.end method
