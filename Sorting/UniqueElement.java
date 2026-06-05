public class UniqueElement { 
  public static void main(String[] args) {
    int[]a={2,1,3,1,2,4};
    remove(a);
  }
  public static void remove(int[] a) {

    for (int i = 0; i < a.length; i++) {

        int count = 0;

        for (int j = 0; j < a.length; j++) {

            if (a[i] == a[j]) {
                count++;
            }
        }

        if (count == 1) {
            System.out.print(a[i] + " ");
        }
    }
}
}
