import java.util.Scanner;
public class u1015{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    float x10=input.nextFloat();
    float y10=input.nextFloat();
    float x20=input.nextFloat();
    float y20=input.nextFloat();
    double x1=(double)x10;
    double x2=(double)x20;
    double y1=(double)y10;
    double y2=(double)y20;
    double p10=x2-x1;
    double p20=y2-y1;
    double p1=Math.pow(p10,2);
    double p2=Math.pow(p20,2);
    double p=(p1+p2);
    double d=Math.pow(p,0.5);
    System.out.format("%.4f",d);
    System.out.println();
  }
}