import java.util.Scanner;
public class u1080{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int []a=new int[100];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    int max=a[0];
    int maxloc=1;
    for(int i=1;i<a.length;i++){
      if(a[i]>max){
      max=a[i];
      maxloc=i+1;
      }
    }
    System.out.println(max);
    System.out.println(maxloc);
  }
}