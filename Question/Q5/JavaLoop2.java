import java.util.Scanner;

public class JavaLoop2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for(int i = 0; i<q ;i++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int s = a;
            
            for(int j = 0;j<n;j++){
                    
                    
                      s = s +(1<<j)*b;
                       
                    System.out.print(s+" ");
            }
            System.out.println();
            
            
            
            
        }
        sc.close();
        
    }
}
