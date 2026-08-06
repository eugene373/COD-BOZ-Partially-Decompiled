.class Lcom/google/android/gms/internal/aj$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aj;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nb:Ljava/lang/String;

.field final synthetic nc:Lorg/json/JSONObject;

.field final synthetic nd:Lcom/google/android/gms/internal/aj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aj;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aj$1;->nd:Lcom/google/android/gms/internal/aj;

    iput-object p2, p0, Lcom/google/android/gms/internal/aj$1;->nb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/aj$1;->nc:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/aj$1;->nd:Lcom/google/android/gms/internal/aj;

    invoke-static {v0}, Lcom/google/android/gms/internal/aj;->a(Lcom/google/android/gms/internal/aj;)Lcom/google/android/gms/internal/gv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aj$1;->nb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/aj$1;->nc:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
