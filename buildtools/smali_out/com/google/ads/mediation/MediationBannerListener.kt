package com.google.ads.mediation

// Auto-emitted from smali.
// 0 fields, 6 methods.

interface MediationBannerListener {
    public fun onClick(p0: com.google.ads.mediation.MediationBannerAdapter)

    public fun onDismissScreen(p0: com.google.ads.mediation.MediationBannerAdapter)

    public fun onFailedToReceiveAd(p0: com.google.ads.mediation.MediationBannerAdapter, p1: com.google.ads.AdRequest.ErrorCode)

    public fun onLeaveApplication(p0: com.google.ads.mediation.MediationBannerAdapter)

    public fun onPresentScreen(p0: com.google.ads.mediation.MediationBannerAdapter)

    public fun onReceivedAd(p0: com.google.ads.mediation.MediationBannerAdapter)

}
