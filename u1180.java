import java.util.Scanner;
public class u1180{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int []a=new int[N];
    for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
    }
    int min=a[0];
    int minloc=0;
    for(int i=1;i<a.length;i++){
      if(a[i]<min){
        min=a[i];
        minloc=i;
      }
    }
    System.out.println("Menor valor: "+min);
    System.out.println("Posicao: "+minloc);
  }
}