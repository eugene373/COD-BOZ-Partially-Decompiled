.class final Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;
.super Ljava/lang/Object;
.source "CursorLoaderHelper.java"

# interfaces
.implements Landroid/content/Loader$OnLoadCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/CursorLoaderHelper;->getCursor(Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/content/Loader$OnLoadCompleteListener",
        "<",
        "Landroid/database/Cursor;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadComplete(Landroid/content/Loader;Landroid/database/Cursor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Loader",
            "<",
            "Landroid/database/Cursor;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    .prologue
    .line 27
    const-string v0, "CursorLoader onLoadComplete"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;

    invoke-interface {v0, p2}, Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;->cursorLoadComplete(Landroid/database/Cursor;)V

    .line 29
    return-void
.end method

.method public bridge synthetic onLoadComplete(Landroid/content/Loader;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 24
    check-cast p2, Landroid/database/Cursor;

    invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;->onLoadComplete(Landroid/content/Loader;Landroid/database/Cursor;)V

    return-void
.end method
