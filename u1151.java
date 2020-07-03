import java.util.Scanner;
public class u1151{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    int sum=0;
    int num1=0;
    int num2=1;
    while(c<N){
      if(c==1){
      System.out.print(num1+" "+num2);
      }
      else{
        sum=num1+num2;
        System.out.print(" "+sum);
        num1=num2;
        num2=sum;
      }
      c++;
    }
    System.out.println();
  }
}