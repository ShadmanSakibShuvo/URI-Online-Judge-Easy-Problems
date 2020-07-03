import java.util.Scanner;
public class u1134{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int A=0;
    int G=0;
    int D=0;
    while(input.hasNext()){
      int N=input.nextInt();
      if(N==4){
        break;
      }
      if(N==1){
        A++;
      }
      if(N==2){
        G++;
      }
      if(N==3){
        D++;
      }
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+A);
    System.out.println("Gasolina: "+G);
    System.out.println("Diesel: "+D);
  }
}