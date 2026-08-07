package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderLocation.java.
// 5 fields, 14 methods.

open class LoaderLocation {
    private var m_GpsStatus: android.location.GpsStatus
    private var m_LocationListener: com.ideaworks3d.marmalade.LoaderLocation.LocationUpdateHandler
    private var m_LocationManager: android.location.LocationManager
    private var m_LocationUpdateDistance: Int
    private var m_LocationUpdateInterval: Int

    public constructor()

    private external fun locationSatellite(p0: Int, p1: Float, p2: Float, p3: Int, p4: Float, p5: Boolean)

    private external fun locationUpdate(p0: Int, p1: Long, p2: Double, p3: Double, p4: Double, p5: Float, p6: Float, p7: Float)

    public fun locationGpsData(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 8
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_GpsStatus:Landroid/location/GpsStatus;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_GpsStatus:Landroid/location/GpsStatus;
    //         invoke-virtual {v0}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v7
    //         :goto_0
    //         invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/location/GpsSatellite;
    //         invoke-virtual {v0}, Landroid/location/GpsSatellite;->getAzimuth()F
    //         move-result v2
    //         invoke-virtual {v0}, Landroid/location/GpsSatellite;->getElevation()F
    //         move-result v3
    //         invoke-virtual {v0}, Landroid/location/GpsSatellite;->getPrn()I
    //         move-result v4
    //         invoke-virtual {v0}, Landroid/location/GpsSatellite;->getSnr()F
    //         move-result v5
    //         invoke-virtual {v0}, Landroid/location/GpsSatellite;->usedInFix()Z
    //         move-result v6
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationSatellite(IFFIFZ)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const/4 v1, 0x1
    //         :cond_1
    //         return v1
    */

    public fun locationStart(p0: com.ideaworks3d.marmalade.LoaderActivity): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/LoaderActivity;)Z") }
    /*
    //         .locals 14
    //         const/4 v13, 0x1
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "location"
    //         invoke-virtual {p1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/location/LocationManager;
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         if-nez v0, :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         new-array v0, v13, [I
    //         const/16 v2, 0x1388
    //         aput v2, v0, v1
    //         new-array v2, v13, [I
    //         const/4 v3, 0x2
    //         aput v3, v2, v1
    //         const-string v3, "s3e"
    //         const-string v4, "LocUpdateInterval"
    //         invoke-static {v3, v4, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I
    //         move-result v3
    //         if-nez v3, :cond_2
    //         aget v0, v0, v1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateInterval:I
    //         :cond_2
    //         const-string v0, "s3e"
    //         const-string v3, "LocUpdateDistance"
    //         invoke-static {v0, v3, v2}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I
    //         move-result v0
    //         if-nez v0, :cond_3
    //         aget v0, v2, v1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateDistance:I
    //         :cond_3
    //         invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderLocation$1;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/LoaderLocation$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderLocation;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         const-string v1, "gps"
    //         invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
    //         move-result-object v0
    //         if-nez v0, :cond_6
    //         const/4 v1, 0x3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         const-string v2, "network"
    //         invoke-virtual {v0, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
    //         move-result-object v0
    //         :goto_1
    //         if-eqz v0, :cond_4
    //         invoke-virtual {v0}, Landroid/location/Location;->getTime()J
    //         move-result-wide v2
    //         invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
    //         move-result-wide v4
    //         invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
    //         move-result-wide v6
    //         invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D
    //         move-result-wide v8
    //         invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
    //         move-result v10
    //         invoke-virtual {v0}, Landroid/location/Location;->hasBearing()Z
    //         move-result v11
    //         if-eqz v11, :cond_5
    //         invoke-virtual {v0}, Landroid/location/Location;->getBearing()F
    //         move-result v11
    //         :goto_2
    //         invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F
    //         move-result v12
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v12}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationUpdate(IJDDDFFF)V
    //         :cond_4
    //         move v0, v13
    //         goto :goto_0
    //         :cond_5
    //         const/high16 v11, -0x40800000    # -1.0f
    //         goto :goto_2
    //         :cond_6
    //         move v1, v13
    //         goto :goto_1
    */

    public fun locationStop(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
    //         invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeGpsStatusListener(Landroid/location/GpsStatus$Listener;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
    //         invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

}
