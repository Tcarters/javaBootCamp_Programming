//package Inner_Class.inner



class outer {
    void display() {
        class innerclass {
            void message() {
                System.out.println("Local inner class");
            }
        }
        // instantiate the inner class
    innerclass obj = new innerclass();
    obj.message();

    }
}


public class application {
    public static void main( String[] args ) {
        outer obj2 = new outer();

        obj2.display();
    }
}
