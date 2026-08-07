package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 4 methods.

class DataLayer_a {
    public val JO: String
    public val wq: Object

    constructor(p0: String, p1: Object)

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/tagmanager/DataLayer$a;
    //         if-nez v1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/tagmanager/DataLayer$a;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer$a;->JO:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/tagmanager/DataLayer$a;->JO:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer$a;->wq:Ljava/lang/Object;
    //         iget-object v2, p1, Lcom/google/android/gms/tagmanager/DataLayer$a;->wq:Ljava/lang/Object;
    //         invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Integer;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/DataLayer$a;->JO:Ljava/lang/String;
    //         invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/DataLayer$a;->wq:Ljava/lang/Object;
    //         invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Key: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer$a;->JO:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " value: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer$a;->wq:Ljava/lang/Object;
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
