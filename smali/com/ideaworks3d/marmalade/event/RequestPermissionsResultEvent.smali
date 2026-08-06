.class public Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;
.super Ljava/lang/Object;
.source "RequestPermissionsResultEvent.java"


# instance fields
.field public m_grantResults:[I

.field public m_permissions:[Ljava/lang/String;

.field public m_requestCode:I


# direct methods
.method public constructor <init>(I[Ljava/lang/String;[I)V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_requestCode:I

    .line 10
    iput-object p2, p0, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_permissions:[Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_grantResults:[I

    .line 12
    return-void
.end method
