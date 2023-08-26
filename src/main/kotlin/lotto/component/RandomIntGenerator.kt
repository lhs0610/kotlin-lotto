package lotto.component

object RandomIntGenerator {

    private const val SUBLIST_START_INDEX = 0

    /**
     * 제공받은 범위에 포함되는 무작위 정수를 반환한다.
     */
    fun generate(rangeStart: Int, rangeEnd: Int): Int {
        return (rangeStart..rangeEnd).random()
    }

    fun generateSet(rangeStart: Int, rangeEnd: Int, size: Int): Set<Int> {
        return (rangeStart..rangeEnd).toList()
            .shuffled()
            .subList(SUBLIST_START_INDEX, size)
            .toSet()
    }
}
