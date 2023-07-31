package stringcalculator

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class StringSplitterTest: BehaviorSpec({

    Given("쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열 입력") {
        val input = "1,2:3"
        When("입력된 문자열을 인자로 StringSplitter의 split 메서드를 호출하면") {
            val split = StringSplitter.split(input): List<String>
            Then("분리된 문자열 목록이 반환된다") {
                split shouldBe listOf("1", "2", "3")
            }
        }
    }
})