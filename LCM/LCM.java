import java.util.Scanner;
class LCM
{
public static void main(String[]args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter two number");
int a=scn.nextInt();
int b=scn.nextInt();

int n=a>b?a:b;
int i=n;
while(true){
if (n%a==0 && n%b==0)
break;
n+=i;
}
System.out.println(n);
}
}
