public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = { 18, 2, 4, 56, 77, 9 };
        int target = 14;
        System.out.println(linearSearch(arr, target, 0, 2));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}