public class Duplicate {
  public static void main(String[] args) {
    int[]a={4,3,2,1,3,5,4,4,7,9,8,0,3};
    remove(a);
  }
  public static void remove(int[]a){
    for(int i=0;i<a.length;i++){
      boolean b=true;
      for(int j=0;j<i;j++){
        if(a[i]==a[j]){
          b=false;
          break;
        }
      }
      if (b){
        System.err.println(a[i]+" ");
      }
    }
  }
}
