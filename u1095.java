public class u1095{
  public static void main(String[]args){
    int c=60;
    int temp=-2;
    while(c>=0){
      int i=temp+3;
      while(i<200000){
        System.out.println("I="+i+" J="+c);
        break;
      }
      temp=i;
      c=c-5;
    }
  }
}