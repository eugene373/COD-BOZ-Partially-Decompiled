.class Lcom/ideaworks3d/marmalade/s3eContacts;
.super Ljava/lang/Object;
.source "s3eContacts.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
    }
.end annotation


# instance fields
.field private final S3E_CONTACTS_FIELD_ADDRESS:I

.field private final S3E_CONTACTS_FIELD_CITY:I

.field private final S3E_CONTACTS_FIELD_COUNTRY:I

.field private final S3E_CONTACTS_FIELD_DISPLAY_NAME:I

.field private final S3E_CONTACTS_FIELD_EMAIL_ADDR:I

.field private final S3E_CONTACTS_FIELD_FIRST_NAME:I

.field private final S3E_CONTACTS_FIELD_FORMATTED_ADDR:I

.field private final S3E_CONTACTS_FIELD_HOME_PHONE:I

.field private final S3E_CONTACTS_FIELD_HONORIFIC_PREFIX:I

.field private final S3E_CONTACTS_FIELD_HONORIFIC_SUFFIX:I

.field private final S3E_CONTACTS_FIELD_IM:I

.field private final S3E_CONTACTS_FIELD_LAST_NAME:I

.field private final S3E_CONTACTS_FIELD_MIDDLE_NAME:I

.field private final S3E_CONTACTS_FIELD_MOBILE_PHONE:I

.field private final S3E_CONTACTS_FIELD_NICKNAME:I

.field private final S3E_CONTACTS_FIELD_NOTE:I

.field private final S3E_CONTACTS_FIELD_ORGANISATION:I

.field private final S3E_CONTACTS_FIELD_ORGANISATION_DEPT:I

.field private final S3E_CONTACTS_FIELD_ORGANISATION_TITLE:I

.field private final S3E_CONTACTS_FIELD_POSTAL_CODE:I

.field private final S3E_CONTACTS_FIELD_REGION:I

.field private final S3E_CONTACTS_FIELD_URL:I

.field private final S3E_CONTACTS_FIELD_WORK_PHONE:I

.field private final S3E_CONTACTS_UNLIMITED_MAX_ENTRIES:I

.field private contactsMap:[I

.field private final m_ContactFields:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;",
            ">;"
        }
    .end annotation
.end field

.field private m_QueryToSearch:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_DISPLAY_NAME:I

    .line 29
    const/4 v0, 0x5

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_HOME_PHONE:I

    .line 30
    const/4 v0, 0x6

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_MOBILE_PHONE:I

    .line 31
    const/4 v0, 0x7

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_WORK_PHONE:I

    .line 32
    const/16 v0, 0x8

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_EMAIL_ADDR:I

    .line 33
    const/16 v0, 0xa

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_ADDRESS:I

    .line 34
    const/4 v0, 0x2

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_LAST_NAME:I

    .line 35
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_FIRST_NAME:I

    .line 36
    const/4 v0, 0x3

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_MIDDLE_NAME:I

    .line 37
    const/16 v0, 0x10

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_HONORIFIC_PREFIX:I

    .line 38
    const/16 v0, 0x11

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_HONORIFIC_SUFFIX:I

    .line 39
    const/4 v0, 0x4

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_NICKNAME:I

    .line 40
    const/16 v0, 0x13

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_FORMATTED_ADDR:I

    .line 41
    const/16 v0, 0xb

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_CITY:I

    .line 42
    const/16 v0, 0x14

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_REGION:I

    .line 43
    const/16 v0, 0xc

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_POSTAL_CODE:I

    .line 44
    const/16 v0, 0xd

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_COUNTRY:I

    .line 45
    const/16 v0, 0x19

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_IM:I

    .line 46
    const/16 v0, 0x24

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_NOTE:I

    .line 47
    const/16 v0, 0x9

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_URL:I

    .line 48
    const/16 v0, 0x20

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_ORGANISATION:I

    .line 49
    const/16 v0, 0x21

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_ORGANISATION_DEPT:I

    .line 50
    const/16 v0, 0x22

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_FIELD_ORGANISATION_TITLE:I

    .line 51
    const v0, 0x7fffffff

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->S3E_CONTACTS_UNLIMITED_MAX_ENTRIES:I

    .line 52
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    .line 73
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eContacts;->InitContactFieldMap()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;

    return-void
.end method

.method private AddQueryes(Ljava/lang/String;I)V
    .locals 7

    .prologue
    .line 122
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    .line 123
    if-nez v0, :cond_0

    .line 132
    :goto_0
    return-void

    .line 127
    :cond_0
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 129
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " OR "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    .line 131
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v2, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    iget-object v3, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;

    iget-object v4, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    iget v5, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eContacts;->CreateSearchQuery(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    goto :goto_0
.end method

.method private CreateSearchQuery(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "((mimetype = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\') AND ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " LIKE \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 103
    if-eqz p4, :cond_0

    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 107
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 108
    return-object v0
.end method

.method private UpdateUIDMap(Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 135
    const-string v0, "myapp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update contacts with query: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    new-array v0, v6, [I

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    .line 140
    if-nez p1, :cond_0

    move v2, v7

    .line 141
    :goto_0
    if-eqz v2, :cond_1

    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    .line 142
    :goto_1
    if-eqz v2, :cond_2

    const-string v0, "contact_id"

    move-object v8, v0

    .line 143
    :goto_2
    if-eqz v2, :cond_3

    const-string v3, "deleted = 0 "

    .line 146
    :goto_3
    :try_start_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v8, v2, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 148
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    if-nez v0, :cond_4

    move v0, v6

    .line 166
    :goto_4
    return v0

    :cond_0
    move v2, v6

    .line 140
    goto :goto_0

    .line 141
    :cond_1
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    goto :goto_1

    .line 142
    :cond_2
    const-string v0, "contact_id"

    move-object v8, v0

    goto :goto_2

    :cond_3
    move-object v3, p1

    .line 143
    goto :goto_3

    .line 150
    :catch_0
    move-exception v0

    move v0, v6

    .line 152
    goto :goto_4

    .line 158
    :cond_4
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    .line 159
    new-array v2, v1, [I

    iput-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    .line 160
    const-string v2, "myapp"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cursor: number of records: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    :goto_5
    if-ge v6, v1, :cond_5

    .line 163
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    aput v3, v2, v6

    .line 161
    add-int/lit8 v6, v6, 0x1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_5

    .line 165
    :cond_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    move v0, v7

    .line 166
    goto :goto_4
.end method


# virtual methods
.method InitContactFieldMap()Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x2

    const v4, 0x7fffffff

    const/4 v6, 0x1

    .line 76
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 77
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/nickname"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/email_v2"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    const/16 v0, 0x19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/im"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    const/16 v0, 0x24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/note"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    const/16 v0, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/website"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    const/16 v0, 0x13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    const/16 v0, 0xb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    const-string v3, "data7"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    const/16 v0, 0x14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    const-string v3, "data8"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    const-string v3, "data9"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    const/16 v0, 0xd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    const-string v3, "data10"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/name"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/name"

    const-string v3, "data2"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/name"

    const-string v3, "data3"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    const/16 v0, 0x11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/name"

    const-string v3, "data6"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/organization"

    const-string v3, "data1"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    const/16 v0, 0x21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/organization"

    const-string v3, "data5"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const/16 v0, 0x22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/organization"

    const-string v3, "data4"

    invoke-direct {v1, p0, v2, v3, v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/phone_v2"

    const-string v3, "data1"

    const-string v5, "data2"

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {v7, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/phone_v2"

    const-string v3, "data1"

    const-string v5, "data2"

    move-object v1, p0

    move v6, v9

    invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {v7, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    const-string v2, "vnd.android.cursor.item/phone_v2"

    const-string v3, "data1"

    const-string v5, "data2"

    const/4 v6, 0x3

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {v7, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    return-object v7
.end method

.method public QueryForContactRow(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mimetype = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "contact_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    if-eqz p3, :cond_0

    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 117
    :cond_0
    const-string v1, "myapp"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "query for row: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    return-object v0
.end method

.method public contactsCreate()I
    .locals 3

    .prologue
    .line 317
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 318
    const-string v1, "aggregation_mode"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 319
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    .line 320
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 324
    :goto_0
    return v0

    .line 322
    :catch_0
    move-exception v0

    .line 324
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public contactsDelete(I)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 331
    :try_start_0
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 332
    sget-object v2, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    int-to-long v4, p1

    invoke-static {v2, v4, v5}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v2

    .line 333
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 337
    :cond_0
    :goto_0
    return v0

    .line 335
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public contactsGetData(II)Landroid/database/Cursor;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 200
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    .line 201
    if-nez v3, :cond_0

    :goto_0
    return-object v4

    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;

    aput-object v6, v2, v5

    iget-object v5, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    iget-object v6, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    iget v3, v3, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I

    invoke-virtual {p0, p1, v5, v6, v3}, Lcom/ideaworks3d/marmalade/s3eContacts;->QueryForContactRow(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    goto :goto_0
.end method

.method public contactsGetField(III)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 241
    .line 245
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsGetData(II)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 246
    if-nez v1, :cond_1

    .line 260
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 262
    :cond_0
    :goto_0
    return-object v0

    .line 250
    :cond_1
    :try_start_1
    invoke-interface {v1, p3}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 252
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 260
    :cond_2
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 255
    :catch_0
    move-exception v1

    move-object v1, v0

    .line 260
    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_2
    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 255
    :catch_1
    move-exception v2

    goto :goto_1
.end method

.method public contactsGetMaxNumEntries(I)I
    .locals 2

    .prologue
    .line 212
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    .line 213
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget v0, v0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->maxEntries:I

    goto :goto_0
.end method

.method public contactsGetNumEntries(II)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 219
    .line 220
    const/4 v0, 0x0

    .line 223
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsGetData(II)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 224
    if-nez v2, :cond_2

    .line 235
    if-eqz v2, :cond_0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_0
    move v0, v1

    .line 237
    :cond_1
    :goto_0
    return v0

    .line 226
    :cond_2
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 227
    if-nez p2, :cond_4

    const/4 v3, 0x1

    if-ne v0, v3, :cond_4

    const/4 v3, 0x0

    :try_start_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v3

    if-nez v3, :cond_4

    .line 235
    if-eqz v2, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 230
    :catch_0
    move-exception v2

    move-object v4, v0

    move v0, v1

    move-object v1, v4

    .line 235
    :goto_1
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_2
    if-eqz v2, :cond_5

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 230
    :catch_1
    move-exception v0

    move v0, v1

    move-object v1, v2

    goto :goto_1

    :catch_2
    move-exception v1

    move-object v1, v2

    goto :goto_1
.end method

.method public contactsGetNumRecords()I
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    array-length v0, v0

    .line 188
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public contactsGetUID(I)I
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    array-length v0, v0

    if-lt p1, v0, :cond_1

    .line 194
    :cond_0
    const/4 v0, -0x1

    .line 196
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->contactsMap:[I

    aget v0, v0, p1

    goto :goto_0
.end method

.method public contactsSetField(Ljava/lang/String;III)Z
    .locals 10

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 266
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_ContactFields:Ljava/util/HashMap;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;

    .line 267
    if-nez v6, :cond_0

    .line 311
    :goto_0
    return v8

    .line 275
    :cond_0
    :try_start_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 276
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "_id"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "contact_id"

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-string v4, "mimetype"

    aput-object v4, v2, v3

    iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    iget-object v4, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    iget v5, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I

    invoke-virtual {p0, p2, v3, v4, v5}, Lcom/ideaworks3d/marmalade/s3eContacts;->QueryForContactRow(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 282
    :try_start_1
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 283
    iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v3, "mimetype"

    iget-object v4, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v3, "raw_contact_id"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 286
    iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 288
    iget-object v3, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    iget v4, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 290
    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    if-ne p4, v3, :cond_3

    .line 292
    :cond_2
    const-string v3, "myapp"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "insert row. type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    sget-object v3, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 309
    :goto_1
    if-eqz v1, :cond_6

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move v0, v7

    :goto_2
    move v8, v0

    .line 311
    goto/16 :goto_0

    .line 297
    :cond_3
    :try_start_2
    const-string v3, "myapp"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "update row. type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v6, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    invoke-interface {v1, p4}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 299
    sget-object v3, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const-string v4, "_id"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 300
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v2, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 303
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 309
    :goto_3
    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    move v0, v8

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v9

    :goto_4
    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_4

    .line 303
    :catch_1
    move-exception v0

    move-object v0, v9

    goto :goto_3

    :cond_5
    move v0, v8

    goto :goto_2

    :cond_6
    move v0, v7

    goto :goto_2
.end method

.method public contactsSimpleSearch(Ljava/lang/String;[IZ)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 170
    const-string v0, ""

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    move v0, v1

    .line 171
    :goto_0
    array-length v2, p2

    if-ge v0, v2, :cond_0

    .line 173
    aget v2, p2, v0

    invoke-direct {p0, p1, v2}, Lcom/ideaworks3d/marmalade/s3eContacts;->AddQueryes(Ljava/lang/String;I)V

    .line 171
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    const-string v2, ""

    if-ne v0, v2, :cond_1

    :goto_1
    return v1

    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts;->m_QueryToSearch:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eContacts;->UpdateUIDMap(Ljava/lang/String;)Z

    move-result v1

    goto :goto_1
.end method

.method public contactsUpdate()Z
    .locals 1

    .prologue
    .line 179
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eContacts;->UpdateUIDMap(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
