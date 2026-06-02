// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;

public class Even_Element {
   public Even_Element() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] % 2 == 0) {
         }
      }

      System.out.print(Arrays.toString(var1));
   }
}
