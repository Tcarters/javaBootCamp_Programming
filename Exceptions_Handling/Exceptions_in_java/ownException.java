//package Exceptions_Handling.Exceptions_in_java;

public class ownException {

    public static void main(String[] args) {
        int age = 18;

    try {
        if ( age < 19 ) {
            throw new ArithmeticException( "Under Age ");
        }
    } catch ( ArithmeticException e ) {
        System.out.println("Error :" + e );
    }
}
    }
    
