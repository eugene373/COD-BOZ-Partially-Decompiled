.class public Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
.super Ljava/lang/Object;
.source "GameHelper.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;,
        Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    }
.end annotation


# static fields
.field public static final CLIENT_ALL:I = 0xf

.field public static final CLIENT_APPSTATE:I = 0x4

.field public static final CLIENT_GAMES:I = 0x1

.field public static final CLIENT_NONE:I = 0x0

.field public static final CLIENT_PLUS:I = 0x2

.field public static final CLIENT_SNAPSHOT:I = 0x8

.field static final DEFAULT_MAX_SIGN_IN_ATTEMPTS:I = 0x3

.field static final RC_RESOLVE:I = 0x2329

.field static final RC_UNUSED:I = 0x232a

.field static final RC_UNUSED_ALT:I = 0x1389

.field static final TAG:Ljava/lang/String; = "GameHelper"


# instance fields
.field private final GAMEHELPER_SHARED_PREFS:Ljava/lang/String;

.field private final KEY_SIGN_IN_CANCELLATIONS:Ljava/lang/String;

.field mActivity:Landroid/app/Activity;

.field mAppContext:Landroid/content/Context;

.field mAppStateApiOptions:Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;

.field mConnectOnStart:Z

.field private mConnecting:Z

.field mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

.field mDebugLog:Z

.field mExpectingResolution:Z

.field mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

.field mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

.field mHandler:Landroid/os/Handler;

.field mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

.field mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

.field mMaxAutoSignInAttempts:I

.field mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

.field mRequestedClients:I

.field mRequests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/request/GameRequest;",
            ">;"
        }
    .end annotation
.end field

.field private mSetupDone:Z

.field mShowErrorDialogs:Z

.field mSignInCancelled:Z

.field mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

.field mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

.field mUserInitiatedSignIn:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z

    .line 90
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 93
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z

    .line 97
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z

    .line 104
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    .line 107
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    .line 118
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 121
    invoke-static {}, Lcom/google/android/gms/games/Games$GamesOptions;->builder()Lcom/google/android/gms/games/Games$GamesOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->build()Lcom/google/android/gms/games/Games$GamesOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

    .line 122
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

    .line 123
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppStateApiOptions:Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;

    .line 126
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 138
    iput v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    .line 143
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 151
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z

    .line 154
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    .line 157
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    .line 160
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mShowErrorDialogs:Z

    .line 163
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mDebugLog:Z

    .line 186
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    .line 192
    const/4 v0, 0x3

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I

    .line 794
    const-string v0, "GAMEHELPER_SHARED_PREFS"

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->GAMEHELPER_SHARED_PREFS:Ljava/lang/String;

    .line 795
    const-string v0, "KEY_SIGN_IN_CANCELLATIONS"

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->KEY_SIGN_IN_CANCELLATIONS:Ljava/lang/String;

    .line 204
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    .line 205
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    .line 206
    iput p2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    .line 207
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mHandler:Landroid/os/Handler;

    .line 208
    return-void
.end method

.method private doApiOptionsPreCheck()V
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    if-eqz v0, :cond_0

    .line 236
    const-string v0, "GameHelper: you cannot call set*ApiOptions after the client builder has been created. Call it before calling createApiClientBuilder() or setup()."

    .line 239
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V

    .line 240
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 242
    :cond_0
    return-void
.end method

.method static makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 1023
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x104000a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method static makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 1029
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x104000a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public static showFailureDialog(Landroid/app/Activity;II)V
    .locals 2

    .prologue
    .line 982
    if-nez p0, :cond_0

    .line 983
    const-string v0, "GameHelper"

    const-string v1, "*** No Activity. Can\'t show failure dialog!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1020
    :goto_0
    return-void

    .line 988
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 1004
    const/16 v0, 0x232a

    const/4 v1, 0x0

    invoke-static {p2, p0, v0, v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getErrorDialog(ILandroid/app/Activity;ILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    .line 1006
    if-nez v0, :cond_1

    .line 1008
    const-string v0, "GameHelper"

    const-string v1, "No standard error dialog available. Making fallback dialog."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1010
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    .line 1019
    :cond_1
    :goto_1
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    goto :goto_0

    .line 990
    :pswitch_0
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_1

    .line 994
    :pswitch_1
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_1

    .line 998
    :pswitch_2
    const/4 v0, 0x3

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_1

    .line 988
    nop

    :pswitch_data_0
    .packed-switch 0x2712
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method assertConfigured(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 225
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z

    if-nez v0, :cond_0

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GameHelper error: Operation attempted without setup: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". The setup() method must be called before attempting any other operation."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V

    .line 230
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 232
    :cond_0
    return-void
.end method

.method public beginUserInitiatedSignIn()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 684
    const-string v0, "beginUserInitiatedSignIn: resetting attempt count."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 685
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->resetSignInCancellations()V

    .line 686
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z

    .line 687
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 689
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 691
    const-string v0, "beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logWarn(Ljava/lang/String;)V

    .line 693
    invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    .line 725
    :goto_0
    return-void

    .line 695
    :cond_0
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    if-eqz v0, :cond_1

    .line 696
    const-string v0, "beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it\'s clicked, and re-enable when you get the callback."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logWarn(Ljava/lang/String;)V

    goto :goto_0

    .line 706
    :cond_1
    const-string v0, "Starting USER-INITIATED sign-in flow."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 711
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z

    .line 713
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v0, :cond_2

    .line 716
    const-string v0, "beginUserInitiatedSignIn: continuing pending sign-in flow."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 717
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 718
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->resolveConnectionResult()V

    goto :goto_0

    .line 721
    :cond_2
    const-string v0, "beginUserInitiatedSignIn: starting new sign-in flow."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 722
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 723
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V

    goto :goto_0
.end method

.method public clearInvitation()V
    .locals 1

    .prologue
    .line 484
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 485
    return-void
.end method

.method public clearRequests()V
    .locals 1

    .prologue
    .line 492
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;

    .line 493
    return-void
.end method

.method public clearTurnBasedMatch()V
    .locals 1

    .prologue
    .line 488
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    .line 489
    return-void
.end method

.method connect()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 728
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 729
    const-string v0, "Already connected."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 737
    :goto_0
    return-void

    .line 732
    :cond_0
    const-string v0, "Starting connection."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 733
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 734
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 735
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    .line 736
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    goto :goto_0
.end method

.method public createApiClientBuilder()Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    .locals 3

    .prologue
    .line 278
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z

    if-eqz v0, :cond_0

    .line 279
    const-string v0, "GameHelper: you called GameHelper.createApiClientBuilder() after calling setup. You can only get a client builder BEFORE performing setup."

    .line 281
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V

    .line 282
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 285
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v1, p0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 288
    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    .line 289
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

    if-eqz v1, :cond_5

    .line 290
    sget-object v1, Lcom/google/android/gms/games/Games;->API:Lcom/google/android/gms/common/api/Api;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 293
    :goto_0
    sget-object v1, Lcom/google/android/gms/games/Games;->SCOPE_GAMES:Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 296
    :cond_1
    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    .line 297
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

    if-eqz v1, :cond_6

    .line 298
    sget-object v1, Lcom/google/android/gms/plus/Plus;->API:Lcom/google/android/gms/common/api/Api;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 301
    :goto_1
    sget-object v1, Lcom/google/android/gms/plus/Plus;->SCOPE_PLUS_LOGIN:Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 304
    :cond_2
    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    .line 305
    sget-object v1, Lcom/google/android/gms/appstate/AppStateManager;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 306
    sget-object v1, Lcom/google/android/gms/appstate/AppStateManager;->SCOPE_APP_STATE:Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 309
    :cond_3
    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    .line 310
    sget-object v1, Lcom/google/android/gms/drive/Drive;->SCOPE_APPFOLDER:Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 311
    sget-object v1, Lcom/google/android/gms/drive/Drive;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 313
    :cond_4
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 314
    return-object v0

    .line 292
    :cond_5
    sget-object v1, Lcom/google/android/gms/games/Games;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    goto :goto_0

    .line 300
    :cond_6
    sget-object v1, Lcom/google/android/gms/plus/Plus;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    goto :goto_1
.end method

.method debugLog(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1052
    const-string v0, "GameHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GameHelper: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1054
    return-void
.end method

.method public disconnect()V
    .locals 2

    .prologue
    .line 923
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 924
    const-string v0, "Disconnecting client."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 925
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 930
    :goto_0
    return-void

    .line 927
    :cond_0
    const-string v0, "GameHelper"

    const-string v1, "disconnect() called when client was already disconnected."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public enableDebugLog(Z)V
    .locals 1

    .prologue
    .line 532
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mDebugLog:Z

    .line 533
    if-eqz p1, :cond_0

    .line 534
    const-string v0, "Debug log enabled."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 536
    :cond_0
    return-void
.end method

.method public enableDebugLog(ZLjava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 540
    const-string v0, "GameHelper"

    const-string v1, "GameHelper.enableDebugLog(boolean,String) is deprecated. Use GameHelper.enableDebugLog(boolean)"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 542
    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->enableDebugLog(Z)V

    .line 543
    return-void
.end method

.method public getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 2

    .prologue
    .line 351
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-nez v0, :cond_0

    .line 352
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No GoogleApiClient. Did you call setup()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object v0
.end method

.method public getInvitation()Lcom/google/android/gms/games/multiplayer/Invitation;
    .locals 2

    .prologue
    .line 463
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 464
    const-string v0, "GameHelper"

    const-string v1, "Warning: getInvitation() should only be called when signed in, that is, after getting onSignInSuceeded()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    return-object v0
.end method

.method public getInvitationId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 445
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 446
    const-string v0, "GameHelper"

    const-string v1, "Warning: getInvitationId() should only be called when signed in, that is, after getting onSignInSuceeded()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getRequests()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/request/GameRequest;",
            ">;"
        }
    .end annotation

    .prologue
    .line 522
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 523
    const-string v0, "GameHelper"

    const-string v1, "Warning: getRequests() should only be called when signed in, that is, after getting onSignInSuceeded()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 527
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;

    return-object v0
.end method

.method getSignInCancellations()I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 800
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    const-string v1, "GAMEHELPER_SHARED_PREFS"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 802
    const-string v1, "KEY_SIGN_IN_CANCELLATIONS"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getSignInError()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    .locals 1

    .prologue
    .line 381
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    return-object v0
.end method

.method public getTurnBasedMatch()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    .locals 2

    .prologue
    .line 504
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 505
    const-string v0, "GameHelper"

    const-string v1, "Warning: getTurnBasedMatch() should only be called when signed in, that is, after getting onSignInSuceeded()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 509
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    return-object v0
.end method

.method giveUp(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 940
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 941
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->disconnect()V

    .line 942
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    .line 944
    iget v0, p1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I

    const/16 v1, 0x2714

    if-ne v0, v1, :cond_0

    .line 946
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->printMisconfiguredDebugInfo(Landroid/content/Context;)V

    .line 949
    :cond_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->showFailureDialog()V

    .line 950
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 951
    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    .line 952
    return-void
.end method

.method public hasInvitation()Z
    .locals 1

    .prologue
    .line 472
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasRequests()Z
    .locals 1

    .prologue
    .line 480
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasSignInError()Z
    .locals 1

    .prologue
    .line 373
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasTurnBasedMatch()Z
    .locals 1

    .prologue
    .line 476
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method incrementSignInCancellations()I
    .locals 4

    .prologue
    .line 809
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInCancellations()I

    move-result v0

    .line 810
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    const-string v2, "GAMEHELPER_SHARED_PREFS"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 812
    const-string v2, "KEY_SIGN_IN_CANCELLATIONS"

    add-int/lit8 v3, v0, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 813
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 814
    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isConnecting()Z
    .locals 1

    .prologue
    .line 365
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    return v0
.end method

.method public isSignedIn()Z
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method logError(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1061
    const-string v0, "GameHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "*** GameHelper ERROR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1062
    return-void
.end method

.method logWarn(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1057
    const-string v0, "GameHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "!!! GameHelper WARNING: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1058
    return-void
.end method

.method public makeSimpleDialog(Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 1035
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 1036
    const-string v0, "*** makeSimpleDialog failed: no current Activity!"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V

    .line 1037
    const/4 v0, 0x0

    .line 1039
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0
.end method

.method public makeSimpleDialog(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 1043
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 1044
    const-string v0, "*** makeSimpleDialog failed: no current Activity!"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V

    .line 1045
    const/4 v0, 0x0

    .line 1047
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-static {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0
.end method

.method notifyListener(Z)V
    .locals 2

    .prologue
    .line 657
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Notifying LISTENER of sign-in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz p1, :cond_1

    const-string v0, "SUCCESS"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 661
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    if-eqz v0, :cond_0

    .line 662
    if-eqz p1, :cond_3

    .line 663
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    invoke-interface {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;->onSignInSucceeded()V

    .line 668
    :cond_0
    :goto_1
    return-void

    .line 657
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    if-eqz v0, :cond_2

    const-string v0, "FAILURE (error)"

    goto :goto_0

    :cond_2
    const-string v0, "FAILURE (no error)"

    goto :goto_0

    .line 665
    :cond_3
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    invoke-interface {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;->onSignInFailed()V

    goto :goto_1
.end method

.method notifyListenerOfSignOut()V
    .locals 1

    .prologue
    .line 671
    const-string v0, "Notifying LISTENER of sign-out"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 672
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    if-eqz v0, :cond_0

    .line 673
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    invoke-interface {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;->onSignOut()V

    .line 675
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .prologue
    const/16 v5, 0x2711

    const/16 v3, 0x2329

    const/4 v4, 0x0

    .line 582
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: req="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-ne p1, v3, :cond_1

    const-string v0, "RC_RESOLVE"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 586
    const-string v1, "GameHelper"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult: req="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-ne p1, v3, :cond_2

    const-string v0, "RC_RESOLVE"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", resp="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 591
    if-ne p2, v5, :cond_3

    const/16 v0, 0x232a

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1389

    if-ne p1, v0, :cond_3

    .line 595
    :cond_0
    const-string v0, "onActivityResult: external signout?"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 596
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 598
    const-string v0, "onActivityResult: signOut detected."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 599
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 600
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListenerOfSignOut()V

    .line 654
    :goto_2
    return-void

    .line 582
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 586
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 605
    :cond_3
    if-eq p1, v3, :cond_4

    .line 606
    const-string v0, "onActivityResult: request code not meant for us. Ignoring."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_2

    .line 611
    :cond_4
    iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z

    .line 613
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    if-nez v0, :cond_5

    .line 614
    const-string v0, "onActivityResult: ignoring because we are not connecting."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_2

    .line 620
    :cond_5
    const/4 v0, -0x1

    if-ne p2, v0, :cond_6

    .line 622
    const-string v0, "onAR: Resolution was RESULT_OK, so connecting current client again."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 623
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V

    goto :goto_2

    .line 624
    :cond_6
    if-ne p2, v5, :cond_7

    .line 625
    const-string v0, "onAR: Resolution was RECONNECT_REQUIRED, so reconnecting."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 626
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V

    goto :goto_2

    .line 627
    :cond_7
    if-nez p2, :cond_8

    .line 629
    const-string v0, "onAR: Got a cancellation result, so disconnecting."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 630
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z

    .line 631
    iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 632
    iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z

    .line 633
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    .line 634
    iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 635
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 638
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInCancellations()I

    move-result v0

    .line 639
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->incrementSignInCancellations()I

    move-result v1

    .line 640
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onAR: # of cancellations "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " --> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", max "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 643
    invoke-virtual {p0, v4}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    goto/16 :goto_2

    .line 647
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAR: responseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", so giving up."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 651
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v1

    invoke-direct {v0, v1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->giveUp(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;)V

    goto/16 :goto_2
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 756
    const-string v0, "onConnected: connected!"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 758
    if-eqz p1, :cond_2

    .line 759
    const-string v0, "onConnected: connection hint provided. Checking for invite."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 760
    const-string v0, "invitation"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 761
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 763
    const-string v1, "onConnected: connection hint has a room invite!"

    invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 764
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 765
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invitation ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    invoke-interface {v1}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 769
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Requests:Lcom/google/android/gms/games/request/Requests;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/request/Requests;->getGameRequestsFromBundle(Landroid/os/Bundle;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;

    .line 770
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 772
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onConnected: connection hint has "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " request(s)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 776
    :cond_1
    const-string v0, "onConnected: connection hint provided. Checking for TBMP game."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 777
    const-string v0, "turn_based_match"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    .line 782
    :cond_2
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->succeedSignIn()V

    .line 783
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 830
    const-string v2, "onConnectionFailed"

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 832
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    .line 833
    const-string v2, "Connection failure:"

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 834
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "   - code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v3

    invoke-static {v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 837
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "   - resolvable: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 838
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "   - details: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 840
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInCancellations()I

    move-result v2

    .line 843
    iget-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z

    if-eqz v3, :cond_0

    .line 844
    const-string v2, "onConnectionFailed: WILL resolve because user initiated sign-in."

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 865
    :goto_0
    if-nez v0, :cond_3

    .line 867
    const-string v0, "onConnectionFailed: since we won\'t resolve, failing now."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 868
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    .line 869
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 870
    invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    .line 880
    :goto_1
    return-void

    .line 846
    :cond_0
    iget-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z

    if-eqz v3, :cond_1

    .line 847
    const-string v0, "onConnectionFailed WILL NOT resolve (user already cancelled once)."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    move v0, v1

    .line 848
    goto :goto_0

    .line 849
    :cond_1
    iget v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I

    if-ge v2, v3, :cond_2

    .line 850
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onConnectionFailed: WILL resolve because we have below the max# of attempts, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " < "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_0

    .line 858
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnectionFailed: Will NOT resolve; not user-initiated and max attempts reached: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " >= "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    .line 874
    :cond_3
    const-string v0, "onConnectionFailed: resolving problem..."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 879
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->resolveConnectionResult()V

    goto :goto_1
.end method

.method public onConnectionSuspended(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 957
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onConnectionSuspended, cause="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 958
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->disconnect()V

    .line 959
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    .line 960
    const-string v0, "Making extraordinary call to onSignInFailed callback"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 961
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 962
    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    .line 963
    return-void
.end method

.method public onStart(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 391
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    .line 392
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    .line 394
    const-string v0, "onStart"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 395
    const-string v0, "onStart"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->assertConfigured(Ljava/lang/String;)V

    .line 397
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    if-eqz v0, :cond_1

    .line 398
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 399
    const-string v0, "GameHelper"

    const-string v1, "GameHelper: client was already connected on onStart()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    :goto_0
    return-void

    .line 402
    :cond_0
    const-string v0, "Connecting client."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 403
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 404
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    goto :goto_0

    .line 407
    :cond_1
    const-string v0, "Not attempting to connect because mConnectOnStart=false"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 408
    const-string v0, "Instead, reporting a sign-in failure."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 409
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public onStop()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 420
    const-string v0, "onStop"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 421
    const-string v0, "onStop"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->assertConfigured(Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    const-string v0, "Disconnecting client due to onStop"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 424
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 428
    :goto_0
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 429
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z

    .line 432
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    .line 433
    return-void

    .line 426
    :cond_0
    const-string v0, "Client already disconnected when we got onStop."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public reconnectClient()V
    .locals 2

    .prologue
    .line 743
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 744
    const-string v0, "GameHelper"

    const-string v1, "reconnectClient() called when client is not connected."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 746
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V

    .line 751
    :goto_0
    return-void

    .line 748
    :cond_0
    const-string v0, "Reconnecting client."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 749
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V

    goto :goto_0
.end method

.method resetSignInCancellations()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 820
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;

    const-string v1, "GAMEHELPER_SHARED_PREFS"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 822
    const-string v1, "KEY_SIGN_IN_CANCELLATIONS"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 823
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 824
    return-void
.end method

.method resolveConnectionResult()V
    .locals 3

    .prologue
    .line 889
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z

    if-eqz v0, :cond_0

    .line 890
    const-string v0, "We\'re already expecting the result of a previous resolution."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 920
    :goto_0
    return-void

    .line 894
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 895
    const-string v0, "No need to resolve issue, activity does not exist anymore"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_0

    .line 898
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "resolveConnectionResult: trying to resolve result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 900
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 902
    const-string v0, "Result has resolution. Starting it."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 906
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z

    .line 907
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    const/16 v2, 0x2329

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 909
    :catch_0
    move-exception v0

    .line 911
    const-string v0, "SendIntentException, so connecting again."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 912
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V

    goto :goto_0

    .line 917
    :cond_2
    const-string v0, "resolveConnectionResult: result has no resolution. Giving up."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 918
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->giveUp(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;)V

    goto :goto_0
.end method

.method public setAppStateApiOptions(Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;)V
    .locals 0

    .prologue
    .line 258
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->doApiOptionsPreCheck()V

    .line 259
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppStateApiOptions:Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;

    .line 260
    return-void
.end method

.method public setConnectOnStart(Z)V
    .locals 2

    .prologue
    .line 1104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Forcing mConnectOnStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 1105
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 1106
    return-void
.end method

.method public setGamesApiOptions(Lcom/google/android/gms/games/Games$GamesOptions;)V
    .locals 0

    .prologue
    .line 249
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->doApiOptionsPreCheck()V

    .line 250
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

    .line 251
    return-void
.end method

.method public setMaxAutoSignInAttempts(I)V
    .locals 0

    .prologue
    .line 221
    iput p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I

    .line 222
    return-void
.end method

.method public setPlusApiOptions(Lcom/google/android/gms/plus/Plus$PlusOptions;)V
    .locals 0

    .prologue
    .line 267
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->doApiOptionsPreCheck()V

    .line 268
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

    .line 269
    return-void
.end method

.method public setShowErrorDialogs(Z)V
    .locals 0

    .prologue
    .line 386
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mShowErrorDialogs:Z

    .line 387
    return-void
.end method

.method public setup(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;)V
    .locals 2

    .prologue
    .line 327
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z

    if-eqz v0, :cond_0

    .line 328
    const-string v0, "GameHelper: you cannot call GameHelper.setup() more than once!"

    .line 329
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V

    .line 330
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 332
    :cond_0
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;

    .line 333
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setup: requested clients: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    if-nez v0, :cond_1

    .line 337
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->createApiClientBuilder()Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 340
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->setViewForPopups(Landroid/view/View;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 341
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 342
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 343
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z

    .line 344
    return-void
.end method

.method public showFailureDialog()V
    .locals 3

    .prologue
    .line 966
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    if-eqz v0, :cond_0

    .line 967
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->getServiceErrorCode()I

    move-result v0

    .line 968
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->getActivityResultCode()I

    move-result v1

    .line 970
    iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mShowErrorDialogs:Z

    if-eqz v2, :cond_1

    .line 971
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-static {v2, v1, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->showFailureDialog(Landroid/app/Activity;II)V

    .line 977
    :cond_0
    :goto_0
    return-void

    .line 973
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not showing error dialog because mShowErrorDialogs==false. Error was: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public signOut()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 547
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 549
    const-string v0, "signOut: was already disconnected, ignoring."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 550
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListenerOfSignOut()V

    .line 573
    :goto_0
    return-void

    .line 556
    :cond_0
    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 557
    const-string v0, "Clearing default account on PlusClient."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 558
    sget-object v0, Lcom/google/android/gms/plus/Plus;->AccountApi:Lcom/google/android/gms/plus/Account;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1}, Lcom/google/android/gms/plus/Account;->clearDefaultAccount(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    .line 563
    :cond_1
    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    .line 564
    const-string v0, "Signing out from the Google API Client."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 565
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-static {v0}, Lcom/google/android/gms/games/Games;->signOut(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    .line 569
    :cond_2
    const-string v0, "Disconnecting client."

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 570
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 571
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 572
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    goto :goto_0
.end method

.method succeedSignIn()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 786
    const-string v0, "succeedSignIn"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 787
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    .line 788
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z

    .line 789
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z

    .line 790
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z

    .line 791
    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    .line 792
    return-void
.end method
