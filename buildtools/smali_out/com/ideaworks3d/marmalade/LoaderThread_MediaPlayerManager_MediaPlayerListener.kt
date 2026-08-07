package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderThread.java.
// 2 fields, 3 methods.

open class LoaderThread_MediaPlayerManager_MediaPlayerListener: android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnCompletionListener {
    var m_channel: Int
    val this$1: com.ideaworks3d.marmalade.LoaderThread.MediaPlayerManager

    constructor(p0: com.ideaworks3d.marmalade.LoaderThread.MediaPlayerManager, p1: Int)

    public fun onCompletion(p0: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$300(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;)[I
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         aget v2, v0, v1
    //         add-int/lit8 v2, v2, -0x1
    //         aput v2, v0, v1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$300(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;)[I
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         aget v0, v0, v1
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->PlaybackCompleted:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$000(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioStop(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$100(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;)[Landroid/media/MediaPlayer;
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         aget-object v0, v0, v1
    //         invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$000(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
    //         goto :goto_0
    */

    public fun onError(p0: android.media.MediaPlayer, p1: Int, p2: Int): Boolean { return TODO("body: (Landroid/media/MediaPlayer;II)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$000(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$100(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;)[Landroid/media/MediaPlayer;
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         aget-object v0, v0, v1
    //         invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$000(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->this$1:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;->m_channel:I
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->access$200(Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;I)V
    //         const/4 v0, 0x1
    //         return v0
    */

}
