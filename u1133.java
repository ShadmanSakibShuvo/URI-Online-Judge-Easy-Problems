import java.util.Scanner;
public class u1133{
  public static void main(String[]args){
  Scanner r=new Scanner(System.in);
  int X=r.nextInt();
  int Y=r.nextInt();
  int sum=0;
  if(X<Y){
    int c=X;
    while(c<Y){
      if(c==X){
      }
      else{
      if(c%5==2 || c%5==3){
        System.out.println(c);
      }
      }
      c++;
    }
  }
  else{
    int c=Y;
    while(c<X){
      if(c==Y){
      }
      else{
      if(c%5==2 || c%5==3){
        System.out.println(c);
      }
      }
      c++;
    }
  }
  }
}