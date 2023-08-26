package lotto.constant

enum class Message(val message: String) {
    INPUT_PARAMETER_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    INPUT_PARAMETER_WINNER_NUMBERS("지난 주 당첨 번호를 입력해 주세요."),
    ERROR_MATCH_RESOLVER_NOT_EXIST("해당하는 타입에 매칭되는 변환기가 존재하지 않습니다."),
    ERROR_NULL_RESOLVER_OBJECT("인수 변환기가 null 입니다.");
}
