.class final Lcom/google/android/gms/internal/iw$a;
.super Landroid/graphics/drawable/Drawable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/iw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/iw$a$a;
    }
.end annotation


# static fields
.field private static final Lf:Lcom/google/android/gms/internal/iw$a;

.field private static final Lg:Lcom/google/android/gms/internal/iw$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/iw$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/iw$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/iw$a;->Lf:Lcom/google/android/gms/internal/iw$a;

    new-instance v0, Lcom/google/android/gms/internal/iw$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/iw$a$a;-><init>(Lcom/google/android/gms/internal/iw$1;)V

    sput-object v0, Lcom/google/android/gms/internal/iw$a;->Lg:Lcom/google/android/gms/internal/iw$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method

.method static synthetic gL()Lcom/google/android/gms/internal/iw$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/iw$a;->Lf:Lcom/google/android/gms/internal/iw$a;

    return-object v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 0
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/iw$a;->Lg:Lcom/google/android/gms/internal/iw$a$a;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public setAlpha(I)V
    .locals 0
    .param p1, "alpha"    # I

    .prologue
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0
    .param p1, "cf"    # Landroid/graphics/ColorFilter;

    .prologue
    return-void
.end method
