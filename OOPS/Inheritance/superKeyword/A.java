class A{
  int i=10;
  static int j=20;
}
class B{
  int i=30;
  public void m1(){
    System.out.println(i);
    System.out.println(super.i);
    system.out.println(j);
  }
  public class Test(){
    public static void main(String[]args){
      B.b=new B();
      b.m1();
    }
  }
