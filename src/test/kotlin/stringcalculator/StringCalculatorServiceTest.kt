package stringcalculator

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import stringcalculator.service.StringCalculateService

class StringCalculatorServiceTest : BehaviorSpec({

    Given("쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열 입력") {
        val input = "23,4:6"
        When("주어진 리스트를 인자로 StringCalculatorService의 sum 함수를 호출하면") {
            val result = StringCalculateService.sum(input)
            Then("합을 반환한다") {
                result shouldBe 33
            }
        }
    }

    Given("커스텀 구분자 지정 및 해당 구분자로 분할되는 문자열 입력") {
        val customInput = "//;\n6;5;3"
        When("주어진 리스트를 인자로 StringCalculatorService의 sum 함수를 호출하면") {
            val result = StringCalculateService.sum(customInput)
            Then("합을 반환한다") {
                result shouldBe 14
            }
        }
    }

    Given("빈 문자열 입력") {
        val input = ""
        When("주어진 리스트를 인자로 StringCalculatorService의 sum 함수를 호출하면") {
            val result = StringCalculateService.sum(input)
            Then("정수 0을 반환한다") {
                result shouldBe 0
            }
        }
    }

    Given("null 입력") {
        val input = null
        When("주어진 리스트를 인자로 StringCalculatorService의 sum 함수를 호출하면") {
            val result = StringCalculateService.sum(input)
            Then("정수 0을 반환한다") {
                result shouldBe 0
            }
        }
    }

    Given("음수 포함 패턴 문자열 입력") {
        val illegalInput = "//;\n-6;5;3"
        When("주어진 리스트를 인자로 StringCalculatorService의 sum 함수를 호출하면") {
            Then("RuntimeException 예외가 발생한다") {
                shouldThrow<RuntimeException> {
                    StringCalculateService.sum(illegalInput)
                }
            }
        }
    }
})
