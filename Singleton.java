package OOPS;

//the goal is to prevent the creation of more than 1 object of a class
// i.e. Only one object of the class exists
//to do so, we have to restrict the constructor to be called from the other files/packages
//in the same file we can call it as many times as we want 
public class Singleton {
    
    private  static Singleton instance;

    private Singleton(){
        //now no object can call this constructor from a diff file/package
    }

    public static Singleton getInstance(){
        if(instance == null){//check whether an instance is there or not
            instance = new Singleton();//(when the very first obj is calling)if not create one/ if 
            // created(when another obj is calling)
        }

        return instance;// and return it / return the same one which is already being created
    }


    public static void main(String[] args) {
        // Singleton sa = Singleton.getInstance();
        // Singleton sa1 = Singleton.getInstance();
        // Singleton sa2 = Singleton.getInstance();
        

    }
}
