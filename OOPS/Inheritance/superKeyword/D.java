class A {
  A (int i){
    System.out.println("A(int i)-const:"+i);
  }
}
class b extends A{
  B(){
    super(10);
    System.out.println("B()-const:");
  }
}C
  Class C extends B{
  C(){
    Super();
    System.out.println("C()-const:");
  }
}
public class Test{
  public static void main(String[]args){
    new C();
  }
}
