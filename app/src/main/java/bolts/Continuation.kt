package bolts

fun interface Continuation<TTaskResult, TContinuationResult> {
    @Throws(Exception::class)
    fun then(task: Task<TTaskResult>): TContinuationResult?
}
