package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 0 fields, 5 methods.

interface Invitations {
    public fun getInvitationInboxIntent(p0: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent

    public fun loadInvitations(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun loadInvitations(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int): com.google.android.gms.common.api.PendingResult

    public fun registerInvitationListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.OnInvitationReceivedListener)

    public fun unregisterInvitationListener(p0: com.google.android.gms.common.api.GoogleApiClient)

}
