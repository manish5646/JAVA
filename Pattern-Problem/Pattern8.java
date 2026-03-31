import java.util.Scanner;

class Pattern8
{
    public static void main(String[] args)
    {
        System.out.print("Enter a value: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (2*n - 1); j++)
            {
                if(j == i || j == (2*n - i))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
