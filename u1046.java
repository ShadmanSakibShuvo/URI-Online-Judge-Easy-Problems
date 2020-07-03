import java.util.Scanner;
public class u1046{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int s=input.nextInt();
    int e=input.nextInt();
    int h=0;
    if(0<=s && s<24 && 0<=e && e<24){
    if(s==e){
      System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    else{
      if(s>=12 && e>=12){
      h=e-s;
      System.out.println("O JOGO DUROU "+h+" HORA(S)");
    }
    if(s>=12 && 12>e){
      e=e+24;
      h=e-s;
      System.out.println("O JOGO DUROU "+h+" HORA(S)");
    }
    if(s<12 && e>=12){
     h=e-s;
     System.out.println("O JOGO DUROU "+h+" HORA(S)");
    }
    if(s<12 && e<12){
      h=e-s;
      System.out.println("O JOGO DUROU "+h+" HORA(S)");
    }
    }
    }
  }
}