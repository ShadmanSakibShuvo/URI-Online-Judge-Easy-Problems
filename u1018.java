import java.util.Scanner;
public class u1018{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int h=0;
    int fif=0;
    int twe=0;
    int te=0;
    int fiv=0;
    int two=0;
    int temp=N;
    if(N>=100){
      h=N/100;
      N=N%100;
    }
    if(N>=50){
      fif=N/50;
      N=N%50;
    }
    if(N>=20){
      twe=N/20;
      N=N%20;
    }
    if(N>=10){
      te=N/10;
      N=N%10;
    }
    if(N>=5){
      fiv=N/5;
      N=N%5;
    }
    if(N>=2){
      two=N/2;
      N=N%2;
    }
    System.out.println(temp);
    System.out.println(h+" nota(s) de R$ 100,00");
    System.out.println(fif+" nota(s) de R$ 50,00");
    System.out.println(twe+" nota(s) de R$ 20,00");
    System.out.println(te+" nota(s) de R$ 10,00");
    System.out.println(fiv+" nota(s) de R$ 5,00");
    System.out.println(two+" nota(s) de R$ 2,00");
    System.out.println(N+" nota(s) de R$ 1,00");
  }
}