package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderLocation.java.
// 1 fields, 6 methods.

open class LoaderLocation_LocationUpdateHandler: android.location.LocationListener, android.location.GpsStatus.Listener {
    val this$0: com.ideaworks3d.marmalade.LoaderLocation

    constructor(p0: com.ideaworks3d.marmalade.LoaderLocation)

    public fun onGpsStatusChanged(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$100(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/GpsStatus;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$102(Lcom/ideaworks3d/marmalade/LoaderLocation;Landroid/location/GpsStatus;)Landroid/location/GpsStatus;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$100(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/GpsStatus;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;
    //         goto :goto_0
    */

    public fun onLocationChanged(p0: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 13
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "gps"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const/4 v1, 0x1
    //         :goto_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-virtual {p1}, Landroid/location/Location;->getTime()J
    //         move-result-wide v2
    //         invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D
    //         move-result-wide v4
    //         invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D
    //         move-result-wide v6
    //         invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D
    //         move-result-wide v8
    //         invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F
    //         move-result v10
    //         invoke-virtual {p1}, Landroid/location/Location;->hasBearing()Z
    //         move-result v11
    //         if-eqz v11, :cond_2
    //         invoke-virtual {p1}, Landroid/location/Location;->getBearing()F
    //         move-result v11
    //         :goto_1
    //         invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F
    //         move-result v12
    //         invoke-static/range {v0 .. v12}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$200(Lcom/ideaworks3d/marmalade/LoaderLocation;IJDDDFFF)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x3
    //         goto :goto_0
    //         :cond_2
    //         const/high16 v11, -0x40800000    # -1.0f
    //         goto :goto_1
    */

    public fun onProviderDisabled(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onProviderEnabled(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onStatusChanged(p0: String, p1: Int, p2: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;ILandroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
