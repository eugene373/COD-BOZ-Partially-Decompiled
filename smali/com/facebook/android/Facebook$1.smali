.class Lcom/facebook/android/Facebook$1;
.super Ljava/lang/Object;
.source "Facebook.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/android/Facebook;

.field final synthetic val$listener:Lcom/facebook/android/Facebook$DialogListener;


# direct methods
.method constructor <init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 0

    .prologue
    .line 300
    iput-object p1, p0, Lcom/facebook/android/Facebook$1;->this$0:Lcom/facebook/android/Facebook;

    iput-object p2, p0, Lcom/facebook/android/Facebook$1;->val$listener:Lcom/facebook/android/Facebook$DialogListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 2

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/android/Facebook$1;->this$0:Lcom/facebook/android/Facebook;

    iget-object v1, p0, Lcom/facebook/android/Facebook$1;->val$listener:Lcom/facebook/android/Facebook$DialogListener;

    invoke-static {v0, p1, p2, p3, v1}, Lcom/facebook/android/Facebook;->access$000(Lcom/facebook/android/Facebook;Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 305
    return-void
.end method
