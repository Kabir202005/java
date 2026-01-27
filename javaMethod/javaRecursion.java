// recursion is technique of making a function call itself
import java.util.Scanner;
public class javaRecursion{
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else{
            return 0;
        }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Value : ");
            int n = sc.nextInt();
            System.out.println(sum(n));
        }

}