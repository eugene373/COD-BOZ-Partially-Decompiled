package com.google.android.gms.analytics

// Auto-emitted from smali.
// 10 fields, 22 methods.

open class ab: com.google.android.gms.analytics.d {
    private val AZ: com.google.android.gms.analytics.ab.a
    private var Ba: com.google.android.gms.analytics.m
    private val Bb: String
    private var Bc: com.google.android.gms.analytics.aa
    private var Bd: Long
    private val Be: Int
    private val mContext: android.content.Context
    private var yD: com.google.android.gms.internal.ju
    private val yl: com.google.android.gms.analytics.e

    constructor(p0: com.google.android.gms.analytics.e, p1: android.content.Context)

    constructor(p0: com.google.android.gms.analytics.e, p1: android.content.Context, p2: String, p3: Int)

    private fun a(p0: java.util.Map, p1: Long, p2: String) { /* TODO(body): (Ljava/util/Map;JLjava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;J",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         const-string v0, "Error opening database for putHit"
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v4
    //         if-nez v4, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v5, Landroid/content/ContentValues;
    //         invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V
    //         const-string v0, "hit_string"
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/ab;->A(Ljava/util/Map;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "hit_time"
    //         invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    //         const-wide/16 v2, 0x0
    //         const-string v0, "AppUID"
    //         invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :try_start_0
    //         const-string v0, "AppUID"
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         :goto_1
    //         const-string v2, "hit_app_id"
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         invoke-virtual {v5, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    //         if-nez p4, :cond_1
    //         const-string p4, "http://www.google-analytics.com/collect"
    //         :cond_1
    //         invoke-virtual {p4}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-nez v0, :cond_2
    //         const-string v0, "Empty path: not sending hit"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move-wide v0, v2
    //         goto :goto_1
    //         :cond_2
    //         const-string v0, "hit_url"
    //         invoke-virtual {v5, v0, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_1
    //         const-string v0, "hits2"
    //         const/4 v1, 0x0
    //         invoke-virtual {v4, v0, v1, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->yl:Lcom/google/android/gms/analytics/e;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/analytics/e;->z(Z)V
    //         :try_end_1
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const-string v0, "Error storing hit"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         move-wide v0, v2
    //         goto :goto_1
    */

    private fun a(p0: java.util.Map, p1: java.util.Collection) { /* TODO(body): (Ljava/util/Map;Ljava/util/Collection;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/hb;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "&_v"
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz p2, :cond_1
    //         invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hb;
    //         const-string v3, "appendVersion"
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hb;->getId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hb;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         return-void
    */

    private fun al(p0: String): android.database.sqlite.SQLiteDatabase { return TODO("body: (Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;") }
    /*
    //         .locals 1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->AZ:Lcom/google/android/gms/analytics/ab$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ab$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun eM() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eO()I
    //         move-result v0
    //         iget v1, p0, Lcom/google/android/gms/analytics/ab;->Be:I
    //         sub-int/2addr v0, v1
    //         add-int/lit8 v0, v0, 0x1
    //         if-lez v0, :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/ab;->F(I)Ljava/util/List;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Store full, deleting "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " hits to make room."
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/String;
    //         invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/ab;->b([Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    fun F(p0: Int): java.util.List { return TODO("body: (I)Ljava/util/List;") }
    /*
    //         .locals 13
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v10, 0x0
    //         new-instance v9, Ljava/util/ArrayList;
    //         invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
    //         if-gtz p1, :cond_0
    //         const-string v0, "Invalid maxHits specified. Skipping"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         move-object v0, v9
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "Error opening database for peekHitIds."
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         move-object v0, v9
    //         goto :goto_0
    //         :cond_1
    //         :try_start_0
    //         const-string v1, "hits2"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/String;
    //         const/4 v3, 0x0
    //         const-string v4, "hit_id"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const-string v7, "%s ASC"
    //         const/4 v8, 0x1
    //         new-array v8, v8, [Ljava/lang/Object;
    //         const/4 v11, 0x0
    //         const-string v12, "hit_id"
    //         aput-object v12, v8, v11
    //         invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v7
    //         invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v8
    //         invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_2
    //         const/4 v0, 0x0
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    //         :try_end_1
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result v0
    //         if-nez v0, :cond_2
    //         :cond_3
    //         if-eqz v1, :cond_4
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_4
    //         :goto_1
    //         move-object v0, v9
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v10
    //         :goto_2
    //         :try_start_2
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Error in peekHits fetching hitIds: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         if-eqz v1, :cond_4
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v10
    //         :goto_3
    //         if-eqz v1, :cond_5
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_5
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_3
    //         :catch_1
    //         move-exception v0
    //         goto :goto_2
    */

    public fun G(p0: Int): java.util.List { return TODO("body: (I)Ljava/util/List;") }
    /*
    //         .locals 16
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/analytics/w;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v11, Ljava/util/ArrayList;
    //         invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
    //         const-string v2, "Error opening database for peekHits"
    //         move-object/from16 v0, p0
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v2
    //         if-nez v2, :cond_1
    //         move-object v2, v11
    //         :cond_0
    //         :goto_0
    //         return-object v2
    //         :cond_1
    //         const/4 v12, 0x0
    //         :try_start_0
    //         const-string v3, "hits2"
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/String;
    //         const/4 v5, 0x0
    //         const-string v6, "hit_id"
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x1
    //         const-string v6, "hit_time"
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         const/4 v8, 0x0
    //         const-string v9, "%s ASC"
    //         const/4 v10, 0x1
    //         new-array v10, v10, [Ljava/lang/Object;
    //         const/4 v13, 0x0
    //         const-string v14, "hit_id"
    //         aput-object v14, v10, v13
    //         invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v9
    //         invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v13
    //         :try_start_1
    //         new-instance v12, Ljava/util/ArrayList;
    //         invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V
    //         :try_end_1
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_3
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_3
    //         :try_start_2
    //         invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v3
    //         if-eqz v3, :cond_3
    //         :cond_2
    //         new-instance v4, Lcom/google/android/gms/analytics/w;
    //         const/4 v5, 0x0
    //         const/4 v3, 0x0
    //         invoke-interface {v13, v3}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v6
    //         const/4 v3, 0x1
    //         invoke-interface {v13, v3}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v8
    //         invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/analytics/w;-><init>(Ljava/lang/String;JJ)V
    //         invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z
    //         :try_end_2
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_4
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_3
    //         move-result v3
    //         if-nez v3, :cond_2
    //         :cond_3
    //         if-eqz v13, :cond_4
    //         invoke-interface {v13}, Landroid/database/Cursor;->close()V
    //         :cond_4
    //         const/4 v11, 0x0
    //         :try_start_3
    //         const-string v3, "hits2"
    //         const/4 v4, 0x3
    //         new-array v4, v4, [Ljava/lang/String;
    //         const/4 v5, 0x0
    //         const-string v6, "hit_id"
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x1
    //         const-string v6, "hit_string"
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x2
    //         const-string v6, "hit_url"
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         const/4 v8, 0x0
    //         const-string v9, "%s ASC"
    //         const/4 v10, 0x1
    //         new-array v10, v10, [Ljava/lang/Object;
    //         const/4 v14, 0x0
    //         const-string v15, "hit_id"
    //         aput-object v15, v10, v14
    //         invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v9
    //         invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_3
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         move-result-object v3
    //         :try_start_4
    //         invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         move v4, v11
    //         :goto_1
    //         move-object v0, v3
    //         check-cast v0, Landroid/database/sqlite/SQLiteCursor;
    //         move-object v2, v0
    //         invoke-virtual {v2}, Landroid/database/sqlite/SQLiteCursor;->getWindow()Landroid/database/CursorWindow;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/database/CursorWindow;->getNumRows()I
    //         move-result v2
    //         if-lez v2, :cond_8
    //         invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/analytics/w;
    //         const/4 v5, 0x1
    //         invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, v5}, Lcom/google/android/gms/analytics/w;->aj(Ljava/lang/String;)V
    //         invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/analytics/w;
    //         const/4 v5, 0x2
    //         invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, v5}, Lcom/google/android/gms/analytics/w;->ak(Ljava/lang/String;)V
    //         :goto_2
    //         add-int/lit8 v2, v4, 0x1
    //         invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z
    //         :try_end_4
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_2
    //         move-result v4
    //         if-nez v4, :cond_e
    //         :cond_5
    //         if-eqz v3, :cond_6
    //         invoke-interface {v3}, Landroid/database/Cursor;->close()V
    //         :cond_6
    //         move-object v2, v12
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v2
    //         move-object v3, v2
    //         move-object v4, v12
    //         move-object v2, v11
    //         :goto_3
    //         :try_start_5
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Error in peekHits fetching hitIds: "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v3}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_4
    //         if-eqz v4, :cond_0
    //         invoke-interface {v4}, Landroid/database/Cursor;->close()V
    //         goto/16 :goto_0
    //         :catchall_0
    //         move-exception v2
    //         :goto_4
    //         if-eqz v12, :cond_7
    //         invoke-interface {v12}, Landroid/database/Cursor;->close()V
    //         :cond_7
    //         throw v2
    //         :cond_8
    //         :try_start_6
    //         const-string v5, "HitString for hitId %d too large.  Hit will be deleted."
    //         const/4 v2, 0x1
    //         new-array v6, v2, [Ljava/lang/Object;
    //         const/4 v7, 0x0
    //         invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/analytics/w;
    //         invoke-virtual {v2}, Lcom/google/android/gms/analytics/w;->eG()J
    //         move-result-wide v8
    //         invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v6, v7
    //         invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :try_end_6
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    //         .catchall {:try_start_6 .. :try_end_6} :catchall_2
    //         goto :goto_2
    //         :catch_1
    //         move-exception v2
    //         move-object v13, v3
    //         :goto_5
    //         :try_start_7
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error in peekHits fetching hitString: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v2}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         const/4 v4, 0x0
    //         invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_6
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v2
    //         if-eqz v2, :cond_9
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/analytics/w;
    //         invoke-virtual {v2}, Lcom/google/android/gms/analytics/w;->eF()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         :try_end_7
    //         .catchall {:try_start_7 .. :try_end_7} :catchall_1
    //         move-result v6
    //         if-eqz v6, :cond_c
    //         if-eqz v4, :cond_b
    //         :cond_9
    //         if-eqz v13, :cond_a
    //         invoke-interface {v13}, Landroid/database/Cursor;->close()V
    //         :cond_a
    //         move-object v2, v3
    //         goto/16 :goto_0
    //         :cond_b
    //         const/4 v4, 0x1
    //         :cond_c
    //         :try_start_8
    //         invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_8
    //         .catchall {:try_start_8 .. :try_end_8} :catchall_1
    //         goto :goto_6
    //         :catchall_1
    //         move-exception v2
    //         :goto_7
    //         if-eqz v13, :cond_d
    //         invoke-interface {v13}, Landroid/database/Cursor;->close()V
    //         :cond_d
    //         throw v2
    //         :catchall_2
    //         move-exception v2
    //         move-object v13, v3
    //         goto :goto_7
    //         :catch_2
    //         move-exception v2
    //         goto :goto_5
    //         :catchall_3
    //         move-exception v2
    //         move-object v12, v13
    //         goto :goto_4
    //         :catchall_4
    //         move-exception v2
    //         move-object v12, v4
    //         goto :goto_4
    //         :catch_3
    //         move-exception v2
    //         move-object v3, v2
    //         move-object v4, v13
    //         move-object v2, v11
    //         goto/16 :goto_3
    //         :catch_4
    //         move-exception v2
    //         move-object v3, v2
    //         move-object v4, v13
    //         move-object v2, v12
    //         goto/16 :goto_3
    //         :cond_e
    //         move v4, v2
    //         goto/16 :goto_1
    */

    public fun a(p0: java.util.Map, p1: Long, p2: String, p3: java.util.Collection) { /* TODO(body): (Ljava/util/Map;JLjava/lang/String;Ljava/util/Collection;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;J",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/hb;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eN()I
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/ab;->eM()V
    //         invoke-direct {p0, p1, p5}, Lcom/google/android/gms/analytics/ab;->a(Ljava/util/Map;Ljava/util/Collection;)V
    //         invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/analytics/ab;->a(Ljava/util/Map;JLjava/lang/String;)V
    //         return-void
    */

    fun b(p0: java.util.Collection) { /* TODO(body): (Ljava/util/Collection;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/analytics/w;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const-string v0, "Empty/Null collection passed to deleteHits."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-interface {p1}, Ljava/util/Collection;->size()I
    //         move-result v0
    //         new-array v3, v0, [Ljava/lang/String;
    //         const/4 v0, 0x0
    //         invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         move v1, v0
    //         :goto_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/analytics/w;
    //         add-int/lit8 v2, v1, 0x1
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/w;->eG()J
    //         move-result-wide v6
    //         invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
    //         move-result-object v0
    //         aput-object v0, v3, v1
    //         move v1, v2
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {p0, v3}, Lcom/google/android/gms/analytics/ab;->b([Ljava/lang/String;)V
    //         goto :goto_0
    */

    fun b(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 8
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-eqz p1, :cond_0
    //         array-length v2, p1
    //         if-nez v2, :cond_2
    //         :cond_0
    //         const-string v0, "Empty hitIds passed to deleteHits."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         const-string v2, "Error opening database for deleteHits."
    //         invoke-direct {p0, v2}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         const-string v3, "HIT_ID in (%s)"
    //         new-array v4, v0, [Ljava/lang/Object;
    //         const-string v5, ","
    //         array-length v6, p1
    //         const-string v7, "?"
    //         invoke-static {v6, v7}, Ljava/util/Collections;->nCopies(ILjava/lang/Object;)Ljava/util/List;
    //         move-result-object v6
    //         invoke-static {v5, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v4, v1
    //         invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v4, "hits2"
    //         invoke-virtual {v2, v4, v3, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ab;->yl:Lcom/google/android/gms/analytics/e;
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eO()I
    //         move-result v3
    //         if-nez v3, :cond_3
    //         :goto_1
    //         invoke-interface {v2, v0}, Lcom/google/android/gms/analytics/e;->z(Z)V
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Error deleting hits "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ","
    //         invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_1
    */

    public fun dM(): com.google.android.gms.analytics.m { return TODO("body: ()Lcom/google/android/gms/analytics/m;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->Ba:Lcom/google/android/gms/analytics/m;
    //         return-object v0
    */

    public fun dispatch() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         const/4 v0, 0x1
    //         const-string v2, "Dispatch running..."
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ab;->Ba:Lcom/google/android/gms/analytics/m;
    //         invoke-interface {v2}, Lcom/google/android/gms/analytics/m;->dX()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/16 v2, 0x28
    //         invoke-virtual {p0, v2}, Lcom/google/android/gms/analytics/ab;->G(I)Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         const-string v1, "...nothing to dispatch"
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/ab;->yl:Lcom/google/android/gms/analytics/e;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/analytics/e;->z(Z)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/ab;->Bc:Lcom/google/android/gms/analytics/aa;
    //         if-nez v3, :cond_2
    //         new-instance v3, Lcom/google/android/gms/analytics/aa;
    //         const-string v4, "_t=dispatch&_v=ma4.0.3"
    //         invoke-direct {v3, v4, v0}, Lcom/google/android/gms/analytics/aa;-><init>(Ljava/lang/String;Z)V
    //         iput-object v3, p0, Lcom/google/android/gms/analytics/ab;->Bc:Lcom/google/android/gms/analytics/aa;
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eO()I
    //         move-result v3
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v4
    //         if-gt v3, v4, :cond_3
    //         :goto_1
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/ab;->Ba:Lcom/google/android/gms/analytics/m;
    //         iget-object v4, p0, Lcom/google/android/gms/analytics/ab;->Bc:Lcom/google/android/gms/analytics/aa;
    //         invoke-interface {v3, v2, v4, v0}, Lcom/google/android/gms/analytics/m;->a(Ljava/util/List;Lcom/google/android/gms/analytics/aa;Z)I
    //         move-result v0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "sent "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, " of "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, " hits"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v3
    //         invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I
    //         move-result v3
    //         invoke-interface {v2, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/analytics/ab;->b(Ljava/util/Collection;)V
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v1
    //         if-ne v0, v1, :cond_4
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eO()I
    //         move-result v0
    //         if-lez v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->dispatchLocalHits()V
    //         goto/16 :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_1
    //         :cond_4
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/ab;->Bc:Lcom/google/android/gms/analytics/aa;
    //         goto/16 :goto_0
    */

    fun eN(): Int { return TODO("body: ()I") }
    /*
    //         .locals 8
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ab;->yD:Lcom/google/android/gms/internal/ju;
    //         invoke-interface {v2}, Lcom/google/android/gms/internal/ju;->currentTimeMillis()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Lcom/google/android/gms/analytics/ab;->Bd:J
    //         const-wide/32 v6, 0x5265c00
    //         add-long/2addr v4, v6
    //         cmp-long v4, v2, v4
    //         if-gtz v4, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         iput-wide v2, p0, Lcom/google/android/gms/analytics/ab;->Bd:J
    //         const-string v2, "Error opening database for deleteStaleHits."
    //         invoke-direct {p0, v2}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/ab;->yD:Lcom/google/android/gms/internal/ju;
    //         invoke-interface {v3}, Lcom/google/android/gms/internal/ju;->currentTimeMillis()J
    //         move-result-wide v4
    //         const-wide v6, 0x9a7ec800L
    //         sub-long/2addr v4, v6
    //         const-string v3, "hits2"
    //         const-string v6, "HIT_TIME < ?"
    //         new-array v7, v0, [Ljava/lang/String;
    //         invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v7, v1
    //         invoke-virtual {v2, v3, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //         move-result v2
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/ab;->yl:Lcom/google/android/gms/analytics/e;
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eO()I
    //         move-result v4
    //         if-nez v4, :cond_2
    //         :goto_1
    //         invoke-interface {v3, v0}, Lcom/google/android/gms/analytics/e;->z(Z)V
    //         move v1, v2
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_1
    */

    fun eO(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         const/4 v0, 0x0
    //         const-string v2, "Error opening database for getNumStoredHits."
    //         invoke-direct {p0, v2}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v2
    //         if-nez v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         :try_start_0
    //         const-string v3, "SELECT COUNT(*) from hits2"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const/4 v2, 0x0
    //         invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-wide v2
    //         long-to-int v0, v2
    //         :cond_2
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         :try_start_1
    //         const-string v2, "Error getting numStoredHits"
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         if-eqz v1, :cond_3
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         throw v0
    */

    public fun l(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         const-string v2, "Error opening database for clearHits"
    //         invoke-direct {p0, v2}, Lcom/google/android/gms/analytics/ab;->al(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         const-wide/16 v4, 0x0
    //         cmp-long v3, p1, v4
    //         if-nez v3, :cond_1
    //         const-string v3, "hits2"
    //         invoke-virtual {v2, v3, v6, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ab;->yl:Lcom/google/android/gms/analytics/e;
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ab;->eO()I
    //         move-result v3
    //         if-nez v3, :cond_2
    //         :goto_1
    //         invoke-interface {v2, v0}, Lcom/google/android/gms/analytics/e;->z(Z)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         new-array v3, v0, [Ljava/lang/String;
    //         invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const-string v4, "hits2"
    //         const-string v5, "hit_app_id = ?"
    //         invoke-virtual {v2, v4, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_1
    */

    companion object {
    private val AY: String = null!!

    @JvmStatic fun A(p0: java.util.Map): String { return TODO("body: (Ljava/util/Map;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-interface {p0}, Ljava/util/Map;->size()I
    //         move-result v0
    //         invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/x;->encode(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v4, "="
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/x;->encode(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "&"
    //         invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.analytics.ab): com.google.android.gms.internal.ju { return TODO("body: (Lcom/google/android/gms/analytics/ab;)Lcom/google/android/gms/internal/ju;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->yD:Lcom/google/android/gms/internal/ju;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.analytics.ab): String { return TODO("body: (Lcom/google/android/gms/analytics/ab;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->Bb:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.analytics.ab): android.content.Context { return TODO("body: (Lcom/google/android/gms/analytics/ab;)Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ab;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    @JvmStatic fun eP(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/analytics/ab;->AY:Ljava/lang/String;
    //         return-object v0
    */

    }
}
