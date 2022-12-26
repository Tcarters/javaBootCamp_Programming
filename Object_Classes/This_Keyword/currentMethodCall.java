// package This_Keyword;

public class currentMethodCall {
    
    void abc() {
        System.out.println( "This is a call from method abc() !!! ");
    }

    void xyz() {
        this.abc(); // call the method abc() here ...

        System.out.println("I am calling  abc method ....");
    }

    public static void main ( String[] args ) {

        currentMethodCall obj = new currentMethodCall();

        obj.xyz(); // used to call the method xyz() which will call abc also.

    }
}
