import java.util.Scanner;
public class u1828{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int t=Integer.parseInt(in.nextLine());
    for(int c=1;c<=t;c++){
      String a=in.nextLine();
      if(a.equals("pedra pedra"))
        System.out.println("Caso #"+c+": De novo!");
      else if(a.equals("papel papel"))
        System.out.println("Caso #"+c+": De novo!");
      else if(a.equals("tesoura tesoura"))
        System.out.println("Caso #"+c+": De novo!");
      else if(a.equals("lagarto lagarto"))
        System.out.println("Caso #"+c+": De novo!");
      else if(a.equals("Spock Spock"))
        System.out.println("Caso #"+c+": De novo!");
      else if(a.equals("tesoura papel"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("papel pedra"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("pedra lagarto"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("lagarto Spock"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("Spock tesoura"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("tesoura lagarto"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("lagarto papel"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("papel Spock"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("Spock pedra"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("pedra tesoura"))
        System.out.println("Caso #"+c+": Bazinga!");
       else if(a.equals("papel tesoura"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("pedra papel"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("lagarto pedra"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("Spock lagarto"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("tesoura Spock"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("lagarto tesoura"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("papel lagarto"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("Spock papel"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("pedra Spock"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else if(a.equals("tesoura pedra"))
        System.out.println("Caso #"+c+": Raj trapaceou!");
      else;
    }
  }
}