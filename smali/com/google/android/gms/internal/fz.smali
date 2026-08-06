.class public final Lcom/google/android/gms/internal/fz;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fz$a;
    }
.end annotation


# instance fields
.field public final errorCode:I

.field public final orientation:I

.field public final qA:Ljava/lang/String;

.field public final qB:Lcom/google/android/gms/internal/co;

.field public final qf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final qg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final qj:J

.field public final qy:Lcom/google/android/gms/internal/cl;

.field public final qz:Lcom/google/android/gms/internal/cu;

.field public final rN:Lcom/google/android/gms/internal/gv;

.field public final tA:Ljava/lang/String;

.field public final tH:J

.field public final tI:Z

.field public final tJ:J

.field public final tK:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final tN:Ljava/lang/String;

.field public final tx:Lcom/google/android/gms/internal/av;

.field public final vp:Lorg/json/JSONObject;

.field public final vq:Lcom/google/android/gms/internal/cm;

.field public final vr:Lcom/google/android/gms/internal/ay;

.field public final vs:J

.field public final vt:J

.field public final vu:Lcom/google/android/gms/internal/bq$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gv;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/co;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bq$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/gv;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;IJ",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/android/gms/internal/cl;",
            "Lcom/google/android/gms/internal/cu;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/cm;",
            "Lcom/google/android/gms/internal/co;",
            "J",
            "Lcom/google/android/gms/internal/ay;",
            "JJJ",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Lcom/google/android/gms/internal/bq$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fz;->tx:Lcom/google/android/gms/internal/av;

    iput-object p2, p0, Lcom/google/android/gms/internal/fz;->rN:Lcom/google/android/gms/internal/gv;

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/internal/fz;->qf:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/fz;->errorCode:I

    if-eqz p5, :cond_1

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/internal/fz;->qg:Ljava/util/List;

    if-eqz p6, :cond_2

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_2
    iput-object v2, p0, Lcom/google/android/gms/internal/fz;->tK:Ljava/util/List;

    iput p7, p0, Lcom/google/android/gms/internal/fz;->orientation:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/fz;->qj:J

    iput-object p10, p0, Lcom/google/android/gms/internal/fz;->tA:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/internal/fz;->tI:Z

    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->qy:Lcom/google/android/gms/internal/cl;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->qz:Lcom/google/android/gms/internal/cu;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->qA:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->vq:Lcom/google/android/gms/internal/cm;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->qB:Lcom/google/android/gms/internal/co;

    move-wide/from16 v0, p17

    iput-wide v0, p0, Lcom/google/android/gms/internal/fz;->tJ:J

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->vr:Lcom/google/android/gms/internal/ay;

    move-wide/from16 v0, p20

    iput-wide v0, p0, Lcom/google/android/gms/internal/fz;->tH:J

    move-wide/from16 v0, p22

    iput-wide v0, p0, Lcom/google/android/gms/internal/fz;->vs:J

    move-wide/from16 v0, p24

    iput-wide v0, p0, Lcom/google/android/gms/internal/fz;->vt:J

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->tN:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->vp:Lorg/json/JSONObject;

    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->vu:Lcom/google/android/gms/internal/bq$a;

    return-void

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_2
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/fz$a;Lcom/google/android/gms/internal/gv;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/co;Lcom/google/android/gms/internal/bq$a;)V
    .locals 31

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;

    iget-object v3, v2, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-object v5, v2, Lcom/google/android/gms/internal/fk;->qf:Ljava/util/List;

    move-object/from16 v0, p1

    iget v6, v0, Lcom/google/android/gms/internal/fz$a;->errorCode:I

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-object v7, v2, Lcom/google/android/gms/internal/fk;->qg:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-object v8, v2, Lcom/google/android/gms/internal/fk;->tK:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget v9, v2, Lcom/google/android/gms/internal/fk;->orientation:I

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-wide v10, v2, Lcom/google/android/gms/internal/fk;->qj:J

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;

    iget-object v12, v2, Lcom/google/android/gms/internal/fi;->tA:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-boolean v13, v2, Lcom/google/android/gms/internal/fk;->tI:Z

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->vq:Lcom/google/android/gms/internal/cm;

    move-object/from16 v17, v0

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-wide v0, v2, Lcom/google/android/gms/internal/fk;->tJ:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->lH:Lcom/google/android/gms/internal/ay;

    move-object/from16 v21, v0

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-wide v0, v2, Lcom/google/android/gms/internal/fk;->tH:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/internal/fz$a;->vs:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/internal/fz$a;->vt:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iget-object v0, v2, Lcom/google/android/gms/internal/fk;->tN:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->vp:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    move-object/from16 v18, p6

    move-object/from16 v30, p7

    invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/internal/fz;-><init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gv;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/co;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bq$a;)V

    return-void
.end method
