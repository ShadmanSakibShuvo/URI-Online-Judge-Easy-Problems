import java.util.Scanner;
public class u1070{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int c=X;
    int d=0;
    while(c<(3*X)){
      if(c%2!=0){
        d++;
        System.out.println(c);
      }
      if(d==6){
        break;
      }
      c++;
    }
  }
}