package stringcalculator.calculator.util

object Add : Calculation {
    override fun calculate(values: List<Int>): Int {
        return values.reduce { total, num -> total + num }
    }
}