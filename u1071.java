import java.util.Scanner;
public class u1071{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int Y=input.nextInt();
    int sum=0;
    if(X>Y){
      int c=Y+1;
      while(c<X){
        if(c%2!=0){
          sum=sum+c;
        }
        c++;
      }
    }
    if(Y>X){
      int c=X+1;
      while(c<Y){
        if(c%2!=0){
          sum=sum+c;
        }
        c++;
      }
    }
    System.out.println(sum);
  }
}