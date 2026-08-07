package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class id_a: android.os.Binder(), com.google.android.gms.internal.id {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/id$a;->fq()I
    //         move-result v1
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/id$a;->fr()I
    //         move-result v1
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v3
    //         invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/id$a;->a(Lcom/google/android/gms/internal/ic;I[B)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/id$a;->a(Lcom/google/android/gms/internal/ic;I)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/id$a;->a(Lcom/google/android/gms/internal/ic;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v4
    //         invoke-virtual {p0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/id$a;->a(Lcom/google/android/gms/internal/ic;ILjava/lang/String;[B)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_7
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/id$a;->b(Lcom/google/android/gms/internal/ic;I)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/id$a;->b(Lcom/google/android/gms/internal/ic;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v1, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ic$a;->J(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/id$a;->c(Lcom/google/android/gms/internal/ic;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1389 -> :sswitch_1
    //             0x138a -> :sswitch_2
    //             0x138b -> :sswitch_3
    //             0x138c -> :sswitch_4
    //             0x138d -> :sswitch_5
    //             0x138e -> :sswitch_6
    //             0x138f -> :sswitch_7
    //             0x1390 -> :sswitch_8
    //             0x1391 -> :sswitch_9
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun K(p0: android.os.IBinder): com.google.android.gms.internal.id { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/id;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateService"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/id;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/id$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/id$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
