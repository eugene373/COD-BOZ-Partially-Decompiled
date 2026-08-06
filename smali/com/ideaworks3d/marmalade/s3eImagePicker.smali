.class Lcom/ideaworks3d/marmalade/s3eImagePicker;
.super Ljava/lang/Object;
.source "s3eImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/s3eImagePicker$ImagePickerResult;
    }
.end annotation


# static fields
.field static final CURSOR_TYPE:[Ljava/lang/String;

.field static final S3E_IMAGEPICKER_ERR_ACCESS:I = 0xd

.field static final S3E_IMAGEPICKER_ERR_ALREADY_IN_PROGRESS:I = 0x3ea

.field static final S3E_IMAGEPICKER_ERR_CANCELLED:I = 0x3e9

.field static final S3E_IMAGEPICKER_ERR_DEVICE:I = 0x6

.field static final S3E_IMAGEPICKER_ERR_MEM:I = 0x8

.field static final S3E_IMAGEPICKER_ERR_NONE:I = 0x0

.field static final S3E_IMAGEPICKER_ERR_NOT_FOUND:I = 0x4

.field static final S3E_IMAGEPICKER_ERR_PARAM:I = 0x1

.field static final S3E_IMAGEPICKER_ERR_UNAVAIL:I = 0x5

.field static final S3E_IMAGEPICKER_ERR_UNSUPPORTED:I = 0x7

.field static final S3E_IMAGEPICKER_FORMAT_ANY:I = 0x0

.field static final S3E_IMAGEPICKER_FORMAT_ANYIMAGE:I = 0x6

.field static final S3E_IMAGEPICKER_FORMAT_ANYVIDEO:I = 0x5

.field static final S3E_IMAGEPICKER_FORMAT_BMP:I = 0x3

.field static final S3E_IMAGEPICKER_FORMAT_GIF:I = 0x4

.field static final S3E_IMAGEPICKER_FORMAT_JPG:I = 0x1

.field static final S3E_IMAGEPICKER_FORMAT_PNG:I = 0x2

.field static final S3E_IMAGEPICKER_FORMAT_UNKNOWN:I = 0x7


# instance fields
.field private volatile waitingForFile:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_data"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "_id"

    aput-object v2, v0, v1

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eImagePicker;->CURSOR_TYPE:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    return-void
.end method

.method private CopyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 124
    .line 127
    const/16 v1, 0x400

    :try_start_0
    new-array v2, v1, [B

    move v1, v0

    .line 130
    :goto_0
    const/4 v3, 0x0

    const/16 v4, 0x400

    invoke-virtual {p1, v2, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    .line 131
    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 144
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    :goto_1
    return v0

    .line 135
    :cond_1
    const/4 v4, 0x0

    invoke-virtual {p2, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    add-int/2addr v1, v3

    .line 137
    goto :goto_0

    .line 139
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/s3eImagePicker;Landroid/net/Uri;)Ljava/io/File;
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/s3eImagePicker;->getPicasaFile(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$102(Lcom/ideaworks3d/marmalade/s3eImagePicker;Z)Z
    .locals 0

    .prologue
    .line 18
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker;->waitingForFile:Z

    return p1
.end method

.method private convertUriToFile(Landroid/net/Uri;)Ljava/io/File;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x1

    .line 192
    new-array v6, v7, [Ljava/io/File;

    .line 193
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "_data"

    aput-object v0, v2, v8

    const-string v0, "_display_name"

    aput-object v0, v2, v7

    .line 194
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_3

    .line 197
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 198
    const-string v1, "_data"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 199
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "content://com.android.gallery3d"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "content://com.google.android.gallery3d"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 202
    :cond_0
    const-string v1, "_display_name"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 203
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 206
    iput-boolean v7, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker;->waitingForFile:Z

    .line 207
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ShowProgressDialog()V

    .line 208
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eImagePicker$1;

    invoke-direct {v1, p0, v6, p1}, Lcom/ideaworks3d/marmalade/s3eImagePicker$1;-><init>(Lcom/ideaworks3d/marmalade/s3eImagePicker;[Ljava/io/File;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 239
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker;->waitingForFile:Z

    if-eqz v0, :cond_4

    .line 241
    invoke-static {v7}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDeviceYield(I)V

    goto :goto_0

    .line 220
    :cond_2
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 221
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 222
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 244
    :goto_1
    return-object v0

    .line 225
    :cond_3
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 228
    iput-boolean v7, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker;->waitingForFile:Z

    .line 229
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ShowProgressDialog()V

    .line 230
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;

    invoke-direct {v1, p0, v6, p1}, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;-><init>(Lcom/ideaworks3d/marmalade/s3eImagePicker;[Ljava/io/File;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 243
    :cond_4
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->HideProgressDialog()V

    .line 244
    aget-object v0, v6, v8

    goto :goto_1
.end method

.method private getPicasaFile(Landroid/net/Uri;)Ljava/io/File;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 149
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v2, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 151
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "Picasa"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 157
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 159
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 163
    :cond_0
    :try_start_0
    const-string v2, "img"

    const-string v3, ".jpg"

    invoke-static {v2, v3, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .line 165
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "content://com.android.gallery3d"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "content://com.google.android.gallery3d"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 168
    :cond_1
    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 174
    :goto_1
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 175
    invoke-direct {p0, v2, v3}, Lcom/ideaworks3d/marmalade/s3eImagePicker;->CopyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)Z

    move-result v2

    .line 176
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 177
    if-nez v2, :cond_2

    .line 179
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 187
    :cond_2
    :goto_2
    return-object v0

    .line 155
    :cond_3
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getCacheDir()Ljava/io/File;

    move-result-object v0

    goto :goto_0

    .line 172
    :cond_4
    :try_start_1
    new-instance v2, Ljava/net/URL;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openStream()Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v2

    goto :goto_1

    .line 184
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 187
    goto :goto_2
.end method


# virtual methods
.method public native ImagePicker_addResultString(Ljava/lang/String;)Z
.end method

.method public s3eImagePickerSaveToGallery(ZIILjava/lang/String;[B)I
    .locals 7

    .prologue
    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 49
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyyMMdd_HHmmss"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 50
    const-string v3, ""

    .line 51
    if-eqz p1, :cond_1

    .line 53
    const-string v4, "raw://"

    const-string v5, ""

    invoke-virtual {p4, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 56
    :try_start_0
    sget-object v5, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v5}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const-string v6, " "

    invoke-static {v5, v4, v2, v6}, Landroid/provider/MediaStore$Images$Media;->insertImage(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 63
    :goto_0
    if-nez v2, :cond_0

    .line 83
    :goto_1
    return v0

    .line 58
    :catch_0
    move-exception v2

    .line 60
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object v2

    .line 61
    const-string v4, "IMAGEPICKER"

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-object v2, v3

    goto :goto_0

    :cond_0
    move v0, v1

    .line 67
    goto :goto_1

    .line 71
    :cond_1
    const-string v3, "IMAGEPICKER"

    const-string v4, "saving to gallery from file"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    new-instance v3, Landroid/graphics/BitmapFactory;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory;-><init>()V

    .line 74
    array-length v3, p5

    .line 75
    invoke-static {p5, v1, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 76
    sget-object v4, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v4}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v5, " "

    invoke-static {v4, v3, v2, v5}, Landroid/provider/MediaStore$Images$Media;->insertImage(Landroid/content/ContentResolver;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 77
    if-nez v2, :cond_2

    .line 79
    const-string v1, "IMAGEPICKER"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "insertImage result : error not saved from buffer to galery  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 82
    :cond_2
    const-string v0, "IMAGEPICKER"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "insertImage result :  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    .line 83
    goto :goto_1
.end method

.method public s3eImagePickerToFile(II)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 88
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.PICK"

    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 89
    packed-switch p1, :pswitch_data_0

    move-object v0, v1

    .line 119
    :cond_0
    :goto_0
    return-object v0

    .line 96
    :pswitch_0
    const-string v2, "image/*"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    :goto_1
    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ExecuteIntent(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 110
    if-nez v0, :cond_1

    move-object v0, v1

    .line 111
    goto :goto_0

    .line 99
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.PICK"

    sget-object v3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 100
    const-string v2, "video/*"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 103
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.PICK"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    const-string v2, "*/*"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 112
    :cond_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 113
    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eImagePicker;->convertUriToFile(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    .line 114
    if-nez v0, :cond_2

    move-object v0, v1

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "raw://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eImagePicker;->ImagePicker_addResultString(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 118
    goto :goto_0

    .line 89
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
