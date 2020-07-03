import java.util.Arrays;
import java.util.Scanner;
public class u1101{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
        int M=input.nextInt();
        int N=input.nextInt();
        int s=0;
        int l=((Math.abs(M-N))+1);
        int []a=new int[l];
        if(M<=0 || N<=0){
          break;
        }
        if(M<N){
        for(int i=0;i<a.length;i++){
            a[i]=M;
            M++;
        }
        }else{
          for(int i=0;i<a.length;i++){
            a[i]=M;
            M--;
        }
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
           s=s+a[i];
           System.out.print(a[i]+" ");
        }
        System.out.println("Sum="+s);
    }
    }
}