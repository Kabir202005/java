// import java.util.Scanner;
// public class add{
//     public static void main(String [] args){
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter your Name :");
//         String name = sc.nextLine();
//         System.out.println("Enter your age :");
//         int age = sc.nextInt();

//         if(age<=18){
//             System.out.println("Not eligible for work");
//         }if(age>50){
//             System.out.println("Eligible but retirement soon");
//         } else if(age<=20){
//                 System.out.println("Take time to learn skills");
//         }
//         else{
//                 System.out.println("Eligible for work");
//             }
//             sc.close();
        
//     }
// }

        
        
        
        
        
        
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name : ");
        // String name = sc.next();

        // System.out.println("hello" + name);

        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();
        // System.out.println("Your age is : " + age);
        // sc.close();
//     }
// }




// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class add{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter your name : ");
//         String name = br.readLine();

//         System.out.println("Enter your age : ");
//         int age = Integer.parseInt(br.readLine());

//         System.out.println("Hello " +name+",Your age is " +age);
//     }

// }


// import java.util.Scanner;
// public class add{
//         public static void main(String[] args){
                

                // Scanner sc = new Scanner(System.in);
                // System.out.println("Enter yout age : ");
                // int age = sc.nextInt();
                
//                 if(age>18){
//                         Scanner ab = new Scanner(System.in);
//                         System.out.println("Enter your name : ");
//                         String name = ab.nextLine();


//                         System.out.print("So now you are also a member mister "+ name);
//         }       else{
//                         System.out.println("You are Not eligible");
//                 }
//                 sc.close();

//         }
// }

// public class add{
//         public static void main(String[] args){
//                 int  dice = 0;
//                 while(dice <= 6){
//                         if(dice < 6){
//                                 System.out.println("No Yatzy");
//                         }
//                         else{
//                                 System.out.println("Yatzy");
//                         }
//                         dice++;
//                 }
//         }
// }

// import java.util.Scanner;
// public class add{
//         public static void main(String[]args){

//                 Scanner sc = new Scanner(System.in);

//                 System.out.print("Enter the number : ");
//                 int k = sc.nextInt();
//                 System.out.print("The numbers before are : ");

//                 for(int i=0;i < k;i++){
//                         System.out.println( i );
//                 }
//                 sc.close();

//         }
// }


//print all the even numbers before the number you entered
// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the number : ");
//                 int k = sc.nextInt();

//                 for(int i=0; i<k;i++){
//                         if(i%2 == 0){
//                                 System.out.println(i);
//                         }
//                 }
//         }
// }

// print the sum of all number which comes before the number you entered

// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner (System.in);
//                 System.out.println("Enter the Number : ");
//                 int k = sc.nextInt();
//                 int sum = 0;
//                 for(int i = 0;i <= k;i++){

//                         sum = sum+i;
//                         System.out.println("sum is : " + sum);
//                 }
//                 sc.close();
//         }
// }


// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the timer : ");
//                 int t = sc.nextInt();

//                 for(int i = t ; i >= 0; i--){
//                         System.out.println(i);
//                 }
//                 System.out.print("Hoorah our countdown timer is working");
//                 sc.close();

//         }
// }


// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 // Scanner sc = new Scanner(System.in);
//                 // System.out.print("Enter the number : ");
//                 // int n = sc.nextInt();

//                 for(int i=1;i<=10;i++){
//                         for(int j =1;j<=10;j++){
//                                 System.out.print(i * j + " ");
//                         }
//                         System.out.println( );
//                 }
//                 // sc.close();
//         }       
// }

// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the factorial no. : ");
//                 int n = sc.nextInt();
//                 int fact = 1;

//                 for(int i = 1 ;i<=n; i++){
//                         fact =  fact*i;
//                 }
//                 System.out.println(fact);
//                 sc.close();
//         }
// }


// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter your String : ");
//                 String cars = sc.nextLine();

//                 System.out.print("your String is : "+"{"+ cars + "}");

//                 sc.close();
//         }
// }

// class add{
//         public static void main(String[] args){
//         String[] cars = {"BMW","Audi","Ford","Mazda"};
        
//         System.out.println(cars[0]);
//         }

// }

// class add{
//         public static void main(String[] args){
//                 String[] cars = {"BMW","Audi","Ford","Mazda"};

//                 for(int i = 0 ; i <cars.length;i++){

//                         System.out.println(cars[i]);
//                 }
//         }
// }



// class add{
//         public static void main(String[] args){
//                 int[] a ={10,20,30,40,50};
//                 int sum = 0;

//                 for(int i =0;i<a.length;i++){
//                         sum += a[i];
//                 }
//                 System.out.println(sum);
              

//         }
// }





// class add{
//         public static void main(String[] args){
//                 int[] a = {10,20,30,40,50,60,70,80,90};

//                 int sum = 0;
//                 int length = a.length;
                
//                 float avg = 0;

//                 for(int i =0;i<a.length;i++){

//                         sum += a[i];

//                         avg = sum/length;

//                 }
//                 System.out.print(avg);
//         }
// }


// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the size of the array : ");
//                 int n = sc.nextInt();

//                 int [] arr = new int[n];

//                 int sum = 0;
//                 float avg = 0;
//                 int length = arr.length;
                
//                 System.out.print("Enter "+ n + " elements : ");
                
//                 for(int i=0;i<n;i++){
//                         arr[i] = sc.nextInt();
                        
//                 }
//                 System.out.print("array elements are : {");

//                 for(int i =0 ; i<n ; i++){
//                         System.out.print ( + arr[i] + "," );
//                 }
//                 System.out.print("}");
//                 sc.close();
                
//                 System.out.println();
                
//                 for(int i=0;i<arr.length;i++){
//                         sum += arr[i];
//                         avg = sum/length;
//                 }
//                 System.out.println("the avg of the arr is : " + avg);
//         }

// }

// import java.util.Scanner;
// class add{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the size of the array : ");
//                 int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.print("Enter " + n + "elements : ");

//         for(int i =0 ; i<n ; i++){
//                 arr[i] = sc.nextInt();        
//         }
//         System.out.print("The array elements are : {");

//         for(int i =0 ; i<n ;i++){
//                 System.out.print(arr[i] + ",");

//         }
//         System.out.print("}");
        
//         for(int i : arr){
//                 if(i < 0){
//                         continue;
//                 }
//                 if(i==0){
//                         break;
//                 }       System.out.println(i);

//                 }
//         sc.close();

//         }
// }


// import java.util.Scanner;
// class add{
//         public static void  main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the size of the array : ");

//                 int n = sc.nextInt();

//                 int arr[] = new int [n];
                
                
                
//                 System.out.print("Enter " + n + " elements : ");
                
//                 for(int i=0 ; i < n ; i++){
//                         arr[i] = sc.nextInt();


//                 }
//                         int max =arr[0];
//                         int min = arr[0];

//                         for(int i : arr){
                        
//                         if (i > max) {
//                                 max = i;
//                         }

//                         if(i < min){
//                                 min = i;
//                         }
//                 }
                
//                 System.out.println(min);
//                 System.out.println(max);
                
//         }
// }

// import java.util.Scanner;
// public class add{
//         public static void main(String[] args){
//                 Scanner sk = new Scanner(System.in);
//                 System.out.print("Enter your name: ");
//                 String n = sk.nextLine();
//                 System.out.println("your name is jitin: "+n);
//                 sk.close();

//         }
// }
