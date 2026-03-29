package OOPS.PackageTwo;

public class FirstClass {
    //why do make main function as static ?
    // Anything(instance var, function etc) which is declared in a class
    // can be used after creating an object but to create an object the program
    // must run first(since objects are created in heap at runtime) and the starting
    // point (from where program starts to run) is the main function.
    // we can access static variable before creating an object.
    // That's why we make main function as static
    public static void main(String[] args){
        
    }

    public static void greetings(){
        System.out.println("Hello World");
    }
}
