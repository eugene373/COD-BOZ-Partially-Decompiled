package android.support.v4.app

// Auto-emitted from smali source: DialogFragment.java.
// 19 fields, 25 methods.

open class DialogFragment: android.support.v4.app.Fragment(), android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    var mBackStackId: Int
    var mCancelable: Boolean
    var mDialog: android.app.Dialog
    var mDismissed: Boolean
    var mShownByMe: Boolean
    var mShowsDialog: Boolean
    var mStyle: Int
    var mTheme: Int
    var mViewDestroyed: Boolean

    public constructor()

    public fun dismiss() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V
    //         return-void
    */

    public fun dismissAllowingStateLoss() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V
    //         return-void
    */

    fun dismissInternal(allowStateLoss: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
    //         iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         :cond_1
    //         iput-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
    //         iget v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         if-ltz v1, :cond_2
    //         invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
    //         move-result-object v1
    //         iget v2, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentManager;->popBackStack(II)V
    //         const/4 v1, -0x1
    //         iput v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v0
    //         .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //         if-eqz p1, :cond_3
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
    //         goto :goto_0
    */

    public fun getDialog(): android.app.Dialog { return TODO("body: ()Landroid/app/Dialog;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         return-object v0
    */

    public fun getLayoutInflater(savedInstanceState: android.os.Bundle): android.view.LayoutInflater { return TODO("body: (Landroid/os/Bundle;)Landroid/view/LayoutInflater;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         if-nez v0, :cond_0
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         packed-switch v0, :pswitch_data_0
    //         :goto_1
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "layout_inflater"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/LayoutInflater;
    //         goto :goto_0
    //         :pswitch_0
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         const/16 v1, 0x18
    //         invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
    //         :pswitch_1
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z
    //         goto :goto_1
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         const-string v1, "layout_inflater"
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/LayoutInflater;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun getShowsDialog(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         return v0
    */

    public fun getTheme(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
    //         return v0
    */

    public fun isCancelable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
    //         return v0
    */

    public fun onActivityCreated(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
    //         iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         if-nez v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getView()Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "view":Landroid/view/View;
    //         if-eqz v1, :cond_3
    //         invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         new-instance v2, Ljava/lang/IllegalStateException;
    //         const-string v3, "DialogFragment can not be attached to a container view"
    //         invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_2
    //         iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v2, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
    //         :cond_3
    //         iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V
    //         iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         iget-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
    //         invoke-virtual {v2, v3}, Landroid/app/Dialog;->setCancelable(Z)V
    //         iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    //         iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    //         if-eqz p1, :cond_0
    //         const-string v2, "android:savedDialogState"
    //         invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "dialogState":Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v2, v0}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun onAttach(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         :cond_0
    //         return-void
    */

    public fun onCancel(dialog: android.content.DialogInterface) { /* TODO(body): (Landroid/content/DialogInterface;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V
    //         iget v0, p0, Landroid/support/v4/app/DialogFragment;->mContainerId:I
    //         if-nez v0, :cond_1
    //         move v0, v1
    //         :goto_0
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         if-eqz p1, :cond_0
    //         const-string v0, "android:style"
    //         invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         const-string v0, "android:theme"
    //         invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
    //         const-string v0, "android:cancelable"
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
    //         const-string v0, "android:showsDialog"
    //         iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         const-string v0, "android:backStackId"
    //         const/4 v1, -0x1
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         :cond_0
    //         return-void
    //         :cond_1
    //         move v0, v2
    //         goto :goto_0
    */

    public fun onCreateDialog(savedInstanceState: android.os.Bundle): android.app.Dialog { return TODO("body: (Landroid/os/Bundle;)Landroid/app/Dialog;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/app/Dialog;
    //         invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getTheme()I
    //         move-result v2
    //         invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
    //         return-object v0
    */

    public fun onDestroyView() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         :cond_0
    //         return-void
    */

    public fun onDetach() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
    //         if-nez v0, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         :cond_0
    //         return-void
    */

    public fun onDismiss(dialog: android.content.DialogInterface) { /* TODO(body): (Landroid/content/DialogInterface;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V
    //         :cond_0
    //         return-void
    */

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v1}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "dialogState":Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         const-string v1, "android:savedDialogState"
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         .end local v0    # "dialogState":Landroid/os/Bundle;
    //         :cond_0
    //         iget v1, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         if-eqz v1, :cond_1
    //         const-string v1, "android:style"
    //         iget v2, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_1
    //         iget v1, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
    //         if-eqz v1, :cond_2
    //         const-string v1, "android:theme"
    //         iget v2, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
    //         invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_2
    //         iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
    //         if-nez v1, :cond_3
    //         const-string v1, "android:cancelable"
    //         iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
    //         invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         :cond_3
    //         iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         if-nez v1, :cond_4
    //         const-string v1, "android:showsDialog"
    //         iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         :cond_4
    //         iget v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         const/4 v2, -0x1
    //         if-eq v1, v2, :cond_5
    //         const-string v1, "android:backStackId"
    //         iget v2, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_5
    //         return-void
    */

    public fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    //         :cond_0
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->hide()V
    //         :cond_0
    //         return-void
    */

    public fun setCancelable(cancelable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V
    //         :cond_0
    //         return-void
    */

    public fun setShowsDialog(showsDialog: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z
    //         return-void
    */

    public fun setStyle(style: Int, theme: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         iput p1, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         const/4 v1, 0x2
    //         if-eq v0, v1, :cond_0
    //         iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         const v0, 0x1030059
    //         iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
    //         :cond_1
    //         if-eqz p2, :cond_2
    //         iput p2, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I
    //         :cond_2
    //         return-void
    */

    public fun show(transaction: android.support.v4.app.FragmentTransaction, tag: String): Int { return TODO("body: (Landroid/support/v4/app/FragmentTransaction;Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
    //         invoke-virtual {p1, p0, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    //         iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z
    //         invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         iget v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I
    //         return v0
    */

    public fun show(manager: android.support.v4.app.FragmentManager, tag: String) { /* TODO(body): (Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z
    //         invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v0
    //         .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v0, p0, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
    //         return-void
    */

    companion object {
    private val SAVED_BACK_STACK_ID: String = "android:backStackId"
    private val SAVED_CANCELABLE: String = "android:cancelable"
    private val SAVED_DIALOG_STATE_TAG: String = "android:savedDialogState"
    private val SAVED_SHOWS_DIALOG: String = "android:showsDialog"
    private val SAVED_STYLE: String = "android:style"
    private val SAVED_THEME: String = "android:theme"
    @JvmField public val STYLE_NORMAL: Int = 0x0
    @JvmField public val STYLE_NO_FRAME: Int = 0x2
    @JvmField public val STYLE_NO_INPUT: Int = 0x3
    @JvmField public val STYLE_NO_TITLE: Int = 0x1
    }
}
