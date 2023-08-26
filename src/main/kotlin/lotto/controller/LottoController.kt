package lotto.controller

import lotto.config.Configuration
import lotto.service.LottoService
import lotto.view.InputView
import lotto.view.ResultView

object LottoController {
    fun startLottoShop(config: Configuration) {
        val inputView = InputView(config.getResolvers(), config.getValidators())

        val purchaseAmountInput = inputView.getPurchaseAmountInput()
        val lottoList = LottoService.purchaseLotto(purchaseAmountInput.value)
        ResultView.printLottoList(lottoList)

        val winnerNumbersInput = inputView.getWinnerNumbersInput()
        val lottoResult = LottoService.analyzeLottoResult(lottoList, winnerNumbersInput.value)
        ResultView.printLottoResult(lottoResult)
    }
}
