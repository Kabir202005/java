import java.util.Scanner;

public class printf{

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){//loop to take inputs 3 times

        String f = sc.next();
        int s = sc.nextInt();
        // Below we add a condition for the digits of two place for all the values less than 100 to add 0 before the number
            if(s<100){
                System.out.printf("%-15s%03d%n",f,s);
            }else{
        System.out.printf("%-15s%3d%n",f,s);
            }
        }
        System.out.println("================================");
        sc.close();
    }
}



// Below is the approach using BufferedReader.

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printf{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("================================");
        for(int i=0;i<3;i++){

        Below the input is taken is split into two parts, because in BufferedReader we take the whole input as a string
        and then we split it into two parts.

            String input =br.readLine();
            String[] parts = input.split(" ");

            String f = parts[0];
            int s = Integer.parseInt(parts[1]);

        in BufferedReader approach we dont need to take if condition as in scanner approach because
        in bufferedReader Automatically:5 → 005

        
            System.out.printf("%-15s%03d%n",f,s);
        }
        System.out.println("================================");
        br.close();
    }
}
*/