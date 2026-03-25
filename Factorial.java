import java.util.Scanner;
class Factorial
{
public static void main(String[]args)
{
System.out.println("enter a num");
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
 int prod=1;
for(int i=1;i<=n;i++)
{
prod*=i;
}
System.out.println(prod);
}
}