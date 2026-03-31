package OOPS;

//Outside classes cannot be static
//since the stuff which is static must be dependent on the another class
//but the outer classes cannot depend on any other class(since they are the outer class)
//As we can see that the class is not static
public class InnerClasses {
    static class Test{
        String name;

        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        
        System.out.println(a.name);
        System.out.println(b.name);
//if the Test class is static then output kunal and Rahul
//if the prop is static then Rahul and Rahul(since print statement dono ki last me hai)

    }
}

//if the class Test(which is dependent on the InnerClasses class) is not static 
//then we can't use it inside the main function(will give error) for the obvious reason that
//main is static and we can't use non-static stuff inside a static stuff
//that's why, to use it inside the static stuff we need to make it static