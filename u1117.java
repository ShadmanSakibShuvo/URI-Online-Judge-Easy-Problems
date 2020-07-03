import static java.lang.System.*;
import java.util.Scanner;
class u1117{
    public static void main(String[]args) {
        Scanner i = new Scanner(in);
        int d=0;
        double s=0;
        while(i.hasNext()){
        float N=i.nextFloat();
        if(N>=0 && N<=10){
          d++;
          double n1=(double)N;
          s=s+n1;
        }
        else
          out.println("nota invalida");
        if(d==2)
          break;
        }
        double avg=(s/2.0);
        out.printf("media = %.2f\n",avg);
    }
}