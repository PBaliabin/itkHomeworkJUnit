import java.util.List;

public class StringUtils {

    private final List<Character> vowelsList = List.of('a', 'e', 'i', 'o', 'u');

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        str = str.toLowerCase();

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public int countVowels(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowelsList.contains(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
