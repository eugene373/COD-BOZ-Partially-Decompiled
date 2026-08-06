.class public LIsIOSUtils;
.super Ljava/lang/Object;
.source "IsIOSUtils.java"


# static fields
.field public static fileName:Ljava/lang/String;

.field static initKobjMap:Z

.field public static kobjMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "LKeychainObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    .line 27
    const/4 v0, 0x1

    sput-boolean v0, LIsIOSUtils;->initKobjMap:Z

    .line 28
    const-string v0, ".temp.bin"

    sput-object v0, LIsIOSUtils;->fileName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IsInstallExceptionHandler()V
    .locals 0

    .prologue
    .line 33
    return-void
.end method

.method public static IsInstallMemoryWarningHandler(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 45
    return-void
.end method

.method public static IsKeychainInit(Ljava/lang/String;)Z
    .locals 12

    .prologue
    const/16 v11, 0x23

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 83
    .line 86
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v5

    .line 90
    sget-boolean v0, LIsIOSUtils;->initKobjMap:Z

    if-eqz v0, :cond_5

    .line 95
    :try_start_0
    sget-object v0, LIsIOSUtils;->fileName:Ljava/lang/String;

    invoke-virtual {v5, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v6

    .line 98
    const v0, 0xffff

    new-array v0, v0, [B

    .line 99
    invoke-virtual {v6, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v7

    .line 101
    const/4 v3, -0x1

    if-ne v7, v3, :cond_0

    .line 173
    :goto_0
    return v1

    .line 110
    :cond_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    move v0, v1

    .line 114
    :cond_1
    new-instance v9, LKeychainObject;

    invoke-direct {v9}, LKeychainObject;-><init>()V

    .line 115
    const-string v3, ""

    move v4, v0

    move-object v0, v3

    .line 120
    :goto_1
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getChar()C

    move-result v10

    .line 121
    if-eq v10, v11, :cond_3

    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 123
    :goto_2
    add-int/lit8 v0, v4, 0x2

    .line 124
    if-ne v10, v11, :cond_4

    .line 127
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    iput v4, v9, LKeychainObject;->crc:I

    .line 128
    add-int/lit8 v0, v0, 0x4

    .line 132
    const/4 v4, 0x1

    iput-boolean v4, v9, LKeychainObject;->valid:Z

    .line 133
    sget-object v4, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    if-lt v0, v7, :cond_1

    .line 137
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move v0, v1

    .line 152
    :goto_3
    sput-boolean v1, LIsIOSUtils;->initKobjMap:Z

    .line 156
    :goto_4
    if-eqz v0, :cond_2

    .line 161
    :try_start_1
    sget-object v0, LIsIOSUtils;->fileName:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v5, v0, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    move v1, v2

    .line 173
    goto :goto_0

    .line 140
    :catch_0
    move-exception v0

    move v0, v2

    .line 150
    goto :goto_3

    .line 165
    :catch_1
    move-exception v0

    goto :goto_0

    .line 145
    :catch_2
    move-exception v0

    goto :goto_0

    :cond_3
    move-object v3, v0

    goto :goto_2

    :cond_4
    move v4, v0

    move-object v0, v3

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_4
.end method

.method public static IsKeychainReadKey(Ljava/lang/String;)I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 209
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 225
    :goto_0
    return v0

    .line 215
    :cond_0
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKeychainObject;

    .line 218
    iget-boolean v2, v0, LKeychainObject;->valid:Z

    if-eqz v2, :cond_1

    iget v2, v0, LKeychainObject;->crc:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 221
    iget v0, v0, LKeychainObject;->crc:I

    goto :goto_0

    :cond_1
    move v0, v1

    .line 225
    goto :goto_0
.end method

.method public static IsKeychainSearchKey(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 185
    .line 187
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 203
    :goto_0
    return v0

    .line 193
    :cond_0
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKeychainObject;

    .line 195
    iget-boolean v2, v0, LKeychainObject;->valid:Z

    if-eqz v2, :cond_1

    iget v0, v0, LKeychainObject;->crc:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    :cond_1
    move v0, v1

    .line 200
    goto :goto_0

    .line 203
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static IsKeychainTerminate()V
    .locals 1

    .prologue
    .line 179
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 180
    return-void
.end method

.method public static IsKeychainWriteKey(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 230
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    new-instance v0, LKeychainObject;

    invoke-direct {v0}, LKeychainObject;-><init>()V

    .line 235
    iput-boolean v2, v0, LKeychainObject;->valid:Z

    .line 236
    const/4 v1, -0x1

    iput v1, v0, LKeychainObject;->crc:I

    .line 237
    sget-object v1, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 246
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKeychainObject;

    iget v0, v0, LKeychainObject;->crc:I

    if-ne v0, v1, :cond_1

    move v0, v2

    .line 312
    :goto_0
    return v0

    .line 253
    :cond_1
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKeychainObject;

    iput v1, v0, LKeychainObject;->crc:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 265
    :goto_1
    :try_start_1
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v0

    .line 266
    sget-object v1, LIsIOSUtils;->fileName:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v4

    .line 269
    sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 271
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 272
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKeychainObject;

    .line 274
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    add-int/lit8 v6, v6, 0x2

    add-int/lit8 v6, v6, 0x4

    .line 276
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 277
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v7

    move v1, v3

    .line 278
    :goto_3
    array-length v8, v7

    if-ge v1, v8, :cond_2

    .line 280
    aget-char v8, v7, v1

    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    .line 278
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 282
    :cond_2
    const/16 v1, 0x23

    invoke-virtual {v6, v1}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    .line 284
    iget v0, v0, LKeychainObject;->crc:I

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 285
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 289
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 290
    invoke-virtual {v4, v0}, Ljava/io/FileOutputStream;->write([B)V

    goto :goto_2

    .line 296
    :catch_0
    move-exception v0

    move v0, v3

    .line 301
    goto :goto_0

    .line 294
    :cond_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v2

    .line 312
    goto :goto_0

    .line 303
    :catch_1
    move-exception v0

    move v0, v3

    .line 307
    goto :goto_0

    .line 256
    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public static IsOSFree()V
    .locals 0

    .prologue
    .line 61
    return-void
.end method

.method public static IsOSMalloc(I)V
    .locals 0

    .prologue
    .line 57
    return-void
.end method

.method public static IsOSRealloc(I)V
    .locals 0

    .prologue
    .line 65
    return-void
.end method

.method public static IsSimulateMemoryWarning()V
    .locals 0

    .prologue
    .line 53
    return-void
.end method

.method public static IsUninstallExceptionHandler()V
    .locals 0

    .prologue
    .line 37
    return-void
.end method

.method public static IsUninstallMemoryWarningHandler()V
    .locals 0

    .prologue
    .line 49
    return-void
.end method


# virtual methods
.method public Test()Z
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x1

    return v0
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    .line 72
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 74
    return-void
.end method
