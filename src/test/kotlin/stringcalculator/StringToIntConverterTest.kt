package stringcalculator

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import stringcalculator.converter.StringToIntConverter

class StringToIntConverterTest : BehaviorSpec ({

    Given("변환될 수 있는 정수 문자열") {
        val input = "3012"
        When("입력된 문자열을 인자로 StringToIntConverter의 convert 메서드를 호출하면") {
            val result = StringToIntConverter.convert(input)
            Then("변환된 정수 결과값을 반환한다") {
                result shouldBe 3012
            }
        }
    }

    Given("음수 문자열") {
        val input = "-3012"
        When("입력된 문자열을 인자로 StringToIntConverter의 convert 메서드를 호출하면") {
            Then("RuntimeException 예외가 발생한다") {
                shouldThrow<RuntimeException> {
                    StringToIntConverter.convert(input)
                }
            }
        }
    }
})