package lotto.component

object RandomIntGenerator {
    /**
     * 제공받은 범위에 포함되는 무작위 정수를 반환한다.
     */
    fun generate(rangeStart: Int, rangeEnd: Int): Int {
        return (rangeStart..rangeEnd).random()
    }

    fun generateSet(rangeStart: Int, rangeEnd: Int, size: Int): Set<Int> {
        val candidate = (rangeStart..rangeEnd).toMutableList()
        val randomIntList = mutableSetOf<Int>()
        repeat(size) { randomIntList.add(candidate.removeAt(candidate.indices.random())) }
        return randomIntList.toSet()
    }
}
