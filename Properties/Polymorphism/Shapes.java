package OOPS.Properties.Polymorphism;

public class Shapes {
    //final void area() { if we make this method as final then it can't be overriden by
    //any subclass of this superclass. Since, final makes anything constant, so, we can't 
    //modify this method in any of its subclass
    //early and late binding : check notes

    //static void area() { this can be inherited but can't be overridden

    void area() {
        System.out.println("I am the shapes area.");
    }
}
