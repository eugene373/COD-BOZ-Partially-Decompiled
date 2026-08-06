.class public Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/BaseImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallbackHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/Result;",
        ">",
        "Landroid/os/Handler;"
    }
.end annotation


# static fields
.field public static final CALLBACK_ON_COMPLETE:I = 0x1

.field public static final CALLBACK_ON_TIMEOUT:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0
    .param p1, "looper"    # Landroid/os/Looper;

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;, "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler<TR;>;"
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method protected deliverResultCallback(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/ResultCallback",
            "<TR;>;TR;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;, "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler<TR;>;"
    .local p1, "callback":Lcom/google/android/gms/common/api/ResultCallback;, "Lcom/google/android/gms/common/api/ResultCallback<TR;>;"
    .local p2, "result":Lcom/google/android/gms/common/api/Result;, "TR;"
    :try_start_0
    invoke-interface {p1, p2}, Lcom/google/android/gms/common/api/ResultCallback;->onResult(Lcom/google/android/gms/common/api/Result;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {p2}, Lcom/google/android/gms/common/api/BaseImplementation;->a(Lcom/google/android/gms/common/api/Result;)V

    throw v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;, "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler<TR;>;"
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "GoogleApi"

    const-string v1, "Don\'t know how to handle this message."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/api/ResultCallback;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/Result;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->deliverResultCallback(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;

    invoke-static {v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->a(Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public removeTimeoutMessages()V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->removeMessages(I)V

    return-void
.end method

.method public sendResultCallback(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/ResultCallback",
            "<TR;>;TR;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;, "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler<TR;>;"
    .local p1, "callback":Lcom/google/android/gms/common/api/ResultCallback;, "Lcom/google/android/gms/common/api/ResultCallback<TR;>;"
    .local p2, "result":Lcom/google/android/gms/common/api/Result;, "TR;"
    const/4 v0, 0x1

    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public sendTimeoutResultCallback(Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;J)V
    .locals 2
    .param p2, "millis"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult",
            "<TR;>;J)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;, "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler<TR;>;"
    .local p1, "pendingResult":Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;, "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult<TR;>;"
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method
