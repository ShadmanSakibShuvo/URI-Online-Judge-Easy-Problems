import java.util.Scanner;
public class u1067{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int c=1;
    while(c<=X){
      if(c%2!=0){
        System.out.println(c);
      }
      c++;
    }
  }
}