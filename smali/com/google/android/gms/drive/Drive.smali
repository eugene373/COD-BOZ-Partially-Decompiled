.class public final Lcom/google/android/gms/drive/Drive;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/Drive$b;,
        Lcom/google/android/gms/drive/Drive$a;
    }
.end annotation


# static fields
.field public static final API:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final CU:Lcom/google/android/gms/common/api/Api$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$c",
            "<",
            "Lcom/google/android/gms/drive/internal/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final DriveApi:Lcom/google/android/gms/drive/DriveApi;

.field public static final Nc:Lcom/google/android/gms/common/api/Scope;

.field public static final Nd:Lcom/google/android/gms/common/api/Scope;

.field public static final Ne:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/drive/Drive$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final Nf:Lcom/google/android/gms/drive/b;

.field public static final Ng:Lcom/google/android/gms/drive/e;

.field public static final SCOPE_APPFOLDER:Lcom/google/android/gms/common/api/Scope;

.field public static final SCOPE_FILE:Lcom/google/android/gms/common/api/Scope;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x0

    new-instance v0, Lcom/google/android/gms/common/api/Api$c;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$c;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive.file"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->SCOPE_FILE:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive.appdata"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->SCOPE_APPFOLDER:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->Nc:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive.apps"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->Nd:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    new-instance v1, Lcom/google/android/gms/drive/Drive$1;

    invoke-direct {v1}, Lcom/google/android/gms/drive/Drive$1;-><init>()V

    sget-object v2, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;

    new-array v3, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Lcom/google/android/gms/common/api/Api$b;Lcom/google/android/gms/common/api/Api$c;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->API:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    new-instance v1, Lcom/google/android/gms/drive/Drive$2;

    invoke-direct {v1}, Lcom/google/android/gms/drive/Drive$2;-><init>()V

    sget-object v2, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;

    new-array v3, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Lcom/google/android/gms/common/api/Api$b;Lcom/google/android/gms/common/api/Api$c;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->Ne:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/drive/internal/o;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->DriveApi:Lcom/google/android/gms/drive/DriveApi;

    new-instance v0, Lcom/google/android/gms/drive/internal/t;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->Nf:Lcom/google/android/gms/drive/b;

    new-instance v0, Lcom/google/android/gms/drive/internal/x;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/x;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/Drive;->Ng:Lcom/google/android/gms/drive/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
