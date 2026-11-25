public class StringUtils {

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
}
