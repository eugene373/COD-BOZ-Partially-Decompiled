package android.support.v4.speech.tts

// Auto-emitted from smali source: TextToSpeechICS.java.
// 1 fields, 2 methods.

open class TextToSpeechICS {
    constructor()

    companion object {
    private val TAG: String = "android.support.v4.speech.tts"

    @JvmStatic fun construct(context: android.content.Context, onInitListener: android.speech.tts.TextToSpeech.OnInitListener, engineName: String): android.speech.tts.TextToSpeech { return TODO("body: (Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)Landroid/speech/tts/TextToSpeech;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xe
    //         if-ge v0, v1, :cond_1
    //         if-nez p2, :cond_0
    //         new-instance v0, Landroid/speech/tts/TextToSpeech;
    //         invoke-direct {v0, p0, p1}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "android.support.v4.speech.tts"
    //         const-string v1, "Can\'t specify tts engine on this device"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Landroid/speech/tts/TextToSpeech;
    //         invoke-direct {v0, p0, p1}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Landroid/speech/tts/TextToSpeech;
    //         invoke-direct {v0, p0, p1, p2}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)V
    //         goto :goto_0
    */

    }
}
