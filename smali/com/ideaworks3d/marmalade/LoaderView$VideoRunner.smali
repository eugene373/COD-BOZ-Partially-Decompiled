.class Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
.super Ljava/lang/Object;
.source "LoaderView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "VideoRunner"
.end annotation


# static fields
.field public static final PAUSE:I = 0x2

.field public static final PLAY:I = 0x1

.field public static final RESUME:I = 0x3

.field public static final STOP:I = 0x4

.field public static final VOLUME:I = 0x5


# instance fields
.field private m_Action:I

.field private m_File:Ljava/lang/String;

.field private m_Fullscreen:Z

.field private m_Height:I

.field private m_Offset:J

.field private m_Repeats:I

.field private m_Return:I

.field private m_Size:J

.field private m_Volume:I

.field private m_Width:I

.field private m_X:I

.field private m_Y:I

.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderView;


# direct methods
.method private constructor <init>(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 0

    .prologue
    .line 270
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V
    .locals 0

    .prologue
    .line 270
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;)V

    return-void
.end method


# virtual methods
.method play(Ljava/lang/String;IIIIIIZJJ)V
    .locals 1

    .prologue
    .line 287
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    .line 288
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_File:Ljava/lang/String;

    .line 289
    iput p2, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Volume:I

    .line 290
    iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Repeats:I

    .line 291
    iput p4, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_X:I

    iput p5, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Y:I

    iput p6, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Width:I

    iput p7, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Height:I

    .line 292
    iput-boolean p8, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Fullscreen:Z

    .line 293
    iput-wide p9, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Offset:J

    iput-wide p11, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Size:J

    .line 294
    return-void
.end method

.method public declared-synchronized run()V
    .locals 8

    .prologue
    .line 339
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 341
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoStop()V

    .line 344
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoRemoveView()V

    .line 345
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView;->access$302(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/S3EVideoView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    .line 347
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    new-instance v1, Lcom/ideaworks3d/marmalade/S3EVideoView;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    iget-object v2, v2, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v1, v2}, Lcom/ideaworks3d/marmalade/S3EVideoView;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;)V

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView;->access$302(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/S3EVideoView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    .line 348
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Fullscreen:Z

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_X:I

    iget v3, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Y:I

    iget v4, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Width:I

    iget v5, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Height:I

    invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoAddView(ZIIII)V

    .line 349
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Volume:I

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoSetVolume(I)V

    .line 350
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_File:Ljava/lang/String;

    iget v3, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Repeats:I

    iget-wide v4, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Offset:J

    iget-wide v6, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Size:J

    invoke-virtual/range {v1 .. v7}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoPlay(Ljava/lang/String;IJJ)I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Return:I

    .line 373
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    monitor-exit p0

    return-void

    .line 352
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 354
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    packed-switch v0, :pswitch_data_0

    .line 371
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Return:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 339
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 357
    :pswitch_0
    :try_start_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoPause()V

    goto :goto_1

    .line 360
    :pswitch_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoResume()V

    goto :goto_1

    .line 363
    :pswitch_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoStop()V

    .line 364
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoRemoveView()V

    .line 365
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView;->access$302(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/S3EVideoView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    goto :goto_1

    .line 368
    :pswitch_3
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;

    move-result-object v0

    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Volume:I

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoSetVolume(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 354
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public declared-synchronized runOnUiThread(Z)I
    .locals 2

    .prologue
    .line 319
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    iget-object v1, v1, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 321
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    :try_start_1
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Return:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    return v0

    .line 325
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 326
    if-eqz p1, :cond_0

    .line 327
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 330
    :catch_0
    move-exception v0

    .line 333
    const/4 v0, -0x1

    goto :goto_1

    .line 335
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 319
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method setState(I)V
    .locals 1

    .prologue
    .line 297
    packed-switch p1, :pswitch_data_0

    .line 309
    :goto_0
    return-void

    .line 300
    :pswitch_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    goto :goto_0

    .line 303
    :pswitch_1
    const/4 v0, 0x3

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    goto :goto_0

    .line 306
    :pswitch_2
    const/4 v0, 0x4

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    goto :goto_0

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method setVolume(I)V
    .locals 1

    .prologue
    .line 312
    const/4 v0, 0x5

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I

    .line 313
    iput p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Volume:I

    .line 314
    return-void
.end method
