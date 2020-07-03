import java.util.Scanner;
public class u1048{
  public static void main(String[]args){
    Scanner i=new Scanner(System.in);
    float s=i.nextFloat();
    float ns=(float)0.00;
    float e=(float)0.00;
    int r=0;
    if(s<=400.00){
      e=(float)(s*0.15);
      ns=(s+e);
      r=15;
    }else if(s>400.00 && s<=800.00){
      e=(float)(s*0.12);
      ns=(s+e);
      r=12;
    }else if(s>800.00 && s<=1200.00){
      e=(float)(s*0.10);
      ns=(s+e);
      r=10;
    }else if(s>1200.00 && s<=2000.00){
      e=(float)(s*0.07);
      ns=(s+e);
      r=7;
    }else{
      e=(float)(s*0.04);
      ns=(s+e);
      r=4;
    }
    System.out.printf("Novo salario: %.2f\n",ns);
    System.out.printf("Reajuste ganho: %.2f\n",e);
    System.out.println("Em percentual: "+r+" %");
  }
}