package com.google.android.gms.location

// Auto-emitted from smali.
// 6 fields, 15 methods.

open class ActivityRecognitionResult: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var aeb: java.util.List
    var aec: Long
    var aed: Long

    public constructor(versionCode: Int, timeMillis: java.util.List, elapsedRealtimeMillis: Long, p3: Long)

    public constructor(mostProbableActivity: com.google.android.gms.location.DetectedActivity, time: Long, elapsedRealtimeMillis: Long)

    public constructor(time: java.util.List, elapsedRealtimeMillis: Long, p2: Long)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getActivityConfidence(activityType: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aeb:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/location/DetectedActivity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/location/DetectedActivity;->getType()I
    //         move-result v2
    //         if-ne v2, p1, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/location/DetectedActivity;->getConfidence()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getElapsedRealtimeMillis(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aed:J
    //         return-wide v0
    */

    public fun getMostProbableActivity(): com.google.android.gms.location.DetectedActivity { return TODO("body: ()Lcom/google/android/gms/location/DetectedActivity;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aeb:Ljava/util/List;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/location/DetectedActivity;
    //         return-object v0
    */

    public fun getProbableActivities(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/location/DetectedActivity;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aeb:Ljava/util/List;
    //         return-object v0
    */

    public fun getTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aec:J
    //         return-wide v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->BR:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "ActivityRecognitionResult [probableActivities="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aeb:Ljava/util/List;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", timeMillis="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aec:J
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", elapsedRealtimeMillis="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aed:J
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/ActivityRecognitionResultCreator;->a(Lcom/google/android/gms/location/ActivityRecognitionResult;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.location.ActivityRecognitionResultCreator = null!!
    @JvmField public val EXTRA_ACTIVITY_RESULT: String = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"

    public @JvmStatic fun extractResult(intent: android.content.Intent): com.google.android.gms.location.ActivityRecognitionResult { return TODO("body: (Landroid/content/Intent;)Lcom/google/android/gms/location/ActivityRecognitionResult;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const/4 v3, 0x0
    //         invoke-static {p0}, Lcom/google/android/gms/location/ActivityRecognitionResult;->hasResult(Landroid/content/Intent;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         move-object v1, v0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         const-string v2, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v2, v1, [B
    //         if-eqz v2, :cond_1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         move-object v0, v1
    //         check-cast v0, [B
    //         check-cast v0, [B
    //         check-cast v1, [B
    //         check-cast v1, [B
    //         array-length v1, v1
    //         invoke-virtual {v2, v0, v3, v1}, Landroid/os/Parcel;->unmarshall([BII)V
    //         invoke-virtual {v2, v3}, Landroid/os/Parcel;->setDataPosition(I)V
    //         sget-object v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->CREATOR:Lcom/google/android/gms/location/ActivityRecognitionResultCreator;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/location/ActivityRecognitionResultCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_1
    //         instance-of v2, v1, Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         if-eqz v2, :cond_2
    //         check-cast v1, Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         goto :goto_0
    //         :cond_2
    //         move-object v1, v0
    //         goto :goto_0
    */

    public @JvmStatic fun hasResult(intent: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         goto :goto_0
    */

    }
}
