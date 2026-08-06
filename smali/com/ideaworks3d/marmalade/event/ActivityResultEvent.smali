.class public Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;
.super Ljava/lang/Object;
.source "ActivityResultEvent.java"


# instance fields
.field public m_intent:Landroid/content/Intent;

.field public m_requestCode:I

.field public m_resultCode:I


# direct methods
.method public constructor <init>(Landroid/content/Intent;II)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_intent:Landroid/content/Intent;

    .line 11
    iput p2, p0, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_requestCode:I

    .line 12
    iput p3, p0, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_resultCode:I

    .line 13
    return-void
.end method
