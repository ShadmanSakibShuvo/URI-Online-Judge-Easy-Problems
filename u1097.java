public class u1097{
  public static void main(String[]args){
    int c=1;
     int temp=5;
    while(c<=9){
      if(c%2!=0){
        int i=temp+2;
        while(i<=2000){
          int i2=i-1;
          int i3=i-2;
      System.out.println("I="+c+" J="+i);
      System.out.println("I="+c+" J="+i2);
      System.out.println("I="+c+" J="+i3);
      break;
      }
        temp=i;
  }
      c++;
  }
  }
}