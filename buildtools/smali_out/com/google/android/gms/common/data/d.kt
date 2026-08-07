package com.google.android.gms.common.data

// Auto-emitted from smali.
// 3 fields, 16 methods.

open class d {
    protected val II: com.google.android.gms.common.data.DataHolder
    protected var JX: Int
    private var JY: Int

    public constructor(p0: com.google.android.gms.common.data.DataHolder, p1: Int)

    protected fun a(p0: String, p1: android.database.CharArrayBuffer) { /* TODO(body): (Ljava/lang/String;Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2, p2}, Lcom/google/android/gms/common/data/DataHolder;->a(Ljava/lang/String;IILandroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun aQ(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->aQ(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    protected fun aR(p0: String): android.net.Uri { return TODO("body: (Ljava/lang/String;)Landroid/net/Uri;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;II)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun aS(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->h(Ljava/lang/String;II)Z
    //         move-result v0
    //         return v0
    */

    protected fun ap(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         if-ltz p1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->getCount()I
    //         move-result v0
    //         if-ge p1, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->I(Z)V
    //         iput p1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->ar(I)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/common/data/d;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/common/data/d;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget v1, p1, Lcom/google/android/gms/common/data/d;->JX:I
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget v1, p1, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p1, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         if-ne v1, v2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    protected fun getBoolean(column: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->d(Ljava/lang/String;II)Z
    //         move-result v0
    //         return v0
    */

    protected fun getByteArray(column: String): ByteArray { return TODO("body: (Ljava/lang/String;)[B") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->f(Ljava/lang/String;II)[B
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getFloat(column: String): Float { return TODO("body: (Ljava/lang/String;)F") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->e(Ljava/lang/String;II)F
    //         move-result v0
    //         return v0
    */

    protected fun getInteger(column: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->b(Ljava/lang/String;II)I
    //         move-result v0
    //         return v0
    */

    protected fun getLong(column: String): Long { return TODO("body: (Ljava/lang/String;)J") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->a(Ljava/lang/String;II)J
    //         move-result-wide v0
    //         return-wide v0
    */

    protected fun getString(column: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun gz(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JX:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/common/data/d;->JY:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/d;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
