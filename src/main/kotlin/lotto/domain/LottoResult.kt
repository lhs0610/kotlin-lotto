package lotto.domain

data class LottoResult(
    private val countMatch: Map<Int, Int>,
    val rateOfReturn: Double
) {
    fun getCountMatch(key: Int): Int {
        return countMatch.getOrDefault(key, DEFAULT_MATCH_COUNT)
    }

    companion object {
        const val DEFAULT_MATCH_COUNT = 0
    }
}