package OOPS.Properties.Polymorphism;
//it is the file from where everything is being called
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Shapes square1 = new Square(); //Java reads the right side first
        //but we can't do it like this
        //Square square1 = new Shapes(); as it will give error
        //first it will create a Square constructor then call the Square constructor
        //Even before that, call Shapes constructor (inheritance rule)
        //Object Type Decides Which Constructor Runs
        //Reference Type Only Controls What You Can Access
        //this is illegal(means will give error) Square square1 = new Shapes();

        shape.area();
        triangle.area();
        square.area();
        square1.area();

    }
}
