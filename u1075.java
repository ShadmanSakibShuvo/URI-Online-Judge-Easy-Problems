import java.util.Scanner;
public class u1075{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=10000){
      if(c%N==2){
        System.out.println(c);
      }
      c++;
    }
  }
}