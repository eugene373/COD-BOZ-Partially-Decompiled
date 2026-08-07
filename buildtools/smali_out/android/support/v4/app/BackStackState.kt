package android.support.v4.app

// Auto-emitted from smali source: BackStackRecord.java.
// 12 fields, 6 methods.

class BackStackState: android.os.Parcelable {
    val mBreadCrumbShortTitleRes: Int
    val mBreadCrumbShortTitleText: CharSequence
    val mBreadCrumbTitleRes: Int
    val mBreadCrumbTitleText: CharSequence
    val mIndex: Int
    val mName: String
    val mOps: IntArray
    val mSharedElementSourceNames: java.util.ArrayList
    val mSharedElementTargetNames: java.util.ArrayList
    val mTransition: Int
    val mTransitionStyle: Int

    public constructor(in: android.os.Parcel)

    public constructor(fm: android.support.v4.app.FragmentManagerImpl, bse: android.support.v4.app.BackStackRecord)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun instantiate(fm: android.support.v4.app.FragmentManagerImpl): android.support.v4.app.BackStackRecord { return TODO("body: (Landroid/support/v4/app/FragmentManagerImpl;)Landroid/support/v4/app/BackStackRecord;") }
    /*
    //         .locals 14
    //         const/4 v13, 0x1
    //         new-instance v1, Landroid/support/v4/app/BackStackRecord;
    //         invoke-direct {v1, p1}, Landroid/support/v4/app/BackStackRecord;-><init>(Landroid/support/v4/app/FragmentManagerImpl;)V
    //         .local v1, "bse":Landroid/support/v4/app/BackStackRecord;
    //         const/4 v7, 0x0
    //         .local v7, "pos":I
    //         const/4 v5, 0x0
    //         .local v5, "num":I
    //         :goto_0
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         array-length v10, v10
    //         if-ge v7, v10, :cond_4
    //         new-instance v6, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v6}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v6, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v8, v7, 0x1
    //         .end local v7    # "pos":I
    //         .local v8, "pos":I
    //         aget v10, v10, v7
    //         iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         sget-boolean v10, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v10, :cond_0
    //         const-string v10, "FragmentManager"
    //         new-instance v11, Ljava/lang/StringBuilder;
    //         invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v12, "Instantiate "
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         const-string v12, " op #"
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         const-string v12, " base fragment #"
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         iget-object v12, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         aget v12, v12, v8
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v11
    //         invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v7, v8, 0x1
    //         .end local v8    # "pos":I
    //         .restart local v7    # "pos":I
    //         aget v3, v10, v8
    //         .local v3, "findex":I
    //         if-ltz v3, :cond_2
    //         iget-object v10, p1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
    //         invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/app/Fragment;
    //         .local v2, "f":Landroid/support/v4/app/Fragment;
    //         iput-object v2, v6, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :goto_1
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v8, v7, 0x1
    //         .end local v7    # "pos":I
    //         .restart local v8    # "pos":I
    //         aget v10, v10, v7
    //         iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v7, v8, 0x1
    //         .end local v8    # "pos":I
    //         .restart local v7    # "pos":I
    //         aget v10, v10, v8
    //         iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v8, v7, 0x1
    //         .end local v7    # "pos":I
    //         .restart local v8    # "pos":I
    //         aget v10, v10, v7
    //         iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v7, v8, 0x1
    //         .end local v8    # "pos":I
    //         .restart local v7    # "pos":I
    //         aget v10, v10, v8
    //         iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v8, v7, 0x1
    //         .end local v7    # "pos":I
    //         .restart local v8    # "pos":I
    //         aget v0, v10, v7
    //         .local v0, "N":I
    //         if-lez v0, :cond_3
    //         new-instance v10, Ljava/util/ArrayList;
    //         invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         iput-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         const/4 v4, 0x0
    //         .local v4, "i":I
    //         :goto_2
    //         if-ge v4, v0, :cond_3
    //         sget-boolean v10, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v10, :cond_1
    //         const-string v10, "FragmentManager"
    //         new-instance v11, Ljava/lang/StringBuilder;
    //         invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v12, "Instantiate "
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         const-string v12, " set remove fragment #"
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         iget-object v12, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         aget v12, v12, v8
    //         invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v11
    //         invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v11
    //         invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_1
    //         iget-object v10, p1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         add-int/lit8 v7, v8, 0x1
    //         .end local v8    # "pos":I
    //         .restart local v7    # "pos":I
    //         aget v11, v11, v8
    //         invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v9
    //         check-cast v9, Landroid/support/v4/app/Fragment;
    //         .local v9, "r":Landroid/support/v4/app/Fragment;
    //         iget-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v4, v4, 0x1
    //         move v8, v7
    //         .end local v7    # "pos":I
    //         .restart local v8    # "pos":I
    //         goto :goto_2
    //         .end local v0    # "N":I
    //         .end local v4    # "i":I
    //         .end local v8    # "pos":I
    //         .end local v9    # "r":Landroid/support/v4/app/Fragment;
    //         .restart local v7    # "pos":I
    //         :cond_2
    //         const/4 v10, 0x0
    //         iput-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         goto :goto_1
    //         .end local v7    # "pos":I
    //         .restart local v0    # "N":I
    //         .restart local v8    # "pos":I
    //         :cond_3
    //         move v7, v8
    //         .end local v8    # "pos":I
    //         .restart local v7    # "pos":I
    //         invoke-virtual {v1, v6}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         add-int/lit8 v5, v5, 0x1
    //         goto/16 :goto_0
    //         .end local v0    # "N":I
    //         .end local v3    # "findex":I
    //         .end local v6    # "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :cond_4
    //         iget v10, p0, Landroid/support/v4/app/BackStackState;->mTransition:I
    //         iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         iget v10, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I
    //         iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;
    //         iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
    //         iget v10, p0, Landroid/support/v4/app/BackStackState;->mIndex:I
    //         iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         iput-boolean v13, v1, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         iget v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I
    //         iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         iget v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I
    //         iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v13}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V
    //         return-object v1
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget v0, p0, Landroid/support/v4/app/BackStackState;->mTransition:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget v0, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/BackStackState;->mIndex:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
    //         iget v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
