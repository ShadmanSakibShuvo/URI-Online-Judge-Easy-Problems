import java.util.Scanner;
public class u1146{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    while(input.hasNext()){
      int X=input.nextInt();
      if(X==0){
        break;
      }
      int c=1;
      while(c<=X){
        if(c!=X){
          System.out.print(c+" ");
        }else{
          System.out.println(c);
        }
        c++;
      }
      //System.out.println();
    }
  }
}