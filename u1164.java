import java.util.Scanner;
public class u1164{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=N){
      int X=input.nextInt();
      int c0=1;
      int sum=0;
      while(c0<X){
        if(X%c0==0){
          sum=sum+c0;
        }
        c0++;
      }
        if(sum==X){
          System.out.println(X+" eh perfeito");
        }else{
          System.out.println(X+" nao eh perfeito");
        }
        c++;
    }
  }
}