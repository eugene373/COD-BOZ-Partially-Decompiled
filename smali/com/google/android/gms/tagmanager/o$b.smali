.class Lcom/google/android/gms/tagmanager/o$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/bg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/bg",
        "<",
        "Lcom/google/android/gms/internal/ol$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aoB:Lcom/google/android/gms/tagmanager/o;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/o;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/o$b;->aoB:Lcom/google/android/gms/tagmanager/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/tagmanager/o$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/o$b;-><init>(Lcom/google/android/gms/tagmanager/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ol$a;)V
    .locals 5

    iget-object v0, p1, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/o$b;->aoB:Lcom/google/android/gms/tagmanager/o;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ol$a;->asr:J

    const/4 v4, 0x1

    invoke-static {v1, v0, v2, v3, v4}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/internal/c$j;JZ)V

    return-void

    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;

    new-instance v0, Lcom/google/android/gms/internal/c$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/c$j;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/c$j;->gs:Lcom/google/android/gms/internal/c$f;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/google/android/gms/internal/c$j;->gr:[Lcom/google/android/gms/internal/c$i;

    iget-object v1, v1, Lcom/google/android/gms/internal/c$f;->version:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/internal/c$j;->gt:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/tagmanager/bg$a;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$b;->aoB:Lcom/google/android/gms/tagmanager/o;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/o;->b(Lcom/google/android/gms/tagmanager/o;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$b;->aoB:Lcom/google/android/gms/tagmanager/o;

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;J)V

    :cond_0
    return-void
.end method

.method public synthetic l(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ol$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/o$b;->a(Lcom/google/android/gms/internal/ol$a;)V

    return-void
.end method

.method public ob()V
    .locals 0

    return-void
.end method
