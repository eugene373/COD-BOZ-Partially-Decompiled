package com.facebook.model

// Auto-emitted from smali source: GraphObject.java.
// 2 fields, 18 methods.

class GraphObject_Factory {
    private constructor()

    companion object {
    private val dateFormats: Array<java.text.SimpleDateFormat> = null!!
    private val verifiedGraphObjectClasses: java.util.HashSet = null!!

    @JvmStatic fun coerceValueToExpectedType(p0: Object, p1: Class, p2: java.lang.reflect.ParameterizedType): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<U:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/lang/Object;",
    //                 "Ljava/lang/Class",
    //                 "<TU;>;",
    //                 "Ljava/lang/reflect/ParameterizedType;",
    //                 ")TU;"
    //             }
    //         .end annotation
    //         const/4 v5, 0x1
    //         const/4 v1, 0x0
    //         if-nez p0, :cond_4
    //         sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object p0
    //         :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_3
    //         const/4 p0, 0x0
    //         goto :goto_0
    //         :cond_4
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         const-class v2, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         const-class v1, Lorg/json/JSONObject;
    //         invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         check-cast p0, Lorg/json/JSONObject;
    //         invoke-static {p1, p0}, Lcom/facebook/model/GraphObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_5
    //         const-class v1, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_6
    //         check-cast p0, Lcom/facebook/model/GraphObject;
    //         invoke-interface {p0, p1}, Lcom/facebook/model/GraphObject;->cast(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_6
    //         new-instance v1, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Can\'t create GraphObject from "
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_7
    //         const-class v2, Ljava/lang/Iterable;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_8
    //         const-class v2, Ljava/util/Collection;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_8
    //         const-class v2, Ljava/util/List;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_8
    //         const-class v2, Lcom/facebook/model/GraphObjectList;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_d
    //         :cond_8
    //         if-nez p2, :cond_9
    //         new-instance v1, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "can\'t infer generic type of: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/Class;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_9
    //         invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
    //         move-result-object v2
    //         if-eqz v2, :cond_a
    //         array-length v4, v2
    //         if-ne v4, v5, :cond_a
    //         aget-object v4, v2, v1
    //         instance-of v4, v4, Ljava/lang/Class;
    //         if-nez v4, :cond_b
    //         :cond_a
    //         new-instance v1, Lcom/facebook/FacebookGraphObjectException;
    //         const-string v2, "Expect collection properties to be of a type with exactly one generic parameter."
    //         invoke-direct {v1, v2}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_b
    //         aget-object v1, v2, v1
    //         check-cast v1, Ljava/lang/Class;
    //         const-class v2, Lorg/json/JSONArray;
    //         invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-eqz v2, :cond_c
    //         check-cast p0, Lorg/json/JSONArray;
    //         invoke-static {p0, v1}, Lcom/facebook/model/GraphObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object p0
    //         goto/16 :goto_0
    //         :cond_c
    //         new-instance v1, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Can\'t create Collection from "
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_d
    //         const-class v2, Ljava/lang/String;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_10
    //         const-class v2, Ljava/lang/Double;
    //         invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-nez v2, :cond_e
    //         const-class v2, Ljava/lang/Float;
    //         invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-eqz v2, :cond_f
    //         :cond_e
    //         const-string v2, "%f"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         aput-object p0, v3, v1
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object p0
    //         goto/16 :goto_0
    //         :cond_f
    //         const-class v2, Ljava/lang/Number;
    //         invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-eqz v2, :cond_12
    //         const-string v2, "%d"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         aput-object p0, v3, v1
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object p0
    //         goto/16 :goto_0
    //         :cond_10
    //         const-class v2, Ljava/util/Date;
    //         invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_12
    //         const-class v2, Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-eqz v2, :cond_12
    //         sget-object v4, Lcom/facebook/model/GraphObject$Factory;->dateFormats:[Ljava/text/SimpleDateFormat;
    //         array-length v5, v4
    //         move v2, v1
    //         :goto_1
    //         if-ge v2, v5, :cond_12
    //         aget-object v6, v4, v2
    //         :try_start_0
    //         move-object v0, p0
    //         check-cast v0, Ljava/lang/String;
    //         move-object v1, v0
    //         invoke-virtual {v6, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    //         :try_end_0
    //         .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         if-eqz v1, :cond_11
    //         move-object p0, v1
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v1
    //         :cond_11
    //         add-int/lit8 v1, v2, 0x1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_12
    //         new-instance v1, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Can\'t convert type"
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " to "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    @JvmStatic fun convertCamelCaseToLowercaseWithUnderscores(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "([a-z])([A-Z])"
    //         const-string v1, "$1_$2"
    //         invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun create(): com.facebook.model.GraphObject { return TODO("body: ()Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/model/GraphObject;
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->create(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun create(p0: Class): com.facebook.model.GraphObject { return TODO("body: (Ljava/lang/Class;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-static {p0, v0}, Lcom/facebook/model/GraphObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun create(p0: org.json.JSONObject): com.facebook.model.GraphObject { return TODO("body: (Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/model/GraphObject;
    //         invoke-static {p0, v0}, Lcom/facebook/model/GraphObject$Factory;->create(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun create(p0: org.json.JSONObject, p1: Class): com.facebook.model.GraphObject { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Lorg/json/JSONObject;",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         invoke-static {p1, p0}, Lcom/facebook/model/GraphObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun createGraphObjectProxy(p0: Class, p1: org.json.JSONObject): com.facebook.model.GraphObject { return TODO("body: (Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;",
    //                 "Lorg/json/JSONObject;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/model/GraphObject$Factory;->verifyCanProxyClass(Ljava/lang/Class;)V
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Ljava/lang/Class;
    //         const/4 v1, 0x0
    //         aput-object p0, v0, v1
    //         new-instance v1, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;
    //         invoke-direct {v1, p1, p0}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;-><init>(Lorg/json/JSONObject;Ljava/lang/Class;)V
    //         const-class v2, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v2
    //         invoke-static {v2, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         return-object v0
    */

    private @JvmStatic fun createGraphObjectProxyForMap(p0: org.json.JSONObject): java.util.Map { return TODO("body: (Lorg/json/JSONObject;)Ljava/util/Map;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lorg/json/JSONObject;",
    //                 ")",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Ljava/lang/Class;
    //         const/4 v1, 0x0
    //         const-class v2, Ljava/util/Map;
    //         aput-object v2, v0, v1
    //         new-instance v1, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;
    //         const-class v2, Ljava/util/Map;
    //         invoke-direct {v1, p0, v2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;-><init>(Lorg/json/JSONObject;Ljava/lang/Class;)V
    //         const-class v2, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v2
    //         invoke-static {v2, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         return-object v0
    */

    public @JvmStatic fun createList(p0: Class): com.facebook.model.GraphObjectList { return TODO("body: (Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)",
    //                 "Lcom/facebook/model/GraphObjectList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONArray;
    //         invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V
    //         invoke-static {v0, p0}, Lcom/facebook/model/GraphObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createList(p0: org.json.JSONArray, p1: Class): com.facebook.model.GraphObjectList { return TODO("body: (Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lorg/json/JSONArray;",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)",
    //                 "Lcom/facebook/model/GraphObjectList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;
    //         invoke-direct {v0, p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;-><init>(Lorg/json/JSONArray;Ljava/lang/Class;)V
    //         return-object v0
    */

    private @JvmStatic fun getUnderlyingJSONObject(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         if-nez p0, :cond_1
    //         const/4 p0, 0x0
    //         :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-class v1, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         check-cast p0, Lcom/facebook/model/GraphObject;
    //         invoke-interface {p0}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_2
    //         const-class v1, Lcom/facebook/model/GraphObjectList;
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         check-cast p0, Lcom/facebook/model/GraphObjectList;
    //         invoke-interface {p0}, Lcom/facebook/model/GraphObjectList;->getInnerJSONArray()Lorg/json/JSONArray;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_3
    //         const-class v1, Ljava/lang/Iterable;
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         check-cast p0, Ljava/lang/Iterable;
    //         invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         const-class v3, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         invoke-interface {v0}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_1
    //         :cond_4
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_1
    //         :cond_5
    //         move-object p0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun hasSameId(p0: com.facebook.model.GraphObject, p1: com.facebook.model.GraphObject): Boolean { return TODO("body: (Lcom/facebook/model/GraphObject;Lcom/facebook/model/GraphObject;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         if-eqz p0, :cond_0
    //         if-eqz p1, :cond_0
    //         invoke-interface {p0}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v1
    //         const-string v2, "id"
    //         invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-interface {p1}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v1
    //         const-string v2, "id"
    //         invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "id"
    //         invoke-interface {p0, v1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         const-string v2, "id"
    //         invoke-interface {p1, v2}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-eqz v1, :cond_0
    //         if-eqz v2, :cond_0
    //         instance-of v3, v1, Ljava/lang/String;
    //         if-eqz v3, :cond_0
    //         instance-of v3, v2, Ljava/lang/String;
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    private @JvmStatic fun verifyCanProxyClass(p0: Class) { /* TODO(body): (Ljava/lang/Class;)V */ }
    /*
    //         .locals 11
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         const/4 v10, 0x3
    //         invoke-static {p0}, Lcom/facebook/model/GraphObject$Factory;->hasClassBeenVerified(Ljava/lang/Class;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Factory can only wrap interfaces, not class: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;
    //         move-result-object v2
    //         array-length v3, v2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_1
    //         if-ge v1, v3, :cond_8
    //         aget-object v4, v2, v1
    //         invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
    //         move-result-object v5
    //         array-length v5, v5
    //         invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
    //         move-result-object v6
    //         const-class v7, Lcom/facebook/model/PropertyName;
    //         invoke-virtual {v4, v7}, Ljava/lang/reflect/Method;->isAnnotationPresent(Ljava/lang/Class;)Z
    //         move-result v7
    //         invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;
    //         move-result-object v8
    //         const-class v9, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v8
    //         if-eqz v8, :cond_3
    //         :cond_2
    //         :goto_2
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_1
    //         :cond_3
    //         const/4 v8, 0x1
    //         if-ne v5, v8, :cond_6
    //         sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;
    //         if-ne v6, v8, :cond_6
    //         if-eqz v7, :cond_5
    //         const-class v0, Lcom/facebook/model/PropertyName;
    //         invoke-virtual {v4, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/PropertyName;
    //         invoke-interface {v0}, Lcom/facebook/model/PropertyName;->value()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_4
    //         new-instance v0, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Factory can\'t proxy method: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v4}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_5
    //         const-string v5, "set"
    //         invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v5
    //         if-eqz v5, :cond_4
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-le v0, v10, :cond_4
    //         goto :goto_2
    //         :cond_6
    //         if-nez v5, :cond_4
    //         sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;
    //         if-eq v6, v5, :cond_4
    //         if-eqz v7, :cond_7
    //         const-class v0, Lcom/facebook/model/PropertyName;
    //         invoke-virtual {v4, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/PropertyName;
    //         invoke-interface {v0}, Lcom/facebook/model/PropertyName;->value()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         goto :goto_2
    //         :cond_7
    //         const-string v5, "get"
    //         invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v5
    //         if-eqz v5, :cond_4
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-le v0, v10, :cond_4
    //         goto :goto_2
    //         :cond_8
    //         invoke-static {p0}, Lcom/facebook/model/GraphObject$Factory;->recordClassHasBeenVerified(Ljava/lang/Class;)V
    //         goto/16 :goto_0
    */

    }
}
