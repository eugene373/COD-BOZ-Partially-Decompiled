.class final Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;
.super Ljava/util/AbstractList;
.source "GraphObject.java"

# interfaces
.implements Lcom/facebook/model/GraphObjectList;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/model/GraphObject$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "GraphObjectListImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList",
        "<TT;>;",
        "Lcom/facebook/model/GraphObjectList",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final itemType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final state:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>(Lorg/json/JSONArray;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 710
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 711
    const-string v0, "state"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 712
    const-string v0, "itemType"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 714
    iput-object p1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    .line 715
    iput-object p2, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;

    .line 716
    return-void
.end method

.method private checkIndex(I)V
    .locals 1

    .prologue
    .line 824
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 825
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 827
    :cond_1
    return-void
.end method

.method private put(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 830
    invoke-static {p2}, Lcom/facebook/model/GraphObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 832
    :try_start_0
    iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 836
    return-void

    .line 833
    :catch_0
    move-exception v0

    .line 834
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 726
    if-gez p1, :cond_0

    .line 727
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 728
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 729
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Only adding items at the end of the list is supported."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 732
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->put(ILjava/lang/Object;)V

    .line 733
    return-void
.end method

.method public final castToListOf(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lcom/facebook/model/GraphObject;",
            ">(",
            "Ljava/lang/Class",
            "<TU;>;)",
            "Lcom/facebook/model/GraphObjectList",
            "<TU;>;"
        }
    .end annotation

    .prologue
    .line 784
    const-class v0, Lcom/facebook/model/GraphObject;

    iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 785
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 791
    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-static {v0, p1}, Lcom/facebook/model/GraphObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;

    move-result-object p0

    goto :goto_0

    .line 793
    :cond_1
    new-instance v0, Lcom/facebook/FacebookGraphObjectException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t cast GraphObjectCollection of non-GraphObject type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 805
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 751
    if-nez p1, :cond_1

    .line 760
    :cond_0
    :goto_0
    return v0

    .line 753
    :cond_1
    if-ne p0, p1, :cond_2

    .line 754
    const/4 v0, 0x1

    goto :goto_0

    .line 755
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 759
    check-cast p1, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;

    .line 760
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    iget-object v1, p1, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .prologue
    .line 766
    invoke-direct {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->checkIndex(I)V

    .line 768
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    .line 772
    iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/model/GraphObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;

    move-result-object v0

    .line 774
    return-object v0
.end method

.method public final getInnerJSONArray()Lorg/json/JSONArray;
    .locals 1

    .prologue
    .line 800
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 746
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->hashCode()I

    move-result v0

    return v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 810
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 815
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 820
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    .prologue
    .line 737
    invoke-direct {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->checkIndex(I)V

    .line 739
    invoke-virtual {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 740
    invoke-direct {p0, p1, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->put(ILjava/lang/Object;)V

    .line 741
    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 779
    iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 720
    const-string v0, "GraphObjectList{itemType=%s, state=%s}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
