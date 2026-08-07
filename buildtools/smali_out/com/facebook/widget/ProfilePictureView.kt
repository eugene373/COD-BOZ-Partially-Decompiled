package com.facebook.widget

// Auto-emitted from smali source: ProfilePictureView.java.
// 25 fields, 28 methods.

open class ProfilePictureView: android.widget.FrameLayout() {
    private var customizedDefaultProfilePicture: android.graphics.Bitmap
    private var image: android.widget.ImageView
    private var imageContents: android.graphics.Bitmap
    private var isCropped: Boolean
    private var lastRequest: com.facebook.internal.ImageRequest
    private var onErrorListener: com.facebook.widget.ProfilePictureView.OnErrorListener
    private var presetSizeType: Int
    private var profileId: String
    private var queryHeight: Int
    private var queryWidth: Int

    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: android.util.AttributeSet)

    public constructor(p0: android.content.Context, p1: android.util.AttributeSet, p2: Int)

    private fun getPresetSizeInPixels(p0: Boolean): Int { return TODO("body: (Z)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget v1, p0, Lcom/facebook/widget/ProfilePictureView;->presetSizeType:I
    //         packed-switch v1, :pswitch_data_0
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         sget v0, Lcom/facebook/android/R$dimen;->com_facebook_profilepictureview_preset_size_small:I
    //         :goto_1
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v0
    //         goto :goto_0
    //         :pswitch_1
    //         sget v0, Lcom/facebook/android/R$dimen;->com_facebook_profilepictureview_preset_size_normal:I
    //         goto :goto_1
    //         :pswitch_2
    //         sget v0, Lcom/facebook/android/R$dimen;->com_facebook_profilepictureview_preset_size_large:I
    //         goto :goto_1
    //         :pswitch_3
    //         if-eqz p1, :cond_0
    //         sget v0, Lcom/facebook/android/R$dimen;->com_facebook_profilepictureview_preset_size_normal:I
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch -0x4
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_3
    //         .end packed-switch
    */

    private fun initialize(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, -0x1
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->removeAllViews()V
    //         new-instance v0, Landroid/widget/ImageView;
    //         invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->image:Landroid/widget/ImageView;
    //         new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->image:Landroid/widget/ImageView;
    //         invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->image:Landroid/widget/ImageView;
    //         sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->image:Landroid/widget/ImageView;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->addView(Landroid/view/View;)V
    //         return-void
    */

    private fun parseAttributes(p0: android.util.AttributeSet) { /* TODO(body): (Landroid/util/AttributeSet;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/android/R$styleable;->com_facebook_profile_picture_view:[I
    //         invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_profile_picture_view_preset_size:I
    //         const/4 v2, -0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/ProfilePictureView;->setPresetSize(I)V
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_profile_picture_view_is_cropped:I
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         iput-boolean v1, p0, Lcom/facebook/widget/ProfilePictureView;->isCropped:Z
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-void
    */

    private fun processResponse(p0: com.facebook.internal.ImageResponse) { /* TODO(body): (Lcom/facebook/internal/ImageResponse;)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getRequest()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getBitmap()Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getError()Ljava/lang/Exception;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->onErrorListener:Lcom/facebook/widget/ProfilePictureView$OnErrorListener;
    //         if-eqz v0, :cond_1
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error in downloading profile picture for profileId: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getProfileId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v2, v3, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-interface {v0, v2}, Lcom/facebook/widget/ProfilePictureView$OnErrorListener;->onError(Lcom/facebook/FacebookException;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const/4 v2, 0x6
    //         sget-object v3, Lcom/facebook/widget/ProfilePictureView;->TAG:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v2, v3, v1}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->isCachedRedirect()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->sendImageRequest(Z)V
    //         goto :goto_0
    */

    private fun refreshImage(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/facebook/widget/ProfilePictureView;->updateImageQueryParameters()Z
    //         move-result v0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget v1, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         if-nez v1, :cond_2
    //         iget v1, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         if-nez v1, :cond_2
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/widget/ProfilePictureView;->setBlankProfilePicture()V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         if-nez v0, :cond_3
    //         if-eqz p1, :cond_1
    //         :cond_3
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->sendImageRequest(Z)V
    //         goto :goto_0
    */

    private fun sendImageRequest(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         :try_start_0
    //         new-instance v0, Lcom/facebook/internal/ImageRequest$Builder;
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         iget v3, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         iget v4, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         invoke-static {v2, v3, v4}, Lcom/facebook/internal/ImageRequest;->getProfilePictureUrl(Ljava/lang/String;II)Ljava/net/URI;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/internal/ImageRequest$Builder;-><init>(Landroid/content/Context;Ljava/net/URI;)V
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/ImageRequest$Builder;->setAllowCachedRedirects(Z)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/facebook/internal/ImageRequest$Builder;->setCallerTag(Ljava/lang/Object;)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/widget/ProfilePictureView$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/ProfilePictureView$1;-><init>(Lcom/facebook/widget/ProfilePictureView;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/ImageRequest$Builder;->setCallback(Lcom/facebook/internal/ImageRequest$Callback;)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/internal/ImageRequest$Builder;->build()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         invoke-static {v1}, Lcom/facebook/internal/ImageDownloader;->cancelRequest(Lcom/facebook/internal/ImageRequest;)Z
    //         :cond_0
    //         iput-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         invoke-static {v0}, Lcom/facebook/internal/ImageDownloader;->downloadAsync(Lcom/facebook/internal/ImageRequest;)V
    //         :try_end_0
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const/4 v2, 0x6
    //         sget-object v3, Lcom/facebook/widget/ProfilePictureView;->TAG:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/net/URISyntaxException;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v2, v3, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun setBlankProfilePicture() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->customizedDefaultProfilePicture:Landroid/graphics/Bitmap;
    //         if-nez v0, :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->isCropped()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_profile_picture_blank_square:I
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_profile_picture_blank_portrait:I
    //         goto :goto_0
    //         :cond_1
    //         invoke-direct {p0}, Lcom/facebook/widget/ProfilePictureView;->updateImageQueryParameters()Z
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->customizedDefaultProfilePicture:Landroid/graphics/Bitmap;
    //         iget v1, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         iget v2, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         const/4 v3, 0x0
    //         invoke-static {v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         goto :goto_1
    */

    private fun setImageBitmap(p0: android.graphics.Bitmap) { /* TODO(body): (Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->image:Landroid/widget/ImageView;
    //         if-eqz v0, :cond_0
    //         if-eqz p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/ProfilePictureView;->imageContents:Landroid/graphics/Bitmap;
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->image:Landroid/widget/ImageView;
    //         invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         :cond_0
    //         return-void
    */

    private fun updateImageQueryParameters(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getHeight()I
    //         move-result v3
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getWidth()I
    //         move-result v0
    //         if-lt v0, v4, :cond_0
    //         if-ge v3, v4, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v2
    //         :cond_1
    //         invoke-direct {p0, v2}, Lcom/facebook/widget/ProfilePictureView;->getPresetSizeInPixels(Z)I
    //         move-result v1
    //         if-eqz v1, :cond_7
    //         move v3, v1
    //         :goto_1
    //         if-gt v1, v3, :cond_5
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->isCropped()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         move v0, v1
    //         :goto_2
    //         iget v3, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         if-ne v1, v3, :cond_2
    //         iget v3, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         if-eq v0, v3, :cond_3
    //         :cond_2
    //         move v2, v4
    //         :cond_3
    //         iput v1, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         iput v0, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         goto :goto_0
    //         :cond_4
    //         move v0, v2
    //         goto :goto_2
    //         :cond_5
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->isCropped()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         move v0, v3
    //         :goto_3
    //         move v1, v0
    //         move v0, v3
    //         goto :goto_2
    //         :cond_6
    //         move v0, v2
    //         goto :goto_3
    //         :cond_7
    //         move v1, v0
    //         goto :goto_1
    */

    public fun getOnErrorListener(): com.facebook.widget.ProfilePictureView.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/ProfilePictureView$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->onErrorListener:Lcom/facebook/widget/ProfilePictureView$OnErrorListener;
    //         return-object v0
    */

    public fun getPresetSize(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/ProfilePictureView;->presetSizeType:I
    //         return v0
    */

    public fun getProfileId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         return-object v0
    */

    public fun isCropped(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/ProfilePictureView;->isCropped:Z
    //         return v0
    */

    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         return-void
    */

    protected fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 1
    //         invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->refreshImage(Z)V
    //         return-void
    */

    protected fun onMeasure(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 8
    //         const/4 v7, -0x2
    //         const/high16 v6, 0x40000000    # 2.0f
    //         const/4 v2, 0x1
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v4
    //         const/4 v1, 0x0
    //         invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
    //         move-result v0
    //         invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
    //         move-result v3
    //         invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
    //         move-result v5
    //         if-eq v5, v6, :cond_0
    //         iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I
    //         if-ne v5, v7, :cond_0
    //         invoke-direct {p0, v2}, Lcom/facebook/widget/ProfilePictureView;->getPresetSizeInPixels(Z)I
    //         move-result v0
    //         invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result p2
    //         move v1, v2
    //         :cond_0
    //         invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
    //         move-result v5
    //         if-eq v5, v6, :cond_2
    //         iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I
    //         if-ne v4, v7, :cond_2
    //         invoke-direct {p0, v2}, Lcom/facebook/widget/ProfilePictureView;->getPresetSizeInPixels(Z)I
    //         move-result v1
    //         invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result p1
    //         :goto_0
    //         if-eqz v2, :cond_1
    //         invoke-virtual {p0, v1, v0}, Lcom/facebook/widget/ProfilePictureView;->setMeasuredDimension(II)V
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/widget/ProfilePictureView;->measureChildren(II)V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V
    //         goto :goto_1
    //         :cond_2
    //         move v2, v1
    //         move v1, v3
    //         goto :goto_0
    */

    protected fun onRestoreInstanceState(p0: android.os.Parcelable) { /* TODO(body): (Landroid/os/Parcelable;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-class v1, Landroid/os/Bundle;
    //         if-eq v0, v1, :cond_1
    //         invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         check-cast p1, Landroid/os/Bundle;
    //         const-string v0, "ProfilePictureView_superState"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V
    //         const-string v0, "ProfilePictureView_profileId"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         const-string v0, "ProfilePictureView_presetSize"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         iput v0, p0, Lcom/facebook/widget/ProfilePictureView;->presetSizeType:I
    //         const-string v0, "ProfilePictureView_isCropped"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/facebook/widget/ProfilePictureView;->isCropped:Z
    //         const-string v0, "ProfilePictureView_width"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         iput v0, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         const-string v0, "ProfilePictureView_height"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         iput v0, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         const-string v0, "ProfilePictureView_bitmap"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         const-string v0, "ProfilePictureView_refresh"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->refreshImage(Z)V
    //         goto :goto_0
    */

    protected fun onSaveInstanceState(): android.os.Parcelable { return TODO("body: ()Landroid/os/Parcelable;") }
    /*
    //         .locals 3
    //         invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "ProfilePictureView_superState"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const-string v0, "ProfilePictureView_profileId"
    //         iget-object v2, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "ProfilePictureView_presetSize"
    //         iget v2, p0, Lcom/facebook/widget/ProfilePictureView;->presetSizeType:I
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "ProfilePictureView_isCropped"
    //         iget-boolean v2, p0, Lcom/facebook/widget/ProfilePictureView;->isCropped:Z
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         const-string v0, "ProfilePictureView_bitmap"
    //         iget-object v2, p0, Lcom/facebook/widget/ProfilePictureView;->imageContents:Landroid/graphics/Bitmap;
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const-string v0, "ProfilePictureView_width"
    //         iget v2, p0, Lcom/facebook/widget/ProfilePictureView;->queryWidth:I
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "ProfilePictureView_height"
    //         iget v2, p0, Lcom/facebook/widget/ProfilePictureView;->queryHeight:I
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v2, "ProfilePictureView_refresh"
    //         iget-object v0, p0, Lcom/facebook/widget/ProfilePictureView;->lastRequest:Lcom/facebook/internal/ImageRequest;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         return-object v1
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setCropped(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iput-boolean p1, p0, Lcom/facebook/widget/ProfilePictureView;->isCropped:Z
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->refreshImage(Z)V
    //         return-void
    */

    public fun setDefaultProfilePicture(p0: android.graphics.Bitmap) { /* TODO(body): (Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/ProfilePictureView;->customizedDefaultProfilePicture:Landroid/graphics/Bitmap;
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.ProfilePictureView.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/ProfilePictureView$OnErrorListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/ProfilePictureView;->onErrorListener:Lcom/facebook/widget/ProfilePictureView$OnErrorListener;
    //         return-void
    */

    public fun setPresetSize(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         packed-switch p1, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Must use a predefined preset size"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         iput p1, p0, Lcom/facebook/widget/ProfilePictureView;->presetSizeType:I
    //         invoke-virtual {p0}, Lcom/facebook/widget/ProfilePictureView;->requestLayout()V
    //         return-void
    //         nop
    //         :pswitch_data_0
    //         .packed-switch -0x4
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun setProfileId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/widget/ProfilePictureView;->setBlankProfilePicture()V
    //         const/4 v0, 0x1
    //         :cond_1
    //         iput-object p1, p0, Lcom/facebook/widget/ProfilePictureView;->profileId:Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/ProfilePictureView;->refreshImage(Z)V
    //         return-void
    */

    companion object {
    private val BITMAP_HEIGHT_KEY: String = "ProfilePictureView_height"
    private val BITMAP_KEY: String = "ProfilePictureView_bitmap"
    private val BITMAP_WIDTH_KEY: String = "ProfilePictureView_width"
    @JvmField public val CUSTOM: Int = 0
    private val IS_CROPPED_DEFAULT_VALUE: Boolean = true
    private val IS_CROPPED_KEY: String = "ProfilePictureView_isCropped"
    @JvmField public val LARGE: Int = 0
    private val MIN_SIZE: Int = 0x1
    @JvmField public val NORMAL: Int = 0
    private val PENDING_REFRESH_KEY: String = "ProfilePictureView_refresh"
    private val PRESET_SIZE_KEY: String = "ProfilePictureView_presetSize"
    private val PROFILE_ID_KEY: String = "ProfilePictureView_profileId"
    @JvmField public val SMALL: Int = 0
    private val SUPER_STATE_KEY: String = "ProfilePictureView_superState"
    @JvmField public val TAG: String = null!!
    }
}
