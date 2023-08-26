package lotto.view

import lotto.constant.Message
import lotto.convertor.InputArgumentResolvers
import lotto.model.PurchaseAmountInput
import lotto.model.WinnerNumbersInput
import lotto.validator.InputArgumentValidators
import kotlin.reflect.KClass

class InputView(
    private val resolvers: InputArgumentResolvers,
    private val validators: InputArgumentValidators
) {

    fun getPurchaseAmountInput(): PurchaseAmountInput {
        return getCLIInput(PurchaseAmountInput::class, Message.INPUT_PARAMETER_PURCHASE_AMOUNT.message)
    }

    fun getWinnerNumbersInput(): WinnerNumbersInput {
        return getCLIInput(WinnerNumbersInput::class, Message.INPUT_PARAMETER_WINNER_NUMBERS.message)
    }

    private fun <T : Any> getCLIInput(type: KClass<T>, message: String): T {
        println(message)
        var input = readln()
        while (!validators.validate(type, input)) {
            input = readln()
        }
        return resolvers.resolve(type, input)
    }
}