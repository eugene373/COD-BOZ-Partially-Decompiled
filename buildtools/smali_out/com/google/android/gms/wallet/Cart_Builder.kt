package com.google.android.gms.wallet

// Auto-emitted from smali.
// 1 fields, 7 methods.

class Cart_Builder {
    val asy: com.google.android.gms.wallet.Cart

    private constructor(p0: com.google.android.gms.wallet.Cart)

    constructor(x0: com.google.android.gms.wallet.Cart, x1: com.google.android.gms.wallet.Cart.1)

    public fun addLineItem(lineItem: com.google.android.gms.wallet.LineItem): com.google.android.gms.wallet.Cart.Builder { return TODO("body: (Lcom/google/android/gms/wallet/LineItem;)Lcom/google/android/gms/wallet/Cart$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$Builder;->asy:Lcom/google/android/gms/wallet/Cart;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/Cart;->asx:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun build(): com.google.android.gms.wallet.Cart { return TODO("body: ()Lcom/google/android/gms/wallet/Cart;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$Builder;->asy:Lcom/google/android/gms/wallet/Cart;
    //         return-object v0
    */

    public fun setCurrencyCode(currencyCode: String): com.google.android.gms.wallet.Cart.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/Cart$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$Builder;->asy:Lcom/google/android/gms/wallet/Cart;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/Cart;->asw:Ljava/lang/String;
    //         return-object p0
    */

    public fun setLineItems(p0: java.util.List): com.google.android.gms.wallet.Cart.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/wallet/Cart$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/wallet/LineItem;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/wallet/Cart$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "lineItems":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/wallet/LineItem;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$Builder;->asy:Lcom/google/android/gms/wallet/Cart;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/Cart;->asx:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$Builder;->asy:Lcom/google/android/gms/wallet/Cart;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/Cart;->asx:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun setTotalPrice(totalPrice: String): com.google.android.gms.wallet.Cart.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/Cart$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart$Builder;->asy:Lcom/google/android/gms/wallet/Cart;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/Cart;->asv:Ljava/lang/String;
    //         return-object p0
    */

}
