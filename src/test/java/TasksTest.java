import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.tink.homeWork1.Tasks;

import java.util.stream.Stream;

public class TasksTest {

    @DisplayName("Convert duration to seconds")
    @ParameterizedTest
    @MethodSource("durationStringProvider")
    public void convertionCorrectStringToSeconds(String duration, int result){
        assertEquals(Tasks.minutesToSeconds(duration), result);
    }

    @DisplayName("Check count of digits without using String type")
    @ParameterizedTest
    @MethodSource("numbersProvider")
    public void checkCorrectCountReturnsOnIntValue(int checkedNumber, int count) {
        assertEquals(Tasks.countDigits(checkedNumber), count);
    }

    @DisplayName("Check if array is nestable within another")
    @ParameterizedTest
    @MethodSource("nestableArrays")
    public void checkArraysNestability(int[] m1, int[] m2, boolean result) {
        assertEquals(Tasks.isNestable(m1, m2), result);
    }

    @DisplayName("")
    @ParameterizedTest
    @MethodSource("fixedString")
    public void checkReplacementIntoString(String stringToFix, String result) {
        assertEquals(Tasks.fixString(stringToFix), result);
    }

    public static Stream<Arguments> durationStringProvider() {
        return Stream.of(
                arguments("01:00", 60),
                arguments("13:56", 836),
                arguments("10:60", -1),
                arguments("10:-10", -1),
                arguments("-10:20", -1),
                arguments("abs:11", -1),
                arguments(":", -1),
                arguments("12345678901:", -1)
        );
    }

    public static Stream<Arguments> numbersProvider() {
        return Stream.of(
                arguments(0, 1),
                arguments(4666, 4)
        );
    }

    public static Stream<Arguments> nestableArrays() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4}, new int[]{0, 6}, true),
                arguments(new int[]{3, 1}, new int[]{4, 0}, true),
                arguments(new int[]{9, 9, 8}, new int[]{8, 9}, false),
                arguments(new int[]{1, 2, 3, 4}, new int[]{2, 3}, false ),
                arguments(new int[]{}, new int[]{1}, false),
                arguments(new int[]{1}, new int[]{}, false),
                arguments(new int[]{3, 1}, new int[]{2, 0}, false),
                arguments(new int[]{1, 2}, new int[]{1, 2}, false)
        );
    }

    public static Stream<Arguments> fixedString() {
        return Stream.of(
                arguments("123456", "214365"),
                arguments("hTsii  s aimex dpus rtni.g", "This is a mixed up string."),
                arguments("badce", "abcde"),
                arguments("", "")
        );
    }
}
