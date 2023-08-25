package lotto.component

object RandomIntGenerator {
    /**
     * 제공받은 범위에 포함되는 무작위 정수를 반환한다.
     */
    fun generate(rangeStart: Int, rangeEnd: Int): Int {
        return (rangeStart..rangeEnd).random()
    }

    fun generateList(rangeStart: Int, rangeEnd: Int, size: Int): List<Int> {
        val randomIntList = mutableListOf<Int>()
        repeat(size) { randomIntList.add(RandomIntGenerator.generate(rangeStart = rangeStart, rangeEnd = rangeEnd)) }
        return randomIntList.toList()
    }
}
