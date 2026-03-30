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
    //we can't call/use a non-static function inside a static function
      //  greet(); it will give error
      //but there is a way to access/call/use it - by creating an object for it.

      FirstClass f1 = new FirstClass();
      //since the greet function is defined in the FirstClass class
      //and we know that to access a method defined in a class can be accessed
      //by creating an object of it
      f1.greet();
    }

    void greet2(){//now if we have to use greet and greet2 in the main function
        greet();// then we simply need only one object that will be for greet2 only
    }

    void greet(){
        System.out.println("hey, I am non-static");
    }

    public static void greetings(){
        System.out.println("Hello World");
    }
}
