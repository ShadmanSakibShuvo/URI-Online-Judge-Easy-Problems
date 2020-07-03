import java.util.Scanner;
public class u1149{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int A=input.nextInt();
    int co=1;
    while(co<2147483647){
    int N=input.nextInt();
    int c=1;
    int sum=0;
    if(N>0){
    while(c<=N){
      sum=sum+A;
      A++;
      c++;
    }
     System.out.println(sum);
     break;
  }
    else{
      co++;
    }
  }
  }
}