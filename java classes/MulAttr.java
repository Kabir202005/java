public class MulAttr {
    String fname = "Kabir";
    String lname = "Solanki";
    int age = 20;

public static void main(String[] args){
    MulAttr myObj1 = new MulAttr();
    MulAttr myObj2 = new MulAttr();
    myObj2.age = 25;
    System.out.println("Name: "+myObj1.fname+" "+myObj1.lname);
    System.out.println("Age: "+myObj1.age);
    System.out.println("After 5 years: "+myObj2.age);

}
}
