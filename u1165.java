import java.util.Scanner;
public class u1165{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=N){
      int X=input.nextInt();
      int c0=1;
      int d=0;
      while(c0<=X){
        if(X%c0==0){
          d++;
        }
        c0++;
      }
        if(d==2){
          System.out.println(X+" eh primo");
        }else{
          System.out.println(X+" nao eh primo");
        }
        c++;
    }
  }
}