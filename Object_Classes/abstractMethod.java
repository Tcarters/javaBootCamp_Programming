
abstract class myclass {

    abstract int  display( int a , int b) ;

}

class doSomething extends myclass {
    int display ( int a, int b) {
        return a+b;
    }

}

public class abstractMethod {

    public static void main( String[] args ) {

        doSomething obj = new doSomething();
        System.out.println( obj.display(2, 20) );
    }
    
}
