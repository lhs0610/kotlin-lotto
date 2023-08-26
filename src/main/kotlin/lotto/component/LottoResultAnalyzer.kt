package lotto.component

import lotto.config.LottoConfiguration
import lotto.domain.Lotto
import lotto.domain.LottoResult
import lotto.enums.MatchPrize

object LottoResultAnalyzer {

    private const val DOUBLE_ZERO = 0.0

    fun analyze(lottoList: List<Lotto>, winnerNumber: Set<Int>): LottoResult {
        val eachCount = lottoList.groupingBy { it.numbers.intersect(winnerNumber).size }
            .eachCount()
            .filter { it.key >= LottoConfiguration.COUNT_MIN_MATCH }

        return LottoResult(eachCount, calculateRateOfReturn(lottoList.size, eachCount))
    }

    private fun calculateRateOfReturn(lottoCount: Int, countMatch: Map<Int, Int>): Double {
        if (countMatch.isEmpty()) {
            return DOUBLE_ZERO
        }

        val reduce = countMatch.entries.map { MatchPrize.getPrizeMoneyByMatchCount(it.key) * it.value }
            .reduce { total, prize -> total + prize }
        val principal = LottoConfiguration.LOTTO_PRICE * lottoCount

        return reduce.toDouble() / principal.toDouble()
    }
}
