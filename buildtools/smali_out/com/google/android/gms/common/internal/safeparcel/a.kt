package com.google.android.gms.common.internal.safeparcel

// Auto-emitted from smali.
// 0 fields, 39 methods.

open class a {
    companion object {
    public @JvmStatic fun A(p0: android.os.Parcel, p1: Int): Array<String> { return TODO("body: (Landroid/os/Parcel;I)[Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun B(p0: android.os.Parcel): Int { return TODO("body: (Landroid/os/Parcel;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun B(p0: android.os.Parcel, p1: Int): java.util.ArrayList { return TODO("body: (Landroid/os/Parcel;I)Ljava/util/ArrayList;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Parcel;",
    //                 "I)",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v2
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-nez v2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         const/4 v1, 0x0
    //         :goto_1
    //         if-ge v1, v4, :cond_1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v5
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_1
    //         add-int v1, v3, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun C(p0: android.os.Parcel): Int { return TODO("body: (Landroid/os/Parcel;)I") }
    /*
    //         .locals 5
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v3
    //         const/16 v4, 0x4f45
    //         if-eq v3, v4, :cond_0
    //         new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Expected object header. Got 0x"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0, p0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v1
    //         :cond_0
    //         add-int v0, v2, v1
    //         if-lt v0, v2, :cond_1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataSize()I
    //         move-result v1
    //         if-le v0, v1, :cond_2
    //         :cond_1
    //         new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Size read is invalid start="
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " end="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0, p0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v1
    //         :cond_2
    //         return v0
    */

    public @JvmStatic fun C(p0: android.os.Parcel, p1: Int): java.util.ArrayList { return TODO("body: (Landroid/os/Parcel;I)Ljava/util/ArrayList;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Parcel;",
    //                 "I)",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun D(p0: android.os.Parcel, p1: Int): android.os.Parcel { return TODO("body: (Landroid/os/Parcel;I)Landroid/os/Parcel;") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun E(p0: android.os.Parcel, p1: Int): Array<android.os.Parcel> { return TODO("body: (Landroid/os/Parcel;I)[Landroid/os/Parcel;") }
    /*
    //         .locals 9
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v3
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v4
    //         if-nez v3, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v5
    //         new-array v1, v5, [Landroid/os/Parcel;
    //         const/4 v2, 0x0
    //         :goto_1
    //         if-ge v2, v5, :cond_2
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v6
    //         if-eqz v6, :cond_1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v7
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v8
    //         invoke-virtual {v8, p0, v7, v6}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V
    //         aput-object v8, v1, v2
    //         add-int/2addr v6, v7
    //         invoke-virtual {p0, v6}, Landroid/os/Parcel;->setDataPosition(I)V
    //         :goto_2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    //         :cond_1
    //         aput-object v0, v1, v2
    //         goto :goto_2
    //         :cond_2
    //         add-int v0, v4, v3
    //         invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun a(p0: android.os.Parcel, p1: Int): Int { return TODO("body: (Landroid/os/Parcel;I)I") }
    /*
    //         .locals 2
    //         const/high16 v1, -0x10000
    //         and-int v0, p1, v1
    //         if-eq v0, v1, :cond_0
    //         shr-int/lit8 v0, p1, 0x10
    //         const v1, 0xffff
    //         and-int/2addr v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun a(p0: android.os.Parcel, p1: Int, p2: android.os.Parcelable.Creator): android.os.Parcelable { return TODO("body: (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Landroid/os/Parcelable;",
    //                 ">(",
    //                 "Landroid/os/Parcel;",
    //                 "I",
    //                 "Landroid/os/Parcelable$Creator",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p2, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Parcelable;
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    private @JvmStatic fun a(p0: android.os.Parcel, p1: Int, p2: Int) { /* TODO(body): (Landroid/os/Parcel;II)V */ }
    /*
    //         .locals 4
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         if-eq v0, p2, :cond_0
    //         new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Expected size "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " got "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " (0x"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ")"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0, p0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v1
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun a(p0: android.os.Parcel, p1: Int, p2: Int, p3: Int) { /* TODO(body): (Landroid/os/Parcel;III)V */ }
    /*
    //         .locals 3
    //         if-eq p2, p3, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Expected size "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " got "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " (0x"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ")"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun a(p0: android.os.Parcel, p1: Int, p2: java.util.List, p3: ClassLoader) { /* TODO(body): (Landroid/os/Parcel;ILjava/util/List;Ljava/lang/ClassLoader;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p2, p3}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun aD(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         const v0, 0xffff
    //         and-int/2addr v0, p0
    //         return v0
    */

    public @JvmStatic fun b(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
    //         return-void
    */

    public @JvmStatic fun b(p0: android.os.Parcel, p1: Int, p2: android.os.Parcelable.Creator): Array<Object> { return TODO("body: (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Landroid/os/Parcel;",
    //                 "I",
    //                 "Landroid/os/Parcelable$Creator",
    //                 "<TT;>;)[TT;"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0, p2}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun c(p0: android.os.Parcel, p1: Int, p2: android.os.Parcelable.Creator): java.util.ArrayList { return TODO("body: (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Landroid/os/Parcel;",
    //                 "I",
    //                 "Landroid/os/Parcelable$Creator",
    //                 "<TT;>;)",
    //                 "Ljava/util/ArrayList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0, p2}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun c(p0: android.os.Parcel, p1: Int): Boolean { return TODO("body: (Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun d(p0: android.os.Parcel, p1: Int): Boolean { return TODO("body: (Landroid/os/Parcel;I)Ljava/lang/Boolean;") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v1, 0x4
    //         invoke-static {p0, p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;III)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public @JvmStatic fun e(p0: android.os.Parcel, p1: Int): Byte { return TODO("body: (Landroid/os/Parcel;I)B") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         int-to-byte v0, v0
    //         return v0
    */

    public @JvmStatic fun f(p0: android.os.Parcel, p1: Int): Short { return TODO("body: (Landroid/os/Parcel;I)S") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         int-to-short v0, v0
    //         return v0
    */

    public @JvmStatic fun g(p0: android.os.Parcel, p1: Int): Int { return TODO("body: (Landroid/os/Parcel;I)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun h(p0: android.os.Parcel, p1: Int): Integer { return TODO("body: (Landroid/os/Parcel;I)Ljava/lang/Integer;") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v1, 0x4
    //         invoke-static {p0, p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;III)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun i(p0: android.os.Parcel, p1: Int): Long { return TODO("body: (Landroid/os/Parcel;I)J") }
    /*
    //         .locals 2
    //         const/16 v0, 0x8
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun j(p0: android.os.Parcel, p1: Int): Long { return TODO("body: (Landroid/os/Parcel;I)Ljava/lang/Long;") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/16 v1, 0x8
    //         invoke-static {p0, p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;III)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun k(p0: android.os.Parcel, p1: Int): java.math.BigInteger { return TODO("body: (Landroid/os/Parcel;I)Ljava/math/BigInteger;") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v2
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
    //         new-instance v0, Ljava/math/BigInteger;
    //         invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>([B)V
    //         goto :goto_0
    */

    public @JvmStatic fun l(p0: android.os.Parcel, p1: Int): Float { return TODO("body: (Landroid/os/Parcel;I)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readFloat()F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun m(p0: android.os.Parcel, p1: Int): Double { return TODO("body: (Landroid/os/Parcel;I)D") }
    /*
    //         .locals 2
    //         const/16 v0, 0x8
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;II)V
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readDouble()D
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun n(p0: android.os.Parcel, p1: Int): java.math.BigDecimal { return TODO("body: (Landroid/os/Parcel;I)Ljava/math/BigDecimal;") }
    /*
    //         .locals 4
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v2
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
    //         new-instance v0, Ljava/math/BigDecimal;
    //         new-instance v1, Ljava/math/BigInteger;
    //         invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>([B)V
    //         invoke-direct {v0, v1, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V
    //         goto :goto_0
    */

    public @JvmStatic fun o(p0: android.os.Parcel, p1: Int): String { return TODO("body: (Landroid/os/Parcel;I)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun p(p0: android.os.Parcel, p1: Int): android.os.IBinder { return TODO("body: (Landroid/os/Parcel;I)Landroid/os/IBinder;") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun q(p0: android.os.Parcel, p1: Int): android.os.Bundle { return TODO("body: (Landroid/os/Parcel;I)Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun r(p0: android.os.Parcel, p1: Int): ByteArray { return TODO("body: (Landroid/os/Parcel;I)[B") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun t(p0: android.os.Parcel, p1: Int): BooleanArray { return TODO("body: (Landroid/os/Parcel;I)[Z") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createBooleanArray()[Z
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun u(p0: android.os.Parcel, p1: Int): IntArray { return TODO("body: (Landroid/os/Parcel;I)[I") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createIntArray()[I
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun v(p0: android.os.Parcel, p1: Int): LongArray { return TODO("body: (Landroid/os/Parcel;I)[J") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createLongArray()[J
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun w(p0: android.os.Parcel, p1: Int): Array<java.math.BigInteger> { return TODO("body: (Landroid/os/Parcel;I)[Ljava/math/BigInteger;") }
    /*
    //         .locals 7
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v2
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-nez v2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         new-array v0, v4, [Ljava/math/BigInteger;
    //         const/4 v1, 0x0
    //         :goto_1
    //         if-ge v1, v4, :cond_1
    //         new-instance v5, Ljava/math/BigInteger;
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v6
    //         invoke-direct {v5, v6}, Ljava/math/BigInteger;-><init>([B)V
    //         aput-object v5, v0, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_1
    //         add-int v1, v3, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun x(p0: android.os.Parcel, p1: Int): FloatArray { return TODO("body: (Landroid/os/Parcel;I)[F") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createFloatArray()[F
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun y(p0: android.os.Parcel, p1: Int): DoubleArray { return TODO("body: (Landroid/os/Parcel;I)[D") }
    /*
    //         .locals 3
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createDoubleArray()[D
    //         move-result-object v0
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    public @JvmStatic fun z(p0: android.os.Parcel, p1: Int): Array<java.math.BigDecimal> { return TODO("body: (Landroid/os/Parcel;I)[Ljava/math/BigDecimal;") }
    /*
    //         .locals 9
    //         invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;I)I
    //         move-result v2
    //         invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-nez v2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         new-array v0, v4, [Ljava/math/BigDecimal;
    //         const/4 v1, 0x0
    //         :goto_1
    //         if-ge v1, v4, :cond_1
    //         invoke-virtual {p0}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v5
    //         invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
    //         move-result v6
    //         new-instance v7, Ljava/math/BigDecimal;
    //         new-instance v8, Ljava/math/BigInteger;
    //         invoke-direct {v8, v5}, Ljava/math/BigInteger;-><init>([B)V
    //         invoke-direct {v7, v8, v6}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V
    //         aput-object v7, v0, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_1
    //         add-int v1, v3, v2
    //         invoke-virtual {p0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         goto :goto_0
    */

    }
}
