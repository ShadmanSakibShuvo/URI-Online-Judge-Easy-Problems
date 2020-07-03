import java.util.Scanner;
import java.util.Arrays;
public class u1045{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    double []a=new double[3];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextDouble();
    }
    Arrays.sort(a);
    double A=a[2];
    double B=a[1];
    double C=a[0];
    double Asq=(A*A);
    double Bsq=(B*B);
    double Csq=(C*C);
    if(A>=(B+C)){
      System.out.println("NAO FORMA TRIANGULO");
    }else{
      if(Asq==(Bsq+Csq)){
      System.out.println("TRIANGULO RETANGULO");
    }if(Asq>(Bsq+Csq)){
      System.out.println("TRIANGULO OBTUSANGULO");
    }if(Asq<(Bsq+Csq)){
      System.out.println("TRIANGULO ACUTANGULO");
    }if(A==B&& B==C){
      System.out.println("TRIANGULO EQUILATERO");
    }if(A==B && B!=C){
      System.out.println("TRIANGULO ISOSCELES");
    }if(A==C && A!=B){
      System.out.println("TRIANGULO ISOSCELES");
    }if(B==C && A!=B){
      System.out.println("TRIANGULO ISOSCELES");
    }
    }
  }
}