import java.util.Arrays;
import java.util.Scanner;
public class u1042{
    public static void main(String[]args) {
        int []array=new int[3];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        int []a=new int[3];
        for(int i=0;i<a.length;i++){
          a[i]=array[i];
        }
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);   
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);   
        }
    }
}