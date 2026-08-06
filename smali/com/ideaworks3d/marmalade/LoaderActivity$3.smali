.class Lcom/ideaworks3d/marmalade/LoaderActivity$3;
.super Ljava/lang/Object;
.source "LoaderActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/LoaderActivity;->getCursor(Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

.field final synthetic val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;

.field final synthetic val$proj:[Ljava/lang/String;

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V
    .locals 0

    .prologue
    .line 426
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$uri:Landroid/net/Uri;

    iput-object p3, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$proj:[Ljava/lang/String;

    iput-object p4, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 430
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 431
    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 434
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$uri:Landroid/net/Uri;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$proj:[Ljava/lang/String;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;

    invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/CursorLoaderHelper;->getCursor(Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)Z

    .line 448
    :goto_0
    return-void

    .line 439
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$uri:Landroid/net/Uri;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$proj:[Ljava/lang/String;

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/LoaderActivity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 446
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;

    invoke-interface {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;->cursorLoadComplete(Landroid/database/Cursor;)V

    goto :goto_0
.end method
