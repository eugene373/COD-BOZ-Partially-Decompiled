.class final Lcom/ideaworks3d/marmalade/CameraCapture$1;
.super Ljava/lang/Object;
.source "s3eCameraCapture.java"

# interfaces
.implements Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/CameraCapture;->convertUriToFile(Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$holder:[Ljava/io/File;


# direct methods
.method constructor <init>([Ljava/io/File;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/CameraCapture$1;->val$holder:[Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cursorLoadComplete(Landroid/database/Cursor;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 108
    :try_start_0
    const-string v0, "_data"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 109
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/CameraCapture$1;->val$holder:[Ljava/io/File;

    const/4 v2, 0x0

    new-instance v3, Ljava/io/File;

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v3, v1, v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    :cond_0
    if-eqz p1, :cond_1

    .line 122
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 124
    :cond_1
    const-string v0, "Finished waiting for file cursor"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 125
    invoke-static {v4}, Lcom/ideaworks3d/marmalade/CameraCapture;->access$002(Z)Z

    .line 127
    :goto_0
    return-void

    .line 114
    :catch_0
    move-exception v0

    .line 116
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in convertUriToFile: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    if-eqz p1, :cond_2

    .line 122
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 124
    :cond_2
    const-string v0, "Finished waiting for file cursor"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 125
    invoke-static {v4}, Lcom/ideaworks3d/marmalade/CameraCapture;->access$002(Z)Z

    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    if-eqz p1, :cond_3

    .line 122
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 124
    :cond_3
    const-string v1, "Finished waiting for file cursor"

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 125
    invoke-static {v4}, Lcom/ideaworks3d/marmalade/CameraCapture;->access$002(Z)Z

    throw v0
.end method
