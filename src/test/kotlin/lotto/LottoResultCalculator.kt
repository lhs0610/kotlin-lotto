package lotto

import io.kotest.core.spec.style.BehaviorSpec
import lotto.component.LottoResultAnalyzer
import lotto.domain.Lotto
import lotto.enums.MatchPrize

class LottoResultAnalyzerTest : BehaviorSpec({
    Given("로또 리스트와 당첨 번호 리스트를 인자로 받는다.") {
        val lottoList = listOf(
            Lotto(listOf(1, 2, 3, 4, 5, 6)),
            Lotto(listOf(7, 8, 9, 10, 11, 12))
        )
        val winnerNumber = listOf(1, 2, 3, 10, 11, 12)
        When("주어진 인자로 LottoResultAnalyzer 의 analyzer 함수를 호출하면") {
            val analyze = LottoResultAnalyzer.analyze(lottoList, winnerNumber)
            Then("(3/4/5/6) 일치한 숫자별 당첨 개수와 수익률을 계산한 결과 객체를 반환한다") {
                analyze.rateOfReturn shouldBe 5.0
                analyze.matchCount[MatchPrize.THREE] shouldBe 2
                analyze.matchCount[MatchPrize.FOUR] shouldBe 0
                analyze.matchCount[MatchPrize.FIVE] shouldBe 0
                analyze.matchCount[MatchPrize.SIX] shouldBe 0
            }
        }
    }
})