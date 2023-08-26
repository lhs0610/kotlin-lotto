package lotto.component

import lotto.domain.Lotto

object LottoFactory645 : LottoFactory {

    const val RANGE_START = 1
    const val RANGE_END = 45

    const val SIZE_NUMBERS = 6

    override fun generate(quantity: Int): List<Lotto> {
        val lottoList = mutableListOf<Lotto>()
        repeat(quantity) {
            lottoList.add(
                Lotto(
                    RandomIntGenerator.generateSet(
                        rangeStart = RANGE_START,
                        rangeEnd = RANGE_END,
                        size = SIZE_NUMBERS
                    )
                )
            )
        }
        return lottoList.toList()
    }
}
