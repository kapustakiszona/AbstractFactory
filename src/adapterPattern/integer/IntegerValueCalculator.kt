package adapterPattern.integer

class IntegerValueCalculator(integerValue: IntegerValue) {

    private var integerValue: IntegerValue? = null

    init {
        this.integerValue = integerValue
    }

    fun calculate(): Int {
        val a = integerValue!!.getA()
        val b = integerValue!!.getB()
        return a.plus(b)
    }

}