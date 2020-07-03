import java.util.Scanner;
public class u1142{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    N=(N*4);
    while(c<=N){
      int c1=c+1;
      int c2=c1+1;
      System.out.println(c+" "+c1+" "+c2+" "+"PUM");
      c=c2+2;
    }
  }
}