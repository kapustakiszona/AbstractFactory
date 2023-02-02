package adapterPattern.adapter

import adapterPattern.integer.IntegerValue
import adapterPattern.string.StringValue

class StringToIntegerAdapter(stringValue: StringValue) : IntegerValue() {

    private var stringValue = StringValue()

    init {
        this.stringValue = stringValue
    }

    override fun getA(): Int {
        return converting(stringValue.getA()!!)
    }

    override fun getB(): Int {
        return converting(stringValue.getB()!!)
    }


    fun converting(sValue: String): Int {
        return when (sValue) {
            "one" -> 1
            "two" -> 2
            "three" -> 3
            "four" -> 4
            "five" -> 5
            "six" -> 6
            "seven" -> 7
            "eight" -> 8
            "nine" -> 9
            "ten" -> 10
            else -> 0
        }
    }
}

