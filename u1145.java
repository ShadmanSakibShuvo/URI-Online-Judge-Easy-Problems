import java.util.Scanner;
public class u1145{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int Y=input.nextInt();
    int c=1;
    while(c<=Y){
      int co=1;
      while(co<=X){
        if(co!=X){
      System.out.print(c+" ");
        }else{
          System.out.print(c);
        }
      c++;
      co++;
      }
      System.out.println();
    }
  }
}