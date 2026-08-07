package com.amazon.device.iap.internal.c

// Auto-emitted from smali source: PendingReceiptsManager.java.
// 5 fields, 13 methods.

open class a {
    public constructor()

    private fun a(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "context"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         sget-object v1, Lcom/amazon/device/iap/internal/c/a;->c:Ljava/lang/String;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         const-string v1, "LAST_CLEANING_TIME"
    //         invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         return-void
    */

    private fun e() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         const-string v1, "enter old receipts cleanup! "
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "context"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-direct {p0, v2, v3}, Lcom/amazon/device/iap/internal/c/a;->a(J)V
    //         new-instance v1, Lcom/amazon/device/iap/internal/c/a$1;
    //         invoke-direct {v1, p0, v0}, Lcom/amazon/device/iap/internal/c/a$1;-><init>(Lcom/amazon/device/iap/internal/c/a;Landroid/content/Context;)V
    //         new-instance v0, Landroid/os/Handler;
    //         invoke-direct {v0}, Landroid/os/Handler;-><init>()V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    private fun f(): Long { return TODO("body: ()J") }
    /*
    //         .locals 8
    //         const-wide/16 v6, 0x0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v2
    //         const-string v0, "context"
    //         invoke-static {v2, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         sget-object v3, Lcom/amazon/device/iap/internal/c/a;->c:Ljava/lang/String;
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v2
    //         const-string v3, "LAST_CLEANING_TIME"
    //         invoke-interface {v2, v3, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    //         move-result-wide v2
    //         cmp-long v4, v2, v6
    //         if-nez v4, :cond_0
    //         invoke-direct {p0, v0, v1}, Lcom/amazon/device/iap/internal/c/a;->a(J)V
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         move-wide v0, v2
    //         goto :goto_0
    */

    public fun a(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "enter removeReceipt for receipt["
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "]"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "context"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         sget-object v1, Lcom/amazon/device/iap/internal/c/a;->b:Ljava/lang/String;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "leave removeReceipt for receipt["
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "]"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun a(p0: String, p1: String, p2: String, p3: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 7
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "enter saveReceipt for receipt ["
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "]"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         const-string v0, "userId"
    //         invoke-static {p2, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "receiptId"
    //         invoke-static {p3, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "receiptString"
    //         invoke-static {p4, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v6
    //         const-string v0, "context"
    //         invoke-static {v6, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/c/d;
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v4
    //         move-object v1, p2
    //         move-object v2, p4
    //         move-object v3, p1
    //         invoke-direct/range {v0 .. v5}, Lcom/amazon/device/iap/internal/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //         sget-object v1, Lcom/amazon/device/iap/internal/c/a;->b:Ljava/lang/String;
    //         const/4 v2, 0x0
    //         invoke-virtual {v6, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v1
    //         invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/c/d;->d()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v1, p3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "leaving saveReceipt for receipt id ["
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "]"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "error in saving pending receipt:"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "/"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ":"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun b(p0: String): java.util.Set { return TODO("body: (Ljava/lang/String;)Ljava/util/Set;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Lcom/amazon/device/iap/model/Receipt;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "context"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         sget-object v1, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "enter getLocalReceipts for user["
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "]"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v2, Ljava/util/HashSet;
    //         invoke-direct {v2}, Ljava/util/HashSet;-><init>()V
    //         invoke-static {p1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "empty UserId: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Invalid UserId:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v1, Lcom/amazon/device/iap/internal/c/a;->b:Ljava/lang/String;
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         :try_start_0
    //         invoke-static {v1}, Lcom/amazon/device/iap/internal/c/d;->a(Ljava/lang/String;)Lcom/amazon/device/iap/internal/c/d;
    //         move-result-object v5
    //         new-instance v6, Lorg/json/JSONObject;
    //         invoke-virtual {v5}, Lcom/amazon/device/iap/internal/c/d;->b()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v5}, Lcom/amazon/device/iap/internal/c/d;->a()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v6, p1, v5}, Lcom/amazon/device/iap/internal/util/a;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v5
    //         invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Lcom/amazon/device/iap/internal/b/d; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v5
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/c/a;->a(Ljava/lang/String;)V
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "failed to verify signature:["
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v5, "]"
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v5
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/c/a;->a(Ljava/lang/String;)V
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "failed to convert string to JSON object:["
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v5, "]"
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "failed to load the receipt from SharedPreference:["
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v5, "]"
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_1
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "leaving getLocalReceipts for user["
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v3, "], "
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {v2}, Ljava/util/Set;->size()I
    //         move-result v3
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v3, " local receipts found."
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/c/a;->f()J
    //         move-result-wide v4
    //         sub-long/2addr v0, v4
    //         sget v3, Lcom/amazon/device/iap/internal/c/a;->d:I
    //         int-to-long v4, v3
    //         cmp-long v0, v0, v4
    //         if-lez v0, :cond_2
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/c/a;->e()V
    //         :cond_2
    //         return-object v2
    */

    public fun c(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v1
    //         const-string v2, "context"
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {p1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "empty receiptId: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Invalid ReceiptId:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v2, Lcom/amazon/device/iap/internal/c/a;->b:Ljava/lang/String;
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v1
    //         invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :try_start_0
    //         invoke-static {v1}, Lcom/amazon/device/iap/internal/c/d;->a(Ljava/lang/String;)Lcom/amazon/device/iap/internal/c/d;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/c/d;->a()Ljava/lang/String;
    //         :try_end_0
    //         .catch Lcom/amazon/device/iap/internal/c/e; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :cond_1
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    companion object {
    private val a: String = null!!
    private val b: String = null!!
    private val c: String = null!!
    private var d: Int
    private val e: com.amazon.device.iap.internal.c.a = null!!

    public @JvmStatic fun a(): com.amazon.device.iap.internal.c.a { return TODO("body: ()Lcom/amazon/device/iap/internal/c/a;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->e:Lcom/amazon/device/iap/internal/c/a;
    //         return-object v0
    */

    @JvmStatic fun b(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->a:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun c(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/c/a;->b:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun d(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/amazon/device/iap/internal/c/a;->d:I
    //         return v0
    */

    }
}
