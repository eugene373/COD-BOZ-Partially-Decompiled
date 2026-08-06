.class interface abstract Lcom/facebook/NativeAppCallContentProvider$AttachmentDataSource;
.super Ljava/lang/Object;
.source "NativeAppCallContentProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/NativeAppCallContentProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "AttachmentDataSource"
.end annotation


# virtual methods
.method public abstract openAttachment(Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation
.end method
