package com.ideaworks3d.marmalade

// Auto-emitted from smali source: SuspendResumeEvent.java.
// 4 fields, 4 methods.

enum class SuspendResumeEvent_EventType {
    RESUME,
    SHUTDOWN,
    SUSPEND,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.ideaworks3d.marmalade.SuspendResumeEvent.EventType { return TODO("body: (Ljava/lang/String;)Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.ideaworks3d.marmalade.SuspendResumeEvent.EventType> { return TODO("body: ()[Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->$VALUES:[Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         invoke-virtual {v0}, [Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         return-object v0
    */

    }
}
