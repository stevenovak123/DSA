public class CeilAndFloor {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8, 9, 22, 33, 44, 55 };
        int target = 0;
        int ceil = ceil(arr, target);
        int floor = floor(arr, target);
        System.out.println("Ciel is " + ceil);
        System.out.println("Floor is " + floor);
    }

    // * return index of the smallest no >= index
    static int ceil(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        // * if target is greater than greatest number of the array

        while (start <= end) {
            // * find middle

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // * answer is found
                return mid;
            }

        }

        return start;
    }

    // * return index of the smallest no <= index
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // * find middle

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // * answer is found
                return mid;
            }

        }
        return end;
    }
}