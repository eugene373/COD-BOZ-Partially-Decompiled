package com.google.android.gms.appstate

// Auto-emitted from smali.
// 0 fields, 12 methods.

class b: com.google.android.gms.common.data.d(), com.google.android.gms.appstate.AppState {
    constructor(p0: com.google.android.gms.common.data.DataHolder, p1: Int)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/appstate/a;->a(Lcom/google/android/gms/appstate/AppState;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun fo(): com.google.android.gms.appstate.AppState { return TODO("body: ()Lcom/google/android/gms/appstate/AppState;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/appstate/a;-><init>(Lcom/google/android/gms/appstate/AppState;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/appstate/b;->fo()Lcom/google/android/gms/appstate/AppState;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getConflictData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "conflict_data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/appstate/b;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getConflictVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "conflict_version"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/appstate/b;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getKey(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "key"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/appstate/b;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getLocalData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "local_data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/appstate/b;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLocalVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "local_version"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/appstate/b;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hasConflict(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "conflict_version"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/appstate/b;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/a;->a(Lcom/google/android/gms/appstate/AppState;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/a;->b(Lcom/google/android/gms/appstate/AppState;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
