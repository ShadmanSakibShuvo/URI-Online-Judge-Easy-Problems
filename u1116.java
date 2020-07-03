import java.util.Scanner;
import java.util.Formatter;
public class u1116{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    while(c<=N){
      int X=input.nextInt();
      int Y=input.nextInt();
      if(Y==0){
        System.out.println("divisao impossivel");
      }
      else{
        float Xi=(float)X;
        float Yi=(float)Y;
        float d=Xi/Yi;
        String str = String.format("%.01f", d);
        System.out.println(str);
      }
      c++;
    }
  }
}