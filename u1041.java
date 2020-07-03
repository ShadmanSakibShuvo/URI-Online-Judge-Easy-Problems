import java.util.Scanner;
public class u1041{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    float x=input.nextFloat();
    float y=input.nextFloat();
    if(x>0.0 && y>0.0){
      System.out.println("Q1");
    }if(x<0.0 && y<0.0){
      System.out.println("Q3");
    }if(x>0.0 && y<0.0){
      System.out.println("Q4");
    }if(x<0.0 && y>0.0){
      System.out.println("Q2");
    }if(x==0.0 && y!=0.0){
      System.out.println("Eixo Y");
    }if(y==0.0 && x!=0.0){
      System.out.println("Eixo X");
    }if(x==0.0 && y==0.0){
      System.out.println("Origem");
    }
  }
}