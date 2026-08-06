.class public Lcom/android/vending/expansion/downloader/impl/DownloadsDB$MetadataColumns;
.super Ljava/lang/Object;
.source "DownloadsDB.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MetadataColumns"
.end annotation


# static fields
.field public static final APKVERSION:Ljava/lang/String; = "APKVERSION"

.field public static final DOWNLOAD_STATUS:Ljava/lang/String; = "DOWNLOADSTATUS"

.field public static final FLAGS:Ljava/lang/String; = "DOWNLOADFLAGS"

.field public static final SCHEMA:[[Ljava/lang/String;

.field public static final TABLE_NAME:Ljava/lang/String; = "MetadataColumns"

.field public static final _ID:Ljava/lang/String; = "MetadataColumns._id"


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 225
    const/4 v0, 0x4

    new-array v0, v0, [[Ljava/lang/String;

    new-array v1, v3, [Ljava/lang/String;

    const-string v2, "_id"

    aput-object v2, v1, v4

    const-string v2, "INTEGER PRIMARY KEY"

    aput-object v2, v1, v5

    aput-object v1, v0, v4

    new-array v1, v3, [Ljava/lang/String;

    const-string v2, "APKVERSION"

    aput-object v2, v1, v4

    const-string v2, "INTEGER"

    aput-object v2, v1, v5

    aput-object v1, v0, v5

    new-array v1, v3, [Ljava/lang/String;

    const-string v2, "DOWNLOADSTATUS"

    aput-object v2, v1, v4

    const-string v2, "INTEGER"

    aput-object v2, v1, v5

    aput-object v1, v0, v3

    const/4 v1, 0x3

    new-array v2, v3, [Ljava/lang/String;

    const-string v3, "DOWNLOADFLAGS"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    sput-object v0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$MetadataColumns;->SCHEMA:[[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
