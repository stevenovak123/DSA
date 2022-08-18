import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5 },
                { 2, 4, 6 },
                { 18, 12, 66, 44 },
                { 33, 55, 23, 99 }
        };
        int target = 99;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(searchMax(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }

            }
        }
        return new int[] { -1, -1 };
    }

    // * max of the 2d array
    static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }

            }
        }
        return max;
    }

}
