//package inheritance;

class Animal {
    void eating () {
        System.out.println("Eating here .....");
    }
}

class cat extends Animal {
    void affiche () {
        System.out.println(" Meowing from cat.....");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("Barking from dog !!! ....");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
         
        cat objCat = new cat();

        dog obDog = new dog();

        //System.out.println(" Value cat: " + 
        objCat.affiche();
         //+ " Value dog " + 
         obDog.bark() ;

    }
}
