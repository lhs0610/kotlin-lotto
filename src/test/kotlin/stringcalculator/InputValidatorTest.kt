package stringcalculator

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import stringcalculator.validator.InputValidator

class InputValidatorTest : BehaviorSpec({

    Given("null 입력") {
        val input = null
        When("주어진 입력값을 인자로 InputValidator의 validate 함수를 호출하면") {
            val validate = InputValidator.validate(input)
            Then("합을 반환한다") {
                validate shouldBe false
            }
        }
    }

    Given("공백 문자열 입력") {
        val input = ""
        When("주어진 입력값을 인자로 InputValidator의 validate 함수를 호출하면") {
            val validate = InputValidator.validate(input)
            Then("합을 반환한다") {
                validate shouldBe false
            }
        }
    }
})
