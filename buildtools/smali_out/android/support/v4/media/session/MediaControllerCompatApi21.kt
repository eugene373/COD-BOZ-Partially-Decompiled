package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompatApi21.java.
// 0 fields, 12 methods.

open class MediaControllerCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun createCallback(callback: android.support.v4.media.session.MediaControllerCompatApi21.Callback): Object { return TODO("body: (Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;
    //         invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;-><init>(Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun dispatchMediaButtonEvent(controllerObj: Object, event: android.view.KeyEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun fromToken(context: android.content.Context, sessionToken: Object): Object { return TODO("body: (Landroid/content/Context;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/media/session/MediaController;
    //         check-cast p1, Landroid/media/session/MediaSession$Token;
    //         .end local p1    # "sessionToken":Ljava/lang/Object;
    //         invoke-direct {v0, p0, p1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V
    //         return-object v0
    */

    public @JvmStatic fun getMetadata(controllerObj: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getPlaybackInfo(controllerObj: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getPlaybackState(controllerObj: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getRatingType(controllerObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController;->getRatingType()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getTransportControls(controllerObj: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun registerCallback(controllerObj: Object, callbackObj: Object, handler: android.os.Handler) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Handler;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/session/MediaController$Callback;
    //         .end local p1    # "callbackObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V
    //         return-void
    */

    public @JvmStatic fun sendCommand(controllerObj: Object, command: String, params: android.os.Bundle, cb: android.os.ResultReceiver) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    //         return-void
    */

    public @JvmStatic fun unregisterCallback(controllerObj: Object, callbackObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaController;
    //         .end local p0    # "controllerObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/session/MediaController$Callback;
    //         .end local p1    # "callbackObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V
    //         return-void
    */

    }
}
