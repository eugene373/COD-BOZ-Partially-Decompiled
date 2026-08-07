package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

class ce: com.google.android.gms.internal.by {
    public constructor()

    public fun a(p0: com.google.android.gms.internal.gv, p1: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V */ }
    /*
    //         .locals 9
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/gv;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v7, -0x1
    //         const/4 v4, 0x0
    //         const-string v0, "action"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "Action missing from video GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->dt()Lcom/google/android/gms/internal/dk;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         const-string v0, "Could not get ad overlay for a video GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v2, "new"
    //         invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v2
    //         const-string v3, "position"
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v2, :cond_2
    //         if-eqz v3, :cond_4
    //         :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         const-string v3, "x"
    //         invoke-static {v0, p2, v3, v4}, Lcom/google/android/gms/internal/ce;->a(Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I
    //         move-result v3
    //         const-string v5, "y"
    //         invoke-static {v0, p2, v5, v4}, Lcom/google/android/gms/internal/ce;->a(Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I
    //         move-result v4
    //         const-string v5, "w"
    //         invoke-static {v0, p2, v5, v7}, Lcom/google/android/gms/internal/ce;->a(Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I
    //         move-result v5
    //         const-string v6, "h"
    //         invoke-static {v0, p2, v6, v7}, Lcom/google/android/gms/internal/ce;->a(Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I
    //         move-result v0
    //         if-eqz v2, :cond_3
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/dk;->bV()Lcom/google/android/gms/internal/do;
    //         move-result-object v2
    //         if-nez v2, :cond_3
    //         invoke-virtual {v1, v3, v4, v5, v0}, Lcom/google/android/gms/internal/dk;->c(IIII)V
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v1, v3, v4, v5, v0}, Lcom/google/android/gms/internal/dk;->b(IIII)V
    //         goto :goto_0
    //         :cond_4
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/dk;->bV()Lcom/google/android/gms/internal/do;
    //         move-result-object v8
    //         if-nez v8, :cond_5
    //         const-string v0, "no_video_view"
    //         const/4 v1, 0x0
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_5
    //         const-string v1, "click"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_6
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         const-string v1, "x"
    //         invoke-static {v0, p2, v1, v4}, Lcom/google/android/gms/internal/ce;->a(Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I
    //         move-result v2
    //         const-string v1, "y"
    //         invoke-static {v0, p2, v1, v4}, Lcom/google/android/gms/internal/ce;->a(Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I
    //         move-result v3
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         int-to-float v5, v2
    //         int-to-float v6, v3
    //         move-wide v2, v0
    //         move v7, v4
    //         invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
    //         move-result-object v0
    //         invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/do;->b(Landroid/view/MotionEvent;)V
    //         invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V
    //         goto/16 :goto_0
    //         :cond_6
    //         const-string v1, "controls"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_8
    //         const-string v0, "enabled"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_7
    //         const-string v0, "Enabled parameter missing from controls video GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_7
    //         invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/do;->q(Z)V
    //         goto/16 :goto_0
    //         :cond_8
    //         const-string v1, "currentTime"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_a
    //         const-string v0, "time"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_9
    //         const-string v0, "Time parameter missing from currentTime video GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_9
    //         :try_start_0
    //         invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    //         move-result v1
    //         const/high16 v2, 0x447a0000    # 1000.0f
    //         mul-float/2addr v1, v2
    //         float-to-int v1, v1
    //         invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/do;->seekTo(I)V
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not parse time parameter from currentTime video GMSG: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_a
    //         const-string v1, "hide"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_b
    //         const/4 v0, 0x4
    //         invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/do;->setVisibility(I)V
    //         goto/16 :goto_0
    //         :cond_b
    //         const-string v1, "load"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_c
    //         invoke-virtual {v8}, Lcom/google/android/gms/internal/do;->ch()V
    //         goto/16 :goto_0
    //         :cond_c
    //         const-string v1, "pause"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_d
    //         invoke-virtual {v8}, Lcom/google/android/gms/internal/do;->pause()V
    //         goto/16 :goto_0
    //         :cond_d
    //         const-string v1, "play"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_e
    //         invoke-virtual {v8}, Lcom/google/android/gms/internal/do;->play()V
    //         goto/16 :goto_0
    //         :cond_e
    //         const-string v1, "show"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_f
    //         invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/do;->setVisibility(I)V
    //         goto/16 :goto_0
    //         :cond_f
    //         const-string v1, "src"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_10
    //         const-string v0, "src"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/do;->C(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_10
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown video action: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto/16 :goto_0
    */

    companion object {
    private @JvmStatic fun a(p0: android.util.DisplayMetrics, p1: java.util.Map, p2: String, p3: Int): Int { return TODO("body: (Landroid/util/DisplayMetrics;Ljava/util/Map;Ljava/lang/String;I)I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/util/DisplayMetrics;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 "I)I"
    //             }
    //         .end annotation
    //         invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-static {p0, v1}, Lcom/google/android/gms/internal/gr;->a(Landroid/util/DisplayMetrics;I)I
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result p3
    //         :cond_0
    //         :goto_0
    //         return p3
    //         :catch_0
    //         move-exception v1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not parse "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " in a video GMSG: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_0
    */

    }
}
