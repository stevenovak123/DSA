import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Steve";
        char target = 'u';
        // System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));

    }

    // * Search a character and return true or false

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // * search a char using the for-each method
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
