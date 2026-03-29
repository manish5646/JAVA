import java.util.Scanner;

class RangePrime {
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        for (int i = a; i <= b; i++) {

            if (i <= 1) continue;

            boolean flag = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
            }
        }
    }
}
