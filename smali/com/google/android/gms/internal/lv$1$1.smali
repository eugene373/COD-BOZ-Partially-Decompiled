.class Lcom/google/android/gms/internal/lv$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/lv$1;->a(Lcom/google/android/gms/internal/lz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aeN:Lcom/google/android/gms/internal/lv$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/lv$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/lv$1$1;->aeN:Lcom/google/android/gms/internal/lv$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAddGeofencesResult(I[Ljava/lang/String;)V
    .locals 2
    .param p1, "statusCode"    # I
    .param p2, "geofenceRequestIds"    # [Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/lv$1$1;->aeN:Lcom/google/android/gms/internal/lv$1;

    invoke-static {p1}, Lcom/google/android/gms/location/LocationStatusCodes;->eg(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lv$1;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
