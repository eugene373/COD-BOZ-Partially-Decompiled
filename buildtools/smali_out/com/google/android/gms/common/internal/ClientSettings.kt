package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 2 fields, 9 methods.

class ClientSettings {
    private val IL: android.view.View
    private val Ls: com.google.android.gms.common.internal.ClientSettings.ParcelableClientSettings

    public constructor(accountName: String, gravityForPopups: java.util.Collection, viewForPopups: Int, realClientPackageName: android.view.View, p4: String)

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->getAccountName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAccountNameOrDefault(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->getAccountNameOrDefault()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getGravityForPopups(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->getGravityForPopups()I
    //         move-result v0
    //         return v0
    */

    public fun getParcelableClientSettings(): com.google.android.gms.common.internal.ClientSettings.ParcelableClientSettings { return TODO("body: ()Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         return-object v0
    */

    public fun getRealClientPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->getRealClientPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getScopes(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->getScopes()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getScopesArray(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->Ls:Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->getScopes()Ljava/util/List;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/String;
    //         invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/String;
    //         return-object v0
    */

    public fun getViewForPopups(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings;->IL:Landroid/view/View;
    //         return-object v0
    */

}
