package lotto.service

import lotto.component.LottoFactory
import lotto.component.LottoFactory645
import lotto.component.LottoResultAnalyzer
import lotto.config.LottoConfiguration
import lotto.domain.Lotto
import lotto.domain.LottoResult

object LottoService {

    fun purchaseLotto(amount: Int) : List<Lotto> {
        val quantity = amount / LottoConfiguration.LOTTO_PRICE
        return LottoFactory645.generate(quantity)
    }

    fun analyzeLottoResult(lottoList: List<Lotto>, winnerNumber: Set<Int>): LottoResult {
        return LottoResultAnalyzer.analyze(lottoList, winnerNumber)
    }
}