.class Lcom/android/vending/licensing/LicenseValidator;
.super Ljava/lang/Object;
.source "LicenseValidator.java"


# static fields
.field private static final ERROR_CONTACTING_SERVER:I = 0x101

.field private static final ERROR_INVALID_PACKAGE_NAME:I = 0x102

.field private static final ERROR_NON_MATCHING_UID:I = 0x103

.field private static final ERROR_NOT_MARKET_MANAGED:I = 0x3

.field private static final ERROR_OVER_QUOTA:I = 0x5

.field private static final ERROR_SERVER_FAILURE:I = 0x4

.field private static final LICENSED:I = 0x0

.field private static final LICENSED_OLD_KEY:I = 0x2

.field private static final NOT_LICENSED:I = 0x1

.field private static final SIGNATURE_ALGORITHM:Ljava/lang/String; = "SHA256withRSA"

.field private static final TAG:Ljava/lang/String; = "LicenseValidator"


# instance fields
.field private final mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

.field private final mDeviceLimiter:Lcom/android/vending/licensing/DeviceLimiter;

.field private final mNonce:I

.field private final mPackageName:Ljava/lang/String;

.field private final mPolicy:Lcom/android/vending/licensing/Policy;

.field private final mVersionCode:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/android/vending/licensing/Policy;Lcom/android/vending/licensing/DeviceLimiter;Lcom/android/vending/licensing/LicenseCheckerCallback;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/android/vending/licensing/LicenseValidator;->mPolicy:Lcom/android/vending/licensing/Policy;

    .line 61
    iput-object p2, p0, Lcom/android/vending/licensing/LicenseValidator;->mDeviceLimiter:Lcom/android/vending/licensing/DeviceLimiter;

    .line 62
    iput-object p3, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

    .line 63
    iput p4, p0, Lcom/android/vending/licensing/LicenseValidator;->mNonce:I

    .line 64
    iput-object p5, p0, Lcom/android/vending/licensing/LicenseValidator;->mPackageName:Ljava/lang/String;

    .line 65
    iput-object p6, p0, Lcom/android/vending/licensing/LicenseValidator;->mVersionCode:Ljava/lang/String;

    .line 66
    return-void
.end method

.method private handleApplicationError(I)V
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

    invoke-interface {v0, p1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->applicationError(I)V

    .line 223
    return-void
.end method

.method private handleInvalidResponse()V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

    const/16 v1, 0x231

    invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->dontAllow(I)V

    .line 227
    return-void
.end method

.method private handleResponse(ILcom/android/vending/licensing/ResponseData;)V
    .locals 3

    .prologue
    .line 208
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mPolicy:Lcom/android/vending/licensing/Policy;

    invoke-interface {v0, p1, p2}, Lcom/android/vending/licensing/Policy;->processServerResponse(ILcom/android/vending/licensing/ResponseData;)V

    .line 212
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mPolicy:Lcom/android/vending/licensing/Policy;

    invoke-interface {v0}, Lcom/android/vending/licensing/Policy;->allowAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string v0, "LicenseValidator"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Allowed: Response "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->allow(I)V

    .line 219
    :goto_0
    return-void

    .line 216
    :cond_0
    const-string v0, "LicenseValidator"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not Allowed: Response "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->dontAllow(I)V

    goto :goto_0
.end method


# virtual methods
.method public getCallback()Lcom/android/vending/licensing/LicenseCheckerCallback;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;

    return-object v0
.end method

.method public getNonce()I
    .locals 1

    .prologue
    .line 73
    iget v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mNonce:I

    return v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public verify(Ljava/security/PublicKey;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/16 v3, 0x123

    .line 92
    .line 95
    if-eqz p2, :cond_0

    if-eq p2, v4, :cond_0

    if-ne p2, v5, :cond_6

    .line 99
    :cond_0
    :try_start_0
    const-string v0, "SHA256withRSA"

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 100
    invoke-virtual {v0, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 101
    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V

    .line 103
    invoke-static {p4}, Lcom/android/vending/licensing/util/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z

    move-result v0

    if-nez v0, :cond_1

    .line 104
    const-string v0, "LicenseValidator"

    const-string v1, "Signature verification failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_3

    .line 198
    :goto_0
    return-void

    .line 108
    :catch_0
    move-exception v0

    .line 110
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 111
    :catch_1
    move-exception v0

    .line 112
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V

    goto :goto_0

    .line 114
    :catch_2
    move-exception v0

    .line 115
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 116
    :catch_3
    move-exception v0

    .line 117
    const-string v0, "LicenseValidator"

    const-string v1, "Could not Base64-decode signature."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto :goto_0

    .line 124
    :cond_1
    :try_start_1
    invoke-static {p3}, Lcom/android/vending/licensing/ResponseData;->parse(Ljava/lang/String;)Lcom/android/vending/licensing/ResponseData;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 131
    iget v1, v0, Lcom/android/vending/licensing/ResponseData;->responseCode:I

    if-eq v1, p2, :cond_2

    .line 132
    const-string v0, "LicenseValidator"

    const-string v1, "Response codes don\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto :goto_0

    .line 125
    :catch_4
    move-exception v0

    .line 126
    const-string v0, "LicenseValidator"

    const-string v1, "Could not parse response."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto :goto_0

    .line 137
    :cond_2
    iget v1, v0, Lcom/android/vending/licensing/ResponseData;->nonce:I

    iget v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mNonce:I

    if-eq v1, v2, :cond_3

    .line 138
    const-string v0, "LicenseValidator"

    const-string v1, "Nonce doesn\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto :goto_0

    .line 143
    :cond_3
    iget-object v1, v0, Lcom/android/vending/licensing/ResponseData;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 144
    const-string v0, "LicenseValidator"

    const-string v1, "Package name doesn\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto :goto_0

    .line 149
    :cond_4
    iget-object v1, v0, Lcom/android/vending/licensing/ResponseData;->versionCode:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mVersionCode:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 150
    const-string v0, "LicenseValidator"

    const-string v1, "Version codes don\'t match."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto :goto_0

    .line 156
    :cond_5
    iget-object v1, v0, Lcom/android/vending/licensing/ResponseData;->userId:Ljava/lang/String;

    .line 157
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 158
    const-string v0, "LicenseValidator"

    const-string v1, "User identifier is empty."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto/16 :goto_0

    :cond_6
    move-object v1, v0

    .line 164
    :cond_7
    sparse-switch p2, :sswitch_data_0

    .line 195
    const-string v0, "LicenseValidator"

    const-string v1, "Unknown response code for license check."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V

    goto/16 :goto_0

    .line 167
    :sswitch_0
    iget-object v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mDeviceLimiter:Lcom/android/vending/licensing/DeviceLimiter;

    invoke-interface {v2, v1}, Lcom/android/vending/licensing/DeviceLimiter;->isDeviceAllowed(Ljava/lang/String;)I

    move-result v1

    .line 168
    invoke-direct {p0, v1, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V

    goto/16 :goto_0

    .line 171
    :sswitch_1
    const/16 v1, 0x231

    invoke-direct {p0, v1, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V

    goto/16 :goto_0

    .line 174
    :sswitch_2
    const-string v1, "LicenseValidator"

    const-string v2, "Error contacting licensing server."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    invoke-direct {p0, v3, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V

    goto/16 :goto_0

    .line 178
    :sswitch_3
    const-string v1, "LicenseValidator"

    const-string v2, "An error has occurred on the licensing server."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    invoke-direct {p0, v3, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V

    goto/16 :goto_0

    .line 182
    :sswitch_4
    const-string v1, "LicenseValidator"

    const-string v2, "Licensing server is refusing to talk to this device, over quota."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    invoke-direct {p0, v3, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V

    goto/16 :goto_0

    .line 186
    :sswitch_5
    invoke-direct {p0, v4}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V

    goto/16 :goto_0

    .line 189
    :sswitch_6
    invoke-direct {p0, v5}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V

    goto/16 :goto_0

    .line 192
    :sswitch_7
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V

    goto/16 :goto_0

    .line 164
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
        0x3 -> :sswitch_7
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x101 -> :sswitch_2
        0x102 -> :sswitch_5
        0x103 -> :sswitch_6
    .end sparse-switch
.end method
