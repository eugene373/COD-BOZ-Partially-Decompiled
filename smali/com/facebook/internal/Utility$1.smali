.class final Lcom/facebook/internal/Utility$1;
.super Landroid/os/AsyncTask;
.source "Utility.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/Utility;->loadAppSettingsAsync(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/facebook/model/GraphObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$applicationId:Ljava/lang/String;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$settingsKey:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 627
    iput-object p1, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/internal/Utility$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/internal/Utility$1;->val$settingsKey:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Lcom/facebook/model/GraphObject;
    .locals 1

    .prologue
    .line 630
    iget-object v0, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/internal/Utility;->access$000(Ljava/lang/String;)Lcom/facebook/model/GraphObject;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 627
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/internal/Utility$1;->doInBackground([Ljava/lang/Void;)Lcom/facebook/model/GraphObject;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lcom/facebook/model/GraphObject;)V
    .locals 4

    .prologue
    .line 635
    if-eqz p1, :cond_0

    .line 636
    invoke-interface {p1}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 637
    iget-object v1, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->access$100(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;

    .line 639
    iget-object v1, p0, Lcom/facebook/internal/Utility$1;->val$context:Landroid/content/Context;

    const-string v2, "com.facebook.internal.preferences.APP_SETTINGS"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 642
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/internal/Utility$1;->val$settingsKey:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 647
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/facebook/internal/Utility;->access$202(Landroid/os/AsyncTask;)Landroid/os/AsyncTask;

    .line 648
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 627
    check-cast p1, Lcom/facebook/model/GraphObject;

    invoke-virtual {p0, p1}, Lcom/facebook/internal/Utility$1;->onPostExecute(Lcom/facebook/model/GraphObject;)V

    return-void
.end method
