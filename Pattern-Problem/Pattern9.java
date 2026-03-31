import java.util.Scanner;

class Pattern9
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
                if(i == j || (i+j) == (n+1))
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
