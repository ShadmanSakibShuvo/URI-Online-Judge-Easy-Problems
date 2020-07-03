import java.util.Scanner;
public class u1115{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    while(input.hasNext()){
      int X=input.nextInt();
      int Y=input.nextInt();
      if(X==0 || Y==0){
        break;
      }
      if(X>0 && Y>0){
        System.out.println("primeiro");
      }
      if(X>0 && Y<0){
        System.out.println("quarto");
      }
      if(X<0 && Y>0){
        System.out.println("segundo");
      }
      if(X<0 && Y<0){
        System.out.println("terceiro");
      }
    }
  }
}