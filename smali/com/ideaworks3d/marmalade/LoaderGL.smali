.class Lcom/ideaworks3d/marmalade/LoaderGL;
.super Ljava/lang/Object;
.source "LoaderGL.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    }
.end annotation


# static fields
.field private static final EGL_CONTEXT_CLIENT_VERSION:I = 0x3098

.field private static final EGL_DEPTH_ENCODING_NV:I = 0x30e2


# instance fields
.field private m_DoneInit:Z

.field m_Egl:Ljavax/microedition/khronos/egl/EGL10;

.field m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

.field m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

.field m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

.field m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

.field private m_GLVersion:I

.field private m_Started:Z


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method private static CopySettingsWithValues([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;[I)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 112
    .line 113
    array-length v2, p0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, p0, v1

    .line 115
    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->HasValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 117
    mul-int/lit8 v4, v0, 0x2

    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->GetSetting()I

    move-result v5

    aput v5, p1, v4

    .line 118
    mul-int/lit8 v4, v0, 0x2

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->GetValue()I

    move-result v3

    aput v3, p1, v4

    .line 119
    add-int/lit8 v0, v0, 0x1

    .line 113
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 122
    :cond_1
    return v0
.end method

.method private static CountSettingsWithValue([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 100
    .line 101
    array-length v2, p0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, p0, v1

    .line 103
    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->HasValue()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 105
    add-int/lit8 v0, v0, 0x1

    .line 101
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 108
    :cond_1
    return v0
.end method

.method private CreateSpecFromSettings([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)[I
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 126
    invoke-static {p1}, Lcom/ideaworks3d/marmalade/LoaderGL;->CountSettingsWithValue([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)I

    move-result v0

    .line 127
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    if-lt v1, v3, :cond_0

    .line 129
    add-int/lit8 v0, v0, 0x1

    .line 131
    :cond_0
    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    new-array v1, v0, [I

    .line 132
    invoke-static {p1, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->CopySettingsWithValues([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;[I)I

    move-result v0

    .line 133
    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    if-lt v2, v3, :cond_1

    .line 135
    mul-int/lit8 v2, v0, 0x2

    const/16 v3, 0x3040

    aput v3, v1, v2

    .line 136
    mul-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x4

    aput v3, v1, v2

    .line 137
    add-int/lit8 v0, v0, 0x1

    .line 139
    :cond_1
    mul-int/lit8 v0, v0, 0x2

    const/16 v2, 0x3038

    aput v2, v1, v0

    .line 140
    return-object v1
.end method

.method private chooseConfigs()V
    .locals 15

    .prologue
    const/16 v14, 0x3023

    const/16 v13, 0x3022

    const/16 v12, 0x3021

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 144
    const/16 v0, 0xb

    new-array v7, v0, [Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v1, "EGL_BUFFER_SIZE"

    const/16 v2, 0x3020

    invoke-direct {v0, p0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v0, v7, v4

    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v1, "EGL_DEPTH_ENCODING_NV"

    const/16 v2, 0x30e2

    invoke-direct {v0, p0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v0, v7, v5

    const/4 v0, 0x2

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_DEPTH_SIZE"

    const/16 v3, 0x3025

    invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/4 v0, 0x3

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_SURFACE_TYPE"

    const/16 v3, 0x3033

    invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/4 v0, 0x4

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_RED_SIZE"

    const/16 v3, 0x3024

    invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/4 v0, 0x5

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_GREEN_SIZE"

    invoke-direct {v1, p0, v2, v14}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/4 v0, 0x6

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_BLUE_SIZE"

    invoke-direct {v1, p0, v2, v13}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/4 v0, 0x7

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_ALPHA_SIZE"

    invoke-direct {v1, p0, v2, v12}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/16 v0, 0x8

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_STENCIL_SIZE"

    const/16 v3, 0x3026

    invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/16 v0, 0x9

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_SAMPLE_BUFFERS"

    const/16 v3, 0x3032

    invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    const/16 v0, 0xa

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;

    const-string v2, "EGL_SAMPLES"

    const/16 v3, 0x3031

    invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V

    aput-object v1, v7, v0

    .line 158
    new-array v5, v5, [I

    move v6, v4

    .line 163
    :goto_0
    invoke-direct {p0, v7}, Lcom/ideaworks3d/marmalade/LoaderGL;->CreateSpecFromSettings([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)[I

    move-result-object v2

    .line 164
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/4 v3, 0x0

    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 165
    aget v0, v5, v4

    if-eqz v0, :cond_0

    .line 182
    aget v10, v5, v4

    .line 183
    new-array v0, v10, [Ljavax/microedition/khronos/egl/EGLConfig;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    .line 184
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v9, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    move-object v8, v2

    move-object v11, v5

    invoke-interface/range {v6 .. v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 185
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    aget-object v8, v0, v4

    .line 186
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/16 v9, 0x3024

    move-object v5, p0

    move v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 187
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    move-object v5, p0

    move v9, v14

    move v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 188
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    move-object v5, p0

    move v9, v13

    move v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 189
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    move-object v5, p0

    move v9, v12

    move v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 190
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/16 v9, 0x3025

    move-object v5, p0

    move v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 191
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/16 v9, 0x3040

    move-object v5, p0

    move v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 192
    iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/16 v9, 0x3027

    const/16 v10, 0x3038

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    .line 194
    return-void

    .line 169
    :cond_0
    array-length v0, v7

    if-ge v6, v0, :cond_1

    .line 171
    aget-object v0, v7, v6

    .line 173
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->SetValueToDefault()V

    .line 174
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    .line 175
    goto :goto_0

    .line 178
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to choose an EGL config"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    .locals 2

    .prologue
    .line 198
    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 199
    invoke-interface {p1, p2, p3, p4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 200
    const/4 v1, 0x0

    aget p5, v0, v1

    .line 202
    :cond_0
    return p5
.end method

.method private stop()V
    .locals 5

    .prologue
    .line 235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Started:Z

    .line 236
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 243
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 246
    :cond_0
    return-void
.end method


# virtual methods
.method public init()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x2

    .line 30
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/egl/EGL10;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    .line 31
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    sget-object v1, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 32
    new-array v0, v3, [I

    .line 33
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v1, v2, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    .line 34
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->chooseConfigs()V

    .line 35
    const/4 v0, 0x0

    .line 36
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    if-lt v1, v3, :cond_0

    .line 38
    const/4 v0, 0x3

    new-array v0, v0, [I

    const/16 v1, 0x3098

    aput v1, v0, v4

    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    aput v1, v0, v5

    const/16 v1, 0x3038

    aput v1, v0, v3

    .line 44
    :cond_0
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    aget-object v3, v3, v4

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v1, v2, v3, v4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

    .line 46
    iput-boolean v5, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_DoneInit:Z

    .line 47
    return-void
.end method

.method public pauseGL()V
    .locals 0

    .prologue
    .line 223
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stop()V

    .line 224
    return-void
.end method

.method public restartGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
    .locals 1

    .prologue
    .line 211
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stop()V

    .line 212
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    invoke-virtual {p0, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    return-object v0
.end method

.method public resumeGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    invoke-virtual {p0, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    return-object v0
.end method

.method public startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;
    .locals 5

    .prologue
    .line 51
    if-eqz p2, :cond_0

    .line 52
    iput p2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I

    .line 53
    :cond_0
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_DoneInit:Z

    if-nez v0, :cond_1

    .line 54
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->init()V

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, p1, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateWindowSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljava/lang/Object;[I)Ljavax/microedition/khronos/egl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 56
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Started:Z

    .line 59
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-virtual {v0}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    return-object v0
.end method

.method public started()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Started:Z

    return v0
.end method

.method public stopGL()V
    .locals 0

    .prologue
    .line 217
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stop()V

    .line 218
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->term()V

    .line 219
    return-void
.end method

.method public swap()V
    .locals 3

    .prologue
    .line 206
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglSwapBuffers(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 207
    return-void
.end method

.method public term()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 250
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 253
    iput-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    if-eqz v0, :cond_1

    .line 257
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 258
    iput-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 260
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_DoneInit:Z

    .line 261
    return-void
.end method
