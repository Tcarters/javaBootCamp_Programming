public class instanceMethod {
    
    public void display () {
        System.out.println(" Message ....");
    }

    public static void main ( String[] args ) {

        instanceMethod obj = new instanceMethod();
        obj.display();
    }
}
