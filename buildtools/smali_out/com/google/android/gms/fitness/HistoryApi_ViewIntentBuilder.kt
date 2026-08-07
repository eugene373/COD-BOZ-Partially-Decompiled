package com.google.android.gms.fitness

// Auto-emitted from smali.
// 6 fields, 6 methods.

open class HistoryApi_ViewIntentBuilder {
    private var KS: Long
    private val Sp: com.google.android.gms.fitness.data.DataType
    private var Sq: com.google.android.gms.fitness.data.DataSource
    private var Sr: Long
    private var Ss: String
    private val mContext: android.content.Context

    public constructor(context: android.content.Context, dataType: com.google.android.gms.fitness.data.DataType)

    private fun i(p0: android.content.Intent): android.content.Intent { return TODO("body: (Landroid/content/Intent;)Landroid/content/Intent;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_1
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
    //         iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
    //         new-instance v2, Landroid/content/ComponentName;
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         invoke-direct {v2, v3, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-object p1, v0
    //         goto :goto_0
    */

    public fun build(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 8
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->KS:J
    //         const-wide/16 v6, 0x0
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Start time must be set"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sr:J
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->KS:J
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_1
    //         :goto_1
    //         const-string v0, "End time must be set and after start time"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "vnd.google.fitness.VIEW"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/fitness/data/DataType;->getMimeType(Lcom/google/android/gms/fitness/data/DataType;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "vnd.google.fitness.start_time"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->KS:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    //         const-string v1, "vnd.google.fitness.end_time"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sr:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         const-string v2, "vnd.google.fitness.data_source"
    //         invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;Landroid/content/Intent;Ljava/lang/String;)V
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->i(Landroid/content/Intent;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    public fun setDataSource(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;") }
    /*
    //         .locals 5
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         const-string v1, "Data source %s is not for the data type %s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         const/4 v3, 0x1
    //         iget-object v4, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object p0
    */

    public fun setPreferredApplication(packageName: String): com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Ss:Ljava/lang/String;
    //         return-object p0
    */

    public fun setTimeInterval(start: Long, end: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder { return TODO("body: (JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;") }
    /*
    //         .locals 3
    //         invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->KS:J
    //         invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/HistoryApi$ViewIntentBuilder;->Sr:J
    //         return-object p0
    */

}
