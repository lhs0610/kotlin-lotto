package stringcalculator

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class StringCalculatorServiceTest : BehaviorSpec({

    Given("쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열 입력") {
        val input = "23,4:6"
        When("주어진 리스트를 인자로 StringCalculator의 sum 함수를 실행하면") {
            val result = StringCalculateService.sum(input)
            Then("합을 반환한다") {
                result shouldBe 33
            }
        }
    }

    Given("커스텀 구분자 지정 및 해당 구분자로 분할되는 문자열 입력") {
        val customInput = "//;\n6;5;3"
        When("주어진 리스트를 인자로 StringCalculator의 sum 함수를 실행하면") {
            val result = StringCalculateService.sum(customInput)
            Then("합을 반환한다") {
                result shouldBe 14
            }
        }
    }
})