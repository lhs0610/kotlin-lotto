package stringcalculator.calculator.util

import stringcalculator.converter.StringToIntConverter

object StringSummaryCalculator: Calculator<String> {

    override fun calculate(input: List<String>): Int {
        val converted = input.map(StringToIntConverter::convert)
        return converted.reduce { total, num -> total + num }
    }
}