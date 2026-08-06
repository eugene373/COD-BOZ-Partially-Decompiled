.class Lcom/android/expansion/downloader/IsDownloadActivity$1$1;
.super Ljava/lang/Object;
.source "IsDownloadActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/expansion/downloader/IsDownloadActivity$1;->onPreExecute()V
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
    .line 169
    iput-object p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1$1;->this$1:Lcom/android/expansion/downloader/IsDownloadActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1$1;->this$1:Lcom/android/expansion/downloader/IsDownloadActivity$1;

    iget-object v0, v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$302(Lcom/android/expansion/downloader/IsDownloadActivity;Z)Z

    .line 173
    return-void
.end method
