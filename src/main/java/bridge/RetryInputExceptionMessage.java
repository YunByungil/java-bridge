package bridge;

public enum RetryInputExceptionMessage {

    SMALL_LETTER_EXCEPTION_MESSAGE("[ERROR] 대문자만 입력가능합니다."),
    NOT_SUITABLE_ALPHABET_EXCEPTION_MESSAGE("[ERROR] U와 D만 입력가능합니다.");

    public String retryInputExceptionMessage;

    RetryInputExceptionMessage(String retryInputExceptionMessage) {
        this.retryInputExceptionMessage = retryInputExceptionMessage;
    }

    public String getRetryInputExceptionMessage() {
        return retryInputExceptionMessage;
    }
}
