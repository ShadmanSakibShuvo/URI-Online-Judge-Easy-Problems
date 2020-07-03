import java.util.Scanner;
public class u1154{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int sum=0;
    float d=0;
    while(input.hasNext()){
    int N=input.nextInt();
    if(N<0){
      break;
    }
    sum=sum+N;
    d++;
    }
    float avg=(sum/d);
    String average=String.format("%.02f",avg);
    System.out.println(average);
  }
}