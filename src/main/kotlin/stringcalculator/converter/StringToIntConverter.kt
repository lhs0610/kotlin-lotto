package stringcalculator.converter

object StringToIntConverter {

    private const val ERROR_INPUT_CANNOT_BE_NEGATIVE = "입력값은 음수일 수 없습니다."
    private const val MIN_VALUE = 0
    fun convert(input: String): Int {
        val value = input.toInt()
        require(value >= MIN_VALUE) { ERROR_INPUT_CANNOT_BE_NEGATIVE }
        return value
    }
}
