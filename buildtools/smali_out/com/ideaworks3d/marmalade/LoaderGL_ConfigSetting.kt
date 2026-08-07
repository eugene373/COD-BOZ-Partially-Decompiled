package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderGL.java.
// 5 fields, 9 methods.

open class LoaderGL_ConfigSetting {
    private var mDefault: Int
    private var mName: String
    private var mSetting: Int
    private var mValue: Int
    val this$0: com.ideaworks3d.marmalade.LoaderGL

    public constructor(p0: com.ideaworks3d.marmalade.LoaderGL, p1: String, p2: Int)

    public constructor(p0: com.ideaworks3d.marmalade.LoaderGL, p1: String, p2: Int, p3: Int)

    private fun Construct(p0: String, p1: Int, p2: Int) { /* TODO(body): (Ljava/lang/String;II)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mName:Ljava/lang/String;
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mSetting:I
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mDefault:I
    //         const/4 v0, 0x1
    //         new-array v0, v0, [I
    //         const/4 v1, -0x1
    //         aput v1, v0, v2
    //         const-string v1, "GL"
    //         invoke-static {v1, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I
    //         move-result v1
    //         if-nez v1, :cond_0
    //         aget v0, v0, v2
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I
    //         goto :goto_0
    */

    public fun GetDefault(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mDefault:I
    //         return v0
    */

    public fun GetName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun GetSetting(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mSetting:I
    //         return v0
    */

    public fun GetValue(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I
    //         return v0
    */

    public fun HasValue(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I
    //         const/4 v1, -0x1
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun SetValueToDefault() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mDefault:I
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->mValue:I
    //         return-void
    */

}
