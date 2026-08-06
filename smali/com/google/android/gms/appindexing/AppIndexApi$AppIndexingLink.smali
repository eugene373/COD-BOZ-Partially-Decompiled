.class public final Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/appindexing/AppIndexApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AppIndexingLink"
.end annotation


# instance fields
.field public final appIndexingUrl:Landroid/net/Uri;

.field public final viewId:I

.field public final webUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/view/View;)V
    .locals 1
    .param p1, "appIndexingUrl"    # Landroid/net/Uri;
    .param p2, "webUrl"    # Landroid/net/Uri;
    .param p3, "view"    # Landroid/view/View;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->appIndexingUrl:Landroid/net/Uri;

    iput-object p2, p0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->webUrl:Landroid/net/Uri;

    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->viewId:I

    return-void
.end method
