package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeInRange

class RandomIntGeneratorTest : BehaviorSpec({
    Given("두 정수로 표현된 정수 범위 입력") {
        val rangeStart = 3
        val rangeEnd = 33
        When("주어진 인자로 RandomIntGenerator 의 generate 함수를 실행하면") {
            val generate = RandomIntGenerator.generate(rangeStart, rangeEnd)
            Then("입력된 범위에 포함되는 정수를 반환한다.") {
                generate.shouldBeInRange(IntRange(rangeStart, rangeEnd))
            }
        }
    }
})
