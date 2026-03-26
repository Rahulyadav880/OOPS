
public class Basics {
    public static void main(String[] args){
        Student rahul = new Student();
//this is the first way (when automatic constructor is made by java)
        // rahul.roll = 95;
        rahul.name = "Rahul Yadav";
        // rahul.marks = 98.8f;
        // System.out.println(rahul.name);
        // System.out.println(rahul.roll);
        // System.out.println(rahul.marks);
        rahul.greetings();

//this is the second way (when we made a constructor in the class)
        Student virat = new Student();
        // System.out.println(virat.name);
        virat.greetings();

//this is the third way when parameters are passed in the constructor inside the class
        Student rajneesh = new Student(94, "Rajneesh Yadav", 89.4f);
        System.out.println(rajneesh.marks);
        rajneesh.greetings();
    }

}

class Student{
        int roll;
        String name;
        float marks;

        //we can also write functions inside the class
        void greetings(){
            System.out.println("Hello ! My name is " + name);
        }

        //creating constructor
        Student(){
            this.name = "virat";
            this.roll = 84;
            this.marks = 82.3f;
        }

        //another constructor with the parameters
        Student(int roll, String naam, float marks){
            this.roll = roll;
            this.name = naam; // we can also name the parameters differently just like here
            this.marks = marks; // but by convention we keep them same as the properties
        }
    }
