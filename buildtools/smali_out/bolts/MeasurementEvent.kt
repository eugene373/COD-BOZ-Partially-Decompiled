package bolts

// Auto-emitted from smali source: MeasurementEvent.java.
// 8 fields, 5 methods.

open class MeasurementEvent {
    private var appContext: android.content.Context
    private var args: android.os.Bundle
    private var name: String

    private constructor(context: android.content.Context, eventName: String, eventArgs: android.os.Bundle)

    private fun sendBroadcast() { /* TODO(body): ()V */ }
    /*
    //         .locals 10
    //         iget-object v6, p0, Lbolts/MeasurementEvent;->name:Ljava/lang/String;
    //         if-nez v6, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v6
    //         invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v6
    //         const-string v7, "Event name is required"
    //         invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :try_start_0
    //         const-string v6, "android.support.v4.content.LocalBroadcastManager"
    //         invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         const-string v6, "getInstance"
    //         const/4 v7, 0x1
    //         new-array v7, v7, [Ljava/lang/Class;
    //         const/4 v8, 0x0
    //         const-class v9, Landroid/content/Context;
    //         aput-object v9, v7, v8
    //         invoke-virtual {v0, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v4
    //         .local v4, "methodGetInstance":Ljava/lang/reflect/Method;
    //         const-string v6, "sendBroadcast"
    //         const/4 v7, 0x1
    //         new-array v7, v7, [Ljava/lang/Class;
    //         const/4 v8, 0x0
    //         const-class v9, Landroid/content/Intent;
    //         aput-object v9, v7, v8
    //         invoke-virtual {v0, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v5
    //         .local v5, "methodSendBroadcast":Ljava/lang/reflect/Method;
    //         const/4 v6, 0x0
    //         const/4 v7, 0x1
    //         new-array v7, v7, [Ljava/lang/Object;
    //         const/4 v8, 0x0
    //         iget-object v9, p0, Lbolts/MeasurementEvent;->appContext:Landroid/content/Context;
    //         aput-object v9, v7, v8
    //         invoke-virtual {v4, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         .local v3, "localBroadcastManager":Ljava/lang/Object;
    //         new-instance v2, Landroid/content/Intent;
    //         const-string v6, "com.parse.bolts.measurement_event"
    //         invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         .local v2, "event":Landroid/content/Intent;
    //         const-string v6, "event_name"
    //         iget-object v7, p0, Lbolts/MeasurementEvent;->name:Ljava/lang/String;
    //         invoke-virtual {v2, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v6, "event_args"
    //         iget-object v7, p0, Lbolts/MeasurementEvent;->args:Landroid/os/Bundle;
    //         invoke-virtual {v2, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         const/4 v6, 0x1
    //         new-array v6, v6, [Ljava/lang/Object;
    //         const/4 v7, 0x0
    //         aput-object v2, v6, v7
    //         invoke-virtual {v5, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         .end local v2    # "event":Landroid/content/Intent;
    //         .end local v3    # "localBroadcastManager":Ljava/lang/Object;
    //         .end local v4    # "methodGetInstance":Ljava/lang/reflect/Method;
    //         .end local v5    # "methodSendBroadcast":Ljava/lang/reflect/Method;
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v6
    //         invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v6
    //         const-string v7, "LocalBroadcastManager in android support library is required to raise bolts event."
    //         invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    companion object {
    @JvmField public val APP_LINK_NAVIGATE_IN_EVENT_NAME: String = "al_nav_in"
    @JvmField public val APP_LINK_NAVIGATE_OUT_EVENT_NAME: String = "al_nav_out"
    @JvmField public val MEASUREMENT_EVENT_ARGS_KEY: String = "event_args"
    @JvmField public val MEASUREMENT_EVENT_NAME_KEY: String = "event_name"
    @JvmField public val MEASUREMENT_EVENT_NOTIFICATION_NAME: String = "com.parse.bolts.measurement_event"

    private @JvmStatic fun getApplinkLogData(context: android.content.Context, eventName: String, appLinkData: android.os.Bundle, applinkIntent: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 11
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         .local v3, "logData":Landroid/os/Bundle;
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v9
    //         invoke-virtual {p3, v9}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //         move-result-object v6
    //         .local v6, "resolvedActivity":Landroid/content/ComponentName;
    //         if-eqz v6, :cond_0
    //         const-string v9, "class"
    //         invoke-virtual {v6}, Landroid/content/ComponentName;->getShortClassName()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         const-string v9, "al_nav_out"
    //         invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v9
    //         if-eqz v9, :cond_5
    //         if-eqz v6, :cond_1
    //         const-string v9, "package"
    //         invoke-virtual {v6}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v9
    //         if-eqz v9, :cond_2
    //         const-string v9, "outputURL"
    //         invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v10
    //         invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_2
    //         invoke-virtual {p3}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
    //         move-result-object v9
    //         if-eqz v9, :cond_3
    //         const-string v9, "outputURLScheme"
    //         invoke-virtual {p3}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_3
    //         :goto_0
    //         invoke-virtual {p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v9
    //         invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         :cond_4
    //         :goto_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v9
    //         if-eqz v9, :cond_c
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "key":Ljava/lang/String;
    //         invoke-virtual {p2, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v5
    //         .local v5, "o":Ljava/lang/Object;
    //         instance-of v9, v5, Landroid/os/Bundle;
    //         if-eqz v9, :cond_a
    //         move-object v9, v5
    //         check-cast v9, Landroid/os/Bundle;
    //         invoke-virtual {v9}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v9
    //         invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         .local v1, "i$":Ljava/util/Iterator;
    //         :goto_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v9
    //         if-eqz v9, :cond_4
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v7
    //         check-cast v7, Ljava/lang/String;
    //         .local v7, "subKey":Ljava/lang/String;
    //         move-object v9, v5
    //         check-cast v9, Landroid/os/Bundle;
    //         invoke-virtual {v9, v7}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v9
    //         invoke-static {v9}, Lbolts/MeasurementEvent;->objectToJSONString(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v4
    //         .local v4, "logValue":Ljava/lang/String;
    //         const-string v9, "referer_app_link"
    //         invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v9
    //         if-eqz v9, :cond_9
    //         const-string v9, "url"
    //         invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v9
    //         if-eqz v9, :cond_7
    //         const-string v9, "refererURL"
    //         invoke-virtual {v3, v9, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_2
    //         .end local v1    # "i$":Ljava/util/Iterator;
    //         .end local v2    # "key":Ljava/lang/String;
    //         .end local v4    # "logValue":Ljava/lang/String;
    //         .end local v5    # "o":Ljava/lang/Object;
    //         .end local v7    # "subKey":Ljava/lang/String;
    //         :cond_5
    //         const-string v9, "al_nav_in"
    //         invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v9
    //         if-eqz v9, :cond_3
    //         invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v9
    //         if-eqz v9, :cond_6
    //         const-string v9, "inputURL"
    //         invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v10
    //         invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_6
    //         invoke-virtual {p3}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
    //         move-result-object v9
    //         if-eqz v9, :cond_3
    //         const-string v9, "inputURLScheme"
    //         invoke-virtual {p3}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         .restart local v1    # "i$":Ljava/util/Iterator;
    //         .restart local v2    # "key":Ljava/lang/String;
    //         .restart local v4    # "logValue":Ljava/lang/String;
    //         .restart local v5    # "o":Ljava/lang/Object;
    //         .restart local v7    # "subKey":Ljava/lang/String;
    //         :cond_7
    //         const-string v9, "app_name"
    //         invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v9
    //         if-eqz v9, :cond_8
    //         const-string v9, "refererAppName"
    //         invoke-virtual {v3, v9, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_2
    //         :cond_8
    //         const-string v9, "package"
    //         invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v9
    //         if-eqz v9, :cond_9
    //         const-string v9, "sourceApplication"
    //         invoke-virtual {v3, v9, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_2
    //         :cond_9
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         const-string v10, "/"
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-virtual {v3, v9, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_2
    //         .end local v1    # "i$":Ljava/util/Iterator;
    //         .end local v4    # "logValue":Ljava/lang/String;
    //         .end local v7    # "subKey":Ljava/lang/String;
    //         :cond_a
    //         invoke-static {v5}, Lbolts/MeasurementEvent;->objectToJSONString(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v4
    //         .restart local v4    # "logValue":Ljava/lang/String;
    //         const-string v9, "target_url"
    //         invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v9
    //         if-eqz v9, :cond_b
    //         invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v8
    //         .local v8, "targetURI":Landroid/net/Uri;
    //         const-string v9, "targetURL"
    //         invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v9, "targetURLHost"
    //         invoke-virtual {v8}, Landroid/net/Uri;->getHost()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_1
    //         .end local v8    # "targetURI":Landroid/net/Uri;
    //         :cond_b
    //         invoke-virtual {v3, v2, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_1
    //         .end local v2    # "key":Ljava/lang/String;
    //         .end local v4    # "logValue":Ljava/lang/String;
    //         .end local v5    # "o":Ljava/lang/Object;
    //         :cond_c
    //         return-object v3
    */

    private @JvmStatic fun objectToJSONString(o: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_0
    //         .end local p0    # "o":Ljava/lang/Object;
    //         :goto_0
    //         return-object v0
    //         .restart local p0    # "o":Ljava/lang/Object;
    //         :cond_0
    //         instance-of v1, p0, Lorg/json/JSONArray;
    //         if-nez v1, :cond_1
    //         instance-of v1, p0, Lorg/json/JSONObject;
    //         if-eqz v1, :cond_2
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         :try_start_0
    //         instance-of v1, p0, Ljava/util/Collection;
    //         if-eqz v1, :cond_3
    //         new-instance v1, Lorg/json/JSONArray;
    //         check-cast p0, Ljava/util/Collection;
    //         .end local p0    # "o":Ljava/lang/Object;
    //         invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         .restart local p0    # "o":Ljava/lang/Object;
    //         :cond_3
    //         instance-of v1, p0, Ljava/util/Map;
    //         if-eqz v1, :cond_4
    //         new-instance v1, Lorg/json/JSONObject;
    //         check-cast p0, Ljava/util/Map;
    //         .end local p0    # "o":Ljava/lang/Object;
    //         invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         .restart local p0    # "o":Ljava/lang/Object;
    //         :cond_4
    //         invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         .end local p0    # "o":Ljava/lang/Object;
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    @JvmStatic fun sendBroadcastEvent(context: android.content.Context, name: String, intent: android.content.Intent, p3: java.util.Map) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ljava/util/Map;)V */ }
    /*
    //         .locals 11
    //         .local p3, "extraLoggingData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    //         new-instance v6, Landroid/os/Bundle;
    //         invoke-direct {v6}, Landroid/os/Bundle;-><init>()V
    //         .local v6, "logData":Landroid/os/Bundle;
    //         if-eqz p2, :cond_0
    //         invoke-static {p2}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "applinkData":Landroid/os/Bundle;
    //         if-eqz v0, :cond_1
    //         invoke-static {p0, p1, v0, p2}, Lbolts/MeasurementEvent;->getApplinkLogData(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v6
    //         .end local v0    # "applinkData":Landroid/os/Bundle;
    //         :cond_0
    //         if-eqz p3, :cond_3
    //         invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v9
    //         invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         .local v2, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v9
    //         if-eqz v9, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v5
    //         check-cast v5, Ljava/lang/String;
    //         .local v5, "key":Ljava/lang/String;
    //         invoke-interface {p3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v9
    //         check-cast v9, Ljava/lang/String;
    //         invoke-virtual {v6, v5, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         .end local v2    # "i$":Ljava/util/Iterator;
    //         .end local v5    # "key":Ljava/lang/String;
    //         .restart local v0    # "applinkData":Landroid/os/Bundle;
    //         :cond_1
    //         invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v4
    //         .local v4, "intentUri":Landroid/net/Uri;
    //         if-eqz v4, :cond_2
    //         const-string v9, "intentData"
    //         invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v6, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_2
    //         invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v3
    //         .local v3, "intentExtras":Landroid/os/Bundle;
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v9
    //         invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         .restart local v2    # "i$":Ljava/util/Iterator;
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v9
    //         if-eqz v9, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v5
    //         check-cast v5, Ljava/lang/String;
    //         .restart local v5    # "key":Ljava/lang/String;
    //         invoke-virtual {v3, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v8
    //         .local v8, "o":Ljava/lang/Object;
    //         invoke-static {v8}, Lbolts/MeasurementEvent;->objectToJSONString(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v7
    //         .local v7, "logValue":Ljava/lang/String;
    //         invoke-virtual {v6, v5, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         .end local v0    # "applinkData":Landroid/os/Bundle;
    //         .end local v2    # "i$":Ljava/util/Iterator;
    //         .end local v3    # "intentExtras":Landroid/os/Bundle;
    //         .end local v4    # "intentUri":Landroid/net/Uri;
    //         .end local v5    # "key":Ljava/lang/String;
    //         .end local v7    # "logValue":Ljava/lang/String;
    //         .end local v8    # "o":Ljava/lang/Object;
    //         :cond_3
    //         new-instance v1, Lbolts/MeasurementEvent;
    //         invoke-direct {v1, p0, p1, v6}, Lbolts/MeasurementEvent;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    //         .local v1, "event":Lbolts/MeasurementEvent;
    //         invoke-direct {v1}, Lbolts/MeasurementEvent;->sendBroadcast()V
    //         return-void
    */

    }
}
