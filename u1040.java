import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class u1040{
  public static void main(String[]args){
    Scanner i=new Scanner(System.in);
    float n1=i.nextFloat();
    float n2=i.nextFloat();
    float n3=i.nextFloat();
    float n4=i.nextFloat();
    double nn1=(double)(n1*2);
    double nn2=(double)(n2*3);
    double nn3=(double)(n3*4);
    double nn4=(double)(n4*1);
    double avg=((nn1+nn2+nn3+nn4)/10.0);
    float a=(float)(avg);
 
    System.out.printf("Media: %.1f\n",a);
    if(a>=7.0){
      System.out.println("Aluno aprovado.");
    }else if(a<5.0){
      System.out.println("Aluno reprovado.");
    }else{
      System.out.println("Aluno em exame.");
      float n5=i.nextFloat();
      System.out.println("Nota do exame: "+n5);
      double nn5=(double)n5;
      double aa=(double)a;
      double average=((nn5+aa)/2.0);
      float av=(float)(average);
      if(av>=5.0){
        System.out.println("Aluno aprovado.");
      }else{
        System.out.println("Aluno reprovado.");
      }
      System.out.printf("Media final: %.1f\n",av);
    }
  }
}