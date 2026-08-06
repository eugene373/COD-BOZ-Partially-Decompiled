.class Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;
.super Ljava/lang/Object;
.source "s3eContacts.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eContacts;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "FieldItem"
.end annotation


# instance fields
.field public fieldType:I

.field public fieldTypeColumn:Ljava/lang/String;

.field public maxEntries:I

.field public mimeType:Ljava/lang/String;

.field public searchColumn:Ljava/lang/String;

.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eContacts;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 56
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->this$0:Lcom/ideaworks3d/marmalade/s3eContacts;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    .line 68
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;

    .line 69
    iput v1, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->maxEntries:I

    .line 70
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    .line 71
    iput v1, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I

    .line 57
    iput-object p2, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->mimeType:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->searchColumn:Ljava/lang/String;

    .line 59
    iput p4, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->maxEntries:I

    .line 60
    return-void
.end method

.method public constructor <init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;-><init>(Lcom/ideaworks3d/marmalade/s3eContacts;Ljava/lang/String;Ljava/lang/String;I)V

    .line 64
    iput-object p5, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldTypeColumn:Ljava/lang/String;

    .line 65
    iput p6, p0, Lcom/ideaworks3d/marmalade/s3eContacts$FieldItem;->fieldType:I

    .line 66
    return-void
.end method
