package com.ideaworks3d.marmalade

import android.location.GpsSatellite
import android.location.GpsStatus
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle

class LoaderLocation {
    private var m_LocationManager: LocationManager? = null
    private var m_LocationListener: LocationUpdateHandler? = null
    private var m_GpsStatus: GpsStatus? = null
    private var m_LocationUpdateInterval = 5000
    private var m_LocationUpdateDistance = 2

    private external fun locationUpdate(
        providerType: Int,
        time: Long,
        latitude: Double,
        longitude: Double,
        altitude: Double,
        accuracy: Float,
        bearing: Float,
        speed: Float,
    )

    private external fun locationSatellite(
        index: Int,
        azimuth: Float,
        elevation: Float,
        prn: Int,
        snr: Float,
        usedInFix: Boolean,
    )

    fun locationStart(activity: LoaderActivity): Boolean {
        if (m_LocationManager != null) return false
        m_LocationManager = activity.getSystemService("location") as? LocationManager
        if (m_LocationManager == null) return false

        val interval = intArrayOf(5000)
        val distance = intArrayOf(2)
        if (LoaderAPI.s3eConfigGetInt("s3e", "LocUpdateInterval", interval) == 0) {
            m_LocationUpdateInterval = interval[0]
        }
        if (LoaderAPI.s3eConfigGetInt("s3e", "LocUpdateDistance", distance) == 0) {
            m_LocationUpdateDistance = distance[0]
        }

        activity.LoaderThread().runOnOSThread {
            m_LocationListener = LocationUpdateHandler()
            m_LocationManager!!.requestLocationUpdates(
                "gps",
                m_LocationUpdateInterval.toLong(),
                m_LocationUpdateDistance.toFloat(),
                m_LocationListener!!,
            )
            m_LocationManager!!.addGpsStatusListener(m_LocationListener)
        }

        var providerType = 1
        var last = m_LocationManager!!.getLastKnownLocation("gps")
        if (last == null) {
            providerType = 3
            last = m_LocationManager!!.getLastKnownLocation("network")
        }
        if (last != null) {
            locationUpdate(
                providerType,
                last.time,
                last.latitude,
                last.longitude,
                last.altitude,
                last.accuracy,
                if (last.hasBearing()) last.bearing else -1.0f,
                last.speed,
            )
        }
        return true
    }

    fun locationStop(): Boolean {
        if (m_LocationManager == null) return false
        m_LocationManager!!.removeGpsStatusListener(m_LocationListener!!)
        m_LocationManager!!.removeUpdates(m_LocationListener!!)
        m_LocationListener = null
        m_LocationManager = null
        return true
    }

    fun locationGpsData(): Boolean {
        if (m_GpsStatus == null) return false
        var index = 0
        for (sat in m_GpsStatus!!.satellites) {
            locationSatellite(index, sat.azimuth, sat.elevation, sat.prn, sat.snr, sat.usedInFix())
            index++
        }
        return true
    }

    internal inner class LocationUpdateHandler : LocationListener, GpsStatus.Listener {
        override fun onGpsStatusChanged(event: Int) {
            if (m_LocationManager != null) {
                if (m_GpsStatus == null) {
                    m_GpsStatus = m_LocationManager!!.getGpsStatus(null)
                } else {
                    m_LocationManager!!.getGpsStatus(m_GpsStatus)
                }
            }
        }

        override fun onLocationChanged(location: Location) {
            val providerType = if (location.provider == "gps") 1 else 3
            locationUpdate(
                providerType,
                location.time,
                location.latitude,
                location.longitude,
                location.altitude,
                location.accuracy,
                if (location.hasBearing()) location.bearing else -1.0f,
                location.speed,
            )
        }

        override fun onProviderDisabled(provider: String) {}
        override fun onProviderEnabled(provider: String) {}
        override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {}
    }
}
