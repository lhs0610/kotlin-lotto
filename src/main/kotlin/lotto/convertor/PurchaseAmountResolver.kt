package lotto.convertor

import lotto.model.PurchaseAmountInput

object PurchaseAmountResolver : InputArgumentResolver<PurchaseAmountInput> {
    override fun resolve(input: String): PurchaseAmountInput {
        return PurchaseAmountInput(input.toInt())
    }
}