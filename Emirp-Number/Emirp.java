import java.util.Scanner;

class Emirp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();

        if (isPrime(n)) {
            int rev = reverse(n);

            if (rev != n && isPrime(rev)) {
                System.out.println("Emirp Number");
            } else {
                System.out.println("Not Emirp");
            }
        } else {
            System.out.println("Not Emirp");
        }
    }

    // Prime check
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Reverse number
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}
