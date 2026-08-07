package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class IRoomService_Stub: android.os.Binder(), com.google.android.gms.games.internal.IRoomService {
    public constructor()

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         const/4 v2, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v2
    //         :goto_0
    //         return v2
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/games/internal/IRoomServiceCallbacks$Stub;->aE(Landroid/os/IBinder;)Lcom/google/android/gms/games/internal/IRoomServiceCallbacks;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->a(Landroid/os/IBinder;Lcom/google/android/gms/games/internal/IRoomServiceCallbacks;)V
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->kG()V
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->kH()V
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v0, v1, v3}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->kI()V
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         move v1, v2
    //         :cond_0
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->a(Lcom/google/android/gms/common/data/DataHolder;Z)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :sswitch_7
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->kJ()V
    //         goto :goto_0
    //         :sswitch_8
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         move v1, v2
    //         :cond_2
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->Q(Z)V
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         invoke-virtual {p0, v0, v1, v3}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->a([BLjava/lang/String;I)V
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->a([B[Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :sswitch_b
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->t(Ljava/lang/String;I)V
    //         goto/16 :goto_0
    //         :sswitch_c
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->u(Ljava/lang/String;I)V
    //         goto/16 :goto_0
    //         :sswitch_d
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->bN(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :sswitch_e
    //         const-string v0, "com.google.android.gms.games.internal.IRoomService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IRoomService$Stub;->bO(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x3e9 -> :sswitch_1
    //             0x3ea -> :sswitch_2
    //             0x3eb -> :sswitch_3
    //             0x3ec -> :sswitch_4
    //             0x3ed -> :sswitch_5
    //             0x3ee -> :sswitch_6
    //             0x3ef -> :sswitch_7
    //             0x3f0 -> :sswitch_8
    //             0x3f1 -> :sswitch_9
    //             0x3f2 -> :sswitch_a
    //             0x3f3 -> :sswitch_b
    //             0x3f4 -> :sswitch_c
    //             0x3f5 -> :sswitch_d
    //             0x3f6 -> :sswitch_e
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

}
