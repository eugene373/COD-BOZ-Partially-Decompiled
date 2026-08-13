package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServices.java.
// 1 fields, 2 methods.

open class s3eGooglePlayServices_Anon2() : android.content.DialogInterface.OnClickListener {
    val thisRef0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServices? = null

    constructor(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServices) : this()

    override public fun onClick(p0: android.content.DialogInterface, p1: Int) {
        android.util.Log.w("s3eGooglePlayServices", "s3eGooglePlayMatchMakingInvitePlayers invite players")
        val service = thisRef0
        if (service != null) {
            val activity = service.m_PretendActivity
            if (activity != null) {
                activity.showMatchMakingInvitePlayersDialog(0x2710, 1, 3)
            }
        }
    }
    /*
    //         .locals 4
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayMatchMakingInvitePlayers invite players"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;->thisRef0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->access$000(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         const/4 v2, 0x3
    //         const/16 v3, 0x2710
    //         invoke-virtual {v0, v1, v2, v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showMatchMakingInvitePlayersDialog(III)Z
    //         return-void
    */

}