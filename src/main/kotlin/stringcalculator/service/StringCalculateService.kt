package stringcalculator.service

import stringcalculator.calculator.util.Add
import stringcalculator.calculator.util.StringCalculator
import stringcalculator.splitter.StringSplitter
import stringcalculator.validator.InputValidator

object StringCalculateService {

    private const val INTEGER_ZERO = 0
    fun sum(input: String?): Int {
        if (!InputValidator.validate(input)) return INTEGER_ZERO
        val split = StringSplitter.split(input!!)
        return StringCalculator.calculate(split, Add)
    }
}
