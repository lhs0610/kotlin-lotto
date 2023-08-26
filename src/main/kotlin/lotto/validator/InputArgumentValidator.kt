package lotto.validator

fun interface InputArgumentValidator {
    fun validate(input: String): Boolean
}
