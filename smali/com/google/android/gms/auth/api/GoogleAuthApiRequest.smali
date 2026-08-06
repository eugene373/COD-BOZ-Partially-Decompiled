.class public Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/auth/api/GoogleAuthApiRequestCreator;

.field public static final DEFAULT_SCOPE_PREFIX:Ljava/lang/String; = "oauth2:"

.field public static final HTTP_METHOD_DELETE:I = 0x3

.field public static final HTTP_METHOD_GET:I = 0x0

.field public static final HTTP_METHOD_HEAD:I = 0x4

.field public static final HTTP_METHOD_OPTIONS:I = 0x5

.field public static final HTTP_METHOD_PATCH:I = 0x7

.field public static final HTTP_METHOD_POST:I = 0x1

.field public static final HTTP_METHOD_PUT:I = 0x2

.field public static final HTTP_METHOD_TRACE:I = 0x6

.field public static final VERSION_CODE:I = 0x1


# instance fields
.field DA:[B

.field DB:J

.field Dt:Ljava/lang/String;

.field Du:Landroid/os/Bundle;

.field Dv:Ljava/lang/String;

.field Dw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field Dx:Ljava/lang/String;

.field Dy:I

.field Dz:Landroid/os/Bundle;

.field name:Ljava/lang/String;

.field version:Ljava/lang/String;

.field final versionCode:I

.field yR:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequestCreator;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequestCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->CREATOR:Lcom/google/android/gms/auth/api/GoogleAuthApiRequestCreator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILandroid/os/Bundle;[BJ)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "apiId"    # Ljava/lang/String;
    .param p5, "path"    # Ljava/lang/String;
    .param p6, "parameters"    # Landroid/os/Bundle;
    .param p7, "accountName"    # Ljava/lang/String;
    .param p9, "scopePrefix"    # Ljava/lang/String;
    .param p10, "httpMethod"    # I
    .param p11, "headers"    # Landroid/os/Bundle;
    .param p12, "body"    # [B
    .param p13, "timeout"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Landroid/os/Bundle;",
            "[BJ)V"
        }
    .end annotation

    .prologue
    .local p8, "scopes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dt:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->yR:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    iput-object p7, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dv:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    iput-object p9, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dx:Ljava/lang/String;

    iput p10, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dy:I

    iput-object p11, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    iput-object p12, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B

    iput-wide p13, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DB:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "apiId"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->versionCode:I

    iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->ay(Ljava/lang/String;)V

    iput-object p3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dt:Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    const-string v0, "oauth2:"

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dx:Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "path"    # Ljava/lang/String;
    .param p4, "httpMethod"    # I

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->versionCode:I

    iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->ay(Ljava/lang/String;)V

    invoke-direct {p0, p3}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->setPath(Ljava/lang/String;)V

    invoke-direct {p0, p4}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->T(I)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    const-string v0, "oauth2:"

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dx:Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B

    return-void
.end method

.method private T(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x7

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid HTTP method."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dy:I

    return-void
.end method

.method private ay(Ljava/lang/String;)V
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x39

    if-gt v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;

    return-void
.end method

.method private setPath(Ljava/lang/String;)V
    .locals 3
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    const/16 v2, 0x2f

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->yR:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public addParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    invoke-virtual {v1, p1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public addScope(Ljava/lang/String;)V
    .locals 1
    .param p1, "scope"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dv:Ljava/lang/String;

    return-object v0
.end method

.method public getApiId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dt:Ljava/lang/String;

    return-object v0
.end method

.method public getFullScope()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->getScope()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dx:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getHeader(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaders()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    return-object v0
.end method

.method public getHeadersAsMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getHttpBody()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B

    return-object v0
.end method

.method public getHttpBodyAsJson()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    :try_start_0
    new-instance v1, Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GoogleAuthApiRequest"

    const-string v1, "Unsupported encoding error."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getHttpMethod()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dy:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getParameters()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    return-object v0
.end method

.method public getParametersAsMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->yR:Ljava/lang/String;

    return-object v0
.end method

.method public getScope()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v1, v0, :cond_1

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DB:J

    return-wide v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;

    return-object v0
.end method

.method public putHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAccountName(Ljava/lang/String;)V
    .locals 0
    .param p1, "accountName"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dv:Ljava/lang/String;

    return-void
.end method

.method public setHttpBody(Ljava/lang/String;)V
    .locals 2
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GoogleAuthApiRequest"

    const-string v1, "Unsupported encoding error."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public setTimeout(J)V
    .locals 1
    .param p1, "timeout"    # J

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DB:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{ API: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Scope: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->getFullScope()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Account: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->getAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequestCreator;->a(Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;Landroid/os/Parcel;I)V

    return-void
.end method
