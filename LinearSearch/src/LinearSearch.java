public class LinearSearch {
    public static void main(String[] args) throws Exception {
        int[] nums = { 23, 43, 21, 567, 25, 0 };
        int target = 23 ;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    // * Search the array : return the index if item found
    // *Else if not found returnn -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }

    // * search and return the value
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;

    }

    // * search and return if true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;

    }
}
