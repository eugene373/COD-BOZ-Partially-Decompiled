package com.google.android.gms.plus

// Auto-emitted from smali.
// 2 fields, 4 methods.

class Plus_PlusOptions_Builder {
    var alb: String
    val alc: java.util.Set

    public constructor()

    public fun addActivityTypes(activityTypes: Array<String>): com.google.android.gms.plus.Plus.PlusOptions.Builder { return TODO("body: ([Ljava/lang/String;)Lcom/google/android/gms/plus/Plus$PlusOptions$Builder;") }
    /*
    //         .locals 3
    //         const-string v0, "activityTypes may not be null."
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v1, p1
    //         if-ge v0, v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/Plus$PlusOptions$Builder;->alc:Ljava/util/Set;
    //         aget-object v2, p1, v0
    //         invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun build(): com.google.android.gms.plus.Plus.PlusOptions { return TODO("body: ()Lcom/google/android/gms/plus/Plus$PlusOptions;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/plus/Plus$PlusOptions;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/plus/Plus$PlusOptions;-><init>(Lcom/google/android/gms/plus/Plus$PlusOptions$Builder;Lcom/google/android/gms/plus/Plus$1;)V
    //         return-object v0
    */

    public fun setServerClientId(clientId: String): com.google.android.gms.plus.Plus.PlusOptions.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/plus/Plus$PlusOptions$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/plus/Plus$PlusOptions$Builder;->alb:Ljava/lang/String;
    //         return-object p0
    */

}
