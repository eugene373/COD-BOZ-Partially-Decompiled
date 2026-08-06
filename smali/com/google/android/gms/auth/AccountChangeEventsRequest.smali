.class public Lcom/google/android/gms/auth/AccountChangeEventsRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/auth/AccountChangeEventsRequestCreator;


# instance fields
.field Dd:Ljava/lang/String;

.field final Di:I

.field Dl:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/AccountChangeEventsRequestCreator;

    invoke-direct {v0}, Lcom/google/android/gms/auth/AccountChangeEventsRequestCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->CREATOR:Lcom/google/android/gms/auth/AccountChangeEventsRequestCreator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Di:I

    return-void
.end method

.method constructor <init>(IILjava/lang/String;)V
    .locals 0
    .param p1, "version"    # I
    .param p2, "eventIndex"    # I
    .param p3, "accountName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Di:I

    iput p2, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dl:I

    iput-object p3, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dd:Ljava/lang/String;

    return-object v0
.end method

.method public getEventIndex()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dl:I

    return v0
.end method

.method public setAccountName(Ljava/lang/String;)Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    .locals 0
    .param p1, "accountName"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dd:Ljava/lang/String;

    return-object p0
.end method

.method public setEventIndex(I)Lcom/google/android/gms/auth/AccountChangeEventsRequest;
    .locals 0
    .param p1, "eventIndex"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dl:I

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/AccountChangeEventsRequestCreator;->a(Lcom/google/android/gms/auth/AccountChangeEventsRequest;Landroid/os/Parcel;I)V

    return-void
.end method
