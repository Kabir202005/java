// Constructor in java is a special method that is used to initialize the object,
// constructor is called when an object of a class is created.

public class Construct{
    int x;
    public Construct(){
        x = 5;
    }
    public static void main(String[] args){
        Construct myobj = new Construct();
        System.out.println(myobj.x);
    }
}
