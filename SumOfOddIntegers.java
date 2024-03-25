/*This program asks the user for an integer N and then calculates two things: (a) the sum of all odd integers from 1 to N, and (b) N^2.
 * Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args){
        int inputN, oddSum = 0, oddSquare; //declaration of int variables
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value for integer N: "); //prompt the user
        inputN = scan.nextInt();

        for (int i = 1; i <= inputN; i += 2){ //calculating the sum of oddInt from 1 to N
            oddSum += i;
        }
        oddSquare = inputN * inputN; 

        //output
        System.out.println("The sum of all odd integers from 1 to " + inputN + " is " + oddSum);
        System.out.println("The square of " + inputN + " is " + oddSquare);

        scan.close();
    }
}
