import java.util.Scanner;
public class u1008{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    int hours=input.nextInt();
    float salary1=input.nextFloat();
    float totalsalary=(salary1*hours);
    System.out.println("NUMBER = "+num);
    System.out.format("SALARY = U$ %.2f",totalsalary);
    System.out.println();
  }
}