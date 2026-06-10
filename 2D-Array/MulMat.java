public class MulMat {
 
  public static void main(String[] args) {
    int[][]a={{2,3,4},
              {5,6,7},
              {8,9,10}};
    int [][]b={{5,6,2},
               {3,4,5},
               {1,2,3}};
    int[][]c=new int[a.length][a.length];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        for(int k=0;k<a[i].length;k++){
           c[i][j]=a[i][k]*a[j][k];
        }
      }
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<c[i].length;j++){
        System.out.print(c[i][j]+"\t");
      }
      System.out.println();
      }
    }
  }
    

    

       
  


