package com.sec.android.iap.lib

// Auto-emitted from smali source: ResourceUtility.java.
// 1 fields, 3 methods.

open class ResourceUtility {
    public constructor()

    companion object {
    @JvmField public var mContext: android.app.Activity

    public @JvmStatic fun getResId(className: String, resourceName: String): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         .local v1, "id":I
    //         :try_start_0
    //         sget-object v2, Lcom/sec/android/iap/lib/ResourceUtility;->mContext:Landroid/app/Activity;
    //         invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         sget-object v3, Lcom/sec/android/iap/lib/ResourceUtility;->mContext:Landroid/app/Activity;
    //         invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, p1, p0, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/IllegalArgumentException;
    //         invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    //         goto :goto_0
    //         .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    //         :catch_1
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/SecurityException;
    //         invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
    //         goto :goto_0
    */

    public @JvmStatic fun getResourceDeclareStyleableIntArray(name: String): IntArray { return TODO("body: (Ljava/lang/String;)[I") }
    /*
    //         .locals 7
    //         const/4 v3, 0x0
    //         :try_start_0
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         sget-object v5, Lcom/sec/android/iap/lib/ResourceUtility;->mContext:Landroid/app/Activity;
    //         invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v5, ".R$styleable"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
    //         move-result-object v1
    //         .local v1, "fields2":[Ljava/lang/reflect/Field;
    //         array-length v5, v1
    //         const/4 v4, 0x0
    //         :goto_0
    //         if-lt v4, v5, :cond_0
    //         .end local v1    # "fields2":[Ljava/lang/reflect/Field;
    //         :goto_1
    //         move-object v2, v3
    //         :goto_2
    //         return-object v2
    //         .restart local v1    # "fields2":[Ljava/lang/reflect/Field;
    //         :cond_0
    //         aget-object v0, v1, v4
    //         .local v0, "f":Ljava/lang/reflect/Field;
    //         invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v6, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v6
    //         if-eqz v6, :cond_1
    //         const/4 v4, 0x0
    //         invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, [I
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         .local v2, "ret":[I
    //         goto :goto_2
    //         .end local v2    # "ret":[I
    //         :cond_1
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_0
    //         .end local v0    # "f":Ljava/lang/reflect/Field;
    //         .end local v1    # "fields2":[Ljava/lang/reflect/Field;
    //         :catch_0
    //         move-exception v4
    //         goto :goto_1
    */

    }
}
