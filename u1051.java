import java.util.Scanner;
public class u1051{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    float i1=in.nextFloat();
    double r=0.00;
    double n=0.00;
    double i=(double)i1;
    if(i<2000.00){
      System.out.println("Isento");
    }else{
    if(i>4500.00){
      n=(i-4500.00);
      r=r+(n*0.28);
      i=i-n;
    }if(i>3000.00){
      n=(i-3000.00);
      r=r+(n*0.18);
      i=i-n;
    }if(i>2000.00){
      n=(i-2000.00);
      r=r+(n*0.08);
    }
    System.out.printf("R$ %.2f\n",r);
    }
  }
}