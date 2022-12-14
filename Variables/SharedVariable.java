
public class SharedVariable {

    int NonShared_variable = 23; // It shouldn't get updated

    static int shared_variable = 1;  // Static make the variable to be shared with others objects

    // Create a constructor:
    SharedVariable () {

        NonShared_variable++;
        System.out.print("NonShared Varable = " + NonShared_variable + "\n" );

        System.out.println(" Shared Variable = " + shared_variable + "\n ");
        shared_variable++;

    }

    public static void main ( String[] args) {
        SharedVariable objNonShare1 = new SharedVariable();

        SharedVariable objNonShare2 = new SharedVariable();

        SharedVariable objSharedVar1 = new SharedVariable();
        SharedVariable objSharedVar2 = new SharedVariable();


        // System.out.println ( objNonShare.NonShared_variable);
    }
    
}