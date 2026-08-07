package android.support.v4.speech.tts

// Auto-emitted from smali source: TextToSpeechICSMR1.java.
// 2 fields, 3 methods.

open class TextToSpeechICSMR1 {
    constructor()

    companion object {
    @JvmField public val KEY_FEATURE_EMBEDDED_SYNTHESIS: String = "embeddedTts"
    @JvmField public val KEY_FEATURE_NETWORK_SYNTHESIS: String = "networkTts"

    @JvmStatic fun getFeatures(tts: android.speech.tts.TextToSpeech, locale: java.util.Locale): java.util.Set { return TODO("body: (Landroid/speech/tts/TextToSpeech;Ljava/util/Locale;)Ljava/util/Set;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xf
    //         if-lt v0, v1, :cond_0
    //         invoke-virtual {p0, p1}, Landroid/speech/tts/TextToSpeech;->getFeatures(Ljava/util/Locale;)Ljava/util/Set;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    @JvmStatic fun setUtteranceProgressListener(tts: android.speech.tts.TextToSpeech, listener: android.support.v4.speech.tts.TextToSpeechICSMR1.UtteranceProgressListenerICSMR1) { /* TODO(body): (Landroid/speech/tts/TextToSpeech;Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xf
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;
    //         invoke-direct {v0, p1}, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;-><init>(Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;)V
    //         invoke-virtual {p0, v0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceProgressListener(Landroid/speech/tts/UtteranceProgressListener;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$2;
    //         invoke-direct {v0, p1}, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$2;-><init>(Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;)V
    //         invoke-virtual {p0, v0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceCompletedListener(Landroid/speech/tts/TextToSpeech$OnUtteranceCompletedListener;)I
    //         goto :goto_0
    */

    }
}
