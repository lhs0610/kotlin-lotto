package stringcalculator

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : BehaviorSpec({
    Given("정수 문자열 리스트") {
        val input = listOf("1","2","650","230")
        When("주어진 리스트를 인자로 StringCalculator의 calculate 함수를 실행하면") {
            val result = StringCalculator.calculate(input, Add)
            Then("합을 반환한다") {
                result shouldBe 883
            }
        }
    }
})