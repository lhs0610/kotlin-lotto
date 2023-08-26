package lotto.config

import lotto.convertor.InputArgumentResolvers
import lotto.validator.InputArgumentValidators

interface Configuration {
    fun getResolvers(): InputArgumentResolvers
    fun getValidators(): InputArgumentValidators
}
