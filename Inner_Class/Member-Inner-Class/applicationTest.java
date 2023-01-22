//package Inner_Class.Member-Inner-Class;

class outer { // This is our outer class
    private int data = 90;

    class inner { // The inner class which is inside the outer class
        void display() {
            System.out.println("Inner class: " + data );
        }
    }
}


public class applicationTest {
    public static void main( String[] args ) {
        outer objOuter = new outer();

        // To access the inner class we take object of outer class to instantiate it:
        outer.inner objInner = objOuter.new inner(); 
        
        //System.out.println("Data of inner class: " + 
        objInner.display();
        //  );
    }
}
