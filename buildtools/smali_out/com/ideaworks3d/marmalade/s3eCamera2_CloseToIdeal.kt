package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera2.java.
// 1 fields, 3 methods.

open class s3eCamera2_CloseToIdeal: java.util.Comparator {
    var m_IdealSize: android.util.Size

    constructor(p0: android.util.Size)

    public fun compare(p0: android.util.Size, p1: android.util.Size): Int { return TODO("body: (Landroid/util/Size;Landroid/util/Size;)I") }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/util/Size;->getHeight()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;
    //         invoke-virtual {v1}, Landroid/util/Size;->getHeight()I
    //         move-result v1
    //         sub-int/2addr v0, v1
    //         invoke-static {v0}, Ljava/lang/Math;->abs(I)I
    //         move-result v0
    //         invoke-virtual {p1}, Landroid/util/Size;->getWidth()I
    //         move-result v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;
    //         invoke-virtual {v2}, Landroid/util/Size;->getWidth()I
    //         move-result v2
    //         sub-int/2addr v1, v2
    //         invoke-static {v1}, Ljava/lang/Math;->abs(I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         invoke-virtual {p2}, Landroid/util/Size;->getHeight()I
    //         move-result v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;
    //         invoke-virtual {v2}, Landroid/util/Size;->getHeight()I
    //         move-result v2
    //         sub-int/2addr v1, v2
    //         invoke-static {v1}, Ljava/lang/Math;->abs(I)I
    //         move-result v1
    //         invoke-virtual {p2}, Landroid/util/Size;->getWidth()I
    //         move-result v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;
    //         invoke-virtual {v3}, Landroid/util/Size;->getWidth()I
    //         move-result v3
    //         sub-int/2addr v2, v3
    //         invoke-static {v2}, Ljava/lang/Math;->abs(I)I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         sub-int/2addr v0, v1
    //         return v0
    */

    public fun compare(p0: Object, p1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/util/Size;
    //         check-cast p2, Landroid/util/Size;
    //         invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->compare(Landroid/util/Size;Landroid/util/Size;)I
    //         move-result v0
    //         return v0
    */

}
