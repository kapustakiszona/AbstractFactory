package adapterPattern.string

open class StringValue {


    private var numberA: String? = null
    private var numberB: String? = null

    constructor()

    constructor(numberA: String, numberB: String) {
        this.numberA = numberA
        this.numberB = numberB
    }


    fun getA(): String? {
        return numberA
    }

    fun getB(): String? {
        return numberB
    }

}
