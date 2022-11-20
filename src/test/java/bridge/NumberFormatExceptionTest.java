package bridge;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.*;

public class NumberFormatExceptionTest extends NsTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @DisplayName("다리 길이 입력 문구에 숫자가 아닐 때, 예외 발생")
    @Test
    void parseException() {
        assertSimpleTest(() -> {
            runException("asdasd");
            assertThat(output()).contains(ERROR_MESSAGE);
        });
    }

    @DisplayName("다리 길이 입력 문구에 숫자가 아닐 때, assertThatThrownBy를 이용해 예외 발생 확인")
    @Test
    void parseException_2() {
        String inputSize = "ff";

        assertThatThrownBy(() -> {
            BridgeSizeInputException.validate(inputSize);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_MESSAGE + " 숫자만 입력해주세요.");
    }

    @DisplayName("다리 길이 입력 문구에 제대로 입력했을 때, 작동 확인")
    @Test
    void validateBridgeSize() {
        String inputSize = "5";

        assertThatCode(() -> {
            BridgeSizeInputException.validate(inputSize);
        }).doesNotThrowAnyException();
    }
    
    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
