public class Character {
  public static void main(String[]args){
     String []s=new String[3];
     s[0]="Ram";
     s[1]="Sita";
     s[2]="Krishna";
  
     for(int i=0;i<s.length;i++){
      System.out.println(s[i]);
     }
     System.out.println("=======");

     for(int i=s.length-1;i>=0;i--){
      System.out.println(s[i]);
     }
  }
}
