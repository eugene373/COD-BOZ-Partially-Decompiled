.class public interface abstract Lcom/google/android/gms/games/snapshot/Snapshot;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/google/android/gms/common/data/Freezable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lcom/google/android/gms/common/data/Freezable",
        "<",
        "Lcom/google/android/gms/games/snapshot/Snapshot;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getContents()Lcom/google/android/gms/drive/Contents;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
.end method

.method public abstract getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;
.end method

.method public abstract modifyBytes(I[BII)Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract readFully()[B
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract writeBytes([B)Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
