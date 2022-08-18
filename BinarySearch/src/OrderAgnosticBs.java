public class OrderAgnosticBs {
    public static void main(String[] args) {
        // int[] arr = { 1, 3, 4, 6, 7, 8, 9, 22, 33, 44, 55 };
        int[] arr = { 55, 44, 33, 22, 9, 8, 7, 6, 4, 3, 1 };
        int target = 22;
        int ans = orderAgnBinary(arr, target);
        System.out.println(ans);
    }

    // * rerturn index and -1 if index does not exist
    static int orderAgnBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // * find ascending or descending value
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            // * find middle
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}