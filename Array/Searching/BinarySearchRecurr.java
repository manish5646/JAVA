public class BinarySearchRecur {
  public static void main(String[] args) {
    int[]a={2,4,6,8,10,11};
    System.out.println(search(a,10,0,a.length-1));
  }
  public static int search(int[]a,int key,int st,int end){
    if(st>end)
    return-1;
    int mid=(st +end)/2;
    if(key==a[mid])
     return mid;
     else if(key < a[mid])
     return search(a,key,st,mid-1);
     else 
     return search (a,key,mid+1,end);
  }
}
