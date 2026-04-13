package OOPS.Abstract;

public class AbstractDemo {
    public static void main(String[] args){
        Child child = new Child(24);
        child.career();
        child.partner();

        //we can also access it with the help of the className
        Parent.goal();

        Parent child1 = new Child(23); //we can also do like this
        child.career();
    }
}

//if a class contains atleast one abstract method then the class must be an abstract class
//we can't create the object of an abstract class(since can't create a abstract constructor).
//Abstract constructor doesn't has a body then how can the object call it? (abstract Parent(int age);)
abstract class Parent{ //we can't make abstract class as final(if done then it can't be inherited)
    int age;

    Parent(int age){
        this.age = age;
    }

//we also can't create static abstract methods(since we can't override it and abstract methods is being overridden)      
//static void goal();  but we can create static methods in abstract class

static void goal(){
    System.out.println("Goal is to become a doctor.");
}

//we can also create normal methods inside abstract class 
    void hello(){
        System.out.println("hey");
    }

//abstract methods are the methods which has only the signature(definition) in the abstract 
//class but not the body and are overridden by the child class 

    abstract void career();
    abstract void partner();
}

class Child extends Parent{
    Child(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become a developer.");
    }
    @Override
    void partner() {
        System.out.println("I love Nishu");
    }
}
