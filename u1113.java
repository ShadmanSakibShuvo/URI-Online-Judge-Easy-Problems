import java.util.Scanner;
public class u1113{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    while(input.hasNext()){
      int X=input.nextInt();
      int Y=input.nextInt();
      if(X==Y){
        break;
      }
      if(X>Y){
        System.out.println("Decrescente");
      }
      if(X<Y){
        System.out.println("Crescente");
      }
    }
  }
}