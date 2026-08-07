package android.support.v4.app

// Auto-emitted from smali source: ShareCompat.java.
// 0 fields, 4 methods.

open class ShareCompat_ShareCompatImplBase: android.support.v4.app.ShareCompat.ShareCompatImpl {
    constructor()

    public fun configureMenuItem(item: android.view.MenuItem, shareIntent: android.support.v4.app.ShareCompat.IntentBuilder) { /* TODO(body): (Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->createChooserIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    //         return-void
    */

    public fun escapeHtml(text: CharSequence): String { return TODO("body: (Ljava/lang/CharSequence;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         .local v0, "out":Ljava/lang/StringBuilder;
    //         const/4 v1, 0x0
    //         invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
    //         move-result v2
    //         invoke-static {v0, p1, v1, v2}, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;->withinStyle(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)V
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

    companion object {
    private @JvmStatic fun withinStyle(out: StringBuilder, text: CharSequence, start: Int, end: Int) { /* TODO(body): (Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)V */ }
    /*
    //         .locals 5
    //         const/16 v4, 0x20
    //         move v1, p2
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, p3, :cond_7
    //         invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C
    //         move-result v0
    //         .local v0, "c":C
    //         const/16 v2, 0x3c
    //         if-ne v0, v2, :cond_0
    //         const-string v2, "&lt;"
    //         invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :goto_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const/16 v2, 0x3e
    //         if-ne v0, v2, :cond_1
    //         const-string v2, "&gt;"
    //         invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_1
    //         const/16 v2, 0x26
    //         if-ne v0, v2, :cond_2
    //         const-string v2, "&amp;"
    //         invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_2
    //         const/16 v2, 0x7e
    //         if-gt v0, v2, :cond_3
    //         if-ge v0, v4, :cond_4
    //         :cond_3
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "&#"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ";"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_4
    //         if-ne v0, v4, :cond_6
    //         :goto_2
    //         add-int/lit8 v2, v1, 0x1
    //         if-ge v2, p3, :cond_5
    //         add-int/lit8 v2, v1, 0x1
    //         invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C
    //         move-result v2
    //         if-ne v2, v4, :cond_5
    //         const-string v2, "&nbsp;"
    //         invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_2
    //         :cond_5
    //         invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_6
    //         invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         .end local v0    # "c":C
    //         :cond_7
    //         return-void
    */

    }
}
