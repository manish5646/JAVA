
//call by values
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] a = {1,4,5,3,2};

        m1(a);
        m2(a);

        System.out.println(Arrays.toString(a));
    }

    public static void m1(int[] a){
        a[0]++;
    }

    public static void m2(int[] c){
        c[c.length - 1]--;
    }
}
