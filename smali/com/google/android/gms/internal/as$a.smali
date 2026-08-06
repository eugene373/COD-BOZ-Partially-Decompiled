.class public Lcom/google/android/gms/internal/as$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final nQ:Ljava/lang/String;

.field final value:J


# direct methods
.method constructor <init>(JLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/as$a;->value:J

    iput-object p3, p0, Lcom/google/android/gms/internal/as$a;->nQ:Ljava/lang/String;

    return-void
.end method
