.class public final Lcom/google/android/gms/games/internal/constants/RequestType;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static dH(I)Ljava/lang/String;
    .locals 3

    packed-switch p0, :pswitch_data_0

    const-string v0, "RequestType"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown request type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "UNKNOWN_TYPE"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "GIFT"

    goto :goto_0

    :pswitch_1
    const-string v0, "WISH"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
