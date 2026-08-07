package com.ideaworks3d.marmalade;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.GpsStatus.Listener;
import android.os.Bundle;
import java.util.Iterator;

public class LoaderLocation {
      private LocationManager m_LocationManager;
      private LoaderLocation.LocationUpdateHandler m_LocationListener;
      private GpsStatus m_GpsStatus;
      private int m_LocationUpdateInterval = 5000;
      private int m_LocationUpdateDistance = 2;

      private native void locationUpdate(int var1, long var2, double var4, double var6, double var8, float var10, float var11, float var12);

      private native void locationSatellite(int var1, float var2, float var3, int var4, float var5, boolean var6);

      public boolean locationStart(LoaderActivity var1) {
            if (this.m_LocationManager != null) {
                  return false;
            } else {
                  this.m_LocationManager = (LocationManager)var1.getSystemService("location");
                  if (this.m_LocationManager == null) {
                        return false;
                  } else {
                        int[] var2 = new int[]{5000};
                        int[] var3 = new int[]{2};
                        if (LoaderAPI.s3eConfigGetInt("s3e", "LocUpdateInterval", var2) == 0) {
                              this.m_LocationUpdateInterval = var2[0];
                        }

                        if (LoaderAPI.s3eConfigGetInt("s3e", "LocUpdateDistance", var3) == 0) {
                              this.m_LocationUpdateDistance = var3[0];
                        }

                        var1.LoaderThread().runOnOSThread(new Runnable() {
                              public void run() {
                                    LoaderLocation.this.m_LocationListener = LoaderLocation.this.new LocationUpdateHandler();
                                    LoaderLocation.this.m_LocationManager.requestLocationUpdates("gps", (long)LoaderLocation.this.m_LocationUpdateInterval, (float)LoaderLocation.this.m_LocationUpdateDistance, LoaderLocation.this.m_LocationListener);
                                    LoaderLocation.this.m_LocationManager.addGpsStatusListener(LoaderLocation.this.m_LocationListener);
                              }
                        });
                        byte var4 = 1;
                        Location var5 = this.m_LocationManager.getLastKnownLocation("gps");
                        if (var5 == null) {
                              var4 = 3;
                              var5 = this.m_LocationManager.getLastKnownLocation("network");
                        }

                        if (var5 != null) {
                              this.locationUpdate(var4, var5.getTime(), var5.getLatitude(), var5.getLongitude(), var5.getAltitude(), var5.getAccuracy(), var5.hasBearing() ? var5.getBearing() : -1.0F, var5.getSpeed());
                        }

                        return true;
                  }
            }
      }

      public boolean locationStop() {
            if (this.m_LocationManager == null) {
                  return false;
            } else {
                  this.m_LocationManager.removeGpsStatusListener(this.m_LocationListener);
                  this.m_LocationManager.removeUpdates(this.m_LocationListener);
                  this.m_LocationListener = null;
                  this.m_LocationManager = null;
                  return true;
            }
      }

      public boolean locationGpsData() {
            int var1 = 0;
            if (this.m_GpsStatus == null) {
                  return false;
            } else {
                  Iterable var2 = this.m_GpsStatus.getSatellites();

                  for(Iterator var3 = var2.iterator(); var3.hasNext(); ++var1) {
                        GpsSatellite var4 = (GpsSatellite)var3.next();
                        this.locationSatellite(var1, var4.getAzimuth(), var4.getElevation(), var4.getPrn(), var4.getSnr(), var4.usedInFix());
                  }

                  return true;
            }
      }

      class LocationUpdateHandler implements LocationListener, Listener {
            public void onGpsStatusChanged(int var1) {
                  if (LoaderLocation.this.m_LocationManager != null) {
                        if (LoaderLocation.this.m_GpsStatus == null) {
                              LoaderLocation.this.m_GpsStatus = LoaderLocation.this.m_LocationManager.getGpsStatus((GpsStatus)null);
                        } else {
                              LoaderLocation.this.m_LocationManager.getGpsStatus(LoaderLocation.this.m_GpsStatus);
                        }

                  }
            }

            public void onLocationChanged(Location var1) {
                  if (var1 != null) {
                        int var2 = var1.getProvider().equals("gps") ? 1 : 3;
                        LoaderLocation.this.locationUpdate(var2, var1.getTime(), var1.getLatitude(), var1.getLongitude(), var1.getAltitude(), var1.getAccuracy(), var1.hasBearing() ? var1.getBearing() : -1.0F, var1.getSpeed());
                  }

            }

            public void onProviderDisabled(String var1) {
            }

            public void onProviderEnabled(String var1) {
            }

            public void onStatusChanged(String var1, int var2, Bundle var3) {
            }
      }
}
