package android.support.v4.content

// Auto-emitted from smali source: Loader.java.
// 8 fields, 26 methods.

open class Loader {
    var mAbandoned: Boolean
    var mContentChanged: Boolean
    var mContext: android.content.Context
    var mId: Int
    var mListener: android.support.v4.content.Loader.OnLoadCompleteListener
    var mProcessingChange: Boolean
    var mReset: Boolean
    var mStarted: Boolean

    public constructor(context: android.content.Context)

    public fun abandon() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
    //         invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onAbandon()V
    //         return-void
    */

    public fun commitContentChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         return-void
    */

    public fun dataToString(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TD;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         .local p1, "data":Ljava/lang/Object;, "TD;"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const/16 v1, 0x40
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "sb":Ljava/lang/StringBuilder;
    //         invoke-static {p1, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

    public fun deliverResult(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TD;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         .local p1, "data":Ljava/lang/Object;, "TD;"
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/content/Loader$OnLoadCompleteListener;->onLoadComplete(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
    //         :cond_0
    //         return-void
    */

    public fun dump(prefix: String, fd: java.io.FileDescriptor, writer: java.io.PrintWriter, args: Array<String>) { /* TODO(body): (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mId="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/content/Loader;->mId:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
    //         const-string v0, " mListener="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         if-nez v0, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         if-nez v0, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mStarted="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mContentChanged="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mProcessingChange="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         :cond_1
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
    //         if-nez v0, :cond_2
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
    //         if-eqz v0, :cond_3
    //         :cond_2
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mAbandoned="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mReset="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         :cond_3
    //         return-void
    */

    public fun forceLoad() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onForceLoad()V
    //         return-void
    */

    public fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    public fun getId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget v0, p0, Landroid/support/v4/content/Loader;->mId:I
    //         return v0
    */

    public fun isAbandoned(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
    //         return v0
    */

    public fun isReset(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
    //         return v0
    */

    public fun isStarted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         return v0
    */

    protected fun onAbandon() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         return-void
    */

    public fun onContentChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/content/Loader;->forceLoad()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         goto :goto_0
    */

    protected fun onForceLoad() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         return-void
    */

    protected fun onReset() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         return-void
    */

    protected fun onStartLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         return-void
    */

    protected fun onStopLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         return-void
    */

    public fun registerListener(id: Int, p1: android.support.v4.content.Loader.OnLoadCompleteListener) { /* TODO(body): (ILandroid/support/v4/content/Loader$OnLoadCompleteListener;)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         .local p2, "listener":Landroid/support/v4/content/Loader$OnLoadCompleteListener;, "Landroid/support/v4/content/Loader$OnLoadCompleteListener<TD;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "There is already a listener registered"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-object p2, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         iput p1, p0, Landroid/support/v4/content/Loader;->mId:I
    //         return-void
    */

    public fun reset() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onReset()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         return-void
    */

    public fun rollbackContentChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         :cond_0
    //         return-void
    */

    public fun startLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         const/4 v1, 0x0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mReset:Z
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
    //         invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onStartLoading()V
    //         return-void
    */

    public fun stopLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
    //         invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onStopLoading()V
    //         return-void
    */

    public fun takeContentChanged(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         .local v0, "res":Z
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
    //         iget-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         or-int/2addr v1, v0
    //         iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const/16 v1, 0x40
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "sb":Ljava/lang/StringBuilder;
    //         invoke-static {p0, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    //         const-string v1, " id="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget v1, p0, Landroid/support/v4/content/Loader;->mId:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

    public fun unregisterListener(p0: android.support.v4.content.Loader.OnLoadCompleteListener) { /* TODO(body): (Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/support/v4/content/Loader$OnLoadCompleteListener",
    //                 "<TD;>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
    //         .local p1, "listener":Landroid/support/v4/content/Loader$OnLoadCompleteListener;, "Landroid/support/v4/content/Loader$OnLoadCompleteListener<TD;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "No listener register"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         if-eq v0, p1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Attempting to unregister the wrong listener"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
    //         return-void
    */

}
