import java.util.Scanner;
public class u1072{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int c=1;
    int d=0;
    int e=0;
    while(c<=N){
    int Y=input.nextInt();
    if(Y>=10 && Y<=20){
      d++;
    }
    else{
      e++;
    }
    c++;
    }
    System.out.println(d+" in");
    System.out.println(e+" out");
  }
}