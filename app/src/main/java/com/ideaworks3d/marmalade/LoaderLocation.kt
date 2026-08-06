package com.ideaworks3d.marmalade

import android.location.GpsStatus
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle

class LoaderLocation {

    private var m_GpsStatus: GpsStatus? = null
    private var m_LocationListener: LocationUpdateHandler? = null
    private var m_LocationManager: LocationManager? = null
    private var m_LocationUpdateDistance = 2
    private var m_LocationUpdateInterval = 5000

    private external fun locationSatellite(
        count: Int, prn: Float, elevation: Float,
        azimuth: Float, snr: Int, usedInFix: Boolean
    )

    private external fun locationUpdate(
        provider: Int, time: Long, latitude: Double, longitude: Double,
        altitude: Double, accuracy: Float, bearing: Float, speed: Float
    )

    inner class LocationUpdateHandler : LocationListener, GpsStatus.Listener {

        override fun onGpsStatusChanged(event: Int) {
            if (m_LocationManager == null) return
            if (m_GpsStatus == null) {
                m_GpsStatus = m_LocationManager?.getGpsStatus(null)
            } else {
                m_LocationManager?.getGpsStatus(m_GpsStatus)
            }
        }

        override fun onLocationChanged(location: Location) {
            val provider = if (location.provider == "gps") 1 else 3
            val speed = if (location.hasBearing()) location.bearing else -1.0f

            locationUpdate(
                provider,
                location.time,
                location.latitude,
                location.longitude,
                location.altitude,
                location.accuracy,
                location.bearing,
                speed
            )
        }

        override fun onProviderDisabled(provider: String) {
        }

        override fun onProviderEnabled(provider: String) {
        }

        override fun onStatusChanged(provider: String, status: Int, extras: Bundle?) {
        }
    }

    fun locationGpsData(): Boolean {
        var count = 0
        m_GpsStatus?.let { status ->
            val satellites = status.satellites
            satellites?.forEach { satellite ->
                locationSatellite(
                    count,
                    satellite.prn.toFloat(),
                    satellite.elevation,
                    satellite.azimuth,
                    satellite.snr.toInt(),
                    satellite.usedInFix()
                )
                count++
            }
        }
        return count > 0
    }

    fun locationStart(activity: LoaderActivity): Boolean {
        if (m_LocationManager != null) return false

        m_LocationManager = activity.getSystemService(android.content.Context.LOCATION_SERVICE) as LocationManager?
        if (m_LocationManager == null) return false

        val interval = intArrayOf(5000)
        val distance = intArrayOf(2)

        if (LoaderAPI.s3eConfigGetInt("s3e", "LocUpdateInterval", interval) != 0) {
            m_LocationUpdateInterval = interval[0]
        }
        if (LoaderAPI.s3eConfigGetInt("s3e", "LocUpdateDistance", distance) != 0) {
            m_LocationUpdateDistance = distance[0]
        }

        val thread = activity.LoaderThread()
        thread?.runOnOSThread(object : Runnable {
            override fun run() {
                m_LocationListener = LocationUpdateHandler()
                try {
                    m_LocationManager?.requestLocationUpdates(
                        "gps",
                        m_LocationUpdateInterval.toLong(),
                        m_LocationUpdateDistance.toFloat(),
                        m_LocationListener!!
                    )
                    m_LocationManager?.requestLocationUpdates(
                        "network",
                        m_LocationUpdateInterval.toLong(),
                        m_LocationUpdateDistance.toFloat(),
                        m_LocationListener!!
                    )
                    m_LocationManager?.addGpsStatusListener(m_LocationListener!!)
                } catch (e: Exception) {
                }
            }
        })

        var location = m_LocationManager?.getLastKnownLocation("gps")
        var provider = 1
        if (location == null) {
            provider = 3
            location = m_LocationManager?.getLastKnownLocation("network")
        }

        if (location != null) {
            val bearing = if (location.hasBearing()) location.bearing else -1.0f
            val speed = if (location.hasBearing()) location.speed else -1.0f

            locationUpdate(
                provider,
                location.time,
                location.latitude,
                location.longitude,
                location.altitude,
                location.accuracy,
                bearing,
                speed
            )
        }

        return true
    }

    fun locationStop(): Boolean {
        if (m_LocationManager == null) return false

        m_LocationListener?.let {
            m_LocationManager?.removeGpsStatusListener(it)
            m_LocationManager?.removeUpdates(it)
        }
        m_LocationListener = null
        m_LocationManager = null

        return true
    }
}
