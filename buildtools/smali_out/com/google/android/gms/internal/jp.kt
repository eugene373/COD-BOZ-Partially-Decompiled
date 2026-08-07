package com.google.android.gms.internal

// Auto-emitted from smali.
// 8 fields, 24 methods.

open class jp: com.google.android.gms.internal.ji(), com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val MG: com.google.android.gms.internal.jm
    private val MN: android.os.Parcel
    private val MO: Int
    private var MP: Int
    private var MQ: Int
    private val mClassName: String

    constructor(p0: Int, p1: android.os.Parcel, p2: com.google.android.gms.internal.jm)

    private constructor(p0: com.google.android.gms.common.internal.safeparcel.SafeParcelable, p1: com.google.android.gms.internal.jm, p2: String)

    private fun a(p0: StringBuilder, p1: Int, p2: Object) { /* TODO(body): (Ljava/lang/StringBuilder;ILjava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         packed-switch p2, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown type = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :goto_0
    //         return-void
    //         :pswitch_1
    //         const-string v0, "\""
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/jz;->bf(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "\""
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         check-cast p3, [B
    //         check-cast p3, [B
    //         invoke-static {p3}, Lcom/google/android/gms/internal/js;->d([B)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "\""
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         check-cast p3, [B
    //         check-cast p3, [B
    //         invoke-static {p3}, Lcom/google/android/gms/internal/js;->e([B)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, "\""
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :pswitch_4
    //         check-cast p3, Ljava/util/HashMap;
    //         invoke-static {p1, p3}, Lcom/google/android/gms/internal/ka;->a(Ljava/lang/StringBuilder;Ljava/util/HashMap;)V
    //         goto :goto_0
    //         :pswitch_5
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Method does not accept concrete type."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //         .end packed-switch
    */

    private fun a(p0: StringBuilder, p1: com.google.android.gms.internal.ji.a, p2: android.os.Parcel, p3: Int) { /* TODO(body): (Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/StringBuilder;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;",
    //                 "Landroid/os/Parcel;",
    //                 "I)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->he()I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown field out type = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->he()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :pswitch_1
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->k(Landroid/os/Parcel;I)Ljava/math/BigInteger;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->l(Landroid/os/Parcel;I)F
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->m(Landroid/os/Parcel;I)D
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->n(Landroid/os/Parcel;I)Ljava/math/BigDecimal;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_6
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_7
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_8
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->r(Landroid/os/Parcel;I)[B
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_9
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->q(Landroid/os/Parcel;I)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/jp;->e(Landroid/os/Bundle;)Ljava/util/HashMap;
    //         move-result-object v0
    //         invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_a
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Method does not accept concrete type."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //             :pswitch_8
    //             :pswitch_8
    //             :pswitch_9
    //             :pswitch_a
    //         .end packed-switch
    */

    private fun a(p0: StringBuilder, p1: String, p2: com.google.android.gms.internal.ji.a, p3: android.os.Parcel, p4: Int) { /* TODO(body): (Ljava/lang/StringBuilder;Ljava/lang/String;Lcom/google/android/gms/internal/ji$a;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/StringBuilder;",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;",
    //                 "Landroid/os/Parcel;",
    //                 "I)V"
    //             }
    //         .end annotation
    //         const-string v0, "\""
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p3}, Lcom/google/android/gms/internal/ji$a;->hp()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, p1, p3, p4, p5}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p1, p3, p4, p5}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    private fun a(p0: StringBuilder, p1: java.util.HashMap, p2: android.os.Parcel) { /* TODO(body): (Ljava/lang/StringBuilder;Ljava/util/HashMap;Landroid/os/Parcel;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/StringBuilder;",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;",
    //                 "Landroid/os/Parcel;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-static {p2}, Lcom/google/android/gms/internal/jp;->b(Ljava/util/HashMap;)Ljava/util/HashMap;
    //         move-result-object v6
    //         const/16 v0, 0x7b
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-static {p3}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v7
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v7, :cond_2
    //         invoke-static {p3}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v5
    //         invoke-static {v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         if-eqz v0, :cond_0
    //         if-eqz v1, :cond_1
    //         const-string v1, ","
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Lcom/google/android/gms/internal/ji$a;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v4, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Lcom/google/android/gms/internal/ji$a;Landroid/os/Parcel;I)V
    //         const/4 v0, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p3}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v7, :cond_3
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p3}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_3
    //         const/16 v0, 0x7d
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         return-void
    */

    private fun b(p0: StringBuilder, p1: com.google.android.gms.internal.ji.a, p2: android.os.Parcel, p3: Int) { /* TODO(body): (Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/StringBuilder;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;",
    //                 "Landroid/os/Parcel;",
    //                 "I)V"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->hk()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "["
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->he()I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Unknown field type out."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->u(Landroid/os/Parcel;I)[I
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[I)V
    //         :cond_0
    //         :goto_0
    //         const-string v0, "]"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :goto_1
    //         return-void
    //         :pswitch_1
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->w(Landroid/os/Parcel;I)[Ljava/math/BigInteger;
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->v(Landroid/os/Parcel;I)[J
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[J)V
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->x(Landroid/os/Parcel;I)[F
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[F)V
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->y(Landroid/os/Parcel;I)[D
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[D)V
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->z(Landroid/os/Parcel;I)[Ljava/math/BigDecimal;
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_6
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->t(Landroid/os/Parcel;I)[Z
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[Z)V
    //         goto :goto_0
    //         :pswitch_7
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->A(Landroid/os/Parcel;I)[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/jr;->a(Ljava/lang/StringBuilder;[Ljava/lang/String;)V
    //         goto :goto_0
    //         :pswitch_8
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_9
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->E(Landroid/os/Parcel;I)[Landroid/os/Parcel;
    //         move-result-object v1
    //         array-length v3, v1
    //         move v0, v2
    //         :goto_2
    //         if-ge v0, v3, :cond_0
    //         if-lez v0, :cond_1
    //         const-string v4, ","
    //         invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         aget-object v4, v1, v0
    //         invoke-virtual {v4, v2}, Landroid/os/Parcel;->setDataPosition(I)V
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->hr()Ljava/util/HashMap;
    //         move-result-object v4
    //         aget-object v5, v1, v0
    //         invoke-direct {p0, p1, v4, v5}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;Ljava/util/HashMap;Landroid/os/Parcel;)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_2
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->he()I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Unknown field type out"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_a
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :pswitch_b
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->k(Landroid/os/Parcel;I)Ljava/math/BigInteger;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :pswitch_c
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v0
    //         invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_d
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->l(Landroid/os/Parcel;I)F
    //         move-result v0
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_e
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->m(Landroid/os/Parcel;I)D
    //         move-result-wide v0
    //         invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_f
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->n(Landroid/os/Parcel;I)Ljava/math/BigDecimal;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_10
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v0
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_11
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-static {v0}, Lcom/google/android/gms/internal/jz;->bf(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_12
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->r(Landroid/os/Parcel;I)[B
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-static {v0}, Lcom/google/android/gms/internal/js;->d([B)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_13
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->r(Landroid/os/Parcel;I)[B
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-static {v0}, Lcom/google/android/gms/internal/js;->e([B)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, "\""
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_14
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->q(Landroid/os/Parcel;I)Landroid/os/Bundle;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Set;->size()I
    //         const-string v0, "{"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const/4 v0, 0x1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         move v1, v0
    //         :goto_3
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v1, :cond_3
    //         const-string v1, ","
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_3
    //         const-string v1, "\""
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v5, "\""
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, ":"
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, "\""
    //         invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/jz;->bf(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move v1, v2
    //         goto :goto_3
    //         :cond_4
    //         const-string v0, "}"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto/16 :goto_1
    //         :pswitch_15
    //         invoke-static {p3, p4}, Lcom/google/android/gms/common/internal/safeparcel/a;->D(Landroid/os/Parcel;I)Landroid/os/Parcel;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->hr()Ljava/util/HashMap;
    //         move-result-object v1
    //         invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;Ljava/util/HashMap;Landroid/os/Parcel;)V
    //         goto/16 :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //             :pswitch_8
    //             :pswitch_8
    //             :pswitch_8
    //             :pswitch_9
    //         .end packed-switch
    //         :pswitch_data_1
    //         .packed-switch 0x0
    //             :pswitch_a
    //             :pswitch_b
    //             :pswitch_c
    //             :pswitch_d
    //             :pswitch_e
    //             :pswitch_f
    //             :pswitch_10
    //             :pswitch_11
    //             :pswitch_12
    //             :pswitch_13
    //             :pswitch_14
    //             :pswitch_15
    //         .end packed-switch
    */

    private fun b(p0: StringBuilder, p1: com.google.android.gms.internal.ji.a, p2: Object) { /* TODO(body): (Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/StringBuilder;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;",
    //                 "Ljava/lang/Object;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->hj()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         check-cast p3, Ljava/util/ArrayList;
    //         invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/jp;->b(Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/util/ArrayList;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->hd()I
    //         move-result v0
    //         invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;ILjava/lang/Object;)V
    //         goto :goto_0
    */

    private fun b(p0: StringBuilder, p1: com.google.android.gms.internal.ji.a, p2: java.util.ArrayList) { /* TODO(body): (Ljava/lang/StringBuilder;Lcom/google/android/gms/internal/ji$a;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/StringBuilder;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;",
    //                 "Ljava/util/ArrayList",
    //                 "<*>;)V"
    //             }
    //         .end annotation
    //         const-string v0, "["
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p3}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v1, :cond_1
    //         if-eqz v0, :cond_0
    //         const-string v2, ","
    //         invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/internal/ji$a;->hd()I
    //         move-result v2
    //         invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-direct {p0, p1, v2, v3}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;ILjava/lang/Object;)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "]"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         return-void
    */

    protected fun ba(p0: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Converting to JSON does not require this method."
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    protected fun bb(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Converting to JSON does not require this method."
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jp;->CREATOR:Lcom/google/android/gms/internal/jq;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/jp;->BR:I
    //         return v0
    */

    public fun hf(): java.util.HashMap { return TODO("body: ()Ljava/util/HashMap;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MG:Lcom/google/android/gms/internal/jm;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MG:Lcom/google/android/gms/internal/jm;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jp;->mClassName:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jm;->be(Ljava/lang/String;)Ljava/util/HashMap;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun hx(): android.os.Parcel { return TODO("body: ()Landroid/os/Parcel;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x2
    //         iget v0, p0, Lcom/google/android/gms/internal/jp;->MP:I
    //         packed-switch v0, :pswitch_data_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MN:Landroid/os/Parcel;
    //         return-object v0
    //         :pswitch_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MN:Landroid/os/Parcel;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/jp;->MQ:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MN:Landroid/os/Parcel;
    //         iget v1, p0, Lcom/google/android/gms/internal/jp;->MQ:I
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         iput v2, p0, Lcom/google/android/gms/internal/jp;->MP:I
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MN:Landroid/os/Parcel;
    //         iget v1, p0, Lcom/google/android/gms/internal/jp;->MQ:I
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         iput v2, p0, Lcom/google/android/gms/internal/jp;->MP:I
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    fun hy(): com.google.android.gms.internal.jm { return TODO("body: ()Lcom/google/android/gms/internal/jm;") }
    /*
    //         .locals 3
    //         iget v0, p0, Lcom/google/android/gms/internal/jp;->MO:I
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Invalid creation type: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/internal/jp;->MO:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MG:Lcom/google/android/gms/internal/jm;
    //         goto :goto_0
    //         :pswitch_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MG:Lcom/google/android/gms/internal/jm;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jp;->MG:Lcom/google/android/gms/internal/jm;
    //         const-string v1, "Cannot convert to JSON on client side."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/jp;->hx()Landroid/os/Parcel;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const/16 v2, 0x64
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/jp;->MG:Lcom/google/android/gms/internal/jm;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/jp;->mClassName:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/jm;->be(Ljava/lang/String;)Ljava/util/HashMap;
    //         move-result-object v2
    //         invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/jp;->a(Ljava/lang/StringBuilder;Ljava/util/HashMap;Landroid/os/Parcel;)V
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jp;->CREATOR:Lcom/google/android/gms/internal/jq;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/jp;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jq = null!!

    public @JvmStatic fun a(p0: com.google.android.gms.internal.ji): com.google.android.gms.internal.jp { return TODO("body: (Lcom/google/android/gms/internal/ji;)Lcom/google/android/gms/internal/jp;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Lcom/google/android/gms/internal/ji;",
    //                 ":",
    //                 "Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;",
    //                 ">(TT;)",
    //                 "Lcom/google/android/gms/internal/jp;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0}, Lcom/google/android/gms/internal/jp;->b(Lcom/google/android/gms/internal/ji;)Lcom/google/android/gms/internal/jm;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/internal/jp;
    //         check-cast p0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         invoke-direct {v2, p0, v1, v0}, Lcom/google/android/gms/internal/jp;-><init>(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;Lcom/google/android/gms/internal/jm;Ljava/lang/String;)V
    //         return-object v2
    */

    private @JvmStatic fun a(p0: com.google.android.gms.internal.jm, p1: com.google.android.gms.internal.ji) { /* TODO(body): (Lcom/google/android/gms/internal/jm;Lcom/google/android/gms/internal/ji;)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jm;->b(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ji;->hf()Ljava/util/HashMap;
    //         move-result-object v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ji;->hf()Ljava/util/HashMap;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/jm;->a(Ljava/lang/Class;Ljava/util/HashMap;)V
    //         invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ji$a;->hn()Ljava/lang/Class;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/ji;
    //         invoke-static {p0, v1}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/jm;Lcom/google/android/gms/internal/ji;)V
    //         :try_end_0
    //         .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         new-instance v2, Ljava/lang/IllegalStateException;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Could not instantiate an object of type "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ji$a;->hn()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         :catch_1
    //         move-exception v1
    //         new-instance v2, Ljava/lang/IllegalStateException;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Could not access object of type "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ji$a;->hn()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         :cond_1
    //         return-void
    */

    private @JvmStatic fun b(p0: com.google.android.gms.internal.ji): com.google.android.gms.internal.jm { return TODO("body: (Lcom/google/android/gms/internal/ji;)Lcom/google/android/gms/internal/jm;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/jm;
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/jm;-><init>(Ljava/lang/Class;)V
    //         invoke-static {v0, p0}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/jm;Lcom/google/android/gms/internal/ji;)V
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/jm;->ht()V
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/jm;->hs()V
    //         return-object v0
    */

    private @JvmStatic fun b(p0: java.util.HashMap): java.util.HashMap { return TODO("body: (Ljava/util/HashMap;)Ljava/util/HashMap;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;)",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 "Ljava/util/Map$Entry",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;>;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/ji$a;->hm()I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public @JvmStatic fun e(p0: android.os.Bundle): java.util.HashMap { return TODO("body: (Landroid/os/Bundle;)Ljava/util/HashMap;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 ")",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    }
}
