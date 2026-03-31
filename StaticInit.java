package OOPS;

public class StaticInit {
    static int a = 4;
    static int b;
//the static block only runs for once
//you create as many object as you want but the block will run only once
    static {
        System.out.println("I am a static block");
        b = a * 5;  // here b = 20
    }

    public static void main(String[] args){
        StaticInit obj1 = new StaticInit();
        System.out.println(obj1.a + " " + obj1.b); // 4, 20
        
        StaticInit.b += 3; //here value is 23
        StaticInit obj2 = new StaticInit();
        System.out.println(obj2.a + " " + obj2.b); // 4, 23
    }
}
