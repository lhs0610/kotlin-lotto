package lotto.convertor

fun interface InputArgumentResolver<T> {
    fun resolve(input: String): T
}
