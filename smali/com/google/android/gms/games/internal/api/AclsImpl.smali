.class public final Lcom/google/android/gms/games/internal/api/AclsImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/internal/game/Acls;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/api/AclsImpl$UpdateNotifyAclImpl;,
        Lcom/google/android/gms/games/internal/api/AclsImpl$LoadNotifyAclImpl;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static L(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/internal/game/Acls$LoadAclResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/api/AclsImpl$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/internal/api/AclsImpl$1;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method static synthetic M(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/internal/game/Acls$LoadAclResult;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/api/AclsImpl;->L(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/internal/game/Acls$LoadAclResult;

    move-result-object v0

    return-object v0
.end method
