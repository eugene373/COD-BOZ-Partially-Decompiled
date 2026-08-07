package bolts

class AggregateException : Exception {
    private val errors: List<Exception>?

    constructor(errors: List<Exception>?) : super("There were multiple errors.") {
        this.errors = errors
    }

    fun getErrors(): List<Exception>? = errors
}
