// A static method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.

public class Static {
    static void method(){
        System.out.println("Static method can be called without creating object");
    }
    public static void main(String[] args){
        method();
        Static.method();//We can also call static method by using class name
    }
}
