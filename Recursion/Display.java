class DisplayNum
{
public static void main(String[]args)
{
  display(10,20);
}
static void display(int start,int end){
 if (start > end) return;
System.out.println(start);
  display(start+1 ,end);
}
}
