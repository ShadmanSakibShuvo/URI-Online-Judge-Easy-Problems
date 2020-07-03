import java.util.Scanner;
public class u1078{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    int p=1;
    while(c<=10){
      p=c*N;
      System.out.println(c+" x "+N+" = "+p);
      c++;
    }
  }
}