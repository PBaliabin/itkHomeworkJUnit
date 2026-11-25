import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
