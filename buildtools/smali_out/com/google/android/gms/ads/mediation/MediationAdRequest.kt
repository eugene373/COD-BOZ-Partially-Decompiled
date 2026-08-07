package com.google.android.gms.ads.mediation

// Auto-emitted from smali.
// 3 fields, 6 methods.

interface MediationAdRequest {
    public fun getBirthday(): java.util.Date

    public fun getGender(): Int

    public fun getKeywords(): java.util.Set

    public fun getLocation(): android.location.Location

    public fun isTesting(): Boolean

    public fun taggedForChildDirectedTreatment(): Int

    companion object {
    @JvmField public val TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE: Int = 0x0
    @JvmField public val TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE: Int = 0x1
    @JvmField public val TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED: Int = 0
    }
}
