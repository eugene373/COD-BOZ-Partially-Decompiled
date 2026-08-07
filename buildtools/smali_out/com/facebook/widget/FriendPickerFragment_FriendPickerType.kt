package com.facebook.widget

// Auto-emitted from smali source: FriendPickerFragment.java.
// 6 fields, 6 methods.

enum class FriendPickerFragment_FriendPickerType {
    FRIENDS,
    INVITABLE_FRIENDS,
    TAGGABLE_FRIENDS,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: String, p1: Boolean)
    // instance fields (declare as constructor params or properties):
    //   private val requestIsCacheable: Boolean
    //   private val requestPath: String

    fun getRequestPath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->requestPath:Ljava/lang/String;
    //         return-object v0
    */

    fun isCacheable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->requestIsCacheable:Z
    //         return v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.widget.FriendPickerFragment.FriendPickerType { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.widget.FriendPickerFragment.FriendPickerType> { return TODO("body: ()[Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->$VALUES:[Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         invoke-virtual {v0}, [Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         return-object v0
    */

    }
}
