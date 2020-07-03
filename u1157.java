import java.util.Scanner;
public class u1157{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=N){
      if(N%c==0){
      System.out.println(c);
      }
      c++;
    }
  }
}