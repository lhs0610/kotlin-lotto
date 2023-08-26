package lotto.config

import lotto.convertor.InputArgumentResolvers
import lotto.convertor.PurchaseAmountResolver
import lotto.convertor.WinnerNumbersResolver
import lotto.model.PurchaseAmountInput
import lotto.model.WinnerNumbersInput
import lotto.validator.InputArgumentValidators
import lotto.validator.PurchaseAmountValidator
import lotto.validator.WinnerNumbersValidator

object LottoConfiguration : Configuration {

    const val COUNT_MIN_MATCH = 3
    const val LOTTO_PRICE = 1000

    private val inputArgumentResolvers: InputArgumentResolvers = InputArgumentResolvers()
    private val inputArgumentValidators: InputArgumentValidators = InputArgumentValidators()

    init {
        inputArgumentResolvers.addResolver(PurchaseAmountInput::class, PurchaseAmountResolver)
        inputArgumentResolvers.addResolver(WinnerNumbersInput::class, WinnerNumbersResolver)

        inputArgumentValidators.addValidator(PurchaseAmountInput::class, PurchaseAmountValidator)
        inputArgumentValidators.addValidator(WinnerNumbersInput::class, WinnerNumbersValidator)
    }

    override fun getResolvers(): InputArgumentResolvers {
        return inputArgumentResolvers
    }

    override fun getValidators(): InputArgumentValidators {
        return inputArgumentValidators
    }
}
