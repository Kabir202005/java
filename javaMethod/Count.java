// Countdown with recursion
import java.util.Scanner;
public class Count {
    public static void countdown(int n){
        if(n > 0){
            System.out.println(n+ " ");
            countdown(n-1);
        }
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int num = sc.nextInt();
            countdown(num);
            sc.close();
    }
    
}

