package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ec_a: android.database.sqlite.SQLiteOpenHelper() {
    val sJ: com.google.android.gms.internal.ec

    public constructor(p0: com.google.android.gms.internal.ec, p1: android.content.Context, p2: String)

    public fun onCreate(db: android.database.sqlite.SQLiteDatabase) { /* TODO(body): (Landroid/database/sqlite/SQLiteDatabase;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/ec;->cs()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    //         return-void
    */

    public fun onUpgrade(db: android.database.sqlite.SQLiteDatabase, oldVersion: Int, newVersion: Int) { /* TODO(body): (Landroid/database/sqlite/SQLiteDatabase;II)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Database updated from version "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " to version "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         const-string v0, "DROP TABLE IF EXISTS InAppPurchase"
    //         invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ec$a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    //         return-void
    */

}
