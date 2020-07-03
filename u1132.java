import java.util.Scanner;
public class u1132{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int Y=input.nextInt();
    int sum=0;
    if(X<Y){
      while(X<=Y){
        if(X%13!=0){
          sum=sum+X;
        }
        X++;
      }
    }
    else{
      while(Y<=X){
        if(Y%13!=0){
          sum=sum+Y;
        }
        Y++;
      }
    }
    System.out.println(sum);
  }
}