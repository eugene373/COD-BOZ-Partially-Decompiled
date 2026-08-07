package com.google.android.gms.common

// Auto-emitted from smali.
// 0 fields, 4 methods.

class AccountPicker {
    private constructor()

    companion object {
    public @JvmStatic fun a(p0: android.accounts.Account, p1: java.util.ArrayList, p2: Array<String>, p3: Boolean, p4: String, p5: String, p6: Array<String>, p7: android.os.Bundle, p8: Boolean): android.content.Intent { return TODO("body: (Landroid/accounts/Account;Ljava/util/ArrayList;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;Z)Landroid/content/Intent;") }
    /*
    //         .locals 11
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/accounts/Account;",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Landroid/accounts/Account;",
    //                 ">;[",
    //                 "Ljava/lang/String;",
    //                 "Z",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "[",
    //                 "Ljava/lang/String;",
    //                 "Landroid/os/Bundle;",
    //                 "Z)",
    //                 "Landroid/content/Intent;"
    //             }
    //         .end annotation
    //         const/4 v9, 0x0
    //         const/4 v10, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move-object v4, p4
    //         move-object/from16 v5, p5
    //         move-object/from16 v6, p6
    //         move-object/from16 v7, p7
    //         move/from16 v8, p8
    //         invoke-static/range {v0 .. v10}, Lcom/google/android/gms/common/AccountPicker;->a(Landroid/accounts/Account;Ljava/util/ArrayList;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;ZII)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun a(p0: android.accounts.Account, p1: java.util.ArrayList, p2: Array<String>, p3: Boolean, p4: String, p5: String, p6: Array<String>, p7: android.os.Bundle, p8: Boolean, p9: Int, p10: Int): android.content.Intent { return TODO("body: (Landroid/accounts/Account;Ljava/util/ArrayList;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;ZII)Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/accounts/Account;",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Landroid/accounts/Account;",
    //                 ">;[",
    //                 "Ljava/lang/String;",
    //                 "Z",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "[",
    //                 "Ljava/lang/String;",
    //                 "Landroid/os/Bundle;",
    //                 "ZII)",
    //                 "Landroid/content/Intent;"
    //             }
    //         .end annotation
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         const-string v1, "com.google.android.gms.common.account.CHOOSE_ACCOUNT"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "allowableAccounts"
    //         invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //         const-string v1, "allowableAccountTypes"
    //         invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "addAccountOptions"
    //         invoke-virtual {v0, v1, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         const-string v1, "selectedAccount"
    //         invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         const-string v1, "alwaysPromptForAccount"
    //         invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         const-string v1, "descriptionTextOverride"
    //         invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "authTokenType"
    //         invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "addAccountRequiredFeatures"
    //         invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "setGmsCoreAccount"
    //         invoke-virtual {v0, v1, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         const-string v1, "overrideTheme"
    //         invoke-virtual {v0, v1, p9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v1, "overrideCustomTheme"
    //         invoke-virtual {v0, v1, p10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         return-object v0
    */

    public @JvmStatic fun newChooseAccountIntent(selectedAccount: android.accounts.Account, allowableAccountTypes: java.util.ArrayList, alwaysPromptForAccount: Array<String>, descriptionOverrideText: Boolean, addAccountAuthTokenType: String, addAccountRequiredFeatures: String, addAccountOptions: Array<String>, p7: android.os.Bundle): android.content.Intent { return TODO("body: (Landroid/accounts/Account;Ljava/util/ArrayList;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;") }
    /*
    //         .locals 9
    //         .local p1, "allowableAccounts":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/accounts/Account;>;"
    //         const/4 v8, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         move-object v6, p6
    //         move-object/from16 v7, p7
    //         invoke-static/range {v0 .. v8}, Lcom/google/android/gms/common/AccountPicker;->a(Landroid/accounts/Account;Ljava/util/ArrayList;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;Z)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
