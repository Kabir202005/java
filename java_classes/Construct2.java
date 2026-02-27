// Initialize constructor with parameters which is taken  by the user
import java.util.Scanner;
public class Construct2 {

    public Construct2(Scanner sc){

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
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        new Construct2(sc);
        sc.close();

    }
    
}