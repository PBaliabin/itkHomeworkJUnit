import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class StringUtilsTests {

    @Test
    public void stringIsPalindromeTest() {
        StringUtils stringUtils = new StringUtils();

        boolean result = stringUtils.isPalindrome("level");

        Assertions.assertTrue(result);
    }

    @Test
    public void stringIsNotPalindromeTest() {
        StringUtils stringUtils = new StringUtils();

        boolean result = stringUtils.isPalindrome("hello");

        Assertions.assertFalse(result);
    }

    @Test
    public void emptyStringIsPalindromeTest() {
        StringUtils stringUtils = new StringUtils();

        boolean result = stringUtils.isPalindrome("");

        Assertions.assertTrue(result);
    }

    @Test
    public void nullStringIsNotPalindromeTest() {
        StringUtils stringUtils = new StringUtils();

        boolean result = stringUtils.isPalindrome(null);

        Assertions.assertFalse(result);
    }

    @Test
    public void mixedCaseIsPalindromeTest() {
        StringUtils stringUtils = new StringUtils();

        boolean result = stringUtils.isPalindrome("RaceCar");

        Assertions.assertTrue(result);
    }

    static List<Arguments> testStrings() {
        return List.of(
                Arguments.of("hello", 2),
                Arguments.of("xyz", 0),
                Arguments.of("", 0),
                Arguments.of(null, 0),
                Arguments.of("AEIOU", 5)
        );
    }
    @ParameterizedTest
    @MethodSource("testStrings")
    public void countVowelsTest(String input, int count) {
        StringUtils stringUtils = new StringUtils();

        int result = stringUtils.countVowels(input);

        Assertions.assertEquals(count, result);
    }
}
