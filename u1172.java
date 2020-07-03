import java.util.Scanner;
public class u1172{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int []a=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
      if(a[i]==0 || a[i]<0){
        a[i]=1;
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.println("X["+i+"] = "+a[i]);
    }
  }
}