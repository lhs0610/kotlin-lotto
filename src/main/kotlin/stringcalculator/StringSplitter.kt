package stringcalculator

object StringSplitter: Splitter<String> {

    private const val DELIMITER_COMMA = ","
    private const val DELIMITER_COLON = ":"
    override fun split(input: String): List<String> {
        return input.split(DELIMITER_COLON, DELIMITER_COMMA)
    }
}