class SumOfDigits
{
public static void main(String[]args)
{
System.out.println(sum(12345));
}
static int sum(int n){
 if (n<=9) return n;
return sum(n/10) + (n%10);
}
}
