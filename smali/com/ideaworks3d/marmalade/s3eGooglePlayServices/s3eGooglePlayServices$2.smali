.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;
.super Ljava/lang/Object;
.source "s3eGooglePlayServices.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayMatchMakingInvitePlayers()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 216
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayMatchMakingInvitePlayers invite players"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->access$000(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x3

    const/16 v3, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showMatchMakingInvitePlayersDialog(III)Z

    .line 218
    return-void
.end method
