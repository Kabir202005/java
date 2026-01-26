//Show the double of the no. 1 through 5 using a method (like double of 1 is 2 and 2 is 4 and so on).
public class doubleGame {
    static int myMethod(int x ){
        return x*2;
    }
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            System.out.println("Double of "+ i + " is "+ myMethod( i));
        }
    }
    
}
