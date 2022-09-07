public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 76, 89, 100 };
        int target = 33;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        // * Go to the left */
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
        // * Go to the right */
        return search(arr, target, mid + 1, end);
    }
}
