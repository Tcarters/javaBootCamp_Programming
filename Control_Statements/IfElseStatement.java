// package Control_Statements;
import java.util.*;


public class IfElseStatement {

    public static void main ( String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("\nEnter Second number: ");
        int num2 = sc.nextInt();

        if ( num1 > num2 ) {

            System.out.println("First Number is greater than Second num");
        }

        else if ( num1 == num2 ) {
           
            System.out.println(" Both numbers are equal ");

        }
        else {
            System.out.println("Your Second input is greather than the first input ....");
        }


    } 
    
}
