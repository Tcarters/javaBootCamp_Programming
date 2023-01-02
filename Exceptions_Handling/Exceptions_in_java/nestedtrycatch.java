//package Exceptions_Handling.Exceptions_in_java;

public class nestedtrycatch {
    
    public static void main(String [] args ) {
        int data = 100;
        int value = 500;
        int x =0;

        try {
            int b = data / 0;
            try {
                int res = value /x ;
            } catch (ArithmeticException e ) {
                System.out.println("error:" + e);
            }
        } catch ( Exception e ) {
            System.out.println("Second error :" + e );
        }
    
        System.out.println("Normal   lines of code     contined ...");
    }

}
