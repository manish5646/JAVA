public class max {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 10};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        System.out.println(max);
    }
}
