.class public Lcom/ideaworks3d/marmalade/SuspendResumeEvent;
.super Ljava/lang/Object;
.source "SuspendResumeEvent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    }
.end annotation


# instance fields
.field public final eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    .line 14
    return-void
.end method
