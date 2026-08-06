.class final Lcom/google/android/gms/tagmanager/bh;
.super Ljava/lang/Object;


# static fields
.field static apQ:Lcom/google/android/gms/tagmanager/bi;

.field static apR:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/tagmanager/x;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/x;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    return-void
.end method

.method public static S(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0}, Lcom/google/android/gms/tagmanager/bi;->S(Ljava/lang/String;)V

    return-void
.end method

.method public static T(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0}, Lcom/google/android/gms/tagmanager/bi;->T(Ljava/lang/String;)V

    return-void
.end method

.method public static U(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0}, Lcom/google/android/gms/tagmanager/bi;->U(Ljava/lang/String;)V

    return-void
.end method

.method public static V(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0}, Lcom/google/android/gms/tagmanager/bi;->V(Ljava/lang/String;)V

    return-void
.end method

.method public static W(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0}, Lcom/google/android/gms/tagmanager/bi;->W(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/tagmanager/bi;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/tagmanager/bi;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static getLogLevel()I
    .locals 1

    sget v0, Lcom/google/android/gms/tagmanager/bh;->apR:I

    return v0
.end method

.method public static setLogLevel(I)V
    .locals 1
    .param p0, "logLevel"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/tagmanager/bh;->apQ:Lcom/google/android/gms/tagmanager/bi;

    invoke-interface {v0, p0}, Lcom/google/android/gms/tagmanager/bi;->setLogLevel(I)V

    return-void
.end method
