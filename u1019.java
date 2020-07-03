import java.util.Scanner;
public class u1019{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int h=0;
    int m=0;
    int s=0;
    if(N<60){
      s=N;
    }
    if(N<3600){
      m=N/60;
      s=N%60;
    }
    if(N>=3600){
      h=N/3600;
      N=N%3600;
      if(N>=60){
        m=N/60;
        s=N%60;
      }
      else{
        s=N;
      }
    }
    System.out.println(h+":"+m+":"+s);
  }
}