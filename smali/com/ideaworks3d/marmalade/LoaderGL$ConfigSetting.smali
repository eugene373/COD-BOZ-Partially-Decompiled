.class Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
.super Ljava/lang/Object;
.source "LoaderGL.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderGL;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConfigSetting"
.end annotation


# instance fields
.field private mDefault:I

.field private mName:Ljava/lang/String;

.field private mSetting:I

.field private mValue:I

.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderGL;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 64
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->this$0:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, -0x1

    invoke-direct {p0, p2, p3, v0}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->Construct(Ljava/lang/String;II)V

    .line 66
    return-void
.end method

.method public constructor <init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->this$0:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-direct {p0, p2, p3, p4}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->Construct(Ljava/lang/String;II)V

    .line 70
    return-void
.end method

.method private Construct(Ljava/lang/String;II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 73
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mName:Ljava/lang/String;

    .line 74
    iput p2, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mSetting:I

    .line 75
    iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mDefault:I

    .line 76
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, -0x1

    aput v1, v0, v2

    .line 77
    const-string v1, "GL"

    invoke-static {v1, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I

    move-result v1

    if-nez v1, :cond_0

    .line 79
    aget v0, v0, v2

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I

    .line 86
    :goto_0
    return-void

    .line 84
    :cond_0
    iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I

    goto :goto_0
.end method


# virtual methods
.method public GetDefault()I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mDefault:I

    return v0
.end method

.method public GetName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public GetSetting()I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mSetting:I

    return v0
.end method

.method public GetValue()I
    .locals 1

    .prologue
    .line 89
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I

    return v0
.end method

.method public HasValue()Z
    .locals 2

    .prologue
    .line 92
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public SetValueToDefault()V
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mDefault:I

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I

    return-void
.end method
