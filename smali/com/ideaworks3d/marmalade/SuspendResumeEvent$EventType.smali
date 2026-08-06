.class public final enum Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
.super Ljava/lang/Enum;
.source "SuspendResumeEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/SuspendResumeEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

.field public static final enum RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

.field public static final enum SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

.field public static final enum SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 6
    new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    .line 7
    new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    const-string v1, "RESUME"

    invoke-direct {v0, v1, v3}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    .line 8
    new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    const-string v1, "SHUTDOWN"

    invoke-direct {v0, v1, v4}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    .line 4
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->$VALUES:[Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

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
    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    .locals 1

    .prologue
    .line 4
    const-class v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    return-object v0
.end method

.method public static values()[Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    .locals 1

    .prologue
    .line 4
    sget-object v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->$VALUES:[Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    invoke-virtual {v0}, [Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    return-object v0
.end method
