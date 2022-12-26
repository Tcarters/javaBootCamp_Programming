// package inheritance;

class parents {
    int eyes = 2;
    int ears = 2;
}

class child extends parents {

    void display() {
        System.out.println(" Value of eyes :" + eyes  + " ears is: " + ears );

    }
}


public class inheritance1 {
    
    public static void main( String[] args) {
        // need to create objet of child 
        child obj = new child();
        obj.display();
    }
}
