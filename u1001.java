import java.util.Scanner;//for user input

public class u1001{//class type public,class name "u1001"
  
  public static void main(String[]args){//main method starting
    
    Scanner input=new Scanner(System.in);//taking input from a scanner
    int A=input.nextInt();//storing the specific type of value in variable
    int B=input.nextInt();
    int X=(A+B);//storing the specific type of summation
    
    System.out.println("X = " +X);//printing out the summation along with a new line
    
  }
  
}