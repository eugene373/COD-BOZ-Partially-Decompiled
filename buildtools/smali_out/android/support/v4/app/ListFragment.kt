package android.support.v4.app

// Auto-emitted from smali source: ListFragment.java.
// 14 fields, 16 methods.

open class ListFragment: android.support.v4.app.Fragment() {
    var mAdapter: android.widget.ListAdapter
    var mEmptyText: CharSequence
    var mEmptyView: android.view.View
    private val mHandler: android.os.Handler
    var mList: android.widget.ListView
    var mListContainer: android.view.View
    var mListShown: Boolean
    private val mOnClickListener: android.widget.AdapterView.OnItemClickListener
    var mProgressContainer: android.view.View
    private val mRequestFocus: Runnable
    var mStandardEmptyView: android.widget.TextView

    public constructor()

    private fun ensureList() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         if-eqz v3, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getView()Landroid/view/View;
    //         move-result-object v2
    //         .local v2, "root":Landroid/view/View;
    //         if-nez v2, :cond_1
    //         new-instance v3, Ljava/lang/IllegalStateException;
    //         const-string v4, "Content view not yet created"
    //         invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v3
    //         :cond_1
    //         instance-of v3, v2, Landroid/widget/ListView;
    //         if-eqz v3, :cond_4
    //         check-cast v2, Landroid/widget/ListView;
    //         .end local v2    # "root":Landroid/view/View;
    //         iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         :cond_2
    //         :goto_1
    //         const/4 v3, 0x1
    //         iput-boolean v3, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;
    //         invoke-virtual {v3, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
    //         if-eqz v3, :cond_9
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
    //         .local v0, "adapter":Landroid/widget/ListAdapter;
    //         const/4 v3, 0x0
    //         iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/ListFragment;->setListAdapter(Landroid/widget/ListAdapter;)V
    //         .end local v0    # "adapter":Landroid/widget/ListAdapter;
    //         :cond_3
    //         :goto_2
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;
    //         iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;
    //         invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    //         .restart local v2    # "root":Landroid/view/View;
    //         :cond_4
    //         const v3, 0xff0001
    //         invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v3
    //         check-cast v3, Landroid/widget/TextView;
    //         iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         if-nez v3, :cond_5
    //         const v3, 0x1020004
    //         invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v3
    //         iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
    //         :goto_3
    //         const v3, 0xff0002
    //         invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v3
    //         iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         const v3, 0xff0003
    //         invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v3
    //         iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         const v3, 0x102000a
    //         invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "rawListView":Landroid/view/View;
    //         instance-of v3, v1, Landroid/widget/ListView;
    //         if-nez v3, :cond_7
    //         if-nez v1, :cond_6
    //         new-instance v3, Ljava/lang/RuntimeException;
    //         const-string v4, "Your content must have a ListView whose id attribute is \'android.R.id.list\'"
    //         invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v3
    //         .end local v1    # "rawListView":Landroid/view/View;
    //         :cond_5
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         const/16 v4, 0x8
    //         invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V
    //         goto :goto_3
    //         .restart local v1    # "rawListView":Landroid/view/View;
    //         :cond_6
    //         new-instance v3, Ljava/lang/RuntimeException;
    //         const-string v4, "Content has view with id attribute \'android.R.id.list\' that is not a ListView class"
    //         invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v3
    //         :cond_7
    //         check-cast v1, Landroid/widget/ListView;
    //         .end local v1    # "rawListView":Landroid/view/View;
    //         iput-object v1, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
    //         if-eqz v3, :cond_8
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
    //         invoke-virtual {v3, v4}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
    //         goto :goto_1
    //         :cond_8
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
    //         if-eqz v3, :cond_2
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
    //         invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         invoke-virtual {v3, v4}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
    //         goto/16 :goto_1
    //         .end local v2    # "root":Landroid/view/View;
    //         :cond_9
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         if-eqz v3, :cond_3
    //         invoke-direct {p0, v5, v5}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
    //         goto/16 :goto_2
    */

    private fun setListShown(shown: Boolean, animate: Boolean) { /* TODO(body): (ZZ)V */ }
    /*
    //         .locals 6
    //         const v5, 0x10a0001
    //         const/high16 v4, 0x10a0000
    //         const/16 v3, 0x8
    //         const/4 v2, 0x0
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Can\'t be used with a custom content view"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
    //         if-ne v0, p1, :cond_1
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iput-boolean p1, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
    //         if-eqz p1, :cond_3
    //         if-eqz p2, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         :goto_1
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
    //         goto :goto_1
    //         :cond_3
    //         if-eqz p2, :cond_4
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         :goto_2
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
    //         goto :goto_2
    */

    public fun getListAdapter(): android.widget.ListAdapter { return TODO("body: ()Landroid/widget/ListAdapter;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
    //         return-object v0
    */

    public fun getListView(): android.widget.ListView { return TODO("body: ()Landroid/widget/ListView;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         return-object v0
    */

    public fun getSelectedItemId(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         invoke-virtual {v0}, Landroid/widget/ListView;->getSelectedItemId()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getSelectedItemPosition(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         invoke-virtual {v0}, Landroid/widget/ListView;->getSelectedItemPosition()I
    //         move-result v0
    //         return v0
    */

    public fun onCreateView(inflater: android.view.LayoutInflater, container: android.view.ViewGroup, savedInstanceState: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 12
    //         const/16 v11, 0x11
    //         const/4 v10, -0x2
    //         const/4 v9, -0x1
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         .local v0, "context":Landroid/content/Context;
    //         new-instance v5, Landroid/widget/FrameLayout;
    //         invoke-direct {v5, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
    //         .local v5, "root":Landroid/widget/FrameLayout;
    //         new-instance v3, Landroid/widget/LinearLayout;
    //         invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
    //         .local v3, "pframe":Landroid/widget/LinearLayout;
    //         const v7, 0xff0002
    //         invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setId(I)V
    //         const/4 v7, 0x1
    //         invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
    //         const/16 v7, 0x8
    //         invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V
    //         invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setGravity(I)V
    //         new-instance v4, Landroid/widget/ProgressBar;
    //         const/4 v7, 0x0
    //         const v8, 0x101007a
    //         invoke-direct {v4, v0, v7, v8}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //         .local v4, "progress":Landroid/widget/ProgressBar;
    //         new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v7, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v3, v4, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v5, v3, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         new-instance v1, Landroid/widget/FrameLayout;
    //         invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
    //         .local v1, "lframe":Landroid/widget/FrameLayout;
    //         const v7, 0xff0003
    //         invoke-virtual {v1, v7}, Landroid/widget/FrameLayout;->setId(I)V
    //         new-instance v6, Landroid/widget/TextView;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v7
    //         invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
    //         .local v6, "tv":Landroid/widget/TextView;
    //         const v7, 0xff0001
    //         invoke-virtual {v6, v7}, Landroid/widget/TextView;->setId(I)V
    //         invoke-virtual {v6, v11}, Landroid/widget/TextView;->setGravity(I)V
    //         new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v1, v6, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         new-instance v2, Landroid/widget/ListView;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v7
    //         invoke-direct {v2, v7}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V
    //         .local v2, "lv":Landroid/widget/ListView;
    //         const v7, 0x102000a
    //         invoke-virtual {v2, v7}, Landroid/widget/ListView;->setId(I)V
    //         const/4 v7, 0x0
    //         invoke-virtual {v2, v7}, Landroid/widget/ListView;->setDrawSelectorOnTop(Z)V
    //         new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v1, v2, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v5, v1, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v5, v7}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         return-object v5
    */

    public fun onDestroyView() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
    //         iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
    //         iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
    //         iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
    //         iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
    //         return-void
    */

    public fun onListItemClick(l: android.widget.ListView, v: android.view.View, position: Int, id: Long) { /* TODO(body): (Landroid/widget/ListView;Landroid/view/View;IJ)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onViewCreated(view: android.view.View, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/view/View;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         return-void
    */

    public fun setEmptyText(text: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Can\'t be used with a custom content view"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         iget-object v1, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
    //         invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
    //         :cond_1
    //         iput-object p1, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
    //         return-void
    */

    public fun setListAdapter(adapter: android.widget.ListAdapter) { /* TODO(body): (Landroid/widget/ListAdapter;)V */ }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
    //         if-eqz v3, :cond_2
    //         move v0, v1
    //         .local v0, "hadAdapter":Z
    //         :goto_0
    //         iput-object p1, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         if-eqz v3, :cond_1
    //         iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         invoke-virtual {v3, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
    //         iget-boolean v3, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
    //         if-nez v3, :cond_1
    //         if-nez v0, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getView()Landroid/view/View;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         move v2, v1
    //         :cond_0
    //         invoke-direct {p0, v1, v2}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
    //         :cond_1
    //         return-void
    //         .end local v0    # "hadAdapter":Z
    //         :cond_2
    //         move v0, v2
    //         goto :goto_0
    */

    public fun setListShown(shown: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, p1, v0}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
    //         return-void
    */

    public fun setListShownNoAnimation(shown: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, p1, v0}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
    //         return-void
    */

    public fun setSelection(position: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
    //         iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
    //         invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V
    //         return-void
    */

    companion object {
    val INTERNAL_EMPTY_ID: Int = 0xff0001
    val INTERNAL_LIST_CONTAINER_ID: Int = 0xff0003
    val INTERNAL_PROGRESS_CONTAINER_ID: Int = 0xff0002
    }
}
