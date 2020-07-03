import java.util.Scanner;
public class u1079{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int c=1;
    float A,B,C,sum,avg;
    while(c<=N){
      A=in.nextFloat();
      B=in.nextFloat();
      C=in.nextFloat();
      A=(A*2);
      B=(B*3);
      C=(C*5);
      sum=(A+B+C);
      avg=(sum/10);
      System.out.printf("%.1f\n",avg);
      c++;
    }
  }
}