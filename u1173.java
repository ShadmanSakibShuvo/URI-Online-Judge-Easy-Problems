import java.util.Scanner;
public class u1173{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int V=input.nextInt();
    int []a=new int[10];
    for(int i=0;i<a.length;i++){
      if(i==0){
        a[i]=V;
      }else{
          a[i]=V;
      }
      V=2*V;
    }
    for(int i=0;i<a.length;i++){
      System.out.println("N["+i+"] = "+a[i]);
    }
  }
}