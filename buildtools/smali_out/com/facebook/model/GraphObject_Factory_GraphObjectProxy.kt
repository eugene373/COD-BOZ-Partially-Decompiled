package com.facebook.model

// Auto-emitted from smali source: GraphObject.java.
// 21 fields, 8 methods.

class GraphObject_Factory_GraphObjectProxy: com.facebook.model.GraphObject.Factory.ProxyBase() {
    private val graphObjectClass: Class

    public constructor(p0: org.json.JSONObject, p1: Class)

    private fun createGraphObjectsFromParameters(p0: com.facebook.model.CreateGraphObject, p1: Object): Object { return TODO("body: (Lcom/facebook/model/CreateGraphObject;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/facebook/model/CreateGraphObject;->value()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-interface {p1}, Lcom/facebook/model/CreateGraphObject;->value()Ljava/lang/String;
    //         move-result-object v1
    //         const-class v0, Ljava/util/List;
    //         invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-class v0, Lcom/facebook/model/GraphObject;
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->createList(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object v0
    //         check-cast p2, Ljava/util/List;
    //         invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;
    //         move-result-object v4
    //         invoke-interface {v4, v1, v3}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-interface {v0, v4}, Lcom/facebook/model/GraphObjectList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         move-object p2, v0
    //         :cond_1
    //         :goto_1
    //         return-object p2
    //         :cond_2
    //         invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         invoke-interface {v0, v1, p2}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         move-object p2, v0
    //         goto :goto_1
    */

    private fun proxyGraphObjectGettersAndSetters(p0: java.lang.reflect.Method, p1: Array<Object>): Object { return TODO("body: (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
    //         move-result-object v0
    //         array-length v3, v0
    //         const-class v0, Lcom/facebook/model/PropertyName;
    //         invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/PropertyName;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lcom/facebook/model/PropertyName;->value()Ljava/lang/String;
    //         move-result-object v0
    //         move-object v2, v0
    //         :goto_0
    //         if-nez v3, :cond_1
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
    //         move-result-object v3
    //         invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;
    //         move-result-object v0
    //         instance-of v4, v0, Ljava/lang/reflect/ParameterizedType;
    //         if-eqz v4, :cond_3
    //         check-cast v0, Ljava/lang/reflect/ParameterizedType;
    //         :goto_1
    //         invoke-static {v2, v3, v0}, Lcom/facebook/model/GraphObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;
    //         move-result-object v1
    //         :goto_2
    //         return-object v1
    //         :cond_0
    //         const/4 v0, 0x3
    //         invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->convertCamelCaseToLowercaseWithUnderscores(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         move-object v2, v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         if-ne v3, v0, :cond_2
    //         const-class v0, Lcom/facebook/model/CreateGraphObject;
    //         invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/CreateGraphObject;
    //         const/4 v3, 0x0
    //         aget-object v3, p2, v3
    //         invoke-direct {p0, v0, v3}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->createGraphObjectsFromParameters(Lcom/facebook/model/CreateGraphObject;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_2
    //         :cond_2
    //         invoke-virtual {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->throwUnexpectedMethodSignature(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    //         move-result-object v1
    //         goto :goto_2
    //         :cond_3
    //         move-object v0, v1
    //         goto :goto_1
    */

    private fun proxyGraphObjectMethods(p0: Object, p1: java.lang.reflect.Method, p2: Array<Object>): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         const/4 v4, 0x1
    //         const/4 v3, 0x0
    //         invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "cast"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         aget-object v0, p3, v3
    //         check-cast v0, Ljava/lang/Class;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->graphObjectClass:Ljava/lang/Class;
    //         invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_0
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v1, Lorg/json/JSONObject;
    //         invoke-static {v0, v1}, Lcom/facebook/model/GraphObject$Factory;->access$000(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         move-result-object p1
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "getInnerJSONObject"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-static {p1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;
    //         iget-object p1, v0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "asMap"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->access$100(Lorg/json/JSONObject;)Ljava/util/Map;
    //         move-result-object p1
    //         goto :goto_0
    //         :cond_3
    //         const-string v1, "getProperty"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p3, v3
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object p1
    //         goto :goto_0
    //         :cond_4
    //         const-string v1, "getPropertyAs"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p3, v3
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         aget-object v0, p3, v4
    //         check-cast v0, Ljava/lang/Class;
    //         invoke-static {v1, v0, v2}, Lcom/facebook/model/GraphObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;
    //         move-result-object p1
    //         goto :goto_0
    //         :cond_5
    //         const-string v1, "getPropertyAsList"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_6
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p3, v3
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         aget-object v0, p3, v4
    //         check-cast v0, Ljava/lang/Class;
    //         new-instance v2, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy$1;
    //         invoke-direct {v2, p0, v0}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy$1;-><init>(Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;Ljava/lang/Class;)V
    //         const-class v0, Lcom/facebook/model/GraphObjectList;
    //         invoke-static {v1, v0, v2}, Lcom/facebook/model/GraphObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;
    //         move-result-object p1
    //         goto/16 :goto_0
    //         :cond_6
    //         const-string v1, "setProperty"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_7
    //         invoke-direct {p0, p3}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->setJSONProperty([Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object p1
    //         goto/16 :goto_0
    //         :cond_7
    //         const-string v1, "removeProperty"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p3, v3
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    //         move-object p1, v2
    //         goto/16 :goto_0
    //         :cond_8
    //         invoke-virtual {p0, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->throwUnexpectedMethodSignature(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    //         move-result-object p1
    //         goto/16 :goto_0
    */

    private fun proxyMapMethods(p0: java.lang.reflect.Method, p1: Array<Object>): Object { return TODO("body: (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v3, "clear"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/JsonUtil;->jsonObjectClear(Lorg/json/JSONObject;)V
    //         move-object v0, v2
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v3, "containsKey"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p2, v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const-string v3, "containsValue"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p2, v1
    //         invoke-static {v0, v1}, Lcom/facebook/model/JsonUtil;->jsonObjectContainsValue(Lorg/json/JSONObject;Ljava/lang/Object;)Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         const-string v3, "entrySet"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_3
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/JsonUtil;->jsonObjectEntrySet(Lorg/json/JSONObject;)Ljava/util/Set;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         const-string v3, "get"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p2, v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_4
    //         const-string v3, "isEmpty"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_6
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
    //         move-result v0
    //         if-nez v0, :cond_5
    //         const/4 v0, 0x1
    //         :goto_1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_5
    //         move v0, v1
    //         goto :goto_1
    //         :cond_6
    //         const-string v3, "keySet"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_7
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/JsonUtil;->jsonObjectKeySet(Lorg/json/JSONObject;)Ljava/util/Set;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :cond_7
    //         const-string v3, "put"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_8
    //         invoke-direct {p0, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->setJSONProperty([Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :cond_8
    //         const-string v3, "putAll"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_b
    //         aget-object v0, p2, v1
    //         instance-of v0, v0, Ljava/util/Map;
    //         if-eqz v0, :cond_9
    //         aget-object v0, p2, v1
    //         check-cast v0, Ljava/util/Map;
    //         move-object v1, v0
    //         :goto_2
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0, v1}, Lcom/facebook/model/JsonUtil;->jsonObjectPutAll(Lorg/json/JSONObject;Ljava/util/Map;)V
    //         move-object v0, v2
    //         goto/16 :goto_0
    //         :cond_9
    //         aget-object v0, p2, v1
    //         instance-of v0, v0, Lcom/facebook/model/GraphObject;
    //         if-eqz v0, :cond_a
    //         aget-object v0, p2, v1
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         invoke-interface {v0}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v0
    //         move-object v1, v0
    //         goto :goto_2
    //         :cond_a
    //         move-object v0, v2
    //         goto/16 :goto_0
    //         :cond_b
    //         const-string v3, "remove"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_c
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         aget-object v1, p2, v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    //         move-object v0, v2
    //         goto/16 :goto_0
    //         :cond_c
    //         const-string v1, "size"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_d
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :cond_d
    //         const-string v1, "values"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_e
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/JsonUtil;->jsonObjectValues(Lorg/json/JSONObject;)Ljava/util/Collection;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :cond_e
    //         invoke-virtual {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->throwUnexpectedMethodSignature(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto/16 :goto_0
    */

    private fun setJSONProperty(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         aget-object v0, p1, v0
    //         check-cast v0, Ljava/lang/String;
    //         const/4 v1, 0x1
    //         aget-object v1, p1, v1
    //         invoke-static {v1}, Lcom/facebook/model/GraphObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         :try_start_0
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         check-cast v1, Lorg/json/JSONObject;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun invoke(p0: Object, p1: java.lang.reflect.Method, p2: Array<Object>): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Throwable;
    //             }
    //         .end annotation
    //         invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-class v1, Ljava/lang/Object;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->proxyObjectMethods(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-class v1, Ljava/util/Map;
    //         if-ne v0, v1, :cond_1
    //         invoke-direct {p0, p2, p3}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->proxyMapMethods(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const-class v1, Lcom/facebook/model/GraphObject;
    //         if-ne v0, v1, :cond_2
    //         invoke-direct {p0, p1, p2, p3}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->proxyGraphObjectMethods(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         const-class v1, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-direct {p0, p2, p3}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->proxyGraphObjectGettersAndSetters(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {p0, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->throwUnexpectedMethodSignature(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "GraphObject{graphObjectClass=%s, state=%s}"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->graphObjectClass:Ljava/lang/Class;
    //         invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val CASTTOMAP_METHOD: String = "asMap"
    private val CAST_METHOD: String = "cast"
    private val CLEAR_METHOD: String = "clear"
    private val CONTAINSKEY_METHOD: String = "containsKey"
    private val CONTAINSVALUE_METHOD: String = "containsValue"
    private val ENTRYSET_METHOD: String = "entrySet"
    private val GETINNERJSONOBJECT_METHOD: String = "getInnerJSONObject"
    private val GETPROPERTYASLIST_METHOD: String = "getPropertyAsList"
    private val GETPROPERTYAS_METHOD: String = "getPropertyAs"
    private val GETPROPERTY_METHOD: String = "getProperty"
    private val GET_METHOD: String = "get"
    private val ISEMPTY_METHOD: String = "isEmpty"
    private val KEYSET_METHOD: String = "keySet"
    private val PUTALL_METHOD: String = "putAll"
    private val PUT_METHOD: String = "put"
    private val REMOVEPROPERTY_METHOD: String = "removeProperty"
    private val REMOVE_METHOD: String = "remove"
    private val SETPROPERTY_METHOD: String = "setProperty"
    private val SIZE_METHOD: String = "size"
    private val VALUES_METHOD: String = "values"
    }
}
