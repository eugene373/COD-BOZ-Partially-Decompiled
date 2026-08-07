package com.google.ads.mediation

// Auto-emitted from smali.
// 5 fields, 7 methods.

class MediationAdRequest {
    private val d: java.util.Date
    private val e: com.google.ads.AdRequest.Gender
    private val f: java.util.Set
    private val g: Boolean
    private val h: android.location.Location

    public constructor(birthday: java.util.Date, gender: com.google.ads.AdRequest.Gender, isTesting: java.util.Set, location: Boolean, p4: android.location.Location)

    public fun getAgeInYears(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x5
    //         const/4 v3, 0x1
    //         const/4 v5, 0x2
    //         iget-object v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->d:Ljava/util/Date;
    //         if-eqz v0, :cond_2
    //         invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
    //         move-result-object v1
    //         invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->d:Ljava/util/Date;
    //         invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
    //         invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
    //         move-result v0
    //         invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I
    //         move-result v3
    //         sub-int/2addr v0, v3
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I
    //         move-result v3
    //         invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I
    //         move-result v4
    //         if-lt v3, v4, :cond_0
    //         invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I
    //         move-result v3
    //         invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I
    //         move-result v4
    //         if-ne v3, v4, :cond_1
    //         invoke-virtual {v2, v6}, Ljava/util/Calendar;->get(I)I
    //         move-result v2
    //         invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I
    //         move-result v1
    //         if-ge v2, v1, :cond_1
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         :cond_1
    //         :goto_0
    //         return-object v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getBirthday(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->d:Ljava/util/Date;
    //         return-object v0
    */

    public fun getGender(): com.google.ads.AdRequest.Gender { return TODO("body: ()Lcom/google/ads/AdRequest$Gender;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->e:Lcom/google/ads/AdRequest$Gender;
    //         return-object v0
    */

    public fun getKeywords(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->f:Ljava/util/Set;
    //         return-object v0
    */

    public fun getLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->h:Landroid/location/Location;
    //         return-object v0
    */

    public fun isTesting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->g:Z
    //         return v0
    */

}
