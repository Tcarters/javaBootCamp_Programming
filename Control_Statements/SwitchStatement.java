// package Control_Statements;

public class SwitchStatement {

    public static void main ( String args[] ){
        String myvar = "Lucy";

        int temp = 0;

        switch ( myvar ) {

            case "Tom": // if condition match then executes this.
                System.out.println( " magic word: " + "Tom");
                temp++;
                System.out.println( "Temp var :" + temp );
                break;
            
            case "Lucy":
                System.out.println(" magic word : " + myvar );
                temp = 23;
                System.out.println( temp );
                break;
            
            case "John": System.out.println(" magic word : " + "john");
                            temp = 44;
                            System.out.println( "Temp var :" + temp );
                            break;
            default: 
                System.out.println(" Search again !!! ");  
                System.out.println( "Temp var :" + temp );
                  

        }

    }
    
}
