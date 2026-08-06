.class public interface abstract Lcom/google/android/gms/auth/api/IGoogleAuthService;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/auth/api/IGoogleAuthService$Stub;
    }
.end annotation


# virtual methods
.method public abstract sendConnection(Lcom/google/android/gms/auth/api/IGoogleAuthApiCallbacks;Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
