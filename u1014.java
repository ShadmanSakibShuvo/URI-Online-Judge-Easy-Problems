import java.util.Scanner;
public class u1014{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int X1=sc.nextInt();
    float Y1=sc.nextFloat();
    double X=(double)X1;
    double Y=(double)Y1;
    double Z1=(X/Y);
    String Z=String.format("%.3f km/l",Z1);
    System.out.println(Z);
  }
}