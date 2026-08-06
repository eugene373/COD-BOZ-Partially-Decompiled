.class public final Lcom/google/android/gms/wearable/Wearable$WearableOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$ApiOptions$Optional;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/Wearable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WearableOptions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;)V
    .locals 0
    .param p1, "builder"    # Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;Lcom/google/android/gms/wearable/Wearable$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/wearable/Wearable$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/Wearable$WearableOptions;-><init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;)V

    return-void
.end method
