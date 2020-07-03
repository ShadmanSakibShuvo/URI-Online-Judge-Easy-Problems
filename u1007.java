import java.util.Scanner;

public class u1007{
  
  public static void main(String[]args){
    
    Scanner input=new Scanner(System.in);
    int A=input.nextInt();
    int B=input.nextInt();
    int product1=(A*B);
    
    int C=input.nextInt();
    int D=input.nextInt();
    int product2=(C*D);
    
    int difference=(product1-product2);
    System.out.println("DIFERENCA = "+difference);

  }
}