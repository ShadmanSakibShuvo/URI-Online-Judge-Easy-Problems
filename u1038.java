import java.util.Scanner;
public class u1038{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int X=input.nextInt();
    int Y=input.nextInt();
    double total=0;
    if(X==1){
      int c=1;
      while(c<=Y){
        total=total+4.00;
        c++;
      }
    }if(X==2){
      int c=1;
      while(c<=Y){
        total=total+4.50;
        c++;
      }
    }if(X==3){
      int c=1;
      while(c<=Y){
        total=total+5.00;
        c++;
      }
    }if(X==4){
      int c=1;
      while(c<=Y){
        total=total+2.00;
        c++;
      }
    }if(X==5){
      int c=1;
      while(c<=Y){
        total=total+1.50;
        c++;
      }
    }
    System.out.format("Total: R$ %.02f",total);
    System.out.println();
  }
}