package com.google.android.gms.security

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class ProviderInstaller {
    public constructor()

    companion object {
    @JvmField public val PROVIDER_NAME: String = "GmsCore_OpenSSL"
    private var anK: java.lang.reflect.Method
    private val uf: Object = null!!

    private @JvmStatic fun V(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/ClassNotFoundException;,
    //                 Ljava/lang/NoSuchMethodException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         const-string v1, "com.google.android.gms.common.security.ProviderInstallerImpl"
    //         invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         const-class v3, Landroid/content/Context;
    //         aput-object v3, v1, v2
    //         const-string v2, "insertProvider"
    //         invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         sput-object v0, Lcom/google/android/gms/security/ProviderInstaller;->anK:Ljava/lang/reflect/Method;
    //         return-void
    */

    public @JvmStatic fun installIfNeeded(context: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 6
    //         const/16 v2, 0x8
    //         const-string v0, "Context must not be null"
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->D(Landroid/content/Context;)V
    //         invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getRemoteContext(Landroid/content/Context;)Landroid/content/Context;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "ProviderInstaller"
    //         const-string v1, "Failed to get remote context"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V
    //         throw v0
    //         :cond_0
    //         sget-object v1, Lcom/google/android/gms/security/ProviderInstaller;->uf:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v2, Lcom/google/android/gms/security/ProviderInstaller;->anK:Ljava/lang/reflect/Method;
    //         if-nez v2, :cond_1
    //         invoke-static {v0}, Lcom/google/android/gms/security/ProviderInstaller;->V(Landroid/content/Context;)V
    //         :cond_1
    //         sget-object v2, Lcom/google/android/gms/security/ProviderInstaller;->anK:Ljava/lang/reflect/Method;
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         aput-object v0, v4, v5
    //         invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         monitor-exit v1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "ProviderInstaller"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Failed to install provider: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
    //         const/16 v2, 0x8
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun installIfNeededAsync(context: android.content.Context, listener: com.google.android.gms.security.ProviderInstaller.ProviderInstallListener) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Context must not be null"
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "Listener must not be null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "Must be called on the UI thread"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         new-instance v0, Lcom/google/android/gms/security/ProviderInstaller$1;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/security/ProviderInstaller$1;-><init>(Landroid/content/Context;Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;)V
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/Void;
    //         invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    }
}
