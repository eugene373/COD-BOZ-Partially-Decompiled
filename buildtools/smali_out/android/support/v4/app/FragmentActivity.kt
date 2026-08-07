package android.support.v4.app

// Auto-emitted from smali source: FragmentActivity.java.
// 18 fields, 43 methods.

open class FragmentActivity: android.app.Activity() {
    var mAllLoaderManagers: android.support.v4.util.SimpleArrayMap
    var mCheckedForLoaderManager: Boolean
    val mContainer: android.support.v4.app.FragmentContainer
    var mCreated: Boolean
    val mFragments: android.support.v4.app.FragmentManagerImpl
    val mHandler: android.os.Handler
    var mLoaderManager: android.support.v4.app.LoaderManagerImpl
    var mLoadersStarted: Boolean
    var mOptionsMenuInvalidated: Boolean
    var mReallyStopped: Boolean
    var mResumed: Boolean
    var mRetaining: Boolean
    var mStopped: Boolean

    public constructor()

    private fun dumpViewHierarchy(prefix: String, writer: java.io.PrintWriter, view: android.view.View) { /* TODO(body): (Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         if-nez p3, :cond_1
    //         const-string v3, "null"
    //         invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         invoke-static {p3}, Landroid/support/v4/app/FragmentActivity;->viewToString(Landroid/view/View;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         instance-of v3, p3, Landroid/view/ViewGroup;
    //         if-eqz v3, :cond_0
    //         move-object v1, p3
    //         check-cast v1, Landroid/view/ViewGroup;
    //         .local v1, "grp":Landroid/view/ViewGroup;
    //         invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
    //         move-result v0
    //         .local v0, "N":I
    //         if-lez v0, :cond_0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, "  "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p1
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         if-ge v2, v0, :cond_0
    //         invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    //         move-result-object v3
    //         invoke-direct {p0, p1, p2, v3}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    */

    fun doReallyStop(retaining: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
    //         if-nez v0, :cond_0
    //         iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
    //         iput-boolean p1, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onReallyStop()V
    //         :cond_0
    //         return-void
    */

    public fun dump(prefix: String, fd: java.io.FileDescriptor, writer: java.io.PrintWriter, args: Array<String>) { /* TODO(body): (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0xb
    //         if-lt v1, v2, :cond_0
    //         :cond_0
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, "Local FragmentActivity "
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, " State:"
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "  "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "innerPrefix":Ljava/lang/String;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, "mCreated="
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v1, "mResumed="
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v1, " mStopped="
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v1, " mReallyStopped="
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, "mLoadersStarted="
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, "Loader Manager "
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, ":"
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "  "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p1, p2, p3, p4}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v1, "View Hierarchy:"
    //         invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "  "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v2
    //         invoke-direct {p0, v1, p3, v2}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
    //         return-void
    */

    public fun getLastCustomNonConfigurationInstance(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    //         .local v0, "nc":Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    //         if-eqz v0, :cond_0
    //         iget-object v1, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    fun getLoaderManager(who: String, started: Boolean, create: Boolean): android.support.v4.app.LoaderManagerImpl { return TODO("body: (Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         if-nez v1, :cond_0
    //         new-instance v1, Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-direct {v1}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V
    //         iput-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;
    //         .local v0, "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         if-nez v0, :cond_2
    //         if-eqz p3, :cond_1
    //         new-instance v0, Landroid/support/v4/app/LoaderManagerImpl;
    //         .end local v0    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-direct {v0, p1, p0, p2}, Landroid/support/v4/app/LoaderManagerImpl;-><init>(Ljava/lang/String;Landroid/support/v4/app/FragmentActivity;Z)V
    //         .restart local v0    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v1, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         :goto_0
    //         return-object v0
    //         :cond_2
    //         invoke-virtual {v0, p0}, Landroid/support/v4/app/LoaderManagerImpl;->updateActivity(Landroid/support/v4/app/FragmentActivity;)V
    //         goto :goto_0
    */

    public fun getSupportFragmentManager(): android.support.v4.app.FragmentManager { return TODO("body: ()Landroid/support/v4/app/FragmentManager;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         return-object v0
    */

    public fun getSupportLoaderManager(): android.support.v4.app.LoaderManager { return TODO("body: ()Landroid/support/v4/app/LoaderManager;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iput-boolean v2, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
    //         const-string v0, "(root)"
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         goto :goto_0
    */

    fun invalidateSupportFragment(who: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;
    //         .local v0, "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-boolean v1, v0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
    //         if-nez v1, :cond_0
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         .end local v0    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_0
    //         return-void
    */

    protected fun onActivityResult(requestCode: Int, resultCode: Int, data: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 5
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         shr-int/lit8 v1, p1, 0x10
    //         .local v1, "index":I
    //         if-eqz v1, :cond_3
    //         add-int/lit8 v1, v1, -0x1
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
    //         if-eqz v2, :cond_0
    //         if-ltz v1, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         if-lt v1, v2, :cond_1
    //         :cond_0
    //         const-string v2, "FragmentActivity"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Activity result fragment index out of range: 0x"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "frag":Landroid/support/v4/app/Fragment;
    //         if-nez v0, :cond_2
    //         const-string v2, "FragmentActivity"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Activity result no fragment exists for index: 0x"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_2
    //         const v2, 0xffff
    //         and-int/2addr v2, p1
    //         invoke-virtual {v0, v2, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V
    //         goto :goto_0
    //         .end local v0    # "frag":Landroid/support/v4/app/Fragment;
    //         :cond_3
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
    //         goto :goto_0
    */

    public fun onAttachFragment(fragment: android.support.v4.app.Fragment) { /* TODO(body): (Landroid/support/v4/app/Fragment;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onBackPressed() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackImmediate()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->supportFinishAfterTransition()V
    //         :cond_0
    //         return-void
    */

    public fun onConfigurationChanged(newConfig: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
    //         return-void
    */

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;
    //         invoke-virtual {v3, p0, v4, v2}, Landroid/support/v4/app/FragmentManagerImpl;->attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
    //         move-result-object v3
    //         invoke-virtual {v3, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V
    //         :cond_0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    //         .local v0, "nc":Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    //         if-eqz v0, :cond_1
    //         iget-object v3, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Landroid/support/v4/util/SimpleArrayMap;
    //         iput-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         :cond_1
    //         if-eqz p1, :cond_3
    //         const-string v3, "android:support:fragments"
    //         invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         .local v1, "p":Landroid/os/Parcelable;
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_2
    //         iget-object v2, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;
    //         :cond_2
    //         invoke-virtual {v3, v1, v2}, Landroid/support/v4/app/FragmentManagerImpl;->restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
    //         .end local v1    # "p":Landroid/os/Parcelable;
    //         :cond_3
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
    //         return-void
    */

    public fun onCreatePanelMenu(featureId: Int, menu: android.view.Menu): Boolean { return TODO("body: (ILandroid/view/Menu;)Z") }
    /*
    //         .locals 3
    //         if-nez p1, :cond_1
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
    //         move-result v0
    //         .local v0, "show":Z
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getMenuInflater()Landroid/view/MenuInflater;
    //         move-result-object v2
    //         invoke-virtual {v1, p2, v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    //         move-result v1
    //         or-int/2addr v0, v1
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0xb
    //         if-lt v1, v2, :cond_0
    //         .end local v0    # "show":Z
    //         :goto_0
    //         return v0
    //         .restart local v0    # "show":Z
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         .end local v0    # "show":Z
    //         :cond_1
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun onCreateView(name: String, context: android.content.Context, attrs: android.util.AttributeSet): android.view.View { return TODO("body: (Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;") }
    /*
    //         .locals 2
    //         .end param
    //         .end param
    //         const-string v1, "fragment"
    //         invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p1, p2, p3}, Landroid/support/v4/app/FragmentManagerImpl;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "v":Landroid/view/View;
    //         if-nez v0, :cond_0
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroy()V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
    //         :cond_0
    //         return-void
    */

    public fun onKeyDown(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/4 v1, 0x5
    //         if-ge v0, v1, :cond_0
    //         const/4 v0, 0x4
    //         if-ne p1, v0, :cond_0
    //         invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchLowMemory()V
    //         return-void
    */

    public fun onMenuItemSelected(featureId: Int, item: android.view.MenuItem): Boolean { return TODO("body: (ILandroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sparse-switch p1, :sswitch_data_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :sswitch_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         goto :goto_0
    //         :sswitch_1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchContextItemSelected(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x6 -> :sswitch_1
    //         .end sparse-switch
    */

    protected fun onNewIntent(intent: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         return-void
    */

    public fun onPanelClosed(featureId: Int, menu: android.view.Menu) { /* TODO(body): (ILandroid/view/Menu;)V */ }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         :goto_0
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V
    //         return-void
    //         :pswitch_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsMenuClosed(Landroid/view/Menu;)V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //         .end packed-switch
    */

    protected fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x2
    //         invoke-super {p0}, Landroid/app/Activity;->onPause()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPause()V
    //         return-void
    */

    protected fun onPostResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onPostResume()V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         const/4 v1, 0x2
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         return-void
    */

    protected fun onPrepareOptionsPanel(view: android.view.View, menu: android.view.Menu): Boolean { return TODO("body: (Landroid/view/View;Landroid/view/Menu;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    //         move-result v0
    //         return v0
    */

    public fun onPreparePanel(featureId: Int, view: android.view.View, menu: android.view.Menu): Boolean { return TODO("body: (ILandroid/view/View;Landroid/view/Menu;)Z") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_1
    //         if-eqz p3, :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
    //         invoke-interface {p3}, Landroid/view/Menu;->clear()V
    //         invoke-virtual {p0, p1, p3}, Landroid/support/v4/app/FragmentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
    //         :cond_0
    //         invoke-virtual {p0, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
    //         move-result v0
    //         .local v0, "goforit":Z
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p3}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
    //         move-result v1
    //         or-int/2addr v0, v1
    //         .end local v0    # "goforit":Z
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    //         move-result v0
    //         goto :goto_0
    */

    fun onReallyStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStop()V
    //         :cond_0
    //         :goto_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchReallyStop()V
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doRetain()V
    //         goto :goto_0
    */

    protected fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onResume()V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         const/4 v1, 0x2
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         return-void
    */

    protected fun onResumeFragments() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
    //         return-void
    */

    public fun onRetainCustomNonConfigurationInstance(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onRetainNonConfigurationInstance(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 11
    //         const/4 v9, 0x0
    //         iget-boolean v8, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
    //         if-eqz v8, :cond_0
    //         const/4 v8, 0x1
    //         invoke-virtual {p0, v8}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "custom":Ljava/lang/Object;
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v8}, Landroid/support/v4/app/FragmentManagerImpl;->retainNonConfig()Ljava/util/ArrayList;
    //         move-result-object v2
    //         .local v2, "fragments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
    //         const/4 v7, 0x0
    //         .local v7, "retainLoaders":Z
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         if-eqz v8, :cond_3
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v8}, Landroid/support/v4/util/SimpleArrayMap;->size()I
    //         move-result v0
    //         .local v0, "N":I
    //         new-array v5, v0, [Landroid/support/v4/app/LoaderManagerImpl;
    //         .local v5, "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
    //         add-int/lit8 v3, v0, -0x1
    //         .local v3, "i":I
    //         :goto_0
    //         if-ltz v3, :cond_1
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v8, v3}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v8
    //         check-cast v8, Landroid/support/v4/app/LoaderManagerImpl;
    //         aput-object v8, v5, v3
    //         add-int/lit8 v3, v3, -0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v3, 0x0
    //         :goto_1
    //         if-ge v3, v0, :cond_3
    //         aget-object v4, v5, v3
    //         .local v4, "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         iget-boolean v8, v4, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
    //         if-eqz v8, :cond_2
    //         const/4 v7, 0x1
    //         :goto_2
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         iget-object v10, v4, Landroid/support/v4/app/LoaderManagerImpl;->mWho:Ljava/lang/String;
    //         invoke-virtual {v8, v10}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_2
    //         .end local v0    # "N":I
    //         .end local v3    # "i":I
    //         .end local v4    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         .end local v5    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_3
    //         if-nez v2, :cond_4
    //         if-nez v7, :cond_4
    //         if-nez v1, :cond_4
    //         move-object v6, v9
    //         :goto_3
    //         return-object v6
    //         :cond_4
    //         new-instance v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    //         invoke-direct {v6}, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;-><init>()V
    //         .local v6, "nci":Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    //         iput-object v9, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->activity:Ljava/lang/Object;
    //         iput-object v1, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;
    //         iput-object v9, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->children:Landroid/support/v4/util/SimpleArrayMap;
    //         iput-object v2, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         iput-object v8, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Landroid/support/v4/util/SimpleArrayMap;
    //         goto :goto_3
    */

    protected fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->saveAllState()Landroid/os/Parcelable;
    //         move-result-object v0
    //         .local v0, "p":Landroid/os/Parcelable;
    //         if-eqz v0, :cond_0
    //         const-string v1, "android:support:fragments"
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_0
    //         return-void
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         const/4 v6, 0x1
    //         invoke-super {p0}, Landroid/app/Activity;->onStart()V
    //         iput-boolean v7, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
    //         iput-boolean v7, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v4, v6}, Landroid/os/Handler;->removeMessages(I)V
    //         iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
    //         if-nez v4, :cond_0
    //         iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
    //         :cond_0
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         if-nez v4, :cond_2
    //         iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v4, :cond_3
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
    //         :cond_1
    //         :goto_0
    //         iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
    //         :cond_2
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         if-eqz v4, :cond_5
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v4}, Landroid/support/v4/util/SimpleArrayMap;->size()I
    //         move-result v0
    //         .local v0, "N":I
    //         new-array v3, v0, [Landroid/support/v4/app/LoaderManagerImpl;
    //         .local v3, "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
    //         add-int/lit8 v1, v0, -0x1
    //         .local v1, "i":I
    //         :goto_1
    //         if-ltz v1, :cond_4
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v4, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v4
    //         check-cast v4, Landroid/support/v4/app/LoaderManagerImpl;
    //         aput-object v4, v3, v1
    //         add-int/lit8 v1, v1, -0x1
    //         goto :goto_1
    //         .end local v0    # "N":I
    //         .end local v1    # "i":I
    //         .end local v3    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_3
    //         iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
    //         if-nez v4, :cond_1
    //         const-string v4, "(root)"
    //         iget-boolean v5, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
    //         invoke-virtual {p0, v4, v5, v7}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    //         move-result-object v4
    //         iput-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v4, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         iget-boolean v4, v4, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
    //         if-nez v4, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
    //         goto :goto_0
    //         .restart local v0    # "N":I
    //         .restart local v1    # "i":I
    //         .restart local v3    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_4
    //         const/4 v1, 0x0
    //         :goto_2
    //         if-ge v1, v0, :cond_5
    //         aget-object v2, v3, v1
    //         .local v2, "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->finishRetain()V
    //         invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->doReportStart()V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_2
    //         .end local v0    # "N":I
    //         .end local v1    # "i":I
    //         .end local v2    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
    //         .end local v3    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_5
    //         return-void
    */

    protected fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         invoke-super {p0}, Landroid/app/Activity;->onStop()V
    //         iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStop()V
    //         return-void
    */

    public fun setEnterSharedElementCallback(callback: android.support.v4.app.SharedElementCallback) { /* TODO(body): (Landroid/support/v4/app/SharedElementCallback;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1}, Landroid/support/v4/app/ActivityCompat;->setEnterSharedElementCallback(Landroid/app/Activity;Landroid/support/v4/app/SharedElementCallback;)V
    //         return-void
    */

    public fun setExitSharedElementCallback(listener: android.support.v4.app.SharedElementCallback) { /* TODO(body): (Landroid/support/v4/app/SharedElementCallback;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1}, Landroid/support/v4/app/ActivityCompat;->setExitSharedElementCallback(Landroid/app/Activity;Landroid/support/v4/app/SharedElementCallback;)V
    //         return-void
    */

    public fun startActivityForResult(intent: android.content.Intent, requestCode: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 2
    //         const/4 v0, -0x1
    //         if-eq p2, v0, :cond_0
    //         const/high16 v0, -0x10000
    //         and-int/2addr v0, p2
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Can only use lower 16 bits for requestCode"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         return-void
    */

    public fun startActivityFromFragment(fragment: android.support.v4.app.Fragment, intent: android.content.Intent, requestCode: Int) { /* TODO(body): (Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V */ }
    /*
    //         .locals 2
    //         const/4 v0, -0x1
    //         if-ne p3, v0, :cond_0
    //         invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/high16 v0, -0x10000
    //         and-int/2addr v0, p3
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Can only use lower 16 bits for requestCode"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I
    //         add-int/lit8 v0, v0, 0x1
    //         shl-int/lit8 v0, v0, 0x10
    //         const v1, 0xffff
    //         and-int/2addr v1, p3
    //         add-int/2addr v0, v1
    //         invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         goto :goto_0
    */

    public fun supportFinishAfterTransition() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompat;->finishAfterTransition(Landroid/app/Activity;)V
    //         return-void
    */

    public fun supportInvalidateOptionsMenu() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
    //         goto :goto_0
    */

    public fun supportPostponeEnterTransition() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompat;->postponeEnterTransition(Landroid/app/Activity;)V
    //         return-void
    */

    public fun supportStartPostponedEnterTransition() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompat;->startPostponedEnterTransition(Landroid/app/Activity;)V
    //         return-void
    */

    companion object {
    val FRAGMENTS_TAG: String = "android:support:fragments"
    private val HONEYCOMB: Int = 0xb
    val MSG_REALLY_STOPPED: Int = 0x1
    val MSG_RESUME_PENDING: Int = 0x2
    private val TAG: String = "FragmentActivity"

    private @JvmStatic fun viewToString(view: android.view.View): String { return TODO("body: (Landroid/view/View;)Ljava/lang/String;") }
    /*
    //         .locals 12
    //         const/16 v9, 0x56
    //         const/16 v7, 0x46
    //         const/16 v11, 0x2c
    //         const/16 v10, 0x20
    //         const/16 v8, 0x2e
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         const/16 v6, 0x80
    //         invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v2, "out":Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v6
    //         invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const/16 v6, 0x7b
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
    //         move-result v6
    //         invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
    //         move-result v6
    //         sparse-switch v6, :sswitch_data_0
    //         invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         :goto_0
    //         invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z
    //         move-result v6
    //         if-eqz v6, :cond_2
    //         move v6, v7
    //         :goto_1
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z
    //         move-result v6
    //         if-eqz v6, :cond_3
    //         const/16 v6, 0x45
    //         :goto_2
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z
    //         move-result v6
    //         if-eqz v6, :cond_4
    //         move v6, v8
    //         :goto_3
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z
    //         move-result v6
    //         if-eqz v6, :cond_5
    //         const/16 v6, 0x48
    //         :goto_4
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z
    //         move-result v6
    //         if-eqz v6, :cond_6
    //         move v6, v9
    //         :goto_5
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isClickable()Z
    //         move-result v6
    //         if-eqz v6, :cond_7
    //         const/16 v6, 0x43
    //         :goto_6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z
    //         move-result v6
    //         if-eqz v6, :cond_8
    //         const/16 v6, 0x4c
    //         :goto_7
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isFocused()Z
    //         move-result v6
    //         if-eqz v6, :cond_9
    //         :goto_8
    //         invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isSelected()Z
    //         move-result v6
    //         if-eqz v6, :cond_a
    //         const/16 v6, 0x53
    //         :goto_9
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->isPressed()Z
    //         move-result v6
    //         if-eqz v6, :cond_0
    //         const/16 v8, 0x50
    //         :cond_0
    //         invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getLeft()I
    //         move-result v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getTop()I
    //         move-result v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         const/16 v6, 0x2d
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getRight()I
    //         move-result v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getBottom()I
    //         move-result v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getId()I
    //         move-result v1
    //         .local v1, "id":I
    //         const/4 v6, -0x1
    //         if-eq v1, v6, :cond_1
    //         const-string v6, " #"
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
    //         move-result-object v4
    //         .local v4, "r":Landroid/content/res/Resources;
    //         if-eqz v1, :cond_1
    //         if-eqz v4, :cond_1
    //         const/high16 v6, -0x1000000
    //         and-int/2addr v6, v1
    //         sparse-switch v6, :sswitch_data_1
    //         :try_start_0
    //         invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "pkgname":Ljava/lang/String;
    //         :goto_a
    //         invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;
    //         move-result-object v5
    //         .local v5, "typename":Ljava/lang/String;
    //         invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "entryname":Ljava/lang/String;
    //         const-string v6, " "
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v6, ":"
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v6, "/"
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :try_end_0
    //         .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v0    # "entryname":Ljava/lang/String;
    //         .end local v3    # "pkgname":Ljava/lang/String;
    //         .end local v4    # "r":Landroid/content/res/Resources;
    //         .end local v5    # "typename":Ljava/lang/String;
    //         :cond_1
    //         :goto_b
    //         const-string v6, "}"
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v6
    //         return-object v6
    //         .end local v1    # "id":I
    //         :sswitch_0
    //         invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         goto/16 :goto_0
    //         :sswitch_1
    //         const/16 v6, 0x49
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         goto/16 :goto_0
    //         :sswitch_2
    //         const/16 v6, 0x47
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         goto/16 :goto_0
    //         :cond_2
    //         move v6, v8
    //         goto/16 :goto_1
    //         :cond_3
    //         move v6, v8
    //         goto/16 :goto_2
    //         :cond_4
    //         const/16 v6, 0x44
    //         goto/16 :goto_3
    //         :cond_5
    //         move v6, v8
    //         goto/16 :goto_4
    //         :cond_6
    //         move v6, v8
    //         goto/16 :goto_5
    //         :cond_7
    //         move v6, v8
    //         goto/16 :goto_6
    //         :cond_8
    //         move v6, v8
    //         goto/16 :goto_7
    //         :cond_9
    //         move v7, v8
    //         goto/16 :goto_8
    //         :cond_a
    //         move v6, v8
    //         goto/16 :goto_9
    //         .restart local v1    # "id":I
    //         .restart local v4    # "r":Landroid/content/res/Resources;
    //         :sswitch_3
    //         :try_start_1
    //         const-string v3, "app"
    //         .restart local v3    # "pkgname":Ljava/lang/String;
    //         goto :goto_a
    //         .end local v3    # "pkgname":Ljava/lang/String;
    //         :sswitch_4
    //         const-string v3, "android"
    //         :try_end_1
    //         .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .restart local v3    # "pkgname":Ljava/lang/String;
    //         goto :goto_a
    //         .end local v3    # "pkgname":Ljava/lang/String;
    //         :catch_0
    //         move-exception v6
    //         goto :goto_b
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x4 -> :sswitch_1
    //             0x8 -> :sswitch_2
    //         .end sparse-switch
    //         :sswitch_data_1
    //         .sparse-switch
    //             0x1000000 -> :sswitch_4
    //             0x7f000000 -> :sswitch_3
    //         .end sparse-switch
    */

    }
}
