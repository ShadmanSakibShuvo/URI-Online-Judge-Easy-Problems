import java.util.Scanner;
public class u1017{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int t=input.nextInt();
    int s=input.nextInt();
    int st=(s*t);
    double f=0.0;
    f=(st/12.0);
    System.out.format("%.3f",f);
    System.out.println();
  }
}