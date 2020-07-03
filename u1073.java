import java.util.Scanner;
public class u1073{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    int pro=1;
    while(c<=N){
      if(c%2==0){
        pro=(int)Math.pow(c,2);
        System.out.println(c+"^2 = "+pro);
      }
    c++;
    }
  }
}