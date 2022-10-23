package Level1;

public class Numbers {
    public static void main(String[] args) {
        // fun(5);
        // funRev(5);
        // funRevBoth(6);
        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(sumOfDigits(1234));
        System.out.println(productOfDigits(123));
        reverse1(4321);
        System.out.println(sum);

        System.out.println(reverse2(2345));
        System.out.println(palin(23432));
        System.out.println(countZeroes(39002011));
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.print(n);
    }

    static void funRevBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        funRevBoth(n - 1);
        System.out.print(n);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    static int sum(int n) {

        if (n <= 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int productOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }

    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }

    static int reverse2(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper1(n, digits);
    }

    private static int helper1(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n) {
        return n == rev(n);
    }

    static int countZeroes(int n) {
        return helperZero(n, 0);
    }

    private static int helperZero(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helperZero(n / 10, c + 1);
        }
        return helperZero(n / 10, c);
    }
}
