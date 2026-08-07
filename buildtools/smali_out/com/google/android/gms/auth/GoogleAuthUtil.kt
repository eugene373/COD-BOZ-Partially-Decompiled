package com.google.android.gms.auth

// Auto-emitted from smali.
// 14 fields, 18 methods.

class GoogleAuthUtil {
    private constructor()

    companion object {
    @JvmField public val CHANGE_TYPE_ACCOUNT_ADDED: Int = 0x1
    @JvmField public val CHANGE_TYPE_ACCOUNT_REMOVED: Int = 0x2
    @JvmField public val CHANGE_TYPE_ACCOUNT_RENAMED_FROM: Int = 0x3
    @JvmField public val CHANGE_TYPE_ACCOUNT_RENAMED_TO: Int = 0x4
    private val Dn: android.content.ComponentName = null!!
    private val Do: android.content.ComponentName = null!!
    private val Dp: android.content.Intent = null!!
    private val Dq: android.content.Intent = null!!
    @JvmField public val GOOGLE_ACCOUNT_TYPE: String = "com.google"
    @JvmField public val KEY_ANDROID_PACKAGE_NAME: String = null!!
    @JvmField public val KEY_CALLER_UID: String = null!!
    @JvmField public val KEY_REQUEST_ACTIONS: String = "request_visible_actions"
    @JvmField public val KEY_REQUEST_VISIBLE_ACTIVITIES: String = "request_visible_actions"
    @JvmField public val KEY_SUPPRESS_PROGRESS_SCREEN: String = "suppressProgressScreen"

    private @JvmStatic fun D(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/auth/GoogleAuthException;
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->D(Landroid/content/Context;)V
    //         :try_end_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/auth/GooglePlayServicesAvailabilityException;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/GooglePlayServicesRepairableException;->getConnectionStatusCode()I
    //         move-result v2
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/GooglePlayServicesRepairableException;->getMessage()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/GooglePlayServicesRepairableException;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/auth/GooglePlayServicesAvailabilityException;-><init>(ILjava/lang/String;Landroid/content/Intent;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/auth/GoogleAuthException;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    private @JvmStatic fun a(p0: android.content.Context, p1: String, p2: String, p3: android.os.Bundle): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lcom/google/android/gms/auth/UserRecoverableNotifiedException;,
    //                 Lcom/google/android/gms/auth/GoogleAuthException;
    //             }
    //         .end annotation
    //         if-nez p3, :cond_0
    //         new-instance p3, Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         :cond_0
    //         :try_start_0
    //         invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/auth/GoogleAuthUtil;->getToken(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/auth/GooglePlayServicesAvailabilityException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/auth/UserRecoverableAuthException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/auth/GooglePlayServicesAvailabilityException;->getConnectionStatusCode()I
    //         move-result v0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/auth/GoogleAuthUtil;->b(Landroid/content/Context;I)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/auth/GoogleAuthUtil$a;
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/auth/GoogleAuthUtil$a;-><init>(Landroid/content/Context;)V
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
    //         move-result-object v1
    //         const-wide/16 v2, 0x7530
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    //         :goto_0
    //         new-instance v0, Lcom/google/android/gms/auth/UserRecoverableNotifiedException;
    //         const-string v1, "User intervention required. Notification has been pushed."
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/auth/UserRecoverableNotifiedException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-static {v0, p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorNotification(ILandroid/content/Context;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         new-instance v0, Lcom/google/android/gms/auth/UserRecoverableNotifiedException;
    //         const-string v1, "User intervention required. Notification has been pushed."
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/auth/UserRecoverableNotifiedException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private @JvmStatic fun aw(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "NetworkError"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "ServiceUnavailable"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "Timeout"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun ax(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "BadAuthentication"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "CaptchaRequired"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "DeviceManagementRequiredOrSyncDisabled"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "NeedPermission"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "NeedsBrowser"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "UserCancel"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "AppDownloadRequired"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/if;->DT:Lcom/google/android/gms/internal/if;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/if;->ft()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/if;->DU:Lcom/google/android/gms/internal/if;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/if;->ft()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/if;->DV:Lcom/google/android/gms/internal/if;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/if;->ft()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/if;->DW:Lcom/google/android/gms/internal/if;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/if;->ft()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/if;->DX:Lcom/google/android/gms/internal/if;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/if;->ft()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/if;->DY:Lcom/google/android/gms/internal/if;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/if;->ft()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun b(p0: android.content.Context, p1: Int): Boolean { return TODO("body: (Landroid/content/Context;I)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         if-ne p1, v0, :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         :try_start_0
    //         const-string v2, "com.google.android.gms"
    //         const/16 v3, 0x2000
    //         invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //         move-result-object v1
    //         iget-boolean v1, v1, Landroid/content/pm/ApplicationInfo;->enabled:Z
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun clearToken(context: android.content.Context, token: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v1
    //         const-string v0, "Calling this from your main thread can lead to deadlock"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aU(Ljava/lang/String;)V
    //         invoke-static {v1}, Lcom/google/android/gms/auth/GoogleAuthUtil;->D(Landroid/content/Context;)V
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v2
    //         iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
    //         const-string v3, "clientPackageName"
    //         invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         sget-object v3, Lcom/google/android/gms/auth/GoogleAuthUtil;->KEY_ANDROID_PACKAGE_NAME:Ljava/lang/String;
    //         invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         sget-object v3, Lcom/google/android/gms/auth/GoogleAuthUtil;->KEY_ANDROID_PACKAGE_NAME:Ljava/lang/String;
    //         invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         new-instance v2, Lcom/google/android/gms/common/a;
    //         invoke-direct {v2}, Lcom/google/android/gms/common/a;-><init>()V
    //         sget-object v3, Lcom/google/android/gms/auth/GoogleAuthUtil;->Dp:Landroid/content/Intent;
    //         const/4 v4, 0x1
    //         invoke-virtual {v1, v3, v2, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         :try_start_0
    //         invoke-virtual {v2}, Lcom/google/android/gms/common/a;->fW()Landroid/os/IBinder;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/google/android/gms/internal/r$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //         move-result-object v3
    //         invoke-interface {v3, p1, v0}, Lcom/google/android/gms/internal/r;->a(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         sget-object v3, Lcom/google/android/gms/internal/if;->Ev:Ljava/lang/String;
    //         invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "booleanResult"
    //         invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/auth/GoogleAuthException;
    //         invoke-direct {v0, v3}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         const-string v3, "GoogleAuthUtil"
    //         const-string v4, "GMS remote exception "
    //         invoke-static {v3, v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v3, "remote exception"
    //         invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         return-void
    //         :catch_1
    //         move-exception v0
    //         :try_start_2
    //         new-instance v0, Lcom/google/android/gms/auth/GoogleAuthException;
    //         const-string v3, "Interrupted"
    //         invoke-direct {v0, v3}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :cond_2
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "Could not bind to service with the given context."
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun getAccountChangeEvents(ctx: android.content.Context, eventIndex: Int, accountName: String): java.util.List { return TODO("body: (Landroid/content/Context;ILjava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/auth/GoogleAuthException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const-string v0, "accountName must be provided"
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //         const-string v0, "Calling this from your main thread can lead to deadlock"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aU(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/auth/GoogleAuthUtil;->D(Landroid/content/Context;)V
    //         new-instance v2, Lcom/google/android/gms/common/a;
    //         invoke-direct {v2}, Lcom/google/android/gms/common/a;-><init>()V
    //         sget-object v0, Lcom/google/android/gms/auth/GoogleAuthUtil;->Dp:Landroid/content/Intent;
    //         const/4 v3, 0x1
    //         invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         invoke-virtual {v2}, Lcom/google/android/gms/common/a;->fW()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/r$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //         move-result-object v0
    //         new-instance v3, Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    //         invoke-direct {v3}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;-><init>()V
    //         invoke-virtual {v3, p2}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->setAccountName(Ljava/lang/String;)Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    //         move-result-object v3
    //         invoke-virtual {v3, p1}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->setEventIndex(I)Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    //         move-result-object v3
    //         invoke-interface {v0, v3}, Lcom/google/android/gms/internal/r;->a(Lcom/google/android/gms/auth/AccountChangeEventsRequest;)Lcom/google/android/gms/auth/AccountChangeEventsResponse;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/auth/AccountChangeEventsResponse;->getEvents()Ljava/util/List;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         const-string v3, "GoogleAuthUtil"
    //         const-string v4, "GMS remote exception "
    //         invoke-static {v3, v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v3, "remote exception"
    //         invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         throw v0
    //         :catch_1
    //         move-exception v0
    //         :try_start_2
    //         new-instance v0, Lcom/google/android/gms/auth/GoogleAuthException;
    //         const-string v3, "Interrupted"
    //         invoke-direct {v0, v3}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "Could not bind to service with the given context."
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun getAccountId(ctx: android.content.Context, accountName: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "accountName must be provided"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //         const-string v0, "Calling this from your main thread can lead to deadlock"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aU(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/auth/GoogleAuthUtil;->D(Landroid/content/Context;)V
    //         const-string v0, "^^_account_id_^^"
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         invoke-static {p0, p1, v0, v1}, Lcom/google/android/gms/auth/GoogleAuthUtil;->getToken(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getAppCert(context: android.content.Context, packageNameToCertify: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "spatula"
    //         return-object v0
    */

    public @JvmStatic fun getToken(context: android.content.Context, accountName: String, scope: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/auth/GoogleAuthUtil;->getToken(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getToken(context: android.content.Context, accountName: String, scope: String, extras: android.os.Bundle): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v2
    //         const-string v1, "Calling this from your main thread can lead to deadlock"
    //         invoke-static {v1}, Lcom/google/android/gms/common/internal/o;->aU(Ljava/lang/String;)V
    //         invoke-static {v2}, Lcom/google/android/gms/auth/GoogleAuthUtil;->D(Landroid/content/Context;)V
    //         if-nez p3, :cond_1
    //         new-instance p3, Landroid/os/Bundle;
    //         .end local p3    # "extras":Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         .restart local p3    # "extras":Landroid/os/Bundle;
    //         :goto_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v1
    //         iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
    //         const-string v3, "clientPackageName"
    //         invoke-virtual {p3, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         sget-object v3, Lcom/google/android/gms/auth/GoogleAuthUtil;->KEY_ANDROID_PACKAGE_NAME:Ljava/lang/String;
    //         invoke-virtual {p3, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         sget-object v3, Lcom/google/android/gms/auth/GoogleAuthUtil;->KEY_ANDROID_PACKAGE_NAME:Ljava/lang/String;
    //         invoke-virtual {p3, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         new-instance v3, Lcom/google/android/gms/common/a;
    //         invoke-direct {v3}, Lcom/google/android/gms/common/a;-><init>()V
    //         sget-object v1, Lcom/google/android/gms/auth/GoogleAuthUtil;->Dp:Landroid/content/Intent;
    //         const/4 v4, 0x1
    //         invoke-virtual {v2, v1, v3, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         :try_start_0
    //         invoke-virtual {v3}, Lcom/google/android/gms/common/a;->fW()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/r$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/r;
    //         move-result-object v1
    //         invoke-interface {v1, p1, p2, p3}, Lcom/google/android/gms/internal/r;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v1
    //         const-string v4, "authtoken"
    //         invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v5
    //         if-nez v5, :cond_2
    //         invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         return-object v4
    //         :cond_1
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         .end local p3    # "extras":Landroid/os/Bundle;
    //         .local v0, "extras":Landroid/os/Bundle;
    //         move-object p3, v0
    //         .end local v0    # "extras":Landroid/os/Bundle;
    //         .restart local p3    # "extras":Landroid/os/Bundle;
    //         goto :goto_0
    //         :cond_2
    //         :try_start_1
    //         const-string v4, "Error"
    //         invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         const-string v5, "userRecoveryIntent"
    //         invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Landroid/content/Intent;
    //         invoke-static {v4}, Lcom/google/android/gms/auth/GoogleAuthUtil;->ax(Ljava/lang/String;)Z
    //         move-result v5
    //         if-eqz v5, :cond_3
    //         new-instance v5, Lcom/google/android/gms/auth/UserRecoverableAuthException;
    //         invoke-direct {v5, v4, v1}, Lcom/google/android/gms/auth/UserRecoverableAuthException;-><init>(Ljava/lang/String;Landroid/content/Intent;)V
    //         throw v5
    //         :try_end_1
    //         .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :catch_0
    //         move-exception v1
    //         :try_start_2
    //         const-string v4, "GoogleAuthUtil"
    //         const-string v5, "GMS remote exception "
    //         invoke-static {v4, v5, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         new-instance v1, Ljava/io/IOException;
    //         const-string v4, "remote exception"
    //         invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :catchall_0
    //         move-exception v1
    //         invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         throw v1
    //         :cond_3
    //         :try_start_3
    //         invoke-static {v4}, Lcom/google/android/gms/auth/GoogleAuthUtil;->aw(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :try_end_3
    //         .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         :catch_1
    //         move-exception v1
    //         :try_start_4
    //         new-instance v1, Lcom/google/android/gms/auth/GoogleAuthException;
    //         const-string v4, "Interrupted"
    //         invoke-direct {v1, v4}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         :cond_4
    //         :try_start_5
    //         new-instance v1, Lcom/google/android/gms/auth/GoogleAuthException;
    //         invoke-direct {v1, v4}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :try_end_5
    //         .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         :cond_5
    //         new-instance v1, Ljava/io/IOException;
    //         const-string v2, "Could not bind to service with the given context."
    //         invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    public @JvmStatic fun getTokenWithNotification(context: android.content.Context, accountName: String, scope: String, extras: android.os.Bundle): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         if-nez p3, :cond_0
    //         new-instance p3, Landroid/os/Bundle;
    //         .end local p3    # "extras":Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         .restart local p3    # "extras":Landroid/os/Bundle;
    //         :cond_0
    //         const-string v0, "handle_notification"
    //         const/4 v1, 0x1
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/auth/GoogleAuthUtil;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getTokenWithNotification(context: android.content.Context, accountName: String, scope: String, extras: android.os.Bundle, callback: android.content.Intent): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Intent;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p4}, Lcom/google/android/gms/auth/GoogleAuthUtil;->h(Landroid/content/Intent;)V
    //         if-nez p3, :cond_0
    //         new-instance p3, Landroid/os/Bundle;
    //         .end local p3    # "extras":Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         .restart local p3    # "extras":Landroid/os/Bundle;
    //         :cond_0
    //         const-string v0, "callback_intent"
    //         invoke-virtual {p3, v0, p4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const-string v0, "handle_notification"
    //         const/4 v1, 0x1
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/auth/GoogleAuthUtil;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getTokenWithNotification(context: android.content.Context, accountName: String, scope: String, extras: android.os.Bundle, authority: String, syncBundle: android.os.Bundle): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Authority cannot be empty or null."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-nez p3, :cond_1
    //         new-instance p3, Landroid/os/Bundle;
    //         .end local p3    # "extras":Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         .restart local p3    # "extras":Landroid/os/Bundle;
    //         :cond_1
    //         if-nez p5, :cond_2
    //         new-instance p5, Landroid/os/Bundle;
    //         .end local p5    # "syncBundle":Landroid/os/Bundle;
    //         invoke-direct {p5}, Landroid/os/Bundle;-><init>()V
    //         .restart local p5    # "syncBundle":Landroid/os/Bundle;
    //         :cond_2
    //         invoke-static {p5}, Landroid/content/ContentResolver;->validateSyncExtrasBundle(Landroid/os/Bundle;)V
    //         const-string v0, "authority"
    //         invoke-virtual {p3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "sync_extras"
    //         invoke-virtual {p3, v0, p5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         const-string v0, "handle_notification"
    //         const/4 v1, 0x1
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/auth/GoogleAuthUtil;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun h(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Callback cannot be null."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         :try_start_0
    //         invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;
    //         :try_end_0
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Parameter callback contains invalid data. It must be serializable using toUri() and parseUri()."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun invalidateToken(context: android.content.Context, token: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;
    //         move-result-object v0
    //         const-string v1, "com.google"
    //         invoke-virtual {v0, v1, p1}, Landroid/accounts/AccountManager;->invalidateAuthToken(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    }
}
