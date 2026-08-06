.class Lbolts/WebViewAppLinkResolver$1;
.super Ljava/lang/Object;
.source "WebViewAppLinkResolver.java"

# interfaces
.implements Lbolts/Continuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/WebViewAppLinkResolver;->getAppLinkFromUrlInBackground(Landroid/net/Uri;)Lbolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/Continuation",
        "<",
        "Lorg/json/JSONArray;",
        "Lbolts/AppLink;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbolts/WebViewAppLinkResolver;

.field final synthetic val$url:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lbolts/WebViewAppLinkResolver;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lbolts/WebViewAppLinkResolver$1;->this$0:Lbolts/WebViewAppLinkResolver;

    iput-object p2, p0, Lbolts/WebViewAppLinkResolver$1;->val$url:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public then(Lbolts/Task;)Lbolts/AppLink;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbolts/Task",
            "<",
            "Lorg/json/JSONArray;",
            ">;)",
            "Lbolts/AppLink;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 181
    .local p1, "task":Lbolts/Task;, "Lbolts/Task<Lorg/json/JSONArray;>;"
    invoke-virtual {p1}, Lbolts/Task;->getResult()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONArray;

    invoke-static {v2}, Lbolts/WebViewAppLinkResolver;->access$000(Lorg/json/JSONArray;)Ljava/util/Map;

    move-result-object v0

    .line 182
    .local v0, "alData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    iget-object v2, p0, Lbolts/WebViewAppLinkResolver$1;->val$url:Landroid/net/Uri;

    invoke-static {v0, v2}, Lbolts/WebViewAppLinkResolver;->access$100(Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;

    move-result-object v1

    .line 183
    .local v1, "appLink":Lbolts/AppLink;
    return-object v1
.end method

.method public bridge synthetic then(Lbolts/Task;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lbolts/Task;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 178
    invoke-virtual {p0, p1}, Lbolts/WebViewAppLinkResolver$1;->then(Lbolts/Task;)Lbolts/AppLink;

    move-result-object v0

    return-object v0
.end method
