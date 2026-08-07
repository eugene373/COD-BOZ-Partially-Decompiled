package android.support.v4.app

// Auto-emitted from smali source: TaskStackBuilder.java.
// 4 fields, 18 methods.

open class TaskStackBuilder: Iterable {
    private val mIntents: java.util.ArrayList
    private val mSourceContext: android.content.Context

    private constructor(a: android.content.Context)

    public fun addNextIntent(nextIntent: android.content.Intent): android.support.v4.app.TaskStackBuilder { return TODO("body: (Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addNextIntentWithParentStack(nextIntent: android.content.Intent): android.support.v4.app.TaskStackBuilder { return TODO("body: (Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
    //         move-result-object v0
    //         .local v0, "target":Landroid/content/ComponentName;
    //         if-nez v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //         move-result-object v0
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
    //         :cond_1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
    //         return-object p0
    */

    public fun addParentStack(sourceActivity: android.app.Activity): android.support.v4.app.TaskStackBuilder { return TODO("body: (Landroid/app/Activity;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         .local v0, "parent":Landroid/content/Intent;
    //         instance-of v2, p1, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;
    //         if-eqz v2, :cond_0
    //         move-object v2, p1
    //         check-cast v2, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;
    //         invoke-interface {v2}, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;->getSupportParentActivityIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         :cond_0
    //         if-nez v0, :cond_1
    //         invoke-static {p1}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    //         move-result-object v0
    //         :cond_1
    //         if-eqz v0, :cond_3
    //         invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
    //         move-result-object v1
    //         .local v1, "target":Landroid/content/ComponentName;
    //         if-nez v1, :cond_2
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //         move-result-object v1
    //         :cond_2
    //         invoke-virtual {p0, v1}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
    //         .end local v1    # "target":Landroid/content/ComponentName;
    //         :cond_3
    //         return-object p0
    */

    public fun addParentStack(sourceActivityName: android.content.ComponentName): android.support.v4.app.TaskStackBuilder { return TODO("body: (Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 5
    //         iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         .local v1, "insertAt":I
    //         :try_start_0
    //         iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-static {v3, p1}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v2
    //         .local v2, "parent":Landroid/content/Intent;
    //         :goto_0
    //         if-eqz v2, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    //         iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v2
    //         goto :goto_0
    //         .end local v2    # "parent":Landroid/content/Intent;
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    //         const-string v3, "TaskStackBuilder"
    //         const-string v4, "Bad ComponentName while traversing activity parent metadata"
    //         invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v3, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
    //         throw v3
    //         .end local v0    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    //         .restart local v2    # "parent":Landroid/content/Intent;
    //         :cond_0
    //         return-object p0
    */

    public fun addParentStack(p0: Class): android.support.v4.app.TaskStackBuilder { return TODO("body: (Ljava/lang/Class;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<*>;)",
    //                 "Landroid/support/v4/app/TaskStackBuilder;"
    //             }
    //         .end annotation
    //         .local p1, "sourceActivityClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         new-instance v0, Landroid/content/ComponentName;
    //         iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun editIntentAt(index: Int): android.content.Intent { return TODO("body: (I)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         return-object v0
    */

    public fun getIntent(index: Int): android.content.Intent { return TODO("body: (I)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/TaskStackBuilder;->editIntentAt(I)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIntentCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         return v0
    */

    public fun getIntents(): Array<android.content.Intent> { return TODO("body: ()[Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         new-array v1, v2, [Landroid/content/Intent;
    //         .local v1, "intents":[Landroid/content/Intent;
    //         array-length v2, v1
    //         if-nez v2, :cond_1
    //         :cond_0
    //         return-object v1
    //         :cond_1
    //         new-instance v3, Landroid/content/Intent;
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/content/Intent;
    //         invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         const v2, 0x1000c000
    //         invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         move-result-object v2
    //         aput-object v2, v1, v4
    //         const/4 v0, 0x1
    //         .local v0, "i":I
    //         :goto_0
    //         array-length v2, v1
    //         if-ge v0, v2, :cond_0
    //         new-instance v3, Landroid/content/Intent;
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/content/Intent;
    //         invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         aput-object v3, v1, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    public fun getPendingIntent(requestCode: Int, flags: Int): android.app.PendingIntent { return TODO("body: (II)Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/TaskStackBuilder;->getPendingIntent(IILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPendingIntent(requestCode: Int, flags: Int, options: android.os.Bundle): android.app.PendingIntent { return TODO("body: (IILandroid/os/Bundle;)Landroid/app/PendingIntent;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "No intents added to TaskStackBuilder; cannot getPendingIntent"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         new-array v1, v1, [Landroid/content/Intent;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, [Landroid/content/Intent;
    //         .local v2, "intents":[Landroid/content/Intent;
    //         new-instance v0, Landroid/content/Intent;
    //         aget-object v1, v2, v3
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         const v1, 0x1000c000
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         move-result-object v0
    //         aput-object v0, v2, v3
    //         sget-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         move v3, p1
    //         move v4, p2
    //         move-object v5, p3
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;->getPendingIntent(Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun iterator(): java.util.Iterator { return TODO("body: ()Ljava/util/Iterator;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Iterator",
    //                 "<",
    //                 "Landroid/content/Intent;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         return-object v0
    */

    public fun startActivities() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->startActivities(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun startActivities(options: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         new-instance v2, Ljava/lang/IllegalStateException;
    //         const-string v3, "No intents added to TaskStackBuilder; cannot startActivities"
    //         invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_0
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         new-array v3, v3, [Landroid/content/Intent;
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Landroid/content/Intent;
    //         .local v0, "intents":[Landroid/content/Intent;
    //         new-instance v2, Landroid/content/Intent;
    //         aget-object v3, v0, v4
    //         invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         const v3, 0x1000c000
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         move-result-object v2
    //         aput-object v2, v0, v4
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-static {v2, v0, p1}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         new-instance v1, Landroid/content/Intent;
    //         array-length v2, v0
    //         add-int/lit8 v2, v2, -0x1
    //         aget-object v2, v0, v2
    //         invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         .local v1, "topIntent":Landroid/content/Intent;
    //         const/high16 v2, 0x10000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
    //         invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         .end local v1    # "topIntent":Landroid/content/Intent;
    //         :cond_1
    //         return-void
    */

    companion object {
    private val IMPL: android.support.v4.app.TaskStackBuilder.TaskStackBuilderImpl = null!!
    private val TAG: String = "TaskStackBuilder"

    public @JvmStatic fun create(context: android.content.Context): android.support.v4.app.TaskStackBuilder { return TODO("body: (Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/app/TaskStackBuilder;
    //         invoke-direct {v0, p0}, Landroid/support/v4/app/TaskStackBuilder;-><init>(Landroid/content/Context;)V
    //         return-object v0
    */

    public @JvmStatic fun from(context: android.content.Context): android.support.v4.app.TaskStackBuilder { return TODO("body: (Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Landroid/support/v4/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
