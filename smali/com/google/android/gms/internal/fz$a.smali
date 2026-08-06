.class public final Lcom/google/android/gms/internal/fz$a;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final errorCode:I

.field public final lH:Lcom/google/android/gms/internal/ay;

.field public final vp:Lorg/json/JSONObject;

.field public final vq:Lcom/google/android/gms/internal/cm;

.field public final vs:J

.field public final vt:J

.field public final vv:Lcom/google/android/gms/internal/fi;

.field public final vw:Lcom/google/android/gms/internal/fk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/fk;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/ay;IJJLorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;

    iput-object p2, p0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iput-object p3, p0, Lcom/google/android/gms/internal/fz$a;->vq:Lcom/google/android/gms/internal/cm;

    iput-object p4, p0, Lcom/google/android/gms/internal/fz$a;->lH:Lcom/google/android/gms/internal/ay;

    iput p5, p0, Lcom/google/android/gms/internal/fz$a;->errorCode:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/fz$a;->vs:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/fz$a;->vt:J

    iput-object p10, p0, Lcom/google/android/gms/internal/fz$a;->vp:Lorg/json/JSONObject;

    return-void
.end method
