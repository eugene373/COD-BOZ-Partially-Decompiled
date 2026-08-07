package com.ideaworks3d.marmalade

// Auto-emitted from smali source: ResourceUtility.java.
// 0 fields, 4 methods.

open class ResourceUtility {
    public constructor()

    companion object {
    public @JvmStatic fun getResId(p0: String, p1: String): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {p0, p1, v0}, Lcom/ideaworks3d/marmalade/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getResId(p0: String, p1: String, p2: android.content.Context): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, p1, p0, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         goto :goto_0
    */

    public @JvmStatic fun getResourceDeclareStyleableIntArray(p0: String): IntArray { return TODO("body: (Ljava/lang/String;)[I") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         :try_start_0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ".R$styleable"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
    //         move-result-object v2
    //         array-length v3, v2
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v3, :cond_1
    //         aget-object v4, v2, v0
    //         invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-eqz v5, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [I
    //         check-cast v0, [I
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_1
    */

    }
}
