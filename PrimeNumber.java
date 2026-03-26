import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("enter a number");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        boolean flag = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (n >= 2 && flag) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}