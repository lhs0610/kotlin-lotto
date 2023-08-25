package stringcalculator.calculator.util

fun interface Calculator<T> {

    fun calculate(input: List<T>): Int
}