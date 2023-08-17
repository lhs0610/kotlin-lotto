package stringcalculator.validator

object InputValidator {

    fun validate(input: String?): Boolean {
        return !(input.isNullOrEmpty() || input.isBlank())
    }
}
