.class public final Lcom/sec/android/iap/lib/R$style;
.super Ljava/lang/Object;
.source "R.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sec/android/iap/lib/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "style"
.end annotation


# static fields
.field public static AppBaseTheme:I

.field public static AppTheme:I

.field public static IapProgressBar:I

.field public static Theme_Empty:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    const/high16 v0, 0x7f060000

    sput v0, Lcom/sec/android/iap/lib/R$style;->AppBaseTheme:I

    .line 73
    const v0, 0x7f060001

    sput v0, Lcom/sec/android/iap/lib/R$style;->AppTheme:I

    .line 74
    const v0, 0x7f060002

    sput v0, Lcom/sec/android/iap/lib/R$style;->IapProgressBar:I

    .line 75
    const v0, 0x7f060003

    sput v0, Lcom/sec/android/iap/lib/R$style;->Theme_Empty:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
