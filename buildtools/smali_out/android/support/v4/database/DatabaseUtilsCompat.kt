package android.support.v4.database

// Auto-emitted from smali source: DatabaseUtilsCompat.java.
// 0 fields, 3 methods.

open class DatabaseUtilsCompat {
    private constructor()

    companion object {
    public @JvmStatic fun appendSelectionArgs(originalValues: Array<String>, newValues: Array<String>): Array<String> { return TODO("body: ([Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         if-eqz p0, :cond_0
    //         array-length v1, p0
    //         if-nez v1, :cond_1
    //         :cond_0
    //         move-object v0, p1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         array-length v1, p0
    //         array-length v2, p1
    //         add-int/2addr v1, v2
    //         new-array v0, v1, [Ljava/lang/String;
    //         .local v0, "result":[Ljava/lang/String;
    //         array-length v1, p0
    //         invoke-static {p0, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         array-length v1, p0
    //         array-length v2, p1
    //         invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         goto :goto_0
    */

    public @JvmStatic fun concatenateWhere(a: String, b: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         .end local p1    # "b":Ljava/lang/String;
    //         :goto_0
    //         return-object p1
    //         .restart local p1    # "b":Ljava/lang/String;
    //         :cond_0
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         move-object p1, p0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ") AND ("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p1
    //         goto :goto_0
    */

    }
}
