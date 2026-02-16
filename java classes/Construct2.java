// Initialize constructor with parameters which is taken  by the user
import java.util.Scanner;
public class Construct2 {

    public Construct2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y: ");
        int y = sc.nextInt();

        int Z = x*y;
        System.out.println("The Multiplication Of "+ x +" and "+ y +" is: " + Z);
    }
    public static void main(String[] args){
        Construct2 myobj = new Construct2();

    }
    
}
