import java.util.Scanner;
public class u1066{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int d=0;
    int e=0;
    int f=0;
    int g=0;
    for(int c=1;c<=5;c++){
      int a=input.nextInt();
      if(a%2==0){
        d++;
      }
      if(a<0){
        e++;
      }
      if(a>0){
        f++;
      }
      if(a%2!=0){
        g++;
      }
    }
    System.out.println(d+" valor(es) par(es)");
    System.out.println(g+" valor(es) impar(es)");
    System.out.println(f+" valor(es) positivo(s)");
    System.out.println(e+" valor(es) negativo(s)");
  }
}