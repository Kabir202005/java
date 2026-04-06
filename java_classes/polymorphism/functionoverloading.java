 class Student {

    String name;
    int age;

    public void studentinfo(String name){
        System.out.println("Name of the student is: "+  name);

    }

    public void studentinfo(int age){
        System.out.println("Age of the student is: "+ age);
    }

    public void studentinfo(String name, int age){
        System.out.println(name + " is "+ age + " years old");
    }
}

public class functionoverloading{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Kabir";
        s1.age = 21;

        s1.studentinfo(s1.name ,s1.age);
        s1.studentinfo(s1.age);
    }

}

