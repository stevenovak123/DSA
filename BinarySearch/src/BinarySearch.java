public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 2, 3, 4, 5, 6, 19, 20, 33, 99 };
        int ans = binarySearch(arr, 33);
        System.out.println(ans);
    }

    // * return the index
    // * return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // * find middle

            int mid = start + (end - start) / 2;
            /*
             * possible that(start+ end) value could exceed the java int when large start
             * and end values
             * hence using a modified version of the formula
             */
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // * answer is found
                return mid;
            }

        }

        return -1;
    }

}
