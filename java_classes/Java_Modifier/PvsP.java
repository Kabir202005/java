class Person{
    public String name = "kabir";
    private int  age = 30; 
}
public class PvsP{
    public static void main(String[] args){

        Person obj = new Person();
        System.out.println(obj.name);
        System.out.println(obj.age);
        
}
}
/*
    It shows an error 
    [error: age has private access in Person
    System.out.println(obj.age);]
*/