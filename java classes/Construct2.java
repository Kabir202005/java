// Initialize constructor with parameters which is taken  by the user
import java.util.Scanner;
public class Construct2 {

    public Construct2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y: ");
        int y = sc.nextInt();

        sc.nextLine(); //Consume the newline character left by nextInt();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int Z = x*y;
        System.out.println("The Multiplication Of "+ x +" and "+ y +" is: " + Z);
        System.out.println("Your name is: "+name);
    }
    public static void main(String[] args){
        Construct2 Obj = new Construct2();
        Construct2 obj1 = new Construct2();
        Construct2 obj2 = new Construct2();
        Construct2 obj3 = new Construct2();
        Construct2 obj4 = new Construct2();

    }
    
}