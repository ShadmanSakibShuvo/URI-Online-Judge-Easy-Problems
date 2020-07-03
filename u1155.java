public class u1155{
  public static void main(String[]args){
    double sum=0.0;
    int c=1;
    while(c<=100){
      sum=sum+(1.00/c);
      c++;
    }
    String S=String.format("%.02f",sum);
    System.out.println(S);
  }
}