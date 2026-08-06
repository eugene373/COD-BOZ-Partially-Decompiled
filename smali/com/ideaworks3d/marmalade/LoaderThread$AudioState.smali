.class final enum Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
.super Ljava/lang/Enum;
.source "LoaderThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "AudioState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Initialized:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum None:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum PlaybackCompleted:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Prepared:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

.field public static final enum Stopped:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 121
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "None"

    invoke-direct {v0, v1, v3}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->None:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 122
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Idle"

    invoke-direct {v0, v1, v4}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 123
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Initialized"

    invoke-direct {v0, v1, v5}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Initialized:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 124
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Stopped"

    invoke-direct {v0, v1, v6}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Stopped:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 125
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Prepared"

    invoke-direct {v0, v1, v7}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Prepared:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 126
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Started"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 127
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Paused"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 128
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "PlaybackCompleted"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->PlaybackCompleted:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 129
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    const-string v1, "Error"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    .line 119
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->None:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Initialized:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Stopped:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Prepared:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->PlaybackCompleted:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    aput-object v2, v0, v1

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->$VALUES:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 119
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    .locals 1

    .prologue
    .line 119
    const-class v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    return-object v0
.end method

.method public static values()[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    .locals 1

    .prologue
    .line 119
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->$VALUES:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    invoke-virtual {v0}, [Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;

    return-object v0
.end method
