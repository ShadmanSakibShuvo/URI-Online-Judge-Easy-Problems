import java.util.Scanner;
public class u1013{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    int maxab =((a+b+(Math.abs(a-b)))/2);
    int max =((maxab+c+Math.abs(maxab-c))/2);
    System.out.println(max+" eh o maior");
  }
}