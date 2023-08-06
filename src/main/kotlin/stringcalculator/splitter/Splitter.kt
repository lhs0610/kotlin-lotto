package stringcalculator.splitter

fun interface Splitter<T> {
    fun split(input: T): List<T>
}