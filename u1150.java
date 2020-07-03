import java.util.Scanner;
public class u1150{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int co=1;
    while(co<2147483647){
    int Z=input.nextInt();
    int c=1;
    int sum=0;
    int d=0;
    if(Z>X){
    while(c<=Z){
      sum=sum+X;
      if(sum<=Z){
        d++;
      }
      else{
        d++;
        break;
      }
      X++;
      c++;
    }
     System.out.println(d);
     break;
  }
    else{
      co++;
    }
  }
  }
}