.class Lcom/android/expansion/downloader/IsDownloadActivity$1$2;
.super Ljava/lang/Object;
.source "IsDownloadActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/expansion/downloader/IsDownloadActivity$1;->onPostExecute(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/expansion/downloader/IsDownloadActivity$1;


# direct methods
.method constructor <init>(Lcom/android/expansion/downloader/IsDownloadActivity$1;)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1$2;->this$1:Lcom/android/expansion/downloader/IsDownloadActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1$2;->this$1:Lcom/android/expansion/downloader/IsDownloadActivity$1;

    iget-object v0, v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;

    invoke-virtual {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->finish()V

    .line 294
    return-void
.end method
