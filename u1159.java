import java.util.Scanner;
public class u1159{
  public static void main(String[]args){
    Scanner i=new Scanner(System.in);
    while(i.hasNext()){
    int X=i.nextInt();
    if(X==0){
      break;
    }
    int co=1;
    int d=0;
    int sum=0;
    int Y=5;
    while(co<=2000000){
    if(X%2==0){
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
    }
  }
}