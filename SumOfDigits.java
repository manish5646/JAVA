import java.util.Scanner;
class SumOfDigits
{
public static void main(String[]args)
{
System.out.println("enter a number");
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();

int sum=0;
while(n>0)
{
sum+=n%10;
n/=10;
}
System.out.println(sum);
}
}