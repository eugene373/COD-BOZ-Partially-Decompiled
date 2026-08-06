.class public Lcom/facebook/internal/ImageRequest;
.super Ljava/lang/Object;
.source "ImageRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/ImageRequest$1;,
        Lcom/facebook/internal/ImageRequest$Builder;,
        Lcom/facebook/internal/ImageRequest$Callback;
    }
.end annotation


# static fields
.field private static final HEIGHT_PARAM:Ljava/lang/String; = "height"

.field private static final MIGRATION_PARAM:Ljava/lang/String; = "migration_overrides"

.field private static final MIGRATION_VALUE:Ljava/lang/String; = "{october_2012:true}"

.field private static final PROFILEPIC_URL_FORMAT:Ljava/lang/String; = "https://graph.facebook.com/%s/picture"

.field public static final UNSPECIFIED_DIMENSION:I = 0x0

.field private static final WIDTH_PARAM:Ljava/lang/String; = "width"


# instance fields
.field private allowCachedRedirects:Z

.field private callback:Lcom/facebook/internal/ImageRequest$Callback;

.field private callerTag:Ljava/lang/Object;

.field private context:Landroid/content/Context;

.field private imageUri:Ljava/net/URI;


# direct methods
.method private constructor <init>(Lcom/facebook/internal/ImageRequest$Builder;)V
    .locals 1

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    invoke-static {p1}, Lcom/facebook/internal/ImageRequest$Builder;->access$000(Lcom/facebook/internal/ImageRequest$Builder;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/ImageRequest;->context:Landroid/content/Context;

    .line 83
    invoke-static {p1}, Lcom/facebook/internal/ImageRequest$Builder;->access$100(Lcom/facebook/internal/ImageRequest$Builder;)Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/ImageRequest;->imageUri:Ljava/net/URI;

    .line 84
    invoke-static {p1}, Lcom/facebook/internal/ImageRequest$Builder;->access$200(Lcom/facebook/internal/ImageRequest$Builder;)Lcom/facebook/internal/ImageRequest$Callback;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/ImageRequest;->callback:Lcom/facebook/internal/ImageRequest$Callback;

    .line 85
    invoke-static {p1}, Lcom/facebook/internal/ImageRequest$Builder;->access$300(Lcom/facebook/internal/ImageRequest$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/internal/ImageRequest;->allowCachedRedirects:Z

    .line 86
    invoke-static {p1}, Lcom/facebook/internal/ImageRequest$Builder;->access$400(Lcom/facebook/internal/ImageRequest$Builder;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/facebook/internal/ImageRequest;->callerTag:Ljava/lang/Object;

    .line 87
    return-void

    .line 86
    :cond_0
    invoke-static {p1}, Lcom/facebook/internal/ImageRequest$Builder;->access$400(Lcom/facebook/internal/ImageRequest$Builder;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/facebook/internal/ImageRequest$Builder;Lcom/facebook/internal/ImageRequest$1;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/internal/ImageRequest;-><init>(Lcom/facebook/internal/ImageRequest$Builder;)V

    return-void
.end method

.method public static getProfilePictureUrl(Ljava/lang/String;II)Ljava/net/URI;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 57
    const-string v0, "userId"

    invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 60
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 62
    if-nez v0, :cond_0

    if-nez v1, :cond_0

    .line 63
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Either width or height must be greater than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_0
    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    const-string v3, "https://graph.facebook.com/%s/picture"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 68
    if-eqz v1, :cond_1

    .line 69
    const-string v3, "height"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 72
    :cond_1
    if-eqz v0, :cond_2

    .line 73
    const-string v1, "width"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 76
    :cond_2
    const-string v0, "migration_overrides"

    const-string v1, "{october_2012:true}"

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 78
    new-instance v0, Ljava/net/URI;

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getCallback()Lcom/facebook/internal/ImageRequest$Callback;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->callback:Lcom/facebook/internal/ImageRequest$Callback;

    return-object v0
.end method

.method public getCallerTag()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->callerTag:Ljava/lang/Object;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getImageUri()Ljava/net/URI;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->imageUri:Ljava/net/URI;

    return-object v0
.end method

.method public isCachedRedirectAllowed()Z
    .locals 1

    .prologue
    .line 102
    iget-boolean v0, p0, Lcom/facebook/internal/ImageRequest;->allowCachedRedirects:Z

    return v0
.end method
