package OOPS.Properties.Inheritance;
// This Main class is for calling only
public class Main {
    public static void main(String[] args){
        //In this I am calling the different types of constructors
        //It matches the arguments which I have passed in these constructors with the 
        //arguments in the constructor definition
        Box box1 = new Box();
        System.out.println(box1.l);

        Box box2 = new Box(4);
        System.out.println(box2.l);

        Box box3 = new Box(1.2, 4.2, 7.5);
        System.out.println(box3.l + " " + box3.b + " " + box3.h);

        Box box4 = new Box(box3);
        System.out.println(box4.l + " " + box4.b + " " + box4.h);

        BoxWeight box5 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box5.l + " " + box5.b + " " + box5.h + " " + box5.weight);

         BoxWeight box6 = new BoxWeight();
         System.out.println(box6.weight);
    }
}
