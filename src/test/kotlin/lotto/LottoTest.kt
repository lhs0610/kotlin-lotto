package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.types.shouldBeInstanceOf

class LottoTest : BehaviorSpec({
    Given("no argument") {
        When("Lotto 객체를 생성하면") {
            val lotto = Lotto()
            Then("랜덤한 정수로 각 요소가 초기화된 리스트를 가진 Lotto 객체가 생성된다.") {
                lotto.numbers.forAll {
                    it.shouldBeInstanceOf<Int>()
                }
            }
        }
    }
})