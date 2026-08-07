package com.google.android.gms.auth.api

// Auto-emitted from smali.
// 4 fields, 8 methods.

class GoogleAuthApiClientImpl: com.google.android.gms.common.internal.e() {
    private val Dd: String
    private var Ds: Array<String>

    public constructor(context: android.content.Context, looper: android.os.Looper, settings: com.google.android.gms.common.internal.ClientSettings, connectedListener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, connectionFailedListener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, accountName: String, scopes: Array<String>)

    public constructor(context: android.content.Context, settings: com.google.android.gms.common.internal.ClientSettings, connectedListener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, connectionFailedListener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, accountName: String, scopes: Array<String>)

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v2, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->Dd:Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->gR()[Ljava/lang/String;
    //         move-result-object v5
    //         move-object v0, p1
    //         move-object v1, p2
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/common/internal/l;->b(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    //         return-void
    */

    protected fun createServiceInterface(iBinder: android.os.IBinder): com.google.android.gms.auth.api.IGoogleAuthService { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/IGoogleAuthService;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/auth/api/IGoogleAuthService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/IGoogleAuthService;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.auth.api.IGoogleAuthService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.auth.service.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->createServiceInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/IGoogleAuthService;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val ACTION_START_SERVICE: String = "com.google.android.gms.auth.service.START"
    @JvmField public val SERVICE_DESCRIPTOR: String = "com.google.android.gms.auth.api.IGoogleAuthService"
    }
}
