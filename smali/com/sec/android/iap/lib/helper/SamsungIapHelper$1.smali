.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;
.super Ljava/lang/Object;
.source "SamsungIapHelper.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->bindIapService(Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

.field private final synthetic val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;


# direct methods
.method constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iput-object p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;

    .line 310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3
    .param p1, "_name"    # Landroid/content/ComponentName;
    .param p2, "_service"    # Landroid/os/IBinder;

    .prologue
    const/4 v2, 0x0

    .line 329
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-static {p2}, Lcom/sec/android/iap/IAPConnector$Stub;->asInterface(Landroid/os/IBinder;)Lcom/sec/android/iap/IAPConnector;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$4(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/IAPConnector;)V

    .line 331
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-static {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$6(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Lcom/sec/android/iap/IAPConnector;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V

    .line 335
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;

    invoke-interface {v0, v2}, Lcom/sec/android/iap/lib/listener/OnIapBindListener;->onBindIapFinished(I)V

    .line 344
    :goto_0
    return-void

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-static {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V

    .line 341
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;

    .line 342
    const/4 v1, 0x2

    .line 341
    invoke-interface {v0, v1}, Lcom/sec/android/iap/lib/listener/OnIapBindListener;->onBindIapFinished(I)V

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3
    .param p1, "_name"    # Landroid/content/ComponentName;

    .prologue
    const/4 v2, 0x0

    .line 315
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IAP Service Disconnected..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V

    .line 318
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-static {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$4(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/IAPConnector;)V

    .line 319
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-static {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$5(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Landroid/content/ServiceConnection;)V

    .line 320
    return-void
.end method
