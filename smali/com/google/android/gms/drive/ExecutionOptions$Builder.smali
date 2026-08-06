.class public final Lcom/google/android/gms/drive/ExecutionOptions$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/ExecutionOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private Nn:Ljava/lang/String;

.field private No:Z

.field private Np:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->Np:I

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/drive/ExecutionOptions;
    .locals 5

    iget v0, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->Np:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->No:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/ExecutionOptions;

    iget-object v1, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->Nn:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->No:Z

    iget v3, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->Np:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/drive/ExecutionOptions;-><init>(Ljava/lang/String;ZILcom/google/android/gms/drive/ExecutionOptions$1;)V

    return-object v0
.end method

.method public setConflictStrategy(I)Lcom/google/android/gms/drive/ExecutionOptions$Builder;
    .locals 3
    .param p1, "strategy"    # I

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/drive/ExecutionOptions;->aW(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized value for conflict strategy: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->Np:I

    return-object p0
.end method

.method public setNotifyOnCompletion(Z)Lcom/google/android/gms/drive/ExecutionOptions$Builder;
    .locals 0
    .param p1, "notify"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->No:Z

    return-object p0
.end method

.method public setTrackingTag(Ljava/lang/String;)Lcom/google/android/gms/drive/ExecutionOptions$Builder;
    .locals 5
    .param p1, "trackingTag"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/drive/ExecutionOptions;->bh(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/high16 v4, 0x10000

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->Nn:Ljava/lang/String;

    return-object p0
.end method
