.class Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;
.super Ljava/lang/Object;
.source "WeakArrayList.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private it:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<TE;>;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/ideaworks3d/marmalade/util/WeakArrayList;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/util/WeakArrayList;)V
    .locals 1

    .prologue
    .line 44
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->this$0:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->this$0:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->access$000(Lcom/ideaworks3d/marmalade/util/WeakArrayList;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 49
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 54
    return-void
.end method
