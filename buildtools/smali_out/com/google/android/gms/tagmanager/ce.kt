package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 5 fields, 8 methods.

open class ce {
    private var aoc: String
    private var aqe: com.google.android.gms.tagmanager.ce.a
    private var aqf: String
    private var aqg: String

    constructor()

    private fun cI(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "&"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         aget-object v0, v0, v1
    //         const-string v1, "="
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         aget-object v0, v0, v1
    //         return-object v0
    */

    private fun j(p0: android.net.Uri): String { return TODO("body: (Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "&gtm_debug=x"
    //         const-string v2, ""
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ce$a;->aqh:Lcom/google/android/gms/tagmanager/ce$a;
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/ce;->aqe:Lcom/google/android/gms/tagmanager/ce$a;
    //         iput-object v1, p0, Lcom/google/android/gms/tagmanager/ce;->aqf:Ljava/lang/String;
    //         iput-object v1, p0, Lcom/google/android/gms/tagmanager/ce;->aoc:Ljava/lang/String;
    //         iput-object v1, p0, Lcom/google/android/gms/tagmanager/ce;->aqg:Ljava/lang/String;
    //         return-void
    */

    fun getContainerId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/ce;->aoc:Ljava/lang/String;
    //         return-object v0
    */

    fun oK(): com.google.android.gms.tagmanager.ce.a { return TODO("body: ()Lcom/google/android/gms/tagmanager/ce$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/ce;->aqe:Lcom/google/android/gms/tagmanager/ce$a;
    //         return-object v0
    */

    fun oL(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/ce;->aqf:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    private var aqd: com.google.android.gms.tagmanager.ce

    @JvmStatic fun oJ(): com.google.android.gms.tagmanager.ce { return TODO("body: ()Lcom/google/android/gms/tagmanager/ce;") }
    /*
    //         .locals 2
    //         const-class v1, Lcom/google/android/gms/tagmanager/ce;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ce;->aqd:Lcom/google/android/gms/tagmanager/ce;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/ce;
    //         invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ce;-><init>()V
    //         sput-object v0, Lcom/google/android/gms/tagmanager/ce;->aqd:Lcom/google/android/gms/tagmanager/ce;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ce;->aqd:Lcom/google/android/gms/tagmanager/ce;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
