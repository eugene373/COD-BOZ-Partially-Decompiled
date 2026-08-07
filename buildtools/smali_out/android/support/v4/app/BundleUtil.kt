package android.support.v4.app

// Auto-emitted from smali source: BundleUtil.java.
// 0 fields, 2 methods.

open class BundleUtil {
    constructor()

    companion object {
    public @JvmStatic fun getBundleArrayFromBundle(bundle: android.os.Bundle, key: String): Array<android.os.Bundle> { return TODO("body: (Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
    //         move-result-object v0
    //         .local v0, "array":[Landroid/os/Parcelable;
    //         instance-of v2, v0, [Landroid/os/Bundle;
    //         if-nez v2, :cond_0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         check-cast v0, [Landroid/os/Bundle;
    //         .end local v0    # "array":[Landroid/os/Parcelable;
    //         check-cast v0, [Landroid/os/Bundle;
    //         move-object v1, v0
    //         :goto_0
    //         return-object v1
    //         .restart local v0    # "array":[Landroid/os/Parcelable;
    //         :cond_1
    //         array-length v2, v0
    //         const-class v3, [Landroid/os/Bundle;
    //         invoke-static {v0, v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, [Landroid/os/Bundle;
    //         .local v1, "typedArray":[Landroid/os/Bundle;
    //         invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         goto :goto_0
    */

    }
}
