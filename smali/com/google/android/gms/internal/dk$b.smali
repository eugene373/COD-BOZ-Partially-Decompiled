.class final Lcom/google/android/gms/internal/dk$b;
.super Landroid/widget/RelativeLayout;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final ly:Lcom/google/android/gms/internal/gm;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/gm;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/gm;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dk$b;->ly:Lcom/google/android/gms/internal/gm;

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/dk$b;->ly:Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gm;->c(Landroid/view/MotionEvent;)V

    const/4 v0, 0x0

    return v0
.end method
