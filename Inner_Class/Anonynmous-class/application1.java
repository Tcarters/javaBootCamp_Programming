//package Inner_Class.Anonynmous-class;
abstract class outer {
    abstract void eat();
    // abstract void display() {

    // }
}

public class application1 {
    public static void main (String[] args ) {
        outer obj = new outer(){
            void eat() {
                System.out.println("This is from abstract class");

            }
        };
        obj.eat();
    }
    
}
