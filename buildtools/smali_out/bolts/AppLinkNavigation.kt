package bolts

// Auto-emitted from smali source: AppLinkNavigation.java.
// 10 fields, 19 methods.

open class AppLinkNavigation {
    private val appLink: bolts.AppLink
    private val appLinkData: android.os.Bundle
    private val extras: android.os.Bundle

    public constructor(appLink: bolts.AppLink, extras: android.os.Bundle, appLinkData: android.os.Bundle)

    private fun buildAppLinkDataForNavigation(context: android.content.Context): android.os.Bundle { return TODO("body: (Landroid/content/Context;)Landroid/os/Bundle;") }
    /*
    //         .locals 7
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         .local v1, "data":Landroid/os/Bundle;
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         .local v2, "refererAppLinkData":Landroid/os/Bundle;
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         .local v4, "refererAppPackage":Ljava/lang/String;
    //         if-eqz v4, :cond_0
    //         const-string v5, "package"
    //         invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v0
    //         .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    //         if-eqz v0, :cond_1
    //         iget v5, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I
    //         invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "refererAppName":Ljava/lang/String;
    //         if-eqz v3, :cond_1
    //         const-string v5, "app_name"
    //         invoke-virtual {v2, v5, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         .end local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    //         .end local v3    # "refererAppName":Ljava/lang/String;
    //         .end local v4    # "refererAppPackage":Ljava/lang/String;
    //         :cond_1
    //         invoke-virtual {p0}, Lbolts/AppLinkNavigation;->getAppLinkData()Landroid/os/Bundle;
    //         move-result-object v5
    //         invoke-virtual {v1, v5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         const-string v5, "target_url"
    //         invoke-virtual {p0}, Lbolts/AppLinkNavigation;->getAppLink()Lbolts/AppLink;
    //         move-result-object v6
    //         invoke-virtual {v6}, Lbolts/AppLink;->getSourceUrl()Landroid/net/Uri;
    //         move-result-object v6
    //         invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v5, "version"
    //         const-string v6, "1.0"
    //         invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v5, "user_agent"
    //         const-string v6, "Bolts Android 1.1.2"
    //         invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v5, "referer_app_link"
    //         invoke-virtual {v1, v5, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         const-string v5, "extras"
    //         invoke-virtual {p0}, Lbolts/AppLinkNavigation;->getExtras()Landroid/os/Bundle;
    //         move-result-object v6
    //         invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-object v1
    */

    private fun getJSONForBundle(bundle: android.os.Bundle): org.json.JSONObject { return TODO("body: (Landroid/os/Bundle;)Lorg/json/JSONObject;") }
    /*
    //         .locals 4
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    //         .local v2, "root":Lorg/json/JSONObject;
    //         invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         .local v0, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         .local v1, "key":Ljava/lang/String;
    //         invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-direct {p0, v3}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         .end local v1    # "key":Ljava/lang/String;
    //         :cond_0
    //         return-object v2
    */

    private fun getJSONValue(value: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 12
    //         instance-of v9, p1, Landroid/os/Bundle;
    //         if-eqz v9, :cond_1
    //         check-cast p1, Landroid/os/Bundle;
    //         .end local p1    # "value":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lbolts/AppLinkNavigation;->getJSONForBundle(Landroid/os/Bundle;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         return-object v1
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v9, p1, Ljava/lang/CharSequence;
    //         if-eqz v9, :cond_2
    //         invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_2
    //         instance-of v9, p1, Ljava/util/List;
    //         if-eqz v9, :cond_3
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .local v1, "array":Lorg/json/JSONArray;
    //         check-cast p1, Ljava/util/List;
    //         .end local p1    # "value":Ljava/lang/Object;
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         .local v5, "i$":Ljava/util/Iterator;
    //         :goto_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v9
    //         if-eqz v9, :cond_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v7
    //         .local v7, "listValue":Ljava/lang/Object;
    //         invoke-direct {p0, v7}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_1
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v5    # "i$":Ljava/util/Iterator;
    //         .end local v7    # "listValue":Ljava/lang/Object;
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_3
    //         instance-of v9, p1, Landroid/util/SparseArray;
    //         if-eqz v9, :cond_4
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         move-object v8, p1
    //         check-cast v8, Landroid/util/SparseArray;
    //         .local v8, "sparseValue":Landroid/util/SparseArray;, "Landroid/util/SparseArray<*>;"
    //         const/4 v4, 0x0
    //         .local v4, "i":I
    //         :goto_2
    //         invoke-virtual {v8}, Landroid/util/SparseArray;->size()I
    //         move-result v9
    //         if-ge v4, v9, :cond_0
    //         invoke-virtual {v8, v4}, Landroid/util/SparseArray;->keyAt(I)I
    //         move-result v9
    //         invoke-virtual {v8, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v10
    //         invoke-direct {p0, v10}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v10
    //         invoke-virtual {v1, v9, v10}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_2
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v4    # "i":I
    //         .end local v8    # "sparseValue":Landroid/util/SparseArray;, "Landroid/util/SparseArray<*>;"
    //         :cond_4
    //         instance-of v9, p1, Ljava/lang/Character;
    //         if-eqz v9, :cond_5
    //         invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_5
    //         instance-of v9, p1, Ljava/lang/Boolean;
    //         if-eqz v9, :cond_6
    //         move-object v1, p1
    //         goto :goto_0
    //         :cond_6
    //         instance-of v9, p1, Ljava/lang/Number;
    //         if-eqz v9, :cond_9
    //         instance-of v9, p1, Ljava/lang/Double;
    //         if-nez v9, :cond_7
    //         instance-of v9, p1, Ljava/lang/Float;
    //         if-eqz v9, :cond_8
    //         :cond_7
    //         check-cast p1, Ljava/lang/Number;
    //         .end local p1    # "value":Ljava/lang/Object;
    //         invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D
    //         move-result-wide v10
    //         invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v1
    //         goto :goto_0
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_8
    //         check-cast p1, Ljava/lang/Number;
    //         .end local p1    # "value":Ljava/lang/Object;
    //         invoke-virtual {p1}, Ljava/lang/Number;->longValue()J
    //         move-result-wide v10
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         goto :goto_0
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_9
    //         instance-of v9, p1, [Z
    //         if-eqz v9, :cond_a
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [Z
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [Z
    //         .local v0, "arr$":[Z
    //         array-length v6, v0
    //         .local v6, "len$":I
    //         const/4 v5, 0x0
    //         .local v5, "i$":I
    //         :goto_3
    //         if-ge v5, v6, :cond_0
    //         aget-boolean v2, v0, v5
    //         .local v2, "arrValue":Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_3
    //         .end local v0    # "arr$":[Z
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":Z
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_a
    //         instance-of v9, p1, [C
    //         if-eqz v9, :cond_b
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [C
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [C
    //         .local v0, "arr$":[C
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_4
    //         if-ge v5, v6, :cond_0
    //         aget-char v2, v0, v5
    //         .local v2, "arrValue":C
    //         invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_4
    //         .end local v0    # "arr$":[C
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":C
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_b
    //         instance-of v9, p1, [Ljava/lang/CharSequence;
    //         if-eqz v9, :cond_c
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [Ljava/lang/CharSequence;
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [Ljava/lang/CharSequence;
    //         .local v0, "arr$":[Ljava/lang/CharSequence;
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_5
    //         if-ge v5, v6, :cond_0
    //         aget-object v2, v0, v5
    //         .local v2, "arrValue":Ljava/lang/CharSequence;
    //         invoke-direct {p0, v2}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_5
    //         .end local v0    # "arr$":[Ljava/lang/CharSequence;
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":Ljava/lang/CharSequence;
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_c
    //         instance-of v9, p1, [D
    //         if-eqz v9, :cond_d
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [D
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [D
    //         .local v0, "arr$":[D
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_6
    //         if-ge v5, v6, :cond_0
    //         aget-wide v2, v0, v5
    //         .local v2, "arrValue":D
    //         invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_6
    //         .end local v0    # "arr$":[D
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":D
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_d
    //         instance-of v9, p1, [F
    //         if-eqz v9, :cond_e
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [F
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [F
    //         .local v0, "arr$":[F
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_7
    //         if-ge v5, v6, :cond_0
    //         aget v2, v0, v5
    //         .local v2, "arrValue":F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_7
    //         .end local v0    # "arr$":[F
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":F
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_e
    //         instance-of v9, p1, [I
    //         if-eqz v9, :cond_f
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [I
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [I
    //         .local v0, "arr$":[I
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_8
    //         if-ge v5, v6, :cond_0
    //         aget v2, v0, v5
    //         .local v2, "arrValue":I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_8
    //         .end local v0    # "arr$":[I
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":I
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_f
    //         instance-of v9, p1, [J
    //         if-eqz v9, :cond_10
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [J
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [J
    //         .local v0, "arr$":[J
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_9
    //         if-ge v5, v6, :cond_0
    //         aget-wide v2, v0, v5
    //         .local v2, "arrValue":J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_9
    //         .end local v0    # "arr$":[J
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":J
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_10
    //         instance-of v9, p1, [S
    //         if-eqz v9, :cond_11
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [S
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [S
    //         .local v0, "arr$":[S
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_a
    //         if-ge v5, v6, :cond_0
    //         aget-short v2, v0, v5
    //         .local v2, "arrValue":S
    //         invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;
    //         move-result-object v9
    //         invoke-direct {p0, v9}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_a
    //         .end local v0    # "arr$":[S
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":S
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_11
    //         instance-of v9, p1, [Ljava/lang/String;
    //         if-eqz v9, :cond_12
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         .restart local v1    # "array":Lorg/json/JSONArray;
    //         check-cast p1, [Ljava/lang/String;
    //         .end local p1    # "value":Ljava/lang/Object;
    //         move-object v0, p1
    //         check-cast v0, [Ljava/lang/String;
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v6, v0
    //         .restart local v6    # "len$":I
    //         const/4 v5, 0x0
    //         .restart local v5    # "i$":I
    //         :goto_b
    //         if-ge v5, v6, :cond_0
    //         aget-object v2, v0, v5
    //         .local v2, "arrValue":Ljava/lang/String;
    //         invoke-direct {p0, v2}, Lbolts/AppLinkNavigation;->getJSONValue(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_b
    //         .end local v0    # "arr$":[Ljava/lang/String;
    //         .end local v1    # "array":Lorg/json/JSONArray;
    //         .end local v2    # "arrValue":Ljava/lang/String;
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .restart local p1    # "value":Ljava/lang/Object;
    //         :cond_12
    //         const/4 v1, 0x0
    //         goto/16 :goto_0
    */

    private fun sendAppLinkNavigateEventBroadcast(context: android.content.Context, intent: android.content.Intent, type: bolts.AppLinkNavigation.NavigationResult, e: org.json.JSONException) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;Lbolts/AppLinkNavigation$NavigationResult;Lorg/json/JSONException;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         .local v0, "extraLoggingData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    //         if-eqz p4, :cond_0
    //         const-string v1, "error"
    //         invoke-virtual {p4}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         const-string v2, "success"
    //         invoke-virtual {p3}, Lbolts/AppLinkNavigation$NavigationResult;->isSucceeded()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const-string v1, "1"
    //         :goto_0
    //         invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v1, "type"
    //         invoke-virtual {p3}, Lbolts/AppLinkNavigation$NavigationResult;->getCode()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v1, "al_nav_out"
    //         invoke-static {p1, v1, p2, v0}, Lbolts/MeasurementEvent;->sendBroadcastEvent(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ljava/util/Map;)V
    //         return-void
    //         :cond_1
    //         const-string v1, "0"
    //         goto :goto_0
    */

    public fun getAppLink(): bolts.AppLink { return TODO("body: ()Lbolts/AppLink;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lbolts/AppLinkNavigation;->appLink:Lbolts/AppLink;
    //         return-object v0
    */

    public fun getAppLinkData(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lbolts/AppLinkNavigation;->appLinkData:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lbolts/AppLinkNavigation;->extras:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun navigate(context: android.content.Context): bolts.AppLinkNavigation.NavigationResult { return TODO("body: (Landroid/content/Context;)Lbolts/AppLinkNavigation$NavigationResult;") }
    /*
    //         .locals 17
    //         invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v8
    //         .local v8, "pm":Landroid/content/pm/PackageManager;
    //         invoke-direct/range {p0 .. p1}, Lbolts/AppLinkNavigation;->buildAppLinkDataForNavigation(Landroid/content/Context;)Landroid/os/Bundle;
    //         move-result-object v5
    //         .local v5, "finalAppLinkData":Landroid/os/Bundle;
    //         const/4 v4, 0x0
    //         .local v4, "eligibleTargetIntent":Landroid/content/Intent;
    //         invoke-virtual/range {p0 .. p0}, Lbolts/AppLinkNavigation;->getAppLink()Lbolts/AppLink;
    //         move-result-object v14
    //         invoke-virtual {v14}, Lbolts/AppLink;->getTargets()Ljava/util/List;
    //         move-result-object v14
    //         invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v6
    //         .local v6, "i$":Ljava/util/Iterator;
    //         :cond_0
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v14
    //         if-eqz v14, :cond_2
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v11
    //         check-cast v11, Lbolts/AppLink$Target;
    //         .local v11, "target":Lbolts/AppLink$Target;
    //         new-instance v12, Landroid/content/Intent;
    //         const-string v14, "android.intent.action.VIEW"
    //         invoke-direct {v12, v14}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         .local v12, "targetIntent":Landroid/content/Intent;
    //         invoke-virtual {v11}, Lbolts/AppLink$Target;->getUrl()Landroid/net/Uri;
    //         move-result-object v14
    //         if-eqz v14, :cond_5
    //         invoke-virtual {v11}, Lbolts/AppLink$Target;->getUrl()Landroid/net/Uri;
    //         move-result-object v14
    //         invoke-virtual {v12, v14}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         :goto_0
    //         invoke-virtual {v11}, Lbolts/AppLink$Target;->getPackageName()Ljava/lang/String;
    //         move-result-object v14
    //         invoke-virtual {v12, v14}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {v11}, Lbolts/AppLink$Target;->getClassName()Ljava/lang/String;
    //         move-result-object v14
    //         if-eqz v14, :cond_1
    //         invoke-virtual {v11}, Lbolts/AppLink$Target;->getPackageName()Ljava/lang/String;
    //         move-result-object v14
    //         invoke-virtual {v11}, Lbolts/AppLink$Target;->getClassName()Ljava/lang/String;
    //         move-result-object v15
    //         invoke-virtual {v12, v14, v15}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         :cond_1
    //         const-string v14, "al_applink_data"
    //         invoke-virtual {v12, v14, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         const/high16 v14, 0x10000
    //         invoke-virtual {v8, v12, v14}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v9
    //         .local v9, "resolved":Landroid/content/pm/ResolveInfo;
    //         if-eqz v9, :cond_0
    //         move-object v4, v12
    //         .end local v9    # "resolved":Landroid/content/pm/ResolveInfo;
    //         .end local v11    # "target":Lbolts/AppLink$Target;
    //         .end local v12    # "targetIntent":Landroid/content/Intent;
    //         :cond_2
    //         const/4 v7, 0x0
    //         .local v7, "outIntent":Landroid/content/Intent;
    //         sget-object v10, Lbolts/AppLinkNavigation$NavigationResult;->FAILED:Lbolts/AppLinkNavigation$NavigationResult;
    //         .local v10, "result":Lbolts/AppLinkNavigation$NavigationResult;
    //         if-eqz v4, :cond_6
    //         move-object v7, v4
    //         sget-object v10, Lbolts/AppLinkNavigation$NavigationResult;->APP:Lbolts/AppLinkNavigation$NavigationResult;
    //         :cond_3
    //         :goto_1
    //         const/4 v14, 0x0
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p1
    //         invoke-direct {v0, v1, v7, v10, v14}, Lbolts/AppLinkNavigation;->sendAppLinkNavigateEventBroadcast(Landroid/content/Context;Landroid/content/Intent;Lbolts/AppLinkNavigation$NavigationResult;Lorg/json/JSONException;)V
    //         if-eqz v7, :cond_4
    //         move-object/from16 v0, p1
    //         invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         :cond_4
    //         return-object v10
    //         .end local v7    # "outIntent":Landroid/content/Intent;
    //         .end local v10    # "result":Lbolts/AppLinkNavigation$NavigationResult;
    //         .restart local v11    # "target":Lbolts/AppLink$Target;
    //         .restart local v12    # "targetIntent":Landroid/content/Intent;
    //         :cond_5
    //         move-object/from16 v0, p0
    //         iget-object v14, v0, Lbolts/AppLinkNavigation;->appLink:Lbolts/AppLink;
    //         invoke-virtual {v14}, Lbolts/AppLink;->getSourceUrl()Landroid/net/Uri;
    //         move-result-object v14
    //         invoke-virtual {v12, v14}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         goto :goto_0
    //         .end local v11    # "target":Lbolts/AppLink$Target;
    //         .end local v12    # "targetIntent":Landroid/content/Intent;
    //         .restart local v7    # "outIntent":Landroid/content/Intent;
    //         .restart local v10    # "result":Lbolts/AppLinkNavigation$NavigationResult;
    //         :cond_6
    //         invoke-virtual/range {p0 .. p0}, Lbolts/AppLinkNavigation;->getAppLink()Lbolts/AppLink;
    //         move-result-object v14
    //         invoke-virtual {v14}, Lbolts/AppLink;->getWebUrl()Landroid/net/Uri;
    //         move-result-object v13
    //         .local v13, "webUrl":Landroid/net/Uri;
    //         if-eqz v13, :cond_3
    //         :try_start_0
    //         move-object/from16 v0, p0
    //         invoke-direct {v0, v5}, Lbolts/AppLinkNavigation;->getJSONForBundle(Landroid/os/Bundle;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v2
    //         .local v2, "appLinkDataJson":Lorg/json/JSONObject;
    //         invoke-virtual {v13}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
    //         move-result-object v14
    //         const-string v15, "al_applink_data"
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v16
    //         invoke-virtual/range {v14 .. v16}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v14
    //         invoke-virtual {v14}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v13
    //         new-instance v7, Landroid/content/Intent;
    //         .end local v7    # "outIntent":Landroid/content/Intent;
    //         const-string v14, "android.intent.action.VIEW"
    //         invoke-direct {v7, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    //         .restart local v7    # "outIntent":Landroid/content/Intent;
    //         sget-object v10, Lbolts/AppLinkNavigation$NavigationResult;->WEB:Lbolts/AppLinkNavigation$NavigationResult;
    //         goto :goto_1
    //         .end local v2    # "appLinkDataJson":Lorg/json/JSONObject;
    //         :catch_0
    //         move-exception v3
    //         .local v3, "e":Lorg/json/JSONException;
    //         sget-object v14, Lbolts/AppLinkNavigation$NavigationResult;->FAILED:Lbolts/AppLinkNavigation$NavigationResult;
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p1
    //         invoke-direct {v0, v1, v4, v14, v3}, Lbolts/AppLinkNavigation;->sendAppLinkNavigateEventBroadcast(Landroid/content/Context;Landroid/content/Intent;Lbolts/AppLinkNavigation$NavigationResult;Lorg/json/JSONException;)V
    //         new-instance v14, Ljava/lang/RuntimeException;
    //         invoke-direct {v14, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v14
    */

    companion object {
    private val KEY_NAME_REFERER_APP_LINK: String = "referer_app_link"
    private val KEY_NAME_REFERER_APP_LINK_APP_NAME: String = "app_name"
    private val KEY_NAME_REFERER_APP_LINK_PACKAGE: String = "package"
    private val KEY_NAME_USER_AGENT: String = "user_agent"
    private val KEY_NAME_VERSION: String = "version"
    private val VERSION: String = "1.0"
    private var defaultResolver: bolts.AppLinkResolver

    public @JvmStatic fun getDefaultResolver(): bolts.AppLinkResolver { return TODO("body: ()Lbolts/AppLinkResolver;") }
    /*
    //         .locals 1
    //         sget-object v0, Lbolts/AppLinkNavigation;->defaultResolver:Lbolts/AppLinkResolver;
    //         return-object v0
    */

    private @JvmStatic fun getResolver(context: android.content.Context): bolts.AppLinkResolver { return TODO("body: (Landroid/content/Context;)Lbolts/AppLinkResolver;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lbolts/AppLinkNavigation;->getDefaultResolver()Lbolts/AppLinkResolver;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lbolts/AppLinkNavigation;->getDefaultResolver()Lbolts/AppLinkResolver;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lbolts/WebViewAppLinkResolver;
    //         invoke-direct {v0, p0}, Lbolts/WebViewAppLinkResolver;-><init>(Landroid/content/Context;)V
    //         goto :goto_0
    */

    public @JvmStatic fun navigate(context: android.content.Context, appLink: bolts.AppLink): bolts.AppLinkNavigation.NavigationResult { return TODO("body: (Landroid/content/Context;Lbolts/AppLink;)Lbolts/AppLinkNavigation$NavigationResult;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lbolts/AppLinkNavigation;
    //         invoke-direct {v0, p1, v1, v1}, Lbolts/AppLinkNavigation;-><init>(Lbolts/AppLink;Landroid/os/Bundle;Landroid/os/Bundle;)V
    //         invoke-virtual {v0, p0}, Lbolts/AppLinkNavigation;->navigate(Landroid/content/Context;)Lbolts/AppLinkNavigation$NavigationResult;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun navigateInBackground(context: android.content.Context, destination: android.net.Uri): bolts.Task { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lbolts/AppLinkNavigation;->getResolver(Landroid/content/Context;)Lbolts/AppLinkResolver;
    //         move-result-object v0
    //         invoke-static {p0, p1, v0}, Lbolts/AppLinkNavigation;->navigateInBackground(Landroid/content/Context;Landroid/net/Uri;Lbolts/AppLinkResolver;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun navigateInBackground(context: android.content.Context, destination: android.net.Uri, resolver: bolts.AppLinkResolver): bolts.Task { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;Lbolts/AppLinkResolver;)Lbolts/Task;") }
    /*
    //         .locals 3
    //         invoke-interface {p2, p1}, Lbolts/AppLinkResolver;->getAppLinkFromUrlInBackground(Landroid/net/Uri;)Lbolts/Task;
    //         move-result-object v0
    //         new-instance v1, Lbolts/AppLinkNavigation$1;
    //         invoke-direct {v1, p0}, Lbolts/AppLinkNavigation$1;-><init>(Landroid/content/Context;)V
    //         sget-object v2, Lbolts/Task;->UI_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {v0, v1, v2}, Lbolts/Task;->onSuccess(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun navigateInBackground(context: android.content.Context, destinationUrl: String): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lbolts/AppLinkNavigation;->getResolver(Landroid/content/Context;)Lbolts/AppLinkResolver;
    //         move-result-object v0
    //         invoke-static {p0, p1, v0}, Lbolts/AppLinkNavigation;->navigateInBackground(Landroid/content/Context;Ljava/lang/String;Lbolts/AppLinkResolver;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun navigateInBackground(context: android.content.Context, destinationUrl: String, resolver: bolts.AppLinkResolver): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Lbolts/AppLinkResolver;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {p0, v0, p2}, Lbolts/AppLinkNavigation;->navigateInBackground(Landroid/content/Context;Landroid/net/Uri;Lbolts/AppLinkResolver;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun navigateInBackground(context: android.content.Context, destination: java.net.URL): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/net/URL;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lbolts/AppLinkNavigation;->getResolver(Landroid/content/Context;)Lbolts/AppLinkResolver;
    //         move-result-object v0
    //         invoke-static {p0, p1, v0}, Lbolts/AppLinkNavigation;->navigateInBackground(Landroid/content/Context;Ljava/net/URL;Lbolts/AppLinkResolver;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun navigateInBackground(context: android.content.Context, destination: java.net.URL, resolver: bolts.AppLinkResolver): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/net/URL;Lbolts/AppLinkResolver;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {p0, v0, p2}, Lbolts/AppLinkNavigation;->navigateInBackground(Landroid/content/Context;Landroid/net/Uri;Lbolts/AppLinkResolver;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun setDefaultResolver(resolver: bolts.AppLinkResolver) { /* TODO(body): (Lbolts/AppLinkResolver;)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Lbolts/AppLinkNavigation;->defaultResolver:Lbolts/AppLinkResolver;
    //         return-void
    */

    }
}
