import java.util.Arrays;
public class UpperCase {
  public static void main(String[]args){
    String[] s={"ram","sita","krishne","radha"};
    for(int i=0;i<s.length;i++){
      s[i] =s[i].toUpperCase();
    }
    System.out.println(Arrays.toString(s));
  }
    }
