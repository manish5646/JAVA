public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {9, 3, 5, 1, 4, 8};
        System.out.println(search(a, 1));
    }

    public static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
