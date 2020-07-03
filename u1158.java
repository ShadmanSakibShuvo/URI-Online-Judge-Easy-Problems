import java.util.Scanner;
public class u1158{
  public static void main(String[]args){
    Scanner i=new Scanner(System.in);
    int N=i.nextInt();
    int c=1;
    while(c<=N){
    int X=i.nextInt();
    int co=1;
    int d=0;
    int sum=0;
    int Y=i.nextInt();
    while(co<=2000000){
    if(X%2!=0){
      sum=sum+X;
      d++;
    }
    if(d==Y){
      break;
    }
    X++;
    co++;
    }
    System.out.println(sum);
    c++;
    }
  }
}