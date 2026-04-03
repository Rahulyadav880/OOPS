package OOPS.Properties.Inheritance;

public class Box {
    double l;
    double b;
    double h;

    Box(){
        this.l = 1;
        this.b = 2;
        this.h = 3;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box( Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public static void main(String[] args) {
        System.out.println("Running");
    }
}
