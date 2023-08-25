package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.ints.shouldBeInRange
import io.kotest.matchers.types.shouldBeInstanceOf
import lotto.component.RandomIntGenerator
import lotto.domain.Lotto

class LottoTest : BehaviorSpec({
    Given("두 정수로 표현된 정수 범위, 리스트 사이즈 입력") {
        val rangeStart = 3
        val rangeEnd = 33
        val size = 6
        When("주어진 인자로 RandomIntGenerator 함수의 반환값을 생성자 인수로 Lotto 객체를 생성하면") {
            val lotto = Lotto(RandomIntGenerator.generateList(rangeStart = rangeStart, rangeEnd = rangeEnd, size = size))
            Then("범위에 포함되는 랜덤한 정수로 각 요소가 초기화된 리스트를 가진 Lotto 객체가 생성된다") {
                lotto.numbers.forAll {
                    it.shouldBeInRange(rangeStart..rangeEnd)
                }
            }
        }
    }
})
