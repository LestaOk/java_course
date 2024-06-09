import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.tink.homeWork1.CycleBitShift;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CycleBitShiftTest {
    @DisplayName("Check cycle bit shift to the right")
    @ParameterizedTest
    @MethodSource("rightCycleBitShift")
    public void rightCycleBitShift(int numToShift, int shift, int result) {
        assertEquals(CycleBitShift.rotateRight(numToShift, shift), result);
    }

    @DisplayName("Check cycle bit shift to the left")
    @ParameterizedTest
    @MethodSource("leftCycleBitShift")
    public void leftCycleBitShift(int numToShift, int shift, int result) {
        assertEquals(CycleBitShift.rotateLeft(numToShift, shift), result);
    }

    public static Stream<Arguments> rightCycleBitShift() {
        return Stream.of(
            arguments(0, 1, 0),
            arguments(8, 1, 4),
            arguments(9, 2, 6)
        );
    }

    public static Stream<Arguments> leftCycleBitShift() {
        return Stream.of(
                arguments(0, 1, 0),
                arguments(16, 1, 1),
                arguments(17, 2, 6)
        );
    }
}
