.class public interface abstract Lcom/google/android/gms/games/Notifications;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/Notifications$InboxCountResult;,
        Lcom/google/android/gms/games/Notifications$ContactSettingLoadResult;,
        Lcom/google/android/gms/games/Notifications$GameMuteStatusLoadResult;,
        Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;
    }
.end annotation


# static fields
.field public static final NOTIFICATION_TYPES_ALL:I = 0x1f

.field public static final NOTIFICATION_TYPES_MULTIPLAYER:I = 0x3

.field public static final NOTIFICATION_TYPE_INVITATION:I = 0x1

.field public static final NOTIFICATION_TYPE_LEVEL_UP:I = 0x10

.field public static final NOTIFICATION_TYPE_MATCH_UPDATE:I = 0x2

.field public static final NOTIFICATION_TYPE_QUEST:I = 0x8

.field public static final NOTIFICATION_TYPE_REQUEST:I = 0x4


# virtual methods
.method public abstract clear(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
.end method

.method public abstract clearAll(Lcom/google/android/gms/common/api/GoogleApiClient;)V
.end method
