package lotto.component

import lotto.domain.Lotto
import lotto.domain.LottoResult
import lotto.enums.MatchPrize
import kotlin.math.ceil

object LottoResultAnalyzer {

    private const val COUNT_MIN_MATCH = 3
    private const val LOTTO_PRICE = 1000

    fun analyze(lottoList: List<Lotto>, winnerNumber: Set<Int>): LottoResult {
        val eachCount = lottoList.groupingBy { it.numbers.intersect(winnerNumber).size }
            .eachCount()
            .filter { it.key >= COUNT_MIN_MATCH }

        return LottoResult(eachCount, calculateRateOfReturn(lottoList.size, eachCount))
    }

    private fun calculateRateOfReturn(lottoCount: Int, countMatch: Map<Int, Int>): Double {
        val reduce = countMatch.entries.map { MatchPrize.getPrizeMoneyByMatchCount(it.key) * it.value }
            .reduce { total, prize -> total + prize }
        val principal = LOTTO_PRICE * lottoCount

        return reduce.toDouble() / principal.toDouble()
    }
}