class Person{
    public String name = "kabir";
    private int  age = 30; 
}
public class PvsP{
    public static void main(String[] args){

        Person obj = new Person();
        System.out.println(obj.name);
        // System.out.println(obj.age); [error : age has private access in person]
        
}
}
/*
    It shows an error 
    [error: age has private access in Person
    System.out.println(obj.age);]

    Explanation: Here, name is declared as public, so it can be accessed from outside the Person class. But age is declared as private, so it can only be used inside the Person class.
*/