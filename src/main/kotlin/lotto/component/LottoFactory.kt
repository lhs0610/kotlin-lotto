package lotto.component

import lotto.domain.Lotto

fun interface LottoFactory {
    fun generate(quantity: Int): List<Lotto>
}