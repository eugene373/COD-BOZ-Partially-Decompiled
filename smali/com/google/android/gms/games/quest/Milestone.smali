.class public interface abstract Lcom/google/android/gms/games/quest/Milestone;
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
        "Lcom/google/android/gms/games/quest/Milestone;",
        ">;"
    }
.end annotation


# static fields
.field public static final STATE_CLAIMED:I = 0x4

.field public static final STATE_COMPLETED_NOT_CLAIMED:I = 0x3

.field public static final STATE_NOT_COMPLETED:I = 0x2

.field public static final STATE_NOT_STARTED:I = 0x1


# virtual methods
.method public abstract getCompletionRewardData()[B
.end method

.method public abstract getCurrentProgress()J
.end method

.method public abstract getEventId()Ljava/lang/String;
.end method

.method public abstract getMilestoneId()Ljava/lang/String;
.end method

.method public abstract getState()I
.end method

.method public abstract getTargetProgress()J
.end method
