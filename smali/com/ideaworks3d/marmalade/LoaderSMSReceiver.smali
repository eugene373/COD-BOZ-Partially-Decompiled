.class public Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
.super Landroid/content/BroadcastReceiver;
.source "LoaderSMSReceiver.java"


# static fields
.field static final ACTION:Ljava/lang/String; = "android.provider.Telephony.SMS_RECEIVED"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static native onReceiveCallback(Ljava/lang/String;Ljava/lang/String;J)V
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.provider.Telephony.SMS_RECEIVED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 21
    const-string v1, "pdus"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 22
    array-length v1, v0

    new-array v4, v1, [Landroid/telephony/SmsMessage;

    move v2, v3

    .line 23
    :goto_0
    array-length v1, v0

    if-ge v2, v1, :cond_0

    .line 25
    aget-object v1, v0, v2

    check-cast v1, [B

    check-cast v1, [B

    invoke-static {v1}, Landroid/telephony/SmsMessage;->createFromPdu([B)Landroid/telephony/SmsMessage;

    move-result-object v1

    aput-object v1, v4, v2

    .line 23
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 29
    :cond_0
    :goto_1
    array-length v0, v4

    if-ge v3, v0, :cond_1

    .line 31
    aget-object v0, v4, v3

    .line 32
    invoke-virtual {v0}, Landroid/telephony/SmsMessage;->getDisplayOriginatingAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/SmsMessage;->getDisplayMessageBody()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/telephony/SmsMessage;->getTimestampMillis()J

    move-result-wide v6

    invoke-static {v1, v2, v6, v7}, Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;->onReceiveCallback(Ljava/lang/String;Ljava/lang/String;J)V

    .line 29
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 41
    :cond_1
    return-void
.end method
