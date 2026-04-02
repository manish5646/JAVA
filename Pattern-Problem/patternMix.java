import java.util.Scanner;

class PatternMix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int num = 1;
        char ch = 'A';

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i % 2 != 0)   // Odd row → numbers
                {
                    System.out.print(num + " ");
                    num++;
                }
                else             // Even row → characters
                {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
