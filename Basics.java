
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

//giving an object the properties of an another object
        Student amar = new Student(rajneesh);
        System.out.println(amar.name);

        final A raOne = new A("rahul yadav");//here we have made the object as final obj
        raOne.name = "rajjo";//but we are able to change the value
        System.out.println(raOne.name);

        //when a non-primitive is final then we can't re-initialize it
        //but i can't do like this
        //raOne = new A("new name");

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

        //creating a constructor which takes properties from another object
        Student(Student other){
            this.name = other.name; //give the properties of other object to the current object
            this.roll = other.roll; //this refers to amar and other refers to rajneesh
            this.marks = other.marks;
        }

        //another constructor with the parameters
        Student(int roll, String naam, float marks){
            this.roll = roll;
            this.name = naam; // we can also name the parameters differently just like here
            this.marks = marks; // but by convention we keep them same as the properties
        }
    }

    class A{
        final int a = 10; //if you only declare the
        //  variable with 'final' keyword then it will give error

        String name;
        A(String name){
            this.name = name;
        }
    }