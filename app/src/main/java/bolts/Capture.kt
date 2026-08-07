package bolts

class Capture<T> {
    private var value: T? = null

    constructor()

    constructor(value: T?) {
        this.value = value
    }

    fun get(): T? = value

    fun set(value: T?) {
        this.value = value
    }
}
