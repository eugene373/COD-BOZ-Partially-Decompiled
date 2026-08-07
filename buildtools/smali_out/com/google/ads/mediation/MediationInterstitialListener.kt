package com.google.ads.mediation

// Auto-emitted from smali.
// 0 fields, 5 methods.

interface MediationInterstitialListener {
    public fun onDismissScreen(p0: com.google.ads.mediation.MediationInterstitialAdapter)

    public fun onFailedToReceiveAd(p0: com.google.ads.mediation.MediationInterstitialAdapter, p1: com.google.ads.AdRequest.ErrorCode)

    public fun onLeaveApplication(p0: com.google.ads.mediation.MediationInterstitialAdapter)

    public fun onPresentScreen(p0: com.google.ads.mediation.MediationInterstitialAdapter)

    public fun onReceivedAd(p0: com.google.ads.mediation.MediationInterstitialAdapter)

}
