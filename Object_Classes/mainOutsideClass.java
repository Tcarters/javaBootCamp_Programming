// package Object_Classes;

class myclass {
    int  var = 44;
}

public class mainOutsideClass {
    
    public static void main(String[] args) {
       
        myclass obj = new myclass();

        System.out.println( obj.var );
    }
}
