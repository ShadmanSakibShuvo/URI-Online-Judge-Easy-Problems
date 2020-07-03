import java.util.Scanner;
public class u1074{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=N){
      int X=input.nextInt();
      if(X>0 && X%2==0){
        System.out.println("EVEN POSITIVE");
      }
      if(X<0 && X%2==0){
        System.out.println("EVEN NEGATIVE");
      }
      if(X>0 && X%2!=0){
        System.out.println("ODD POSITIVE");
      }
      if(X<0 && X%2!=0){
        System.out.println("ODD NEGATIVE");
      }
      if(X==0){
        System.out.println("NULL");
      }
      c++;
    }
  }
}