package com.google.android.gms.common.data

// Auto-emitted from smali.
// 13 fields, 32 methods.

class DataHolder: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val HF: Int
    private val Kb: Array<String>
    var Kc: android.os.Bundle
    private val Kd: Array<android.database.CursorWindow>
    private val Ke: android.os.Bundle
    var Kf: IntArray
    var Kg: Int
    private var Kh: Object
    private var Ki: Boolean
    var mClosed: Boolean

    constructor(versionCode: Int, columns: Array<String>, windows: Array<android.database.CursorWindow>, statusCode: Int, metadata: android.os.Bundle)

    private constructor(builder: com.google.android.gms.common.data.DataHolder.a, statusCode: Int, metadata: android.os.Bundle)

    public constructor(columns: Array<String>, windows: Array<android.database.CursorWindow>, statusCode: Int, metadata: android.os.Bundle)

    private fun g(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No such column: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Buffer is closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         if-ltz p2, :cond_3
    //         iget v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kg:I
    //         if-lt p2, v0, :cond_4
    //         :cond_3
    //         new-instance v0, Landroid/database/CursorIndexOutOfBoundsException;
    //         iget v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kg:I
    //         invoke-direct {v0, p2, v1}, Landroid/database/CursorIndexOutOfBoundsException;-><init>(II)V
    //         throw v0
    //         :cond_4
    //         return-void
    */

    public fun a(p0: String, p1: Int, p2: Int): Long { return TODO("body: (Ljava/lang/String;II)J") }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->getLong(II)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun a(p0: String, p1: Int, p2: Int, p3: android.database.CharArrayBuffer) { /* TODO(body): (Ljava/lang/String;IILandroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1, p4}, Landroid/database/CursorWindow;->copyStringToBuffer(IILandroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun aQ(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun ar(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         if-ltz p1, :cond_2
    //         iget v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kg:I
    //         if-ge p1, v0, :cond_2
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->I(Z)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kf:[I
    //         array-length v0, v0
    //         if-ge v1, v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kf:[I
    //         aget v0, v0, v1
    //         if-ge p1, v0, :cond_3
    //         add-int/lit8 v1, v1, -0x1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kf:[I
    //         array-length v0, v0
    //         if-ne v1, v0, :cond_1
    //         add-int/lit8 v1, v1, -0x1
    //         :cond_1
    //         return v1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    */

    public fun b(p0: String, p1: Int, p2: Int): Int { return TODO("body: (Ljava/lang/String;II)I") }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->getInt(II)I
    //         move-result v0
    //         return v0
    */

    public fun c(p0: String, p1: Int, p2: Int): String { return TODO("body: (Ljava/lang/String;II)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->getString(II)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         monitor-enter p0
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/data/DataHolder;->mClosed:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/data/DataHolder;->mClosed:Z
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         array-length v1, v1
    //         if-ge v0, v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v1, v1, v0
    //         invoke-virtual {v1}, Landroid/database/CursorWindow;->close()V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         monitor-exit p0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun d(p0: String, p1: Int, p2: Int): Boolean { return TODO("body: (Ljava/lang/String;II)Z") }
    /*
    //         .locals 4
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->getLong(II)J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         const-wide/16 v2, 0x1
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun e(p0: String, p1: Int, p2: Int): Float { return TODO("body: (Ljava/lang/String;II)F") }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->getFloat(II)F
    //         move-result v0
    //         return v0
    */

    public fun e(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kh:Ljava/lang/Object;
    //         return-void
    */

    public fun f(p0: String, p1: Int, p2: Int): ByteArray { return TODO("body: (Ljava/lang/String;II)[B") }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->getBlob(II)[B
    //         move-result-object v0
    //         return-object v0
    */

    protected fun finalize() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Throwable;
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Ki:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         array-length v0, v0
    //         if-lez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kh:Ljava/lang/Object;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "internal object: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         const-string v1, "DataBuffer"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. ("
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ")"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->close()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-super {p0}, Ljava/lang/Object;->finalize()V
    //         return-void
    //         :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kh:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-super {p0}, Ljava/lang/Object;->finalize()V
    //         throw v0
    */

    public fun g(p0: String, p1: Int, p2: Int): android.net.Uri { return TODO("body: (Ljava/lang/String;II)Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun gA() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         move v0, v1
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/DataHolder;->Kb:[Ljava/lang/String;
    //         array-length v2, v2
    //         if-ge v0, v2, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         iget-object v3, p0, Lcom/google/android/gms/common/data/DataHolder;->Kb:[Ljava/lang/String;
    //         aget-object v3, v3, v0
    //         invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         array-length v0, v0
    //         new-array v0, v0, [I
    //         iput-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kf:[I
    //         move v0, v1
    //         :goto_1
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         array-length v2, v2
    //         if-ge v1, v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/DataHolder;->Kf:[I
    //         aput v0, v2, v1
    //         iget-object v2, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v2, v2, v1
    //         invoke-virtual {v2}, Landroid/database/CursorWindow;->getStartPosition()I
    //         move-result v2
    //         sub-int v2, v0, v2
    //         iget-object v3, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v3, v3, v1
    //         invoke-virtual {v3}, Landroid/database/CursorWindow;->getNumRows()I
    //         move-result v3
    //         sub-int v2, v3, v2
    //         add-int/2addr v0, v2
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_1
    //         iput v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kg:I
    //         return-void
    */

    fun gB(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kb:[Ljava/lang/String;
    //         return-object v0
    */

    fun gC(): Array<android.database.CursorWindow> { return TODO("body: ()[Landroid/database/CursorWindow;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         return-object v0
    */

    public fun getCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kg:I
    //         return v0
    */

    public fun getStatusCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/data/DataHolder;->HF:I
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/data/DataHolder;->BR:I
    //         return v0
    */

    public fun gy(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Ke:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun h(p0: String, p1: Int, p2: Int): Boolean { return TODO("body: (Ljava/lang/String;II)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->g(Ljava/lang/String;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataHolder;->Kd:[Landroid/database/CursorWindow;
    //         aget-object v0, v0, p3
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/DataHolder;->Kc:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, p2, v1}, Landroid/database/CursorWindow;->isNull(II)Z
    //         move-result v0
    //         return v0
    */

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         monitor-enter p0
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/data/DataHolder;->mClosed:Z
    //         monitor-exit p0
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/data/f;->a(Lcom/google/android/gms/common/data/DataHolder;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.common.data.f = null!!
    private val Kj: com.google.android.gms.common.data.DataHolder.a = null!!

    public @JvmStatic fun a(p0: Int, p1: android.os.Bundle): com.google.android.gms.common.data.DataHolder { return TODO("body: (ILandroid/os/Bundle;)Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/common/data/DataHolder;
    //         sget-object v1, Lcom/google/android/gms/common/data/DataHolder;->Kj:Lcom/google/android/gms/common/data/DataHolder$a;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/common/data/DataHolder;-><init>(Lcom/google/android/gms/common/data/DataHolder$a;ILandroid/os/Bundle;)V
    //         return-object v0
    */

    private @JvmStatic fun a(p0: com.google.android.gms.common.data.DataHolder.a, p1: Int): Array<android.database.CursorWindow> { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder$a;I)[Landroid/database/CursorWindow;") }
    /*
    //         .locals 12
    //         const/4 v4, 0x0
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->a(Lcom/google/android/gms/common/data/DataHolder$a;)[Ljava/lang/String;
    //         move-result-object v0
    //         array-length v0, v0
    //         if-nez v0, :cond_0
    //         new-array v0, v4, [Landroid/database/CursorWindow;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-ltz p1, :cond_1
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->b(Lcom/google/android/gms/common/data/DataHolder$a;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-lt p1, v0, :cond_2
    //         :cond_1
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->b(Lcom/google/android/gms/common/data/DataHolder$a;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         move-object v2, v0
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v10
    //         new-instance v5, Landroid/database/CursorWindow;
    //         invoke-direct {v5, v4}, Landroid/database/CursorWindow;-><init>(Z)V
    //         new-instance v11, Ljava/util/ArrayList;
    //         invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->a(Lcom/google/android/gms/common/data/DataHolder$a;)[Ljava/lang/String;
    //         move-result-object v0
    //         array-length v0, v0
    //         invoke-virtual {v5, v0}, Landroid/database/CursorWindow;->setNumColumns(I)Z
    //         move v3, v4
    //         move v0, v4
    //         :goto_2
    //         if-ge v3, v10, :cond_10
    //         :try_start_0
    //         invoke-virtual {v5}, Landroid/database/CursorWindow;->allocRow()Z
    //         move-result v1
    //         if-nez v1, :cond_11
    //         const-string v0, "DataHolder"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Allocating additional cursor window for large data set (row "
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v5, ")"
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v5, Landroid/database/CursorWindow;
    //         const/4 v0, 0x0
    //         invoke-direct {v5, v0}, Landroid/database/CursorWindow;-><init>(Z)V
    //         invoke-virtual {v5, v3}, Landroid/database/CursorWindow;->setStartPosition(I)V
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->a(Lcom/google/android/gms/common/data/DataHolder$a;)[Ljava/lang/String;
    //         move-result-object v0
    //         array-length v0, v0
    //         invoke-virtual {v5, v0}, Landroid/database/CursorWindow;->setNumColumns(I)Z
    //         invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {v5}, Landroid/database/CursorWindow;->allocRow()Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         const-string v0, "DataHolder"
    //         const-string v1, "Unable to allocate row to hold data."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         new-array v0, v0, [Landroid/database/CursorWindow;
    //         invoke-virtual {v11, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Landroid/database/CursorWindow;
    //         :try_end_0
    //         .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto/16 :goto_0
    //         :cond_2
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->b(Lcom/google/android/gms/common/data/DataHolder$a;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {v0, v4, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;
    //         move-result-object v0
    //         move-object v2, v0
    //         goto :goto_1
    //         :cond_3
    //         move v9, v4
    //         :goto_3
    //         :try_start_1
    //         invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         const/4 v1, 0x1
    //         move v8, v4
    //         :goto_4
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->a(Lcom/google/android/gms/common/data/DataHolder$a;)[Ljava/lang/String;
    //         move-result-object v6
    //         array-length v6, v6
    //         if-ge v8, v6, :cond_d
    //         if-eqz v1, :cond_d
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->a(Lcom/google/android/gms/common/data/DataHolder$a;)[Ljava/lang/String;
    //         move-result-object v1
    //         aget-object v6, v1, v8
    //         invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_4
    //         invoke-virtual {v5, v9, v8}, Landroid/database/CursorWindow;->putNull(II)Z
    //         move-result v1
    //         :goto_5
    //         add-int/lit8 v6, v8, 0x1
    //         move v8, v6
    //         goto :goto_4
    //         :cond_4
    //         instance-of v7, v1, Ljava/lang/String;
    //         if-eqz v7, :cond_5
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v5, v1, v9, v8}, Landroid/database/CursorWindow;->putString(Ljava/lang/String;II)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_5
    //         instance-of v7, v1, Ljava/lang/Long;
    //         if-eqz v7, :cond_6
    //         check-cast v1, Ljava/lang/Long;
    //         invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v6
    //         invoke-virtual {v5, v6, v7, v9, v8}, Landroid/database/CursorWindow;->putLong(JII)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_6
    //         instance-of v7, v1, Ljava/lang/Integer;
    //         if-eqz v7, :cond_7
    //         check-cast v1, Ljava/lang/Integer;
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v1
    //         int-to-long v6, v1
    //         invoke-virtual {v5, v6, v7, v9, v8}, Landroid/database/CursorWindow;->putLong(JII)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_7
    //         instance-of v7, v1, Ljava/lang/Boolean;
    //         if-eqz v7, :cond_9
    //         check-cast v1, Ljava/lang/Boolean;
    //         invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v1
    //         if-eqz v1, :cond_8
    //         const-wide/16 v6, 0x1
    //         :goto_6
    //         invoke-virtual {v5, v6, v7, v9, v8}, Landroid/database/CursorWindow;->putLong(JII)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_8
    //         const-wide/16 v6, 0x0
    //         goto :goto_6
    //         :cond_9
    //         instance-of v7, v1, [B
    //         if-eqz v7, :cond_a
    //         check-cast v1, [B
    //         check-cast v1, [B
    //         invoke-virtual {v5, v1, v9, v8}, Landroid/database/CursorWindow;->putBlob([BII)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_a
    //         instance-of v7, v1, Ljava/lang/Double;
    //         if-eqz v7, :cond_b
    //         check-cast v1, Ljava/lang/Double;
    //         invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v6
    //         invoke-virtual {v5, v6, v7, v9, v8}, Landroid/database/CursorWindow;->putDouble(DII)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_b
    //         instance-of v7, v1, Ljava/lang/Float;
    //         if-eqz v7, :cond_c
    //         check-cast v1, Ljava/lang/Float;
    //         invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
    //         move-result v1
    //         float-to-double v6, v1
    //         invoke-virtual {v5, v6, v7, v9, v8}, Landroid/database/CursorWindow;->putDouble(DII)Z
    //         move-result v1
    //         goto :goto_5
    //         :cond_c
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unsupported object for column "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ": "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_1
    //         .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v0
    //         invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         :goto_7
    //         if-ge v4, v2, :cond_f
    //         invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/database/CursorWindow;
    //         invoke-virtual {v0}, Landroid/database/CursorWindow;->close()V
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_7
    //         :cond_d
    //         if-nez v1, :cond_e
    //         :try_start_2
    //         const-string v0, "DataHolder"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Couldn\'t populate window data for row "
    //         invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v6, " - allocating new window."
    //         invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v5}, Landroid/database/CursorWindow;->freeLastRow()V
    //         new-instance v1, Landroid/database/CursorWindow;
    //         const/4 v0, 0x0
    //         invoke-direct {v1, v0}, Landroid/database/CursorWindow;-><init>(Z)V
    //         invoke-static {p0}, Lcom/google/android/gms/common/data/DataHolder$a;->a(Lcom/google/android/gms/common/data/DataHolder$a;)[Ljava/lang/String;
    //         move-result-object v0
    //         array-length v0, v0
    //         invoke-virtual {v1, v0}, Landroid/database/CursorWindow;->setNumColumns(I)Z
    //         invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :try_end_2
    //         .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    //         add-int/lit8 v0, v3, -0x1
    //         move-object v3, v1
    //         move v1, v4
    //         :goto_8
    //         add-int/lit8 v0, v0, 0x1
    //         move-object v5, v3
    //         move v3, v0
    //         move v0, v1
    //         goto/16 :goto_2
    //         :cond_e
    //         add-int/lit8 v0, v9, 0x1
    //         move v1, v0
    //         move v0, v3
    //         move-object v3, v5
    //         goto :goto_8
    //         :cond_f
    //         throw v1
    //         :cond_10
    //         invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         new-array v0, v0, [Landroid/database/CursorWindow;
    //         invoke-virtual {v11, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Landroid/database/CursorWindow;
    //         goto/16 :goto_0
    //         :cond_11
    //         move v9, v0
    //         goto/16 :goto_3
    */

    public @JvmStatic fun as(p0: Int): com.google.android.gms.common.data.DataHolder { return TODO("body: (I)Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/data/DataHolder;->a(ILandroid/os/Bundle;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
