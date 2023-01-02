//package Exceptions_Handling.Exceptions_in_java;

public class finallyblock {
    
    public static void main ( String[] args) {
        int d = 100;
        try {
            int res = d / 0;

        } catch ( Exception e ) {
            //;
        } 
        
        finally {
            System.out.println("This block is final block ");

        }

        System.out.println("Outside block ...");
    }
}
