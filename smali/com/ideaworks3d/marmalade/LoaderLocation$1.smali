.class Lcom/ideaworks3d/marmalade/LoaderLocation$1;
.super Ljava/lang/Object;
.source "LoaderLocation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStart(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderLocation;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 65
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-direct {v1, v2}, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;-><init>(Lcom/ideaworks3d/marmalade/LoaderLocation;)V

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$302(Lcom/ideaworks3d/marmalade/LoaderLocation;Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;)Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    .line 66
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "gps"

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$400(Lcom/ideaworks3d/marmalade/LoaderLocation;)I

    move-result v2

    int-to-long v2, v2

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v4}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$500(Lcom/ideaworks3d/marmalade/LoaderLocation;)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v5}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$300(Lcom/ideaworks3d/marmalade/LoaderLocation;)Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 67
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$300(Lcom/ideaworks3d/marmalade/LoaderLocation;)Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->addGpsStatusListener(Landroid/location/GpsStatus$Listener;)Z

    .line 68
    return-void
.end method
