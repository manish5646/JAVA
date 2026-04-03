import java.util.Scanner;
class M
{
public static void main(String[]args)
{
System.out.print("enter a number");
Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
for (int i=1;i<=n;i++)
{
for (int j=1;j<=n;j++)
{
if(j==1 || j==n || (i==j && (i<=n/2+1)) || ((i+j)==(n+1) && (i<=n/2+1)) )
{
System.out.print("*");
}
else
System.out.print(" ");
}
System.out.println();
}
}
}

