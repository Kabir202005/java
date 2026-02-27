// Modifiers in java is use to declare the access level of a class,method,attribute or constructor.
/*
The are two types of Modifiers in java :
  - Access Modifiers - controls the access level.
  - Non-Access Modifiers - do not control access level, but provides other functionality.

  ACCESS MODIFIERS:
    - public : accessible from any other class. (We use public alot in our whole session)
    - private : accessible only within the declared class. 
    - protected : accessible within the same package and subclasses.
    - default : accessible only within the same package. (if no access modifier is specified)
  */

public class Modifiers{
    private String fname = "Kabir";
    private String Lname = "Solanki";
    private int age = 21;
    private String Mail = "Kabir@gmail.com";
    public static void main(String[] args){
        Modifiers myobj = new Modifiers();
        System.out.println("name : "+ myobj.fname + " " + myobj.Lname);
        System.out.println("age : " + myobj.age);
        System.out.println("Mail : " + myobj.Mail);
}    

}