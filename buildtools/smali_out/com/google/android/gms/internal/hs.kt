package com.google.android.gms.internal

// Auto-emitted from smali.
// 7 fields, 15 methods.

open class hs: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val CD: com.google.android.gms.internal.hg
    val CE: Long
    val CF: Int
    val CG: com.google.android.gms.internal.he
    public val oT: String

    constructor(p0: Int, p1: com.google.android.gms.internal.hg, p2: Long, p3: Int, p4: String, p5: com.google.android.gms.internal.he)

    public constructor(p0: com.google.android.gms.internal.hg, p1: Long, p2: Int)

    public constructor(p0: String, p1: android.content.Intent, p2: String, p3: android.net.Uri, p4: String, p5: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hs;->CREATOR:Lcom/google/android/gms/internal/ht;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const-string v0, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d]"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/internal/hs;->CD:Lcom/google/android/gms/internal/hg;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/hs;->CE:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget v3, p0, Lcom/google/android/gms/internal/hs;->CF:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hs;->CREATOR:Lcom/google/android/gms/internal/ht;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ht;->a(Lcom/google/android/gms/internal/hs;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.ht = null!!

    public @JvmStatic fun a(p0: android.content.Intent, p1: String, p2: android.net.Uri, p3: String, p4: java.util.List): com.google.android.gms.internal.he.a { return TODO("body: (Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/internal/he$a;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Intent;",
    //                 "Ljava/lang/String;",
    //                 "Landroid/net/Uri;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/internal/he$a;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/he$a;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/he$a;-><init>()V
    //         invoke-static {p1}, Lcom/google/android/gms/internal/hs;->av(Ljava/lang/String;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         if-eqz p2, :cond_0
    //         invoke-static {p2}, Lcom/google/android/gms/internal/hs;->f(Landroid/net/Uri;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         :cond_0
    //         if-eqz p4, :cond_1
    //         invoke-static {p4}, Lcom/google/android/gms/internal/hs;->b(Ljava/util/List;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         const-string v2, "intent_action"
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/hs;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         :cond_2
    //         invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_3
    //         const-string v2, "intent_data"
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/hs;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         :cond_3
    //         invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
    //         move-result-object v1
    //         if-eqz v1, :cond_4
    //         const-string v2, "intent_activity"
    //         invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/hs;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         :cond_4
    //         invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         if-eqz v1, :cond_5
    //         const-string v2, "intent_extra_data_key"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_5
    //         const-string v2, "intent_extra_data"
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/hs;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hi;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    //         :cond_5
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/he$a;->ar(Ljava/lang/String;)Lcom/google/android/gms/internal/he$a;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/he$a;->D(Z)Lcom/google/android/gms/internal/he$a;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun a(p0: String, p1: android.content.Intent): com.google.android.gms.internal.hg { return TODO("body: (Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/hg;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/hs;->g(Landroid/content/Intent;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/internal/hs;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hg;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun av(p0: String): com.google.android.gms.internal.hi { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/internal/hi;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         new-instance v0, Lcom/google/android/gms/internal/hi;
    //         new-instance v1, Lcom/google/android/gms/internal/hq$a;
    //         const-string v2, "title"
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/hq$a;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/hq$a;->P(I)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/hq$a;->F(Z)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v1
    //         const-string v2, "name"
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/hq$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/hq$a;->fm()Lcom/google/android/gms/internal/hq;
    //         move-result-object v1
    //         const-string v2, "text1"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/hi;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hq;Ljava/lang/String;)V
    //         return-object v0
    */

    private @JvmStatic fun b(p0: java.util.List): com.google.android.gms.internal.hi { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/internal/hi;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/internal/hi;"
    //             }
    //         .end annotation
    //         new-instance v2, Lcom/google/android/gms/internal/ll$a;
    //         invoke-direct {v2}, Lcom/google/android/gms/internal/ll$a;-><init>()V
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v3, v0, [Lcom/google/android/gms/internal/ll$a$a;
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         array-length v0, v3
    //         if-ge v1, v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/ll$a$a;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/ll$a$a;-><init>()V
    //         aput-object v0, v3, v1
    //         invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;
    //         aget-object v4, v3, v1
    //         iget-object v5, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->appIndexingUrl:Landroid/net/Uri;
    //         invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         iput-object v5, v4, Lcom/google/android/gms/internal/ll$a$a;->adG:Ljava/lang/String;
    //         aget-object v4, v3, v1
    //         iget-object v5, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->webUrl:Landroid/net/Uri;
    //         invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         iput-object v5, v4, Lcom/google/android/gms/internal/ll$a$a;->adH:Ljava/lang/String;
    //         aget-object v4, v3, v1
    //         iget v0, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->viewId:I
    //         iput v0, v4, Lcom/google/android/gms/internal/ll$a$a;->viewId:I
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         iput-object v3, v2, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         new-instance v0, Lcom/google/android/gms/internal/hi;
    //         invoke-static {v2}, Lcom/google/android/gms/internal/pn;->f(Lcom/google/android/gms/internal/pn;)[B
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/internal/hq$a;
    //         const-string v3, "outlinks"
    //         invoke-direct {v2, v3}, Lcom/google/android/gms/internal/hq$a;-><init>(Ljava/lang/String;)V
    //         const/4 v3, 0x1
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hq$a;->E(Z)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v2
    //         const-string v3, ".private:outLinks"
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hq$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v2
    //         const-string v3, "blob"
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hq$a;->at(Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/hq$a;->fm()Lcom/google/android/gms/internal/hq;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hi;-><init>([BLcom/google/android/gms/internal/hq;)V
    //         return-object v0
    */

    private @JvmStatic fun f(p0: android.net.Uri): com.google.android.gms.internal.hi { return TODO("body: (Landroid/net/Uri;)Lcom/google/android/gms/internal/hi;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/internal/hi;
    //         invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/internal/hq$a;
    //         const-string v3, "web_url"
    //         invoke-direct {v2, v3}, Lcom/google/android/gms/internal/hq$a;-><init>(Ljava/lang/String;)V
    //         const/4 v3, 0x4
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hq$a;->P(I)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v2
    //         const/4 v3, 0x1
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hq$a;->E(Z)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v2
    //         const-string v3, "url"
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hq$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/hq$a;->fm()Lcom/google/android/gms/internal/hq;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hi;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hq;)V
    //         return-object v0
    */

    private @JvmStatic fun g(p0: android.content.Intent): String { return TODO("body: (Landroid/content/Intent;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/zip/CRC32;
    //         invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V
    //         :try_start_0
    //         const-string v2, "UTF-8"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/zip/CRC32;->update([B)V
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private @JvmStatic fun i(p0: String, p1: String): com.google.android.gms.internal.hg { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hg;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/hg;
    //         const-string v1, ""
    //         invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/internal/hg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    private @JvmStatic fun j(p0: String, p1: String): com.google.android.gms.internal.hi { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hi;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/internal/hi;
    //         new-instance v1, Lcom/google/android/gms/internal/hq$a;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hq$a;-><init>(Ljava/lang/String;)V
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/hq$a;->E(Z)Lcom/google/android/gms/internal/hq$a;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/hq$a;->fm()Lcom/google/android/gms/internal/hq;
    //         move-result-object v1
    //         invoke-direct {v0, p1, v1, p0}, Lcom/google/android/gms/internal/hi;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hq;Ljava/lang/String;)V
    //         return-object v0
    */

    }
}
