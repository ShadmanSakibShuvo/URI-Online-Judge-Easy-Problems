import java.util.Scanner;
public class u1099{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    int sum=0;
    while(c<=N){
      int X=input.nextInt();
      int Y=input.nextInt();
      if(Y-X==1 || X-Y==1){
        sum=0;
        System.out.println(sum);
      }
      else if(X==Y){
        System.out.println("0");
      }
      else{
        sum=0;
      if(X>Y){
        int i=Y+1;
        while(i<X){
          if(i%2!=0){
            sum=sum+i;
          }
          i++;
        }
        System.out.println(sum);
      }
      if(Y>X){
        int i=X+1;
        while(i<Y){
          if(i%2!=0){
            sum=sum+i;
          }
          i++;
        }
        System.out.println(sum);
      }
      }
      c++;
    }
  }
}