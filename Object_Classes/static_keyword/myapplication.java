package static_keyword;

public class myapplication {
    static int abc ;
    static {
        abc = 10;
        System.out.println(" Static block !!! ");
    }

    public static void main ( String[] args ){

        System.out.println( " Value of var: " + abc );
    }
}
