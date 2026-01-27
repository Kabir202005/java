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
            sc.close();
        }

 }
//  sum() method adds parameter k to the sum of all numbers smaller than k and returns the result.
/*
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 
*/

// HALTING CONDITION

/*- recursive methods can run into the problem of infinite recursion 
  - recursive methods can run into the problem of infinite recursion.
*/

// import java.util.Scanner;
// public class javaRecursion{
//     public static int sum(int Start, int end){
//             if(end > Start){
//                 return end + sum(Start , end-1);
//             }else{
//                 return 0;
//             }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the starting value :");
//         int m = sc.nextInt();

//         System.out.println("enter th eending value : ");
//         int n = sc.nextInt();

//         System.out.println(sum(m,n));
//     }
// }

/*
    10 + sum(0, (9))
    10 + 9 + sum(0, (8))
    10 + 9 + 8 + sum(0, (7))
    ...
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0, (0))
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0


*/
