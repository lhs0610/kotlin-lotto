package lotto.convertor

import lotto.model.WinnerNumbersInput
import stringcalculator.splitter.StringSplitter

object WinnerNumbersResolver : InputArgumentResolver<WinnerNumbersInput> {
    override fun resolve(input: String): WinnerNumbersInput {
        val split = StringSplitter.split(input)
        val convert = split.map { it.toInt() }.toSet()
        return WinnerNumbersInput(convert)
    }
}
