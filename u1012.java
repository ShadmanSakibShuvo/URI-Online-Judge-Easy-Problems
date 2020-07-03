import java.util.Scanner;
public class u1012{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    double A=input.nextDouble();
    double B=input.nextDouble();
    double C=input.nextDouble();
    double t=(0.5*A*C);
    double c=(3.14159*C*C);
    double trap=(0.5*(A+B)*C);
    double s=(B*B);
    double r=(A*B);
    String t1=String.format("TRIANGULO: %.3f",t);
    String c1=String.format("CIRCULO: %.3f",c);
    String trap1=String.format("TRAPEZIO: %.3f",trap);
    String s1=String.format("QUADRADO: %.3f",s);
    String r1=String.format("RETANGULO: %.3f",r);
    System.out.println(t1);
    System.out.println(c1);
    System.out.println(trap1);
    System.out.println(s1);
    System.out.println(r1); 
  }
}