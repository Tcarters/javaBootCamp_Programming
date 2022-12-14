// package Java_BootCamp_Programming.Variables;

public class MainVariables {

    int instanceVariable = 100; // This is an instance Variable because defined inside a Class but outside of a method. 
    
    static int StaticVar = 300; // declare a static Variable 
    public static void main(String[] args) {
        int localVaribale = 50; // local variable

        System.out.println("Local Variable = " + localVaribale );

        // Object Creation 
        MainVariables obj = new MainVariables();

        System.out.println("Instance Variable = " + obj.instanceVariable); // To call the instance variable we've to instantiate it with an object


        System.out.println("StaticVariable = " + StaticVar ); // To call a static variable don't need to instantiate it.
    }
}
