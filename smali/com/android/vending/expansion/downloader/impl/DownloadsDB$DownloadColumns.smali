.class public Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadColumns;
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
    name = "DownloadColumns"
.end annotation


# static fields
.field public static final CONTROL:Ljava/lang/String; = "CONTROL"

.field public static final CURRENTBYTES:Ljava/lang/String; = "CURRENTBYTES"

.field public static final ETAG:Ljava/lang/String; = "ETAG"

.field public static final FILENAME:Ljava/lang/String; = "FN"

.field public static final INDEX:Ljava/lang/String; = "FILEIDX"

.field public static final LASTMOD:Ljava/lang/String; = "LASTMOD"

.field public static final NUM_FAILED:Ljava/lang/String; = "FAILCOUNT"

.field public static final REDIRECT_COUNT:Ljava/lang/String; = "REDIRECTCOUNT"

.field public static final RETRY_AFTER:Ljava/lang/String; = "RETRYAFTER"

.field public static final SCHEMA:[[Ljava/lang/String;

.field public static final STATUS:Ljava/lang/String; = "STATUS"

.field public static final TABLE_NAME:Ljava/lang/String; = "DownloadColumns"

.field public static final TOTALBYTES:Ljava/lang/String; = "TOTALBYTES"

.field public static final URI:Ljava/lang/String; = "URI"

.field public static final _ID:Ljava/lang/String; = "DownloadColumns._id"


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 258
    const/16 v0, 0xd

    new-array v0, v0, [[Ljava/lang/String;

    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "_id"

    aput-object v2, v1, v4

    const-string v2, "INTEGER PRIMARY KEY"

    aput-object v2, v1, v5

    aput-object v1, v0, v4

    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "FILEIDX"

    aput-object v2, v1, v4

    const-string v2, "INTEGER UNIQUE"

    aput-object v2, v1, v5

    aput-object v1, v0, v5

    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "URI"

    aput-object v2, v1, v4

    const-string v2, "TEXT"

    aput-object v2, v1, v5

    aput-object v1, v0, v6

    const/4 v1, 0x3

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "FN"

    aput-object v3, v2, v4

    const-string v3, "TEXT UNIQUE"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/4 v1, 0x4

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "ETAG"

    aput-object v3, v2, v4

    const-string v3, "TEXT"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/4 v1, 0x5

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "TOTALBYTES"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/4 v1, 0x6

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "CURRENTBYTES"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "LASTMOD"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/16 v1, 0x8

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "STATUS"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/16 v1, 0x9

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "CONTROL"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/16 v1, 0xa

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "FAILCOUNT"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/16 v1, 0xb

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "RETRYAFTER"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    const/16 v1, 0xc

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "REDIRECTCOUNT"

    aput-object v3, v2, v4

    const-string v3, "INTEGER"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    sput-object v0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadColumns;->SCHEMA:[[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
