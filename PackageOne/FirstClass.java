package OOPS.PackageOne;
//here is the syntax to import functions from different packages
import static OOPS.PackageTwo.FirstClass.greetings;

public class FirstClass {
    public static void main(String[] args) {
        greetings();
//we can't use non-static function inside a static one but vice-versa is true
      //  forgiver();

      //and all objects share the same static variable(no copies are made)
      //we can access static variable/function even before creating an object
      Student s1 = new Student(); //will give 1 as output
      Student s2 = new Student(); //will give 2 as output


    }

    void forgiver(){
    System.out.println("hey");
    }
}

class Student{
    static int count = 0; //static variable is being created only for once (see lin 12)
    Student(){
        count++;
        System.out.println(count);
    }
}
