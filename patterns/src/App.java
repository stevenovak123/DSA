public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("pattern 1");
        pattern1(4);
        System.out.println("pattern 2");
        pattern2(4);
        System.out.println("pattern 3");
        pattern3(4);
        System.out.println("pattern 4");
        pattern4(4);
        System.out.println("pattern 5");
        pattern5(4);
        System.out.println("pattern 6");
        pattern6(4);
        System.out.println("pattern 7");
        pattern7(4);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int rows = 1; rows <= n; rows++) {

            for (int spaces = 0; spaces < n - rows; spaces++) {
                System.out.print(" ");
            }

            for (int col = rows; col >= 1; col--) {
                System.out.print(col);

            }
            for (int col = 2; col <= rows; col++) {
                System.out.print(col );
            }
            System.out.println();
        }
    }
}
