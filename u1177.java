import java.util.Scanner;
public class u1177{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int T=input.nextInt();
    int []a=new int[1000];
     int c=0;
    for(int i=0;i<a.length;i++){
        a[i]=c;
        c++;
        if(c==T){
          c=0;
        }
    }
    for(int i=0;i<a.length;i++){
      System.out.println("N["+i+"] = "+a[i]);
    }
  }
}