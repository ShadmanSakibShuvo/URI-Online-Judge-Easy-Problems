import java.util.Scanner;
public class u1021{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    float N=sc.nextFloat();
    float n1=N*100;
    int N1=(int)N;
    float n21=(float)(N1*100);
    float n20=n1-n21;
    int n2=(int)n20;
    int h=0;
    int h0=0;
    int fif=0;
    int fif0=0;
    int twe=0;
    int twe0=0;
    int te=0;
    int te0=0;
    int fiv=0;
    int two=0;
    if(N1>=100){
      h=N1/100;
      N1=N1%100;
    }
    if(N1>=50){
      fif=N1/50;
      N1=N1%50;
    }
    if(N1>=20){
      twe=N1/20;
      N1=N1%20;
    }
    if(N1>=10){
      te=N1/10;
      N1=N1%10;
    }
    if(N1>=5){
      fiv=N1/5;
      N1=N1%5;
    }
    if(N1>=2){
      two=N1/2;
      N1=N1%2;
    }
    if(n2>=50){
      h0=n2/50;
      n2=n2%50;
    }
    if(n2>=25){
      fif0=n2/25;
      n2=n2%25;
    }
    if(n2>=10){
      twe0=n2/10;
      n2=n2%10;
    }
    if(n2>=5){
      te0=n2/5;
      n2=n2%5;
    }
    System.out.println("NOTAS:");
    System.out.println(h+" nota(s) de R$ 100.00");
    System.out.println(fif+" nota(s) de R$ 50.00");
    System.out.println(twe+" nota(s) de R$ 20.00");
    System.out.println(te+" nota(s) de R$ 10.00");
    System.out.println(fiv+" nota(s) de R$ 5.00");
    System.out.println(two+" nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(N1+" moeda(s) de R$ 1.00");
    System.out.println(h0+" moeda(s) de R$ 0.50");
    System.out.println(fif0+" moeda(s) de R$ 0.25");
    System.out.println(twe0+" moeda(s) de R$ 0.10");
    System.out.println(te0+" moeda(s) de R$ 0.05");
    System.out.println(n2+" moeda(s) de R$ 0.01");
  }
}