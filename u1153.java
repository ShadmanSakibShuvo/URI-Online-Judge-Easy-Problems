import java.util.Scanner;
public class u1153{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=N;
    int pro=1;
    while(c>=1){
      pro=pro*c;
      c--;
    }
    System.out.println(pro);
  }
}