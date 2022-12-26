// package inheritance;

class parent {
    static String  q = " A smple string ";
    static int eyes  = 234; 
}

class child extends parent { // first inheritance
    int nose = 2;
    void display () {
        System.out.println(" value of q:" + q + "eyes:" + eyes );
    }
}

class grand_child extends child { // a second inheritance

    void mentor () {
        System.out.println(" Nose :" + nose + " q: " + q );
    }
}

public class multiInheritance {
    public static void main(String[] args) {

        child obj = new child();
        obj.display();

        grand_child o = new grand_child();
        o.mentor();
        
    }
}
