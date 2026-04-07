Multiple Inheritance is an object-oriented concept where a class can inherit from more than one parent class. While powerful, it can cause ambiguity when multiple parents have the same methods.

If two of the parent classes have a method with the same signature, the compiler cannot determine which one to execute.
This ambiguity is the reason Java does not support multiple inheritance with classes.

Multiple Inheritance in java can be achieved by interfaces.

as we shown in the example in multiple.java file.

The issue in using the class in multiple Inheritance is explained below.

class area {
    public void area(int r){
        System.out.println("Area: " + (3.14*r*r));
    }
}

class perimeter {
    public void perimeter(int r){
        System.out.println("Perimeter: " + (2*3.14*r));
    }
}

class circle extends area, perimeter {
    int r;

    public void display(){
        area(r);
        perimeter(r);
    }
}

public class multiple{
    public static void main(String args[]){
        circle c = new circle();
        c.r = 5;
        c.display();
    }
}

If the java allows multiple inheritance the above code will run without any error but the issue is the java doesnt allow
"class circle extends area, perimeter" 

Or one more reason called the "Diamond problem" in which this scenerio cause the ambiguity like if area has it's own variable
integer r and perimeter also have their own variable integer r or if we define both r in main class 
then it will cause ambiguity of r or the Diamond effect.