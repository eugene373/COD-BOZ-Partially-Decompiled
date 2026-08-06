.class public final Lcom/sec/android/iap/lib/R$drawable;
.super Ljava/lang/Object;
.source "R.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sec/android/iap/lib/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "drawable"
.end annotation


# static fields
.field public static dialog_full_holo_light:I

.field public static progressbar_middle:I

.field public static tw_widget_progressbar_effect_holo_light:I

.field public static tw_widget_progressbar_holo_light:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/high16 v0, 0x7f020000

    sput v0, Lcom/sec/android/iap/lib/R$drawable;->dialog_full_holo_light:I

    .line 18
    const v0, 0x7f020001

    sput v0, Lcom/sec/android/iap/lib/R$drawable;->progressbar_middle:I

    .line 19
    const v0, 0x7f020002

    sput v0, Lcom/sec/android/iap/lib/R$drawable;->tw_widget_progressbar_effect_holo_light:I

    .line 20
    const v0, 0x7f020003

    sput v0, Lcom/sec/android/iap/lib/R$drawable;->tw_widget_progressbar_holo_light:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
