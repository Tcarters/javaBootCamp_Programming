// package Exceptions_Handling.Exceptions_in_java;

public class application {
    
    public static void main(String[] args) {
         
        int data = 100 ;

        try {
            int a = data / 0;

        } catch ( ArithmeticException e ) {
            // If we don't know the type of exception just write: ' catch ( Exception e ) '
            System.out.println( "Exceptions detected: " +  e );
        }

        System.out.println("Normal lines of code ...");
        
    }
}
