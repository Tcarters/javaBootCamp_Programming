//package Exceptions_Handling;

class myclass extends Exception {
    myclass ( String s ) {
        super ( s );
    }
}

public class customException {
  
    public static void main(String[] args ) {
        int age = 17;

        try {

            if ( age < 20) {
                throw new myclass (" Under age of 20 years ...");
            } else {
                System.out.println("Welcome to vote ...");
            }
        } catch ( myclass e ) {
            System.out.println("Under age exception was handled ...");
        }
    }
}
