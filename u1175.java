import java.util.Scanner;
public class u1175{
    public static void main(String[]args) {
        int []array=new int[20];
        Scanner input = new Scanner(System.in);
        for(int i=array.length-1;i>=0;i--){
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.println("N["+i+"] = "+array[i]);   
        } 
    }
}