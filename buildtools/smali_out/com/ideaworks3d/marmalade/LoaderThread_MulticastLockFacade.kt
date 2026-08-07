package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderThread.java.
// 2 fields, 4 methods.

open class LoaderThread_MulticastLockFacade {
    private var m_multiCastLockReal: Object
    val this$0: com.ideaworks3d.marmalade.LoaderThread

    public constructor(p0: com.ideaworks3d.marmalade.LoaderThread, p1: android.net.wifi.WifiManager)

    public fun acquire() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         const-string v2, "acquire"
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Class;
    //         invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun isHeld(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         const-string v3, "isHeld"
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Class;
    //         invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Object;
    //         invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         const-string v2, "release"
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Class;
    //         invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->m_multiCastLockReal:Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

}
