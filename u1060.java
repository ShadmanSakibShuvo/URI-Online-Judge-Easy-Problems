import java.util.Scanner;
public class u1060{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int p=0;
    int c=1;
    while(c<=6){
    float i1=in.nextFloat();
    if(i1>0.0){
      p++;
    }
    c++;
    }
    System.out.println(p+" valores positivos");
  }
}