.class public final Lcom/google/android/gms/internal/gz;
.super Lcom/google/android/gms/internal/gx;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gx;-><init>(Lcom/google/android/gms/internal/gv;)V

    return-void
.end method


# virtual methods
.method public onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 0
    .param p1, "view"    # Landroid/view/View;
    .param p2, "requestedOrientation"    # I
    .param p3, "customViewCallback"    # Landroid/webkit/WebChromeClient$CustomViewCallback;

    .prologue
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/gz;->a(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V

    return-void
.end method
