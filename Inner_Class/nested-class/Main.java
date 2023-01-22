//package Inner_Class.nested-class;

class outer {
    static int val =50;

    static class inner {
        void msg() {
            System.out.println("Static nested class: " + val );
        }
    }
}

public class Main {
    
    public static void main ( String[] args ) {
        outer.inner obj = new outer.inner();

        // Access the method of inner class:
        obj.msg();
    }
}


