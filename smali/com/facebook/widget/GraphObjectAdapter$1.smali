.class Lcom/facebook/widget/GraphObjectAdapter$1;
.super Ljava/lang/Object;
.source "GraphObjectAdapter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/GraphObjectAdapter;->rebuildSections()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/model/GraphObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/GraphObjectAdapter;

.field final synthetic val$collator:Ljava/text/Collator;


# direct methods
.method constructor <init>(Lcom/facebook/widget/GraphObjectAdapter;Ljava/text/Collator;)V
    .locals 0

    .prologue
    .line 483
    iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter$1;->this$0:Lcom/facebook/widget/GraphObjectAdapter;

    iput-object p2, p0, Lcom/facebook/widget/GraphObjectAdapter$1;->val$collator:Ljava/text/Collator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/facebook/model/GraphObject;Lcom/facebook/model/GraphObject;)I
    .locals 2

    .prologue
    .line 486
    iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter$1;->this$0:Lcom/facebook/widget/GraphObjectAdapter;

    invoke-static {v0}, Lcom/facebook/widget/GraphObjectAdapter;->access$000(Lcom/facebook/widget/GraphObjectAdapter;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter$1;->val$collator:Ljava/text/Collator;

    invoke-static {p1, p2, v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->access$100(Lcom/facebook/model/GraphObject;Lcom/facebook/model/GraphObject;Ljava/util/Collection;Ljava/text/Collator;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 483
    check-cast p1, Lcom/facebook/model/GraphObject;

    check-cast p2, Lcom/facebook/model/GraphObject;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/widget/GraphObjectAdapter$1;->compare(Lcom/facebook/model/GraphObject;Lcom/facebook/model/GraphObject;)I

    move-result v0

    return v0
.end method
