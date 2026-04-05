package OOPS.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;

     BoxWeight() {
        
        this.weight = 1;
    }

     BoxWeight(double l, double b, double h, double weight) {
        //without super no error will cause since java implicitly add super()
        //good practice is to add it manually
        super(l, b, h); //this is calling the parent class's constructor in which l,b,h are defined
        this.weight = weight;
    }

    public static void main(String[] args) {
        System.out.println("Running");
    }
    
}
