package lotto

import lotto.config.LottoConfiguration
import lotto.controller.LottoController

fun main() {
    LottoController.startLottoShop(LottoConfiguration)
}