package stringcalculator.splitter

object StringSplitter : Splitter<String> {

    private const val DELIMITER_COMMA = ","
    private const val DELIMITER_COLON = ":"

    private const val REGEX_CUSTOM_DELIMITER = "//(.)\n"
    private const val REGEX_ALL_WORD = "(.*)"
    private const val REGEX_CUSTOM_INPUT = REGEX_CUSTOM_DELIMITER + REGEX_ALL_WORD

    private const val INDEX_CUSTOM_DELIMITER = 1
    private const val INDEX_REAL_INPUT = 2

    private val customInputRegex = Regex(REGEX_CUSTOM_INPUT)

    override fun split(input: String): List<String> {
        if (hasCustomPattern(input)) {
            return customDelimiterSplit(input)
        }

        return defaultSplit(input)
    }

    private fun defaultSplit(input: String): List<String> {
        return input.split(DELIMITER_COMMA, DELIMITER_COLON)
    }

    private fun customDelimiterSplit(input: String): List<String> {
        val matchResult = customInputRegex.find(input)
        return matchResult?.let {
            val customDelimiter = it.groupValues[INDEX_CUSTOM_DELIMITER]
            val realInput = it.groupValues[INDEX_REAL_INPUT]

            realInput.split(customDelimiter)
        } ?: emptyList()
    }

    private fun hasCustomPattern(input: String): Boolean {
        val matchResult = Regex("//(.)\n").find(input)
        return matchResult != null
    }
}
