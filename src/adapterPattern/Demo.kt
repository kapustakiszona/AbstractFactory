package adapterPattern

import adapterPattern.adapter.StringToIntegerAdapter
import adapterPattern.integer.IntegerValue
import adapterPattern.integer.IntegerValueCalculator
import adapterPattern.string.StringValue

fun main() {
    val integerValue = IntegerValue(4, 5)
    val integerValueCalculator = IntegerValueCalculator(integerValue)
    println("Integer object contains 2 values with sum ${integerValueCalculator.calculate()}")

    val stringValue = StringValue("two", "five")
    val stringToIntegerAdapter = StringToIntegerAdapter(stringValue)
    val result = IntegerValueCalculator(stringToIntegerAdapter)
    println("String object contains 2 values with sum ${result.calculate()}")


}