import java.util.Scanner;
public class u1065{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int d=0;
    for(int c=1;c<=5;c++){
      int a=input.nextInt();
      if(a%2==0){
        d++;
      }
    }
    System.out.println(d+" valores pares");
  }
}