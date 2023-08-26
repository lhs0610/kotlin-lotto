package lotto.view

import lotto.domain.Lotto
import lotto.domain.LottoResult
import lotto.enums.MatchPrize

object ResultView {

    private const val RESULT_PRINT_START_RANGE = 3
    private const val RESULT_PRINT_END_RANGE = 6

    fun printLottoList(lottoList: List<Lotto>) {
        println("${lottoList.size}개를 구매했습니다.")
        lottoList.forEach { println(it.numbers) }
        println()
    }

    fun printLottoResult(result: LottoResult) {
        println()
        println("당첨 통계")
        println("--------")
        (RESULT_PRINT_START_RANGE..RESULT_PRINT_END_RANGE).forEach {
            println("${it}개 일치 (${MatchPrize.getPrizeMoneyByMatchCount(it)}) => ${result.getCountMatch(it)}개")
        }
        println("총 수익률은 ${result.rateOfReturn}입니다.")
    }

}