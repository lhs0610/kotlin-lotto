package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.ints.shouldBeInRange
import io.kotest.matchers.shouldBe
import lotto.component.LottoFactory645

class LottoFactoryTest : BehaviorSpec({
    Given("생성할 로또의 개수") {
        val rangeStart = LottoFactory645.RANGE_START
        val rangeEnd = LottoFactory645.RANGE_END
        val size = LottoFactory645.SIZE_NUMBERS
        val quantity = 5
        When("주어진 인자로 LottoFactory645 의 generate 함수를 실행하면 ") {
            val lottoList = LottoFactory645.generate(quantity)
            println(lottoList)
            Then("랜덤한 6가지 번호를 가진 로또를 quantity 만큼 보유한 리스트를 반환한다") {
                lottoList.size shouldBe quantity
                lottoList.forAll { it ->
                    it.numbers.size shouldBe size
                    it.numbers.forAll {
                        it shouldBeInRange(rangeStart..rangeEnd)
                    }
                }
            }
        }
    }
})
