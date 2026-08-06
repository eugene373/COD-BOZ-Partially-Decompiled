.class Lcom/facebook/android/AsyncFacebookRunner$1;
.super Ljava/lang/Thread;
.source "AsyncFacebookRunner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/android/AsyncFacebookRunner;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

.field final synthetic val$state:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/facebook/android/AsyncFacebookRunner;Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->this$0:Lcom/facebook/android/AsyncFacebookRunner;

    iput-object p2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iput-object p4, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 89
    :try_start_0
    iget-object v0, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->this$0:Lcom/facebook/android/AsyncFacebookRunner;

    iget-object v0, v0, Lcom/facebook/android/AsyncFacebookRunner;->fb:Lcom/facebook/android/Facebook;

    iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->logoutImpl(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "false"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    new-instance v1, Lcom/facebook/android/FacebookError;

    const-string v2, "auth.expireSession failed"

    invoke-direct {v1, v2}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFacebookError(Lcom/facebook/android/FacebookError;Ljava/lang/Object;)V

    .line 103
    :goto_0
    return-void

    .line 95
    :cond_1
    iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 96
    :catch_0
    move-exception v0

    .line 97
    iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V

    goto :goto_0

    .line 98
    :catch_1
    move-exception v0

    .line 99
    iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V

    goto :goto_0

    .line 100
    :catch_2
    move-exception v0

    .line 101
    iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onIOException(Ljava/io/IOException;Ljava/lang/Object;)V

    goto :goto_0
.end method
