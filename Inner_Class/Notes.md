 ** Inner Class **

 - Java inner class or nested class is a class which is declared inside the class or interface.
 - We use inner classes to logically group classes and interfaces in one place so that it can be more readable and    maintainable.
 - Additionally , it can access all the members of outer class including private data members and methods.

 `` Basic Syntax ``
  class Java_outer_class  // code class Java_inner_class { //code } }

> Advantages
+ Nested classes represent a special type of relationship that is `` it can access all the members ( data members and methods) of outer class including private . ``
+ Nested classes are used `` to develop more readable and maintainable code `` because it logically group classes and interfaces in one place only.
+ `` Code Optimization ``: It requires less code to write.

 Difference between nested & Inner class
 - Inner class is a part of nested class. NOn-static nested classes are known as `` inner classes ``.

 Types of Nested classes:
  + Non-static nested class (inner class )
  + Member inner class
  + Anonymous inner class 
  + Local inner class
  + Static nested class

 -> Member Inner Class : A class created within class and outside method.
    A non-static class that is created inside a class but outside a method is called `` member inner class ``.

** Anonymous Inner Class ** 
   A class created for implementing interface or extending class. Its name is decided by the java compiler.
 
 > Internal working of Anonymous class:
  - A class is created but its name is decided by the compiler which extends the Person class and provides the implementation of the eat() method in our example.
  - An object of Anonymous class is created that is referred by p reference variable of Person type.
 
 
 -> Local Inner Class: A class created within method.
  - A class i.e created inside a method is called ``local inner class  `` in java. If we want to invoke the methods of local inner class, we must instantiate this class inside the method.
 
 -> Static Nested Class:  A static class created within class.
  - It cannot access non-static data members and methods. It can be accessed by outer class name.
  - It can access static data members of outer class including private.
  - Static nested class cannot acess non-static (instance) data member or method.
 
 -> Nested Interface: An interface created within class or another interface.
 - A class that have no name is known as anonymous inner class in java. It should be used if you have to override method of class or interface. Java Anonymous inner class can be created by two ways:
  - class (may be abstract or concrete)
  - The nested interfaces are used to group related interfaces so that they can be easy to maintain .
  - The nested interface must be referred by the outer interface or class. It can't be accessed directly.
  > Points to remember:
    -> Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.
    -> Nested interfaces are declared static implicitely.


> Working of Inner class
 - The java compiler created two class files in case of inner class. The class file name of inner class is "Outer$Inner". If you want to instantiate inner class, you must have to create the instance of outer class. In such case, instance of inner class is created inside the instance of outer class.