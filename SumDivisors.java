/*This program asks the user for an integer N and then calculates the sum of all integers from 1 to N that divide N with zero left over. Use the % operator.
 * Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;

public class SumDivisors {
    public static void main(String[] args){
        int inputN, sumDivisor = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value for N: "); //prompt the user for N value 
        inputN = scan.nextInt();

        for (int i = 1; i <= inputN / 2; i++){
            if (inputN % i == 0) //checks if i is a divisor of N
                sumDivisor += i;
        }
        if (sumDivisor == inputN)
            System.out.println("" + inputN + " is a perfect number");
        else 
            System.out.println("The sum of divisors of " + inputN + " is: " + sumDivisor);
        
        scan.close();
    }
}
