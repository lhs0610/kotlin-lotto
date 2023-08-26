package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import lotto.component.LottoResultAnalyzer
import lotto.domain.Lotto

class LottoResultAnalyzerTest : BehaviorSpec({
    Given("로또 리스트와 당첨 번호 리스트를 인자로 받는다.") {
        val lottoList = listOf(
            Lotto(setOf(1, 2, 3, 4, 5, 6)),
            Lotto(setOf(7, 8, 9, 10, 11, 12))
        )
        val winnerNumber = setOf(1, 2, 3, 10, 11, 12)
        When("주어진 인자로 LottoResultAnalyzer 의 analyzer 함수를 호출하면") {
            val analyze = LottoResultAnalyzer.analyze(lottoList, winnerNumber)
            println(analyze)
            Then("(3/4/5/6) 일치한 숫자별 당첨 개수와 수익률을 계산한 결과 객체를 반환한다") {
                analyze.rateOfReturn shouldBe 5.0
                analyze.getCountMatch(3) shouldBe 2
                analyze.getCountMatch(4) shouldBe 0
                analyze.getCountMatch(5) shouldBe 0
                analyze.getCountMatch(6) shouldBe 0
            }
        }
    }
})
