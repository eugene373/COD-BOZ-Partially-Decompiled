package com.google.android.gms.plus

// Auto-emitted from smali.
// 0 fields, 6 methods.

interface People {
    public fun getCurrentPerson(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.plus.model.people.Person

    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.Collection): com.google.android.gms.common.api.PendingResult

    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Array<String>): com.google.android.gms.common.api.PendingResult

    public fun loadConnected(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun loadVisible(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: String): com.google.android.gms.common.api.PendingResult

    public fun loadVisible(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

}
