package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderGL.java.
// 10 fields, 16 methods.

open class LoaderGL {
    private var m_DoneInit: Boolean
    var m_Egl: javax.microedition.khronos.egl.EGL10
    var m_EglConfigs: Array<javax.microedition.khronos.egl.EGLConfig>
    var m_EglContext: javax.microedition.khronos.egl.EGLContext
    var m_EglDisplay: javax.microedition.khronos.egl.EGLDisplay
    var m_EglSurface: javax.microedition.khronos.egl.EGLSurface
    private var m_GLVersion: Int
    private var m_Started: Boolean

    constructor()

    private fun CreateSpecFromSettings(p0: Array<com.ideaworks3d.marmalade.LoaderGL.ConfigSetting>): IntArray { return TODO("body: ([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)[I") }
    /*
    //         .locals 4
    //         const/4 v3, 0x2
    //         invoke-static {p1}, Lcom/ideaworks3d/marmalade/LoaderGL;->CountSettingsWithValue([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)I
    //         move-result v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         if-lt v1, v3, :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_0
    //         mul-int/lit8 v0, v0, 0x2
    //         add-int/lit8 v0, v0, 0x1
    //         new-array v1, v0, [I
    //         invoke-static {p1, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->CopySettingsWithValues([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;[I)I
    //         move-result v0
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         if-lt v2, v3, :cond_1
    //         mul-int/lit8 v2, v0, 0x2
    //         const/16 v3, 0x3040
    //         aput v3, v1, v2
    //         mul-int/lit8 v2, v0, 0x2
    //         add-int/lit8 v2, v2, 0x1
    //         const/4 v3, 0x4
    //         aput v3, v1, v2
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_1
    //         mul-int/lit8 v0, v0, 0x2
    //         const/16 v2, 0x3038
    //         aput v2, v1, v0
    //         return-object v1
    */

    private fun chooseConfigs() { /* TODO(body): ()V */ }
    /*
    //         .locals 15
    //         const/16 v14, 0x3023
    //         const/16 v13, 0x3022
    //         const/16 v12, 0x3021
    //         const/4 v5, 0x1
    //         const/4 v4, 0x0
    //         const/16 v0, 0xb
    //         new-array v7, v0, [Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v1, "EGL_BUFFER_SIZE"
    //         const/16 v2, 0x3020
    //         invoke-direct {v0, p0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v0, v7, v4
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v1, "EGL_DEPTH_ENCODING_NV"
    //         const/16 v2, 0x30e2
    //         invoke-direct {v0, p0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v0, v7, v5
    //         const/4 v0, 0x2
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_DEPTH_SIZE"
    //         const/16 v3, 0x3025
    //         invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/4 v0, 0x3
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_SURFACE_TYPE"
    //         const/16 v3, 0x3033
    //         invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/4 v0, 0x4
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_RED_SIZE"
    //         const/16 v3, 0x3024
    //         invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/4 v0, 0x5
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_GREEN_SIZE"
    //         invoke-direct {v1, p0, v2, v14}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/4 v0, 0x6
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_BLUE_SIZE"
    //         invoke-direct {v1, p0, v2, v13}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/4 v0, 0x7
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_ALPHA_SIZE"
    //         invoke-direct {v1, p0, v2, v12}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/16 v0, 0x8
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_STENCIL_SIZE"
    //         const/16 v3, 0x3026
    //         invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/16 v0, 0x9
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_SAMPLE_BUFFERS"
    //         const/16 v3, 0x3032
    //         invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         const/16 v0, 0xa
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;
    //         const-string v2, "EGL_SAMPLES"
    //         const/16 v3, 0x3031
    //         invoke-direct {v1, p0, v2, v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;-><init>(Lcom/ideaworks3d/marmalade/LoaderGL;Ljava/lang/String;I)V
    //         aput-object v1, v7, v0
    //         new-array v5, v5, [I
    //         move v6, v4
    //         :goto_0
    //         invoke-direct {p0, v7}, Lcom/ideaworks3d/marmalade/LoaderGL;->CreateSpecFromSettings([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)[I
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         const/4 v3, 0x0
    //         invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z
    //         aget v0, v5, v4
    //         if-eqz v0, :cond_0
    //         aget v10, v5, v4
    //         new-array v0, v10, [Ljavax/microedition/khronos/egl/EGLConfig;
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v9, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;
    //         move-object v8, v2
    //         move-object v11, v5
    //         invoke-interface/range {v6 .. v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;
    //         aget-object v8, v0, v4
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         const/16 v9, 0x3024
    //         move-object v5, p0
    //         move v10, v4
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         move-object v5, p0
    //         move v9, v14
    //         move v10, v4
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         move-object v5, p0
    //         move v9, v13
    //         move v10, v4
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         move-object v5, p0
    //         move v9, v12
    //         move v10, v4
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         const/16 v9, 0x3025
    //         move-object v5, p0
    //         move v10, v4
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         const/16 v9, 0x3040
    //         move-object v5, p0
    //         move v10, v4
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         iget-object v6, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v7, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         const/16 v9, 0x3027
    //         const/16 v10, 0x3038
    //         move-object v5, p0
    //         invoke-direct/range {v5 .. v10}, Lcom/ideaworks3d/marmalade/LoaderGL;->findConfigAttrib(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    //         return-void
    //         :cond_0
    //         array-length v0, v7
    //         if-ge v6, v0, :cond_1
    //         aget-object v0, v7, v6
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->SetValueToDefault()V
    //         add-int/lit8 v0, v6, 0x1
    //         move v6, v0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         const-string v1, "Failed to choose an EGL config"
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private fun findConfigAttrib(p0: javax.microedition.khronos.egl.EGL10, p1: javax.microedition.khronos.egl.EGLDisplay, p2: javax.microedition.khronos.egl.EGLConfig, p3: Int, p4: Int): Int { return TODO("body: (Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         new-array v0, v0, [I
    //         invoke-interface {p1, p2, p3, p4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x0
    //         aget p5, v0, v1
    //         :cond_0
    //         return p5
    */

    private fun stop() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Started:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;
    //         sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;
    //         sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;
    //         invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         :cond_0
    //         return-void
    */

    public fun init() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x1
    //         const/4 v4, 0x0
    //         const/4 v3, 0x2
    //         invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;
    //         move-result-object v0
    //         check-cast v0, Ljavax/microedition/khronos/egl/EGL10;
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         sget-object v1, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         new-array v0, v3, [I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         invoke-interface {v1, v2, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->chooseConfigs()V
    //         const/4 v0, 0x0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         if-lt v1, v3, :cond_0
    //         const/4 v0, 0x3
    //         new-array v0, v0, [I
    //         const/16 v1, 0x3098
    //         aput v1, v0, v4
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         aput v1, v0, v5
    //         const/16 v1, 0x3038
    //         aput v1, v0, v3
    //         :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;
    //         aget-object v3, v3, v4
    //         sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;
    //         invoke-interface {v1, v2, v3, v4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;
    //         iput-boolean v5, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_DoneInit:Z
    //         return-void
    */

    public fun pauseGL() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stop()V
    //         return-void
    */

    public fun restartGL(p0: android.view.SurfaceHolder): javax.microedition.khronos.opengles.GL { return TODO("body: (Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stop()V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         invoke-virtual {p0, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         return-object v0
    */

    public fun resumeGL(p0: android.view.SurfaceHolder): javax.microedition.khronos.opengles.GL { return TODO("body: (Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         invoke-virtual {p0, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         return-object v0
    */

    public fun startGL(p0: android.view.SurfaceHolder, p1: Int): javax.microedition.khronos.opengles.GL { return TODO("body: (Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;") }
    /*
    //         .locals 5
    //         if-eqz p2, :cond_0
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_GLVersion:I
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_DoneInit:Z
    //         if-nez v0, :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->init()V
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;
    //         const/4 v3, 0x0
    //         aget-object v2, v2, v3
    //         const/4 v3, 0x0
    //         invoke-interface {v0, v1, v2, p1, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateWindowSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljava/lang/Object;[I)Ljavax/microedition/khronos/egl/EGLSurface;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;
    //         invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Started:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;
    //         invoke-virtual {v0}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         return-object v0
    */

    public fun started(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Started:Z
    //         return v0
    */

    public fun stopGL() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stop()V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderGL;->term()V
    //         return-void
    */

    public fun swap() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglSurface:Ljavax/microedition/khronos/egl/EGLSurface;
    //         invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglSwapBuffers(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z
    //         return-void
    */

    public fun term() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;
    //         invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z
    //         iput-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglContext:Ljavax/microedition/khronos/egl/EGLContext;
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_Egl:Ljavax/microedition/khronos/egl/EGL10;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z
    //         iput-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_EglDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderGL;->m_DoneInit:Z
    //         return-void
    */

    companion object {
    private val EGL_CONTEXT_CLIENT_VERSION: Int = 0x3098
    private val EGL_DEPTH_ENCODING_NV: Int = 0x30e2

    private @JvmStatic fun CopySettingsWithValues(p0: Array<com.ideaworks3d.marmalade.LoaderGL.ConfigSetting>, p1: IntArray): Int { return TODO("body: ([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;[I)I") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         array-length v2, p0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_1
    //         aget-object v3, p0, v1
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->HasValue()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         mul-int/lit8 v4, v0, 0x2
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->GetSetting()I
    //         move-result v5
    //         aput v5, p1, v4
    //         mul-int/lit8 v4, v0, 0x2
    //         add-int/lit8 v4, v4, 0x1
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->GetValue()I
    //         move-result v3
    //         aput v3, p1, v4
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return v0
    */

    private @JvmStatic fun CountSettingsWithValue(p0: Array<com.ideaworks3d.marmalade.LoaderGL.ConfigSetting>): Int { return TODO("body: ([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         array-length v2, p0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_1
    //         aget-object v3, p0, v1
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;->HasValue()Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return v0
    */

    }
}
