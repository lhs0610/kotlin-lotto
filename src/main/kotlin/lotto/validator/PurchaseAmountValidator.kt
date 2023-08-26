package lotto.validator

object PurchaseAmountValidator : InputArgumentValidator {

    override fun validate(input: String): Boolean {
        return checkStringIsNumeric(input)
    }

    private fun checkStringIsNumeric(input: String): Boolean {
        val toIntOrNull = input.toIntOrNull()
        return toIntOrNull is Int
    }
}