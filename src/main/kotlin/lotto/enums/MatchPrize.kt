package lotto.enums

enum class MatchPrize(
    val matchCount: Int,
    val prizeMoney: Int
) {
    THREE(3, 5000),
    FOUR(4, 50000),
    FIVE(5, 1500000),
    SIX(6, 2000000000);

    companion object {
        private val mapping = values().associate { it.matchCount to it.prizeMoney }

        fun getPrizeMoneyByMatchCount(matchCount: Int): Int {
            require(mapping.containsKey(matchCount))

            return mapping[matchCount]!!
        }
    }
}