package stringcalculator

fun interface Splitter<T> {
    fun split(input: T): List<T>
}