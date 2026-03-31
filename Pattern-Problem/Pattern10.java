import java.util.Scanner;

class Pattern10
{
    public static void main(String[] args)
    {
        System.out.print("Enter value: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i >= 1; i--)   // rows
        {
            for (int j = i; j >= 1; j--)   // decreasing j
            {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
