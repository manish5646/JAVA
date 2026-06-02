import java.util.Arrays;
public class SumOfString {
  public static void main(String[]args){
    int []a={1,2,3};
    int []b={1,2,3};
    int []c=new int[a.length];
    for(int i=0;i<a.length;i++){
      c[i]=a[i]+b[i];
    }
    System.out.print(Arrays.toString(c));
    }
  }

