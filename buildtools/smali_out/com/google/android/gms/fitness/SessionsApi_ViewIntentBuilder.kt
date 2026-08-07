package com.google.android.gms.fitness

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class SessionsApi_ViewIntentBuilder {
    private var Ss: String
    private var St: com.google.android.gms.fitness.data.Session
    private var Su: Boolean
    private val mContext: android.content.Context

    public constructor(context: android.content.Context)

    private fun i(p0: android.content.Intent): android.content.Intent { return TODO("body: (Landroid/content/Intent;)Landroid/content/Intent;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_1
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
    //         iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
    //         new-instance v2, Landroid/content/ComponentName;
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         invoke-direct {v2, v3, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-object p1, v0
    //         goto :goto_0
    */

    public fun build(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->St:Lcom/google/android/gms/fitness/data/Session;
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Session must be set"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "vnd.google.fitness.VIEW"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->St:Lcom/google/android/gms/fitness/data/Session;
    //         invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Session;->getActivity()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/fitness/data/Session;->getMimeType(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->St:Lcom/google/android/gms/fitness/data/Session;
    //         const-string v2, "vnd.google.fitness.session"
    //         invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;Landroid/content/Intent;Ljava/lang/String;)V
    //         iget-boolean v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Su:Z
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->St:Lcom/google/android/gms/fitness/data/Session;
    //         invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Session;->getAppPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         :cond_0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->i(Landroid/content/Intent;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setPreferredApplication(packageName: String): com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;") }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->Su:Z
    //         return-object p0
    */

    public fun setSession(session: com.google.android.gms.fitness.data.Session): com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder { return TODO("body: (Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/SessionsApi$ViewIntentBuilder;->St:Lcom/google/android/gms/fitness/data/Session;
    //         return-object p0
    */

}
