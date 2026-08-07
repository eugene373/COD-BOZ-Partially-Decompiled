package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eContacts.java.
// 27 fields, 17 methods.

open class s3eContacts {
    private val S3E_CONTACTS_FIELD_ADDRESS: Int
    private val S3E_CONTACTS_FIELD_CITY: Int
    private val S3E_CONTACTS_FIELD_COUNTRY: Int
    private val S3E_CONTACTS_FIELD_DISPLAY_NAME: Int
    private val S3E_CONTACTS_FIELD_EMAIL_ADDR: Int
    private val S3E_CONTACTS_FIELD_FIRST_NAME: Int
    private val S3E_CONTACTS_FIELD_FORMATTED_ADDR: Int
    private val S3E_CONTACTS_FIELD_HOME_PHONE: Int
    private val S3E_CONTACTS_FIELD_HONORIFIC_PREFIX: Int
    private val S3E_CONTACTS_FIELD_HONORIFIC_SUFFIX: Int
    private val S3E_CONTACTS_FIELD_IM: Int
    private val S3E_CONTACTS_FIELD_LAST_NAME: Int
    private val S3E_CONTACTS_FIELD_MIDDLE_NAME: Int
    private val S3E_CONTACTS_FIELD_MOBILE_PHONE: Int
    private val S3E_CONTACTS_FIELD_NICKNAME: Int
    private val S3E_CONTACTS_FIELD_NOTE: Int
    private val S3E_CONTACTS_FIELD_ORGANISATION: Int
    private val S3E_CONTACTS_FIELD_ORGANISATION_DEPT: Int
    private val S3E_CONTACTS_FIELD_ORGANISATION_TITLE: Int
    private val S3E_CONTACTS_FIELD_POSTAL_CODE: Int
    private val S3E_CONTACTS_FIELD_REGION: Int
    private val S3E_CONTACTS_FIELD_URL: Int
    private val S3E_CONTACTS_FIELD_WORK_PHONE: Int
    private val S3E_CONTACTS_UNLIMITED_MAX_ENTRIES: Int
    private var contactsMap: IntArray
    private val m_ContactFields: java.util.HashMap
    private var m_QueryToSearch: String

    constructor()

    private fun AddQueryes(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-lez v1, :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " OR "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v6
    //         iget-object v2, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;
    //         iget-object v3, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;
    //         iget-object v4, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;
    //         iget v5, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I
    //         move-object v0, p0
    //         move-object v1, p1
    //         invoke-direct/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eContacts;->CreateSearchQuery(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         goto :goto_0
    */

    private fun CreateSearchQuery(p0: String, p1: String, p2: String, p3: String, p4: Int): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "((mimetype = \'"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\') AND ("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " LIKE \'%"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "%\')"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz p4, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "AND ( "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " = \'"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\' )"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private fun UpdateUIDMap(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 9
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         const-string v0, "myapp"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "update contacts with query: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-array v0, v6, [I
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         if-nez p1, :cond_0
    //         move v2, v7
    //         :goto_0
    //         if-eqz v2, :cond_1
    //         sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;
    //         :goto_1
    //         if-eqz v2, :cond_2
    //         const-string v0, "contact_id"
    //         move-object v8, v0
    //         :goto_2
    //         if-eqz v2, :cond_3
    //         const-string v3, "deleted = 0 "
    //         :goto_3
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/String;
    //         const/4 v4, 0x0
    //         aput-object v8, v2, v4
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         if-nez v0, :cond_4
    //         move v0, v6
    //         :goto_4
    //         return v0
    //         :cond_0
    //         move v2, v6
    //         goto :goto_0
    //         :cond_1
    //         sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;
    //         goto :goto_1
    //         :cond_2
    //         const-string v0, "contact_id"
    //         move-object v8, v0
    //         goto :goto_2
    //         :cond_3
    //         move-object v3, p1
    //         goto :goto_3
    //         :catch_0
    //         move-exception v0
    //         move v0, v6
    //         goto :goto_4
    //         :cond_4
    //         invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    //         move-result v1
    //         new-array v2, v1, [I
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         const-string v2, "myapp"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "cursor: number of records: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_5
    //         if-ge v6, v1, :cond_5
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         invoke-interface {v0, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v3
    //         invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v3
    //         aput v3, v2, v6
    //         add-int/lit8 v6, v6, 0x1
    //         invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
    //         goto :goto_5
    //         :cond_5
    //         invoke-interface {v0}, Landroid/database/Cursor;->close()V
    //         move v0, v7
    //         goto :goto_4
    */

    fun InitContactFieldMap(): java.util.HashMap { return TODO("body: ()Ljava/util/HashMap;") }
    /*
    //         .locals 10
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 "Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v9, 0x2
    //         const v4, 0x7fffffff
    //         const/4 v6, 0x1
    //         new-instance v7, Ljava/util/HashMap;
    //         invoke-direct {v7}, Ljava/util/HashMap;-><init>()V
    //         const/4 v0, 0x4
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/nickname"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x8
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/email_v2"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x19
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/im"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x24
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/note"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x9
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/website"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x13
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/postal-address_v2"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0xa
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/postal-address_v2"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0xb
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/postal-address_v2"
    //         const-string v3, "data7"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x14
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/postal-address_v2"
    //         const-string v3, "data8"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0xc
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/postal-address_v2"
    //         const-string v3, "data9"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0xd
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/postal-address_v2"
    //         const-string v3, "data10"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/name"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/name"
    //         const-string v3, "data2"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/name"
    //         const-string v3, "data3"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x11
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/name"
    //         const-string v3, "data6"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x20
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/organization"
    //         const-string v3, "data1"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x21
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/organization"
    //         const-string v3, "data5"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/16 v0, 0x22
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/organization"
    //         const-string v3, "data4"
    //         invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/4 v0, 0x5
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v8
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/phone_v2"
    //         const-string v3, "data1"
    //         const-string v5, "data2"
    //         move-object v1, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    //         invoke-virtual {v7, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/4 v0, 0x6
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v8
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/phone_v2"
    //         const-string v3, "data1"
    //         const-string v5, "data2"
    //         move-object v1, p0
    //         move v6, v9
    //         invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    //         invoke-virtual {v7, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const/4 v0, 0x7
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v8
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         const-string v2, "vnd.android.cursor.item/phone_v2"
    //         const-string v3, "data1"
    //         const-string v5, "data2"
    //         const/4 v6, 0x3
    //         move-object v1, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    //         invoke-virtual {v7, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object v7
    */

    public fun QueryForContactRow(p0: Int, p1: String, p2: String, p3: Int): String { return TODO("body: (ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "mimetype = \'"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\'"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " AND "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "contact_id"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " = "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz p3, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " AND "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " = "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         const-string v1, "myapp"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "query for row: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         return-object v0
    */

    public fun contactsCreate(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         :try_start_0
    //         new-instance v0, Landroid/content/ContentValues;
    //         invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
    //         const-string v1, "aggregation_mode"
    //         const/4 v2, 0x3
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v1
    //         sget-object v2, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;
    //         invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun contactsDelete(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         :try_start_0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v1
    //         sget-object v2, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;
    //         int-to-long v4, p1
    //         invoke-static {v2, v4, v5}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         invoke-virtual {v1, v2, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun contactsGetData(p0: Int, p1: Int): android.database.Cursor { return TODO("body: (II)Landroid/database/Cursor;") }
    /*
    //         .locals 7
    //         const/4 v4, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         move-object v3, v0
    //         check-cast v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         if-nez v3, :cond_0
    //         :goto_0
    //         return-object v4
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/String;
    //         const/4 v5, 0x0
    //         iget-object v6, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;
    //         aput-object v6, v2, v5
    //         iget-object v5, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;
    //         iget-object v6, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;
    //         iget v3, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I
    //         invoke-virtual {p0, p1, v5, v6, v3}, Lcom/ideaworks3d/marmalade/s3eContacts;->QueryForContactRow(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //         move-result-object v3
    //         move-object v5, v4
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v4
    //         goto :goto_0
    */

    public fun contactsGetField(p0: Int, p1: Int, p2: Int): String { return TODO("body: (III)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsGetData(II)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         :try_start_1
    //         invoke-interface {v1, p3}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const/4 v2, 0x0
    //         invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result-object v0
    //         :cond_2
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         move-object v1, v0
    //         :goto_1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         move-object v3, v1
    //         move-object v1, v0
    //         move-object v0, v3
    //         :goto_2
    //         if-eqz v1, :cond_3
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_2
    //         :catch_1
    //         move-exception v2
    //         goto :goto_1
    */

    public fun contactsGetMaxNumEntries(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget v0, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->maxEntries:I
    //         goto :goto_0
    */

    public fun contactsGetNumEntries(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsGetData(II)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v2
    //         if-nez v2, :cond_2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         move v0, v1
    //         :cond_1
    //         :goto_0
    //         return v0
    //         :cond_2
    //         :try_start_1
    //         invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result v0
    //         if-nez p2, :cond_4
    //         const/4 v3, 0x1
    //         if-ne v0, v3, :cond_4
    //         const/4 v3, 0x0
    //         :try_start_2
    //         invoke-interface {v2, v3}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         const/4 v3, 0x0
    //         invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         move-result-object v3
    //         if-nez v3, :cond_4
    //         if-eqz v2, :cond_3
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         if-eqz v2, :cond_1
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         move-object v4, v0
    //         move v0, v1
    //         move-object v1, v4
    //         :goto_1
    //         if-eqz v1, :cond_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         move-object v2, v0
    //         move-object v0, v1
    //         :goto_2
    //         if-eqz v2, :cond_5
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         :cond_5
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_2
    //         :catch_1
    //         move-exception v0
    //         move v0, v1
    //         move-object v1, v2
    //         goto :goto_1
    //         :catch_2
    //         move-exception v1
    //         move-object v1, v2
    //         goto :goto_1
    */

    public fun contactsGetNumRecords(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         array-length v0, v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun contactsGetUID(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         if-eqz v0, :cond_0
    //         if-ltz p1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         array-length v0, v0
    //         if-lt p1, v0, :cond_1
    //         :cond_0
    //         const/4 v0, -0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I
    //         aget v0, v0, p1
    //         goto :goto_0
    */

    public fun contactsSetField(p0: String, p1: Int, p2: Int, p3: Int): Boolean { return TODO("body: (Ljava/lang/String;III)Z") }
    /*
    //         .locals 10
    //         const/4 v7, 0x1
    //         const/4 v8, 0x0
    //         const/4 v9, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;
    //         invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         move-object v6, v0
    //         check-cast v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    //         if-nez v6, :cond_0
    //         :goto_0
    //         return v8
    //         :cond_0
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;
    //         const/4 v2, 0x3
    //         new-array v2, v2, [Ljava/lang/String;
    //         const/4 v3, 0x0
    //         const-string v4, "_id"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         const-string v4, "contact_id"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x2
    //         const-string v4, "mimetype"
    //         aput-object v4, v2, v3
    //         iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;
    //         iget-object v4, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;
    //         iget v5, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I
    //         invoke-virtual {p0, p2, v3, v4, v5}, Lcom/ideaworks3d/marmalade/s3eContacts;->QueryForContactRow(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         :try_start_1
    //         new-instance v2, Landroid/content/ContentValues;
    //         invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V
    //         iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;
    //         invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v3, "mimetype"
    //         iget-object v4, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;
    //         invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v3, "raw_contact_id"
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;
    //         if-eqz v3, :cond_1
    //         iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;
    //         iget v4, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
    //         move-result v3
    //         if-ne p4, v3, :cond_3
    //         :cond_2
    //         const-string v3, "myapp"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "insert row. type: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         iget-object v5, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " value: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v3, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;
    //         invoke-virtual {v0, v3, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         :goto_1
    //         if-eqz v1, :cond_6
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         move v0, v7
    //         :goto_2
    //         move v8, v0
    //         goto/16 :goto_0
    //         :cond_3
    //         :try_start_2
    //         const-string v3, "myapp"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "update row. type: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         iget-object v5, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " value: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-interface {v1, p4}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         sget-object v3, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;
    //         const-string v4, "_id"
    //         invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v4
    //         invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         invoke-virtual {v0, v3, v2, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         move-object v0, v1
    //         :goto_3
    //         if-eqz v0, :cond_5
    //         invoke-interface {v0}, Landroid/database/Cursor;->close()V
    //         move v0, v8
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v9
    //         :goto_4
    //         if-eqz v1, :cond_4
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_4
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_4
    //         :catch_1
    //         move-exception v0
    //         move-object v0, v9
    //         goto :goto_3
    //         :cond_5
    //         move v0, v8
    //         goto :goto_2
    //         :cond_6
    //         move v0, v7
    //         goto :goto_2
    */

    public fun contactsSimpleSearch(p0: String, p1: IntArray, p2: Boolean): Boolean { return TODO("body: (Ljava/lang/String;[IZ)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         move v0, v1
    //         :goto_0
    //         array-length v2, p2
    //         if-ge v0, v2, :cond_0
    //         aget v2, p2, v0
    //         invoke-direct {p0, p1, v2}, Lcom/ideaworks3d/marmalade/s3eContacts;->AddQueryes(Ljava/lang/String;I)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         const-string v2, ""
    //         if-ne v0, v2, :cond_1
    //         :goto_1
    //         return v1
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eContacts;->UpdateUIDMap(Ljava/lang/String;)Z
    //         move-result v1
    //         goto :goto_1
    */

    public fun contactsUpdate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eContacts;->UpdateUIDMap(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

}
