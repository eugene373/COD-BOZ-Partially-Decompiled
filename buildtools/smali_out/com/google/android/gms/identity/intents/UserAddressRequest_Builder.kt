package com.google.android.gms.identity.intents

// Auto-emitted from smali.
// 1 fields, 5 methods.

class UserAddressRequest_Builder {
    val adL: com.google.android.gms.identity.intents.UserAddressRequest

    private constructor(p0: com.google.android.gms.identity.intents.UserAddressRequest)

    constructor(x0: com.google.android.gms.identity.intents.UserAddressRequest, x1: com.google.android.gms.identity.intents.UserAddressRequest.1)

    public fun addAllowedCountrySpecification(countrySpecification: com.google.android.gms.identity.intents.model.CountrySpecification): com.google.android.gms.identity.intents.UserAddressRequest.Builder { return TODO("body: (Lcom/google/android/gms/identity/intents/model/CountrySpecification;)Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addAllowedCountrySpecifications(p0: java.util.Collection): com.google.android.gms.identity.intents.UserAddressRequest.Builder { return TODO("body: (Ljava/util/Collection;)Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/identity/intents/model/CountrySpecification;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "countrySpecifications":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/identity/intents/model/CountrySpecification;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun build(): com.google.android.gms.identity.intents.UserAddressRequest { return TODO("body: ()Lcom/google/android/gms/identity/intents/UserAddressRequest;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v1, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         iget-object v1, v1, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v1
    //         iput-object v1, v0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->adK:Ljava/util/List;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;->adL:Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         return-object v0
    */

}
