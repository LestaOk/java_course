import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.tink.homeWork1.PalindromeDescendant;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PalindromeDescendantTest {
    @DisplayName("Check if number or at least one of descendents is palindrome ")
    @ParameterizedTest
    @MethodSource("palindromeDescendant")
    public void checkIfNumberOrDescendantIsPalindrome(int numberToCheck, boolean result) {
        assertEquals(PalindromeDescendant.isPalindromeDescendant(numberToCheck), result);
    }

    public static Stream<Arguments> palindromeDescendant() {
        return Stream.of(
                arguments(11211230, true),
                arguments(13001120, true),
                arguments(11, true),
                arguments(4, false)
        );
    }
}
