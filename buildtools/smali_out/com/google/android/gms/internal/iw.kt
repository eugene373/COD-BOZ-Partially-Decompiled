package com.google.android.gms.internal

// Auto-emitted from smali.
// 16 fields, 18 methods.

class iw: android.graphics.drawable.Drawable(), android.graphics.drawable.Drawable.Callback {
    private var KL: Boolean
    private var KR: Int
    private var KS: Long
    private var KT: Int
    private var KU: Int
    private var KV: Int
    private var KW: Int
    private var KX: Boolean
    private var KY: com.google.android.gms.internal.iw.b
    private var KZ: android.graphics.drawable.Drawable
    private var La: android.graphics.drawable.Drawable
    private var Lb: Boolean
    private var Lc: Boolean
    private var Ld: Boolean
    private var Le: Int
    private var mFrom: Int

    public constructor(p0: android.graphics.drawable.Drawable, p1: android.graphics.drawable.Drawable)

    constructor(p0: com.google.android.gms.internal.iw.b)

    public fun canConstantState(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/iw;->Lb:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         move v0, v1
    //         :goto_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/iw;->Lc:Z
    //         iput-boolean v1, p0, Lcom/google/android/gms/internal/iw;->Lb:Z
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/iw;->Lc:Z
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun draw(canvas: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 7
    //         const/4 v1, 0x1
    //         const/high16 v6, 0x3f800000    # 1.0f
    //         const/4 v0, 0x0
    //         iget v2, p0, Lcom/google/android/gms/internal/iw;->KR:I
    //         packed-switch v2, :pswitch_data_0
    //         :cond_0
    //         :goto_0
    //         move v0, v1
    //         :goto_1
    //         iget v1, p0, Lcom/google/android/gms/internal/iw;->KW:I
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/iw;->KL:Z
    //         iget-object v3, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         if-eqz v0, :cond_6
    //         if-eqz v2, :cond_1
    //         if-nez v1, :cond_2
    //         :cond_1
    //         invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         :cond_2
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         if-ne v1, v0, :cond_3
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         :cond_3
    //         :goto_2
    //         return-void
    //         :pswitch_0
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/iw;->KS:J
    //         const/4 v1, 0x2
    //         iput v1, p0, Lcom/google/android/gms/internal/iw;->KR:I
    //         goto :goto_1
    //         :pswitch_1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/iw;->KS:J
    //         const-wide/16 v4, 0x0
    //         cmp-long v2, v2, v4
    //         if-ltz v2, :cond_0
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/iw;->KS:J
    //         sub-long/2addr v2, v4
    //         long-to-float v2, v2
    //         iget v3, p0, Lcom/google/android/gms/internal/iw;->KV:I
    //         int-to-float v3, v3
    //         div-float/2addr v2, v3
    //         cmpl-float v3, v2, v6
    //         if-ltz v3, :cond_5
    //         :goto_3
    //         if-eqz v1, :cond_4
    //         iput v0, p0, Lcom/google/android/gms/internal/iw;->KR:I
    //         :cond_4
    //         invoke-static {v2, v6}, Ljava/lang/Math;->min(FF)F
    //         move-result v0
    //         iget v2, p0, Lcom/google/android/gms/internal/iw;->mFrom:I
    //         int-to-float v2, v2
    //         iget v3, p0, Lcom/google/android/gms/internal/iw;->KT:I
    //         iget v4, p0, Lcom/google/android/gms/internal/iw;->mFrom:I
    //         sub-int/2addr v3, v4
    //         int-to-float v3, v3
    //         mul-float/2addr v0, v3
    //         add-float/2addr v0, v2
    //         float-to-int v0, v0
    //         iput v0, p0, Lcom/google/android/gms/internal/iw;->KW:I
    //         goto :goto_0
    //         :cond_5
    //         move v1, v0
    //         goto :goto_3
    //         :cond_6
    //         if-eqz v2, :cond_7
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         sub-int/2addr v0, v1
    //         invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         :cond_7
    //         invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         if-eqz v2, :cond_8
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         :cond_8
    //         if-lez v1, :cond_9
    //         invoke-virtual {v4, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         :cond_9
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->invalidateSelf()V
    //         goto :goto_2
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun gK(): android.graphics.drawable.Drawable { return TODO("body: ()Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         return-object v0
    */

    public fun getChangingConfigurations(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iw;->KY:Lcom/google/android/gms/internal/iw$b;
    //         iget v1, v1, Lcom/google/android/gms/internal/iw$b;->Lh:I
    //         or-int/2addr v0, v1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iw;->KY:Lcom/google/android/gms/internal/iw$b;
    //         iget v1, v1, Lcom/google/android/gms/internal/iw$b;->Li:I
    //         or-int/2addr v0, v1
    //         return v0
    */

    public fun getConstantState(): android.graphics.drawable.Drawable.ConstantState { return TODO("body: ()Landroid/graphics/drawable/Drawable$ConstantState;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->canConstantState()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KY:Lcom/google/android/gms/internal/iw$b;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->getChangingConfigurations()I
    //         move-result v1
    //         iput v1, v0, Lcom/google/android/gms/internal/iw$b;->Lh:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KY:Lcom/google/android/gms/internal/iw$b;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getIntrinsicHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
    //         move-result v1
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         return v0
    */

    public fun getIntrinsicWidth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
    //         move-result v1
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         return v0
    */

    public fun getOpacity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/iw;->Ld:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getOpacity()I
    //         move-result v1
    //         invoke-static {v0, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/iw;->Le:I
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/iw;->Ld:Z
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->Le:I
    //         return v0
    */

    public fun invalidateDrawable(who: android.graphics.drawable.Drawable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hB()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    //         :cond_0
    //         return-void
    */

    public fun mutate(): android.graphics.drawable.Drawable { return TODO("body: ()Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/iw;->KX:Z
    //         if-nez v0, :cond_1
    //         invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         if-ne v0, p0, :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->canConstantState()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/iw;->KX:Z
    //         :cond_1
    //         return-object p0
    */

    protected fun onBoundsChange(bounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun scheduleDrawable(who: android.graphics.drawable.Drawable, what: Runnable, when: Long) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hB()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    //         :cond_0
    //         return-void
    */

    public fun setAlpha(alpha: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KW:I
    //         iget v1, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         if-ne v0, v1, :cond_0
    //         iput p1, p0, Lcom/google/android/gms/internal/iw;->KW:I
    //         :cond_0
    //         iput p1, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->invalidateSelf()V
    //         return-void
    */

    public fun setColorFilter(cf: android.graphics.ColorFilter) { /* TODO(body): (Landroid/graphics/ColorFilter;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->KZ:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iw;->La:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
    //         return-void
    */

    public fun startTransition(durationMillis: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iput v1, p0, Lcom/google/android/gms/internal/iw;->mFrom:I
    //         iget v0, p0, Lcom/google/android/gms/internal/iw;->KU:I
    //         iput v0, p0, Lcom/google/android/gms/internal/iw;->KT:I
    //         iput v1, p0, Lcom/google/android/gms/internal/iw;->KW:I
    //         iput p1, p0, Lcom/google/android/gms/internal/iw;->KV:I
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/iw;->KR:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->invalidateSelf()V
    //         return-void
    */

    public fun unscheduleDrawable(who: android.graphics.drawable.Drawable, what: Runnable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hB()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iw;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    //         :cond_0
    //         return-void
    */

}
