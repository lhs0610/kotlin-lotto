package lotto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.ints.shouldBeInRange
import io.kotest.matchers.shouldBe
import lotto.component.RandomIntGenerator

class RandomIntGeneratorTest : BehaviorSpec({
    Given("두 정수로 표현된 정수 범위 입력") {
        val rangeStart = 3
        val rangeEnd = 33
        When("주어진 인자로 RandomIntGenerator 의 generate 함수를 실행하면") {
            val generate = RandomIntGenerator.generate(rangeStart, rangeEnd)
            Then("입력된 범위에 포함되는 정수를 반환한다") {
                generate shouldBeInRange(IntRange(rangeStart, rangeEnd))
            }
        }
    }

    Given("두 정수로 표현된 정수 범위, 리스트 사이즈 입력") {
        val rangeStart = 3
        val rangeEnd = 33
        val size = 6
        When("주어진 인자로 RandomIntGenerator 의 generateList 함수를 실행하면") {
            val generate = RandomIntGenerator.generateList(rangeStart, rangeEnd, size)
            Then("입력된 범위에 포함되는 정수를 반환한다.") {
                generate.size shouldBe size
                generate.forAll {
                    it shouldBeInRange(rangeStart..rangeEnd)
                }
            }
        }
    }
})
