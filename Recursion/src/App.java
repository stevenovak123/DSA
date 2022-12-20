public class App {
    public static void main(String[] args) throws Exception {
        // * Print first 5 numbers using recursion
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        print(n + 1);
    }

}
