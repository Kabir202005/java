
import java.util.Scanner;
public class In_Out {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Double num2 = sc.nextDouble();

        sc.nextLine(); // Consume the newLine character left by nextDouble()

        String text = sc.nextLine();

        System.out.println("Integer: "+num);
        System.out.println("Double: "+num2);
        System.out.println("String: "+text);


    }

    
}
