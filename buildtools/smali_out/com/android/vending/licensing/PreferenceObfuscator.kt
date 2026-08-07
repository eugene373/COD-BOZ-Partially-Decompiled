package com.android.vending.licensing

// Auto-emitted from smali source: PreferenceObfuscator.java.
// 4 fields, 4 methods.

open class PreferenceObfuscator {
    private var mEditor: android.content.SharedPreferences.Editor
    private val mObfuscator: com.android.vending.licensing.Obfuscator
    private val mPreferences: android.content.SharedPreferences

    public constructor(p0: android.content.SharedPreferences, p1: com.android.vending.licensing.Obfuscator)

    public fun commit() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mEditor:Landroid/content/SharedPreferences$Editor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mEditor:Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mEditor:Landroid/content/SharedPreferences$Editor;
    //         :cond_0
    //         return-void
    */

    public fun getString(p0: String, p1: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mPreferences:Landroid/content/SharedPreferences;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mObfuscator:Lcom/android/vending/licensing/Obfuscator;
    //         invoke-interface {v1, v0, p1}, Lcom/android/vending/licensing/Obfuscator;->unobfuscate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Lcom/android/vending/licensing/ValidationException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object p2
    //         :cond_0
    //         :goto_0
    //         return-object p2
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "PreferenceObfuscator"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Validation error while reading preference: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun putString(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mEditor:Landroid/content/SharedPreferences$Editor;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mPreferences:Landroid/content/SharedPreferences;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mEditor:Landroid/content/SharedPreferences$Editor;
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mObfuscator:Lcom/android/vending/licensing/Obfuscator;
    //         invoke-interface {v0, p2, p1}, Lcom/android/vending/licensing/Obfuscator;->obfuscate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/licensing/PreferenceObfuscator;->mEditor:Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         return-void
    */

    companion object {
    private val TAG: String = "PreferenceObfuscator"
    }
}
