package com.google.android.gms.appstate

// Auto-emitted from smali.
// 6 fields, 16 methods.

class a: com.google.android.gms.appstate.AppState {
    private val CO: Int
    private val CP: String
    private val CQ: ByteArray
    private val CR: Boolean
    private val CS: String
    private val CT: ByteArray

    public constructor(p0: com.google.android.gms.appstate.AppState)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/appstate/a;->a(Lcom/google/android/gms/appstate/AppState;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun fo(): com.google.android.gms.appstate.AppState { return TODO("body: ()Lcom/google/android/gms/appstate/AppState;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/appstate/a;->fo()Lcom/google/android/gms/appstate/AppState;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getConflictData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/appstate/a;->CT:[B
    //         return-object v0
    */

    public fun getConflictVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/appstate/a;->CS:Ljava/lang/String;
    //         return-object v0
    */

    public fun getKey(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/appstate/a;->CO:I
    //         return v0
    */

    public fun getLocalData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/appstate/a;->CQ:[B
    //         return-object v0
    */

    public fun getLocalVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/appstate/a;->CP:Ljava/lang/String;
    //         return-object v0
    */

    public fun hasConflict(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/appstate/a;->CR:Z
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/a;->a(Lcom/google/android/gms/appstate/AppState;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/a;->b(Lcom/google/android/gms/appstate/AppState;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.appstate.AppState): Int { return TODO("body: (Lcom/google/android/gms/appstate/AppState;)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x6
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getKey()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getLocalVersion()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->hasConflict()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.appstate.AppState, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/appstate/AppState;Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/appstate/AppState;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/appstate/AppState;
    //         invoke-interface {p1}, Lcom/google/android/gms/appstate/AppState;->getKey()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getKey()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/appstate/AppState;->getLocalVersion()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getLocalVersion()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/appstate/AppState;->hasConflict()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->hasConflict()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    @JvmStatic fun b(p0: com.google.android.gms.appstate.AppState): String { return TODO("body: (Lcom/google/android/gms/appstate/AppState;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Key"
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getKey()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "LocalVersion"
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getLocalVersion()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "LocalData"
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HasConflict"
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->hasConflict()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ConflictVersion"
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ConflictData"
    //         invoke-interface {p0}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
