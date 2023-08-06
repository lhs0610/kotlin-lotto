package stringcalculator

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class StringToIntConverterTest : BehaviorSpec ({

    Given("변환될 수 있는 정수 문자열") {
        val input = "3012"
        When("입력된 문자열을 인자로 StringToIntConverter의 convert 메서드를 호출하면") {
            val result: Int = StringToIntConverter.convert(input)
            Then("변환된 정수 결과값을 반환한다") {
                result shouldBe 3012
            }
        }
    }
})