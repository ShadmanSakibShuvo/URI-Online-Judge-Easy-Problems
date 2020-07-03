import java.util.Scanner;
public class u1144{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=N){
      int c1=c*c;
      int c2=c*c*c;
      System.out.println(c+" "+c1+" "+c2);
      int c12=c1+1;
      int c22=c2+1;
      System.out.println(c+" "+c12+" "+c22);
      c++;
    }
  }
}