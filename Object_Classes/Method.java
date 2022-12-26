public class Method {
    
    public static int sum ( int a, int b) { // sample as public int sum()
        return a+b;
    }

    public static void main ( String[] args ) {

        Method obj = new Method();
        int c = obj.sum(10, 20);

        System.out.println ( "Value of c: " +  c) ;
    }
}
