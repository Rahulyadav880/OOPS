package OOPS.AccessModifiers;
import OOPS.Properties.Inheritance.Box;
public class AllModifiers extends Box{
    
    public static void main(String[] args) {
        AllModifiers box11 = new AllModifiers();
         double br = box11.b;
         br = 6;
        System.out.println(br);
    }
    
}
//In this file, it is being showcased that how protected access modifier works.
//As i have imported the Box class and made the native class as a subclass of Box
//and accessed the instance variable which is in Box class(in different package)
//protected variables can only be accessed (if accessing from a diff pkg) via a subclass
//of the class in which the variable is present.