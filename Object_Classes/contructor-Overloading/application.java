import java.util.Scanner;

// package contructor-Overloading;

class myConstrucor {

    int varlocal ;
    myConstrucor () {
        // definiing a constructor
        System.out.println(" This the default constructor !!! ");
   }

   myConstrucor ( int var ){ // constructor overloading ...
    varlocal = var;

    System.out.println("User value is: " + varlocal );
   }
}


public class application {
    public static void main(String[] args) {
        Scanner obScanner = new Scanner(System.in );
        System.out.println("Enter an integr value: ");
      // int  var = obScanner.nextInt();



        
        myConstrucor obj = new myConstrucor( obScanner.nextInt() );
    
    } 

    
   
}
