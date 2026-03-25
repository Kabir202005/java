import java.io.*;
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            
            String s = br.readLine();
            
            try{
                Long n = Long.parseLong(s);
                
                System.out.println(n+" can be fitted in:");
                
                
                if(n >= -128 && n <= 127){
                    System.out.println("* byte");
                }if(n >= -32768 && n <= 32767){
                    System.out.println("* short");
                }if(n >= -2147483648 && n <= 2147483647){
                    System.out.println("* int");
                }if(n >= -9223372036854775808L && n <= 9223372036854775807L){
                    System.out.println("* long");
                }
        }catch(NumberFormatException e){
            System.out.println(s+" can't be fitted anywhere.");
        }
        }
        br.close();
        
    }
}