Class A{
  int i=10;
  public static void m1(){
    System.out.println("m1()-A");
  }
}
Class B extends A{
   int i=20 ;
  @override
    public void m1(){
    System.out.println("m1()-B");
  }
}
public  class Test{
  public static void main(String[]args){
    Aa=new B();
    System.out.println(a.i);//10
    a.m1();//m1()-A
    B.b=new B{
      System.out.println(b.i);//20
      b.m1();//m1()-B
      A a1=new B();//upcasting from B to A
      System.out.println(a1.i);//10
      a1.m1();//m1()-B//late binding is happening here
    }
  }
