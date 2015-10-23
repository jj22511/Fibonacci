import java.util.Scanner;

/**
 * @author JOHN JAY MERCINES - BSIS2
 */
public class FibonacciCalculator {

    public static void main(String args[]) {
    
       //input to print Fibonacci 
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci upto " + number +" numbers : ");
        
	//printing Fibonacci
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci(i) +", ");
        }
    } 
  

   /*Recursion*/
    public static int fibonacci(int number){
        if(number <= 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
}

