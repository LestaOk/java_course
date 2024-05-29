import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.tink.homeWork1.KaprekarNumber;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KaprekarNumberTest {

    @DisplayName("Count number of steps to receive Kaprekar number")
    @ParameterizedTest
    @MethodSource("kaprekarNumber")
    public void kaprekarNumberCountStepsTest(int numToCheck, int result) {
        assertEquals(KaprekarNumber.getCountToKaprekarNumber(numToCheck), result);
    }

    public static Stream<Arguments> kaprekarNumber() {
        return Stream.of(
                arguments(6621, 5),
                arguments(6174, 0),
                arguments(999, -1),
                arguments(10000, -1),
                arguments(1111, -1)
        );
    }
}
