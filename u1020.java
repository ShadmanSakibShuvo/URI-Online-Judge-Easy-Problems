import java.util.Scanner;
public class u1020{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int y=0;
    int m=0;
    int d=0;
    if(N>=365){
      y=N/365;
      N=N%365;
    }
    if(N>=30){
      m=N/30;
      d=N%30;
    }
     else{
        d=N;
      }
    System.out.println(y+" ano(s)");
    System.out.println(m+" mes(es)");
    System.out.println(d+" dia(s)");
  }
}