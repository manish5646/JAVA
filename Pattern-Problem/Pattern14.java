import java.util.Scanner;
class Pattern14
{
public static void main(String[]args)
{
System.out.print("Enter a Number");
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==n || j==n || (i+j)==(n+1))
{
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
