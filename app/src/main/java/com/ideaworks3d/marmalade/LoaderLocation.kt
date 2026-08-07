package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 5 fields, 5 methods.

open class LoaderLocation {
        private var m_LocationManager: android.location.LocationManager
        private var m_LocationListener: com.ideaworks3d.marmalade.LoaderLocation$LocationUpdateHandler
        private var m_GpsStatus: android.location.GpsStatus
        private var m_LocationUpdateInterval: Int
        private var m_LocationUpdateDistance: Int

    private external fun locationUpdate(p0: Int, p1: Long, p2: Double, p3: Double, p4: Double, p5: Float, p6: Float, p7: Float)
    private external fun locationSatellite(p0: Int, p1: Float, p2: Float, p3: Int, p4: Float, p5: Boolean)
    public fun locationStart(p0: com.ideaworks3d.marmalade.LoaderActivity): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/LoaderActivity;)Z") }
    public fun locationStop(): Boolean { return TODO("body: ()Z") }
    public fun locationGpsData(): Boolean { return TODO("body: ()Z") }
}
