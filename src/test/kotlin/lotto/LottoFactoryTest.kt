package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeInRange
import io.kotest.matchers.shouldBe

class LottoFactoryTest : BehaviorSpec({
    Given("생성할 로또의 개수") {
        val rangeStart = 3
        val rangeEnd = 33
        val size = 6
        val count = 5
        When("주어진 인자로 LottoFactory645 의 generate 함수를 실행하면 ") {
            val lottoList = LottoFactory645.generate(count)
            Then("") {
                lottoList.size shouldBes count
                lottoList.forAll {
                    it.numbers.size shouldBe size
                    it.numbers.forAll {
                        it shouldBeInRange(rangeStart..rangeEnd)
                    }
                }
            }
        }
    }
})