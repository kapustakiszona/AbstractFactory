package adapterPattern.integer

open class IntegerValue {
    private var numberA: Int = 0
    private var numberB: Int = 0

    constructor()

    constructor(numberA: Int, numberB: Int) {
        this.numberA = numberA
        this.numberB = numberB
    }


    open fun getA(): Int {
        return numberA
    }

    open fun getB(): Int {
        return numberB
    }

}

