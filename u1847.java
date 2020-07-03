import java.util.Scanner;
public class u1847{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    if(a>b && b<=c)
      System.out.println(":)");
    else if(a<b && b>=c)
      System.out.println(":(");
    else if(a<b && b<c){
      if((c-b)<(b-a))
        System.out.println(":(");
      if((c-b)>=(b-a))
        System.out.println(":)");
    }
    else if(a>b && b>c){
      if((b-c)<(a-b))
        System.out.println(":)");
      if((b-c)>=(a-b))
        System.out.println(":(");
    }
    if(a==b && b<c)
      System.out.println(":)");
    if(a==b && b>=c)
      System.out.println(":(");
  }
}