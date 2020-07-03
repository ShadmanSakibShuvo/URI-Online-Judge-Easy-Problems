import java.util.Scanner;
public class u1011{
 public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
  float R1=scan.nextFloat();
  double R=(double)R1;
  double pi=3.14159;
  double volume=((4/3.0)*pi*R*R*R);
  String v=String.format("VOLUME = %.3f",volume);
  System.out.println(v);
 }  
}