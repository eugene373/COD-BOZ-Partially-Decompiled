package android.support.v4.app

// Auto-emitted from smali source: TaskStackBuilder.java.
// 0 fields, 2 methods.

open class TaskStackBuilder_TaskStackBuilderImplBase: android.support.v4.app.TaskStackBuilder.TaskStackBuilderImpl {
    constructor()

    public fun getPendingIntent(context: android.content.Context, intents: Array<android.content.Intent>, requestCode: Int, flags: Int, options: android.os.Bundle): android.app.PendingIntent { return TODO("body: (Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         array-length v1, p2
    //         add-int/lit8 v1, v1, -0x1
    //         aget-object v1, p2, v1
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         .local v0, "topIntent":Landroid/content/Intent;
    //         const/high16 v1, 0x10000000
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         invoke-static {p1, p3, v0, p4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //         move-result-object v1
    //         return-object v1
    */

}
