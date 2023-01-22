//package Inner_Class.nested-class;

interface outer {
    void method1();
    interface inner {
        void method2() ;
          // {
            // System.out.println(" Hello from inner Interface ...");
        //}
    }
}

class ABC implements outer.inner {
    public void method2() {
        System.out.println( " Nested Interface ");
    }
}

public class interfapplication {
 public static void main (String[] args ) {
    outer.inner obj = new ABC();
    obj.method2();
 }   
}
