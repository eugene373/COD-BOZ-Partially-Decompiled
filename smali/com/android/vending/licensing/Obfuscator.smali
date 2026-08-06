.class public interface abstract Lcom/android/vending/licensing/Obfuscator;
.super Ljava/lang/Object;
.source "Obfuscator.java"


# virtual methods
.method public abstract obfuscate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract unobfuscate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/licensing/ValidationException;
        }
    .end annotation
.end method
