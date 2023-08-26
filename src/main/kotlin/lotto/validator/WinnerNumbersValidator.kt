package lotto.validator

import stringcalculator.splitter.StringSplitter

object WinnerNumbersValidator : InputArgumentValidator {
    override fun validate(input: String): Boolean {
        val split = StringSplitter.split(input)

        return checkDuplicate(split)
    }

    private fun checkDuplicate(split: List<String>): Boolean {
        val originSize = split.size
        val distinctSize = split.distinct().size

        return originSize == distinctSize
    }
}