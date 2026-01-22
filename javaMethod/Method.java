// A method is a block of code which only runs when it is called.
// We can  pass Data, Known as parameters, into a method.
// We use methos to reuse code: define the code once, and use it many times.

public class Method {
     static void myMethod(String Numbers){//we use static means the method belongs to the main class and can be called without creating an object of the main class.
            System.out.println("The number is: " + Numbers);
    }
    public static void main(String[] args){
        myMethod("15");//we can call the method multiple times
        myMethod("23");
        myMethod("45");
    }
}
