import java.util.Scanner;
public class u1050{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    boolean flag=false;
    if(num==61){
      System.out.println("Brasilia");
      flag=true;
    }if(num==71){
      System.out.println("Salvador");
      flag=true;
    }if(num==11){
      System.out.println("Sao Paulo");
      flag=true;
    }if(num==21){
      System.out.println("Rio de Janeiro");
      flag=true;
    }if(num==32){
      System.out.println("Juiz de Fora");
      flag=true;
    }if(num==19){
      System.out.println("Campinas");
      flag=true;
    }if(num==27){
      System.out.println("Vitoria");
      flag=true;
    }if(num==31){
      System.out.println("Belo Horizonte");
      flag=true;
    }
    if(flag==false){
      System.out.println("DDD nao cadastrado");
    }
  }
}