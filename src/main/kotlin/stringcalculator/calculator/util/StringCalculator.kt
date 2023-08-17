package stringcalculator.calculator.util

import stringcalculator.converter.StringToIntConverter
import stringcalculator.splitter.StringSplitter

object StringCalculator {
    fun calculate(input: List<String>, calculation: Calculation): Int {
        val converted = input.map(StringToIntConverter::convert)
        return calculation.calculate(converted)
    }
}