package android.support.v4.media

// Auto-emitted from smali source: TransportMediatorJellybeanMR2.java.
// 16 fields, 15 methods.

open class TransportMediatorJellybeanMR2: android.media.RemoteControlClient.OnGetPlaybackPositionListener, android.media.RemoteControlClient.OnPlaybackPositionUpdateListener {
    var mAudioFocusChangeListener: android.media.AudioManager.OnAudioFocusChangeListener
    var mAudioFocused: Boolean
    val mAudioManager: android.media.AudioManager
    val mContext: android.content.Context
    var mFocused: Boolean
    val mIntent: android.content.Intent
    val mMediaButtonReceiver: android.content.BroadcastReceiver
    var mPendingIntent: android.app.PendingIntent
    var mPlayState: Int
    val mReceiverAction: String
    val mReceiverFilter: android.content.IntentFilter
    var mRemoteControl: android.media.RemoteControlClient
    val mTargetView: android.view.View
    val mTransportCallback: android.support.v4.media.TransportMediatorCallback
    val mWindowAttachListener: android.view.ViewTreeObserver.OnWindowAttachListener
    val mWindowFocusListener: android.view.ViewTreeObserver.OnWindowFocusChangeListener

    public constructor(context: android.content.Context, audioManager: android.media.AudioManager, view: android.view.View, transportCallback: android.support.v4.media.TransportMediatorCallback)

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->windowDetached()V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowAttachListener:Landroid/view/ViewTreeObserver$OnWindowAttachListener;
    //         invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowAttachListener(Landroid/view/ViewTreeObserver$OnWindowAttachListener;)V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowFocusListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
    //         invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V
    //         return-void
    */

    fun dropAudioFocus() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
    //         invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I
    //         :cond_0
    //         return-void
    */

    fun gainFocus() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1}, Landroid/media/AudioManager;->registerMediaButtonEventReceiver(Landroid/app/PendingIntent;)V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, v1}, Landroid/media/AudioManager;->registerRemoteControlClient(Landroid/media/RemoteControlClient;)V
    //         iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->takeAudioFocus()V
    //         :cond_0
    //         return-void
    */

    public fun getRemoteControlClient(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         return-object v0
    */

    fun loseFocus() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->dropAudioFocus()V
    //         iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterRemoteControlClient(Landroid/media/RemoteControlClient;)V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterMediaButtonEventReceiver(Landroid/app/PendingIntent;)V
    //         :cond_0
    //         return-void
    */

    public fun onGetPlaybackPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
    //         invoke-interface {v0}, Landroid/support/v4/media/TransportMediatorCallback;->getPlaybackPosition()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun onPlaybackPositionUpdate(newPositionMs: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/TransportMediatorCallback;->playbackPositionUpdate(J)V
    //         return-void
    */

    public fun pausePlaying() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x2
    //         iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         iput v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, v2}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->dropAudioFocus()V
    //         return-void
    */

    public fun refreshState(playing: Boolean, position: Long, transportControls: Int) { /* TODO(body): (ZJI)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         if-eqz v0, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         if-eqz p1, :cond_1
    //         const/4 v0, 0x3
    //         move v1, v0
    //         :goto_0
    //         if-eqz p1, :cond_2
    //         const/high16 v0, 0x3f800000    # 1.0f
    //         :goto_1
    //         invoke-virtual {v2, v1, p2, p3, v0}, Landroid/media/RemoteControlClient;->setPlaybackState(IJF)V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, p4}, Landroid/media/RemoteControlClient;->setTransportControlFlags(I)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun startPlaying() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x3
    //         iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         if-eq v0, v1, :cond_0
    //         iput v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, v1}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V
    //         :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->takeAudioFocus()V
    //         :cond_1
    //         return-void
    */

    public fun stopPlaying() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         if-eq v0, v1, :cond_0
    //         iput v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, v1}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->dropAudioFocus()V
    //         return-void
    */

    fun takeAudioFocus() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
    //         if-nez v0, :cond_0
    //         iput-boolean v3, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
    //         const/4 v2, 0x3
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I
    //         :cond_0
    //         return-void
    */

    fun windowAttached() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mMediaButtonReceiver:Landroid/content/BroadcastReceiver;
    //         iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverFilter:Landroid/content/IntentFilter;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mIntent:Landroid/content/Intent;
    //         const/high16 v3, 0x10000000
    //         invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         new-instance v0, Landroid/media/RemoteControlClient;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-direct {v0, v1}, Landroid/media/RemoteControlClient;-><init>(Landroid/app/PendingIntent;)V
    //         iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, p0}, Landroid/media/RemoteControlClient;->setOnGetPlaybackPositionListener(Landroid/media/RemoteControlClient$OnGetPlaybackPositionListener;)V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         invoke-virtual {v0, p0}, Landroid/media/RemoteControlClient;->setPlaybackPositionUpdateListener(Landroid/media/RemoteControlClient$OnPlaybackPositionUpdateListener;)V
    //         return-void
    */

    fun windowDetached() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->loseFocus()V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mMediaButtonReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0}, Landroid/app/PendingIntent;->cancel()V
    //         iput-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
    //         iput-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
    //         :cond_0
    //         return-void
    */

}
