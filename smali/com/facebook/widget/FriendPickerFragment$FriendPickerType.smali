.class public final enum Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
.super Ljava/lang/Enum;
.source "FriendPickerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FriendPickerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FriendPickerType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

.field public static final enum FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

.field public static final enum INVITABLE_FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

.field public static final enum TAGGABLE_FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;


# instance fields
.field private final requestIsCacheable:Z

.field private final requestPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 57
    new-instance v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    const-string v1, "FRIENDS"

    const-string v2, "/friends"

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    .line 58
    new-instance v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    const-string v1, "TAGGABLE_FRIENDS"

    const-string v2, "/taggable_friends"

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->TAGGABLE_FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    .line 59
    new-instance v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    const-string v1, "INVITABLE_FRIENDS"

    const-string v2, "/invitable_friends"

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->INVITABLE_FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    .line 56
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    sget-object v1, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->TAGGABLE_FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->INVITABLE_FRIENDS:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->$VALUES:[Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    iput-object p3, p0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->requestPath:Ljava/lang/String;

    .line 66
    iput-boolean p4, p0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->requestIsCacheable:Z

    .line 67
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    .locals 1

    .prologue
    .line 56
    const-class v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->$VALUES:[Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    invoke-virtual {v0}, [Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    return-object v0
.end method


# virtual methods
.method getRequestPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->requestPath:Ljava/lang/String;

    return-object v0
.end method

.method isCacheable()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->requestIsCacheable:Z

    return v0
.end method
