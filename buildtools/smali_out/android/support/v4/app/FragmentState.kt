package android.support.v4.app

// Auto-emitted from smali source: Fragment.java.
// 12 fields, 6 methods.

class FragmentState: android.os.Parcelable {
    val mArguments: android.os.Bundle
    val mClassName: String
    val mContainerId: Int
    val mDetached: Boolean
    val mFragmentId: Int
    val mFromLayout: Boolean
    val mIndex: Int
    var mInstance: android.support.v4.app.Fragment
    val mRetainInstance: Boolean
    var mSavedFragmentState: android.os.Bundle
    val mTag: String

    public constructor(in: android.os.Parcel)

    public constructor(frag: android.support.v4.app.Fragment)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun instantiate(activity: android.support.v4.app.FragmentActivity, parent: android.support.v4.app.Fragment): android.support.v4.app.Fragment { return TODO("body: (Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
    //         invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
    //         invoke-static {p1, v0, v1}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
    //         invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
    //         iput-object v1, v0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
    //         :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget v1, p0, Landroid/support/v4/app/FragmentState;->mIndex:I
    //         invoke-virtual {v0, v1, p2}, Landroid/support/v4/app/Fragment;->setIndex(ILandroid/support/v4/app/Fragment;)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z
    //         iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mFromLayout:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         const/4 v1, 0x1
    //         iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mRestored:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget v1, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I
    //         iput v1, v0, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget v1, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I
    //         iput v1, v0, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;
    //         iput-object v1, v0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z
    //         iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z
    //         iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mDetached:Z
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         iget-object v1, p1, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         iput-object v1, v0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v0, :cond_3
    //         const-string v0, "FragmentManager"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Instantiated fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_3
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
    //         goto/16 :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z
    //         if-eqz v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z
    //         if-eqz v0, :cond_2
    //         :goto_2
    //         invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    //         return-void
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :cond_2
    //         move v1, v2
    //         goto :goto_2
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
