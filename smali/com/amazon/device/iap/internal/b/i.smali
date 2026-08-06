.class public abstract Lcom/amazon/device/iap/internal/b/i;
.super Lcom/amazon/android/framework/task/command/AbstractCommandTask;
.source "KiwiCommand.java"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/amazon/device/iap/internal/b/e;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;

.field private h:Z

.field private i:Lcom/amazon/device/iap/internal/b/i;

.field private j:Lcom/amazon/device/iap/internal/b/i;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/amazon/device/iap/internal/b/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 44
    invoke-direct {p0}, Lcom/amazon/android/framework/task/command/AbstractCommandTask;-><init>()V

    .line 33
    new-instance v0, Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;

    invoke-direct {v0}, Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;-><init>()V

    iput-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->g:Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    .line 45
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    .line 46
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/b/e;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->c:Ljava/lang/String;

    .line 47
    iput-object p2, p0, Lcom/amazon/device/iap/internal/b/i;->d:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Lcom/amazon/device/iap/internal/b/i;->e:Ljava/lang/String;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;

    .line 51
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;

    const-string v1, "requestId"

    iget-object v2, p0, Lcom/amazon/device/iap/internal/b/i;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;

    const-string v1, "sdkVersion"

    const-string v2, "2.0.61.0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z

    .line 55
    iput-object v3, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;

    .line 56
    iput-object v3, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    .line 57
    return-void
.end method

.method private a(Lcom/amazon/android/framework/prompt/PromptContent;)V
    .locals 2

    .prologue
    .line 113
    if-nez p1, :cond_0

    .line 119
    :goto_0
    return-void

    .line 116
    :cond_0
    new-instance v0, Lcom/amazon/device/iap/internal/b/b;

    invoke-direct {v0, p1}, Lcom/amazon/device/iap/internal/b/b;-><init>(Lcom/amazon/android/framework/prompt/PromptContent;)V

    .line 117
    invoke-static {}, Lcom/amazon/android/Kiwi;->getPromptManager()Lcom/amazon/android/framework/prompt/PromptManager;

    move-result-object v1

    .line 118
    invoke-interface {v1, v0}, Lcom/amazon/android/framework/prompt/PromptManager;->present(Lcom/amazon/android/framework/prompt/Prompt;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Z)Lcom/amazon/device/iap/internal/b/i;
    .locals 0

    .prologue
    .line 60
    iput-boolean p1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    .line 61
    return-object p0
.end method

.method public a(Lcom/amazon/device/iap/internal/b/i;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;

    .line 70
    return-void
.end method

.method protected a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    return-void
.end method

.method protected abstract a(Lcom/amazon/venezia/command/SuccessResult;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public a_()V
    .locals 0

    .prologue
    .line 211
    invoke-static {p0}, Lcom/amazon/android/Kiwi;->addCommandToCommandTaskPipeline(Lcom/amazon/android/framework/task/command/AbstractCommandTask;)V

    .line 212
    return-void
.end method

.method protected b()Lcom/amazon/device/iap/internal/b/e;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    return-object v0
.end method

.method public b(Lcom/amazon/device/iap/internal/b/i;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    .line 74
    return-void
.end method

.method protected b(Z)V
    .locals 0

    .prologue
    .line 109
    iput-boolean p1, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z

    .line 110
    return-void
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected getCommandData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 105
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;

    return-object v0
.end method

.method protected getCommandName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method protected getCommandVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->e:Ljava/lang/String;

    return-object v0
.end method

.method protected isExecutionNeeded()Z
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x1

    return v0
.end method

.method protected final onException(Lcom/amazon/android/framework/exception/KiwiException;)V
    .locals 3

    .prologue
    .line 187
    sget-object v0, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onException: exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/android/framework/exception/KiwiException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "UNHANDLED_EXCEPTION"

    invoke-virtual {p1}, Lcom/amazon/android/framework/exception/KiwiException;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "2.0"

    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/i;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    if-eqz v0, :cond_1

    .line 193
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Z)Lcom/amazon/device/iap/internal/b/i;

    .line 194
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V

    .line 205
    :cond_0
    :goto_0
    return-void

    .line 197
    :cond_1
    iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z

    if-eqz v0, :cond_2

    .line 198
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->g:Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;

    invoke-virtual {v0, p1}, Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;->map(Lcom/amazon/android/framework/exception/KiwiException;)Lcom/amazon/android/framework/prompt/PromptContent;

    move-result-object v0

    .line 199
    invoke-direct {p0, v0}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/android/framework/prompt/PromptContent;)V

    .line 201
    :cond_2
    iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    if-nez v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V

    goto :goto_0
.end method

.method protected final onFailure(Lcom/amazon/venezia/command/FailureResult;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/amazon/android/framework/exception/KiwiException;
        }
    .end annotation

    .prologue
    .line 154
    sget-object v0, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailure: result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const/4 v1, 0x0

    .line 157
    if-eqz p1, :cond_3

    .line 158
    invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getExtensionData()Ljava/util/Map;

    move-result-object v0

    const-string v2, "maxVersion"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 159
    if-eqz v0, :cond_3

    const-string v2, "1.0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 160
    const/4 v0, 0x1

    .line 164
    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    if-eqz v0, :cond_1

    .line 165
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Z)Lcom/amazon/device/iap/internal/b/i;

    .line 166
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V

    .line 180
    :cond_0
    :goto_1
    return-void

    .line 170
    :cond_1
    iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z

    if-eqz v0, :cond_2

    .line 171
    new-instance v0, Lcom/amazon/android/framework/prompt/PromptContent;

    invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getDisplayableName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getDisplayableMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getButtonLabel()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->show()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amazon/android/framework/prompt/PromptContent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 175
    invoke-direct {p0, v0}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/android/framework/prompt/PromptContent;)V

    .line 177
    :cond_2
    iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    if-nez v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method protected final onSuccess(Lcom/amazon/venezia/command/SuccessResult;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 124
    invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "errorMessage"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 125
    sget-object v1, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSuccess: result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", errorMessage: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-static {v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 127
    const/4 v0, 0x0

    .line 129
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/venezia/command/SuccessResult;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 134
    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;

    if-eqz v1, :cond_1

    .line 135
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V

    .line 150
    :cond_0
    :goto_1
    return-void

    .line 130
    :catch_0
    move-exception v1

    .line 131
    sget-object v2, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error calling onResult: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :cond_1
    iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    if-nez v1, :cond_0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->a()V

    goto :goto_1

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V

    goto :goto_1

    .line 146
    :cond_3
    iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V

    goto :goto_1
.end method
