public class App {
    public static void main(String[] args) throws Exception {
        String str = "Steve Dsouza";
        System.out.println(str);
        String palin = "abcba";
        System.out.println(isPalindrome(palin));

    }

    // * Palindrome program
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }

        }
        return true;
    }
}
