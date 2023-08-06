package stringcalculator.service

import stringcalculator.calculator.util.Add
import stringcalculator.calculator.util.StringCalculator
import stringcalculator.splitter.StringSplitter

object StringCalculateService {
    fun sum(input: String): Int {
        val split = StringSplitter.split(input)
        return StringCalculator.calculate(split, Add)
    }
}