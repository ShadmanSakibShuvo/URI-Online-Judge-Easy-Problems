import java.util.Scanner;
public class u1114{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    while(input.hasNext()){
      int X=input.nextInt();
      if(X==2002){
        System.out.println("Acesso Permitido");
        break;
      }
      else{
        System.out.println("Senha Invalida");
      }
    }
  }
}