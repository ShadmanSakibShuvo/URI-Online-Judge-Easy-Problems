import java.util.Scanner;
public class u1064{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int p=0;
    int c=1;
    float sum=0;
    while(c<=6){
    float i1=in.nextFloat();
    if(i1>0.0){
      p++;
      sum=sum+i1;
    }
    c++;
    }
    float avg=(sum/p);
    System.out.printf(p+" valores positivos\n"+"%.1f\n",avg);
  }
}