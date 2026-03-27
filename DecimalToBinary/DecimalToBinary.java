import java.util.Scanner;
class DecimalToBinary
{
public static void main(String[]args)
{
System.out.println("enter Two number");
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int res=0;
int i=1;
while(n>0){
int bit=n%2;
 res=bit*i + res;
n/=2;
i*=10;
}
System.out.println(res);
}
}
