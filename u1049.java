import java.util.Scanner;
public class u1049{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    String w1=input.nextLine();
    String w2=input.nextLine();
    String w3=input.nextLine();
    int w1Length=w1.length();
    int w2Length=w2.length();
    int w3Length=w3.length();
    if(w1Length==10 && w2Length==3 && w3Length==9){
      System.out.println("aguia");
    }
    if(w1Length==10 && w2Length==3 && w3Length==7){
      System.out.println("pomba");
    }
    if(w1Length==10 && w2Length==8 && w3Length==7){
      System.out.println("homem");
    }
    if(w1Length==10 && w2Length==8 && w3Length==9){
      System.out.println("vaca");
    }
    if(w1Length==12 && w2Length==6 && w3Length==10){
      System.out.println("pulga");
    }
    if(w1Length==12 && w2Length==6 && w3Length==9){
      System.out.println("lagarta");
    }
    if(w1Length==12 && w2Length==8 && w3Length==10){
      System.out.println("sanguessuga");
    }
    if(w1Length==12 && w2Length==8 && w3Length==7){
      System.out.println("minhoca");
    }
  }
}