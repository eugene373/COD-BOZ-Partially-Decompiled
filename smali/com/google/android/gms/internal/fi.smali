.class public final Lcom/google/android/gms/internal/fi;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fi$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/fj;


# instance fields
.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final lA:Ljava/lang/String;

.field public final lD:Lcom/google/android/gms/internal/gt;

.field public final lH:Lcom/google/android/gms/internal/ay;

.field public final lS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final tA:Ljava/lang/String;

.field public final tB:Ljava/lang/String;

.field public final tC:Landroid/os/Bundle;

.field public final tD:I

.field public final tE:Landroid/os/Bundle;

.field public final tF:Z

.field public final tw:Landroid/os/Bundle;

.field public final tx:Lcom/google/android/gms/internal/av;

.field public final ty:Landroid/content/pm/PackageInfo;

.field public final tz:Ljava/lang/String;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/fj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fi;->CREATOR:Lcom/google/android/gms/internal/fj;

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/ay;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gt;",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/fi;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/fi;->tw:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;

    iput-object p4, p0, Lcom/google/android/gms/internal/fi;->lH:Lcom/google/android/gms/internal/ay;

    iput-object p5, p0, Lcom/google/android/gms/internal/fi;->lA:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/fi;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/fi;->ty:Landroid/content/pm/PackageInfo;

    iput-object p8, p0, Lcom/google/android/gms/internal/fi;->tz:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/fi;->tA:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/fi;->tB:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/fi;->lD:Lcom/google/android/gms/internal/gt;

    iput-object p12, p0, Lcom/google/android/gms/internal/fi;->tC:Landroid/os/Bundle;

    iput p13, p0, Lcom/google/android/gms/internal/fi;->tD:I

    iput-object p14, p0, Lcom/google/android/gms/internal/fi;->lS:Ljava/util/List;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/fi;->tE:Landroid/os/Bundle;

    move/from16 v0, p16

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fi;->tF:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/ay;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gt;",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z)V"
        }
    .end annotation

    const/4 v1, 0x4

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v0 .. v16}, Lcom/google/android/gms/internal/fi;-><init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/fi$a;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fi$a;->tw:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/fi$a;->tx:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/internal/fi$a;->lH:Lcom/google/android/gms/internal/ay;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/internal/fi$a;->lA:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/internal/fi$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/internal/fi$a;->ty:Landroid/content/pm/PackageInfo;

    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/google/android/gms/internal/fi$a;->tA:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/google/android/gms/internal/fi$a;->tB:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/gms/internal/fi$a;->lD:Lcom/google/android/gms/internal/gt;

    move-object/from16 v0, p1

    iget-object v12, v0, Lcom/google/android/gms/internal/fi$a;->tC:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget v13, v0, Lcom/google/android/gms/internal/fi$a;->tD:I

    move-object/from16 v0, p1

    iget-object v14, v0, Lcom/google/android/gms/internal/fi$a;->lS:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v15, v0, Lcom/google/android/gms/internal/fi$a;->tE:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/internal/fi$a;->tF:Z

    move/from16 v16, v0

    move-object/from16 v1, p0

    move-object/from16 v8, p2

    invoke-direct/range {v1 .. v16}, Lcom/google/android/gms/internal/fi;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/fj;->a(Lcom/google/android/gms/internal/fi;Landroid/os/Parcel;I)V

    return-void
.end method
