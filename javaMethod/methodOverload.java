public class methodOverload {
    static int myMethod(int x){
        return x+5;
    }
    static float myMethod(float x){
        return x + 4f;
    }
    static double myMethod(double x){
        return x+3d;
    }

public static void main(String[] args){
    System.out.println(myMethod(5));
    System.out.println(myMethod(5.5f));
    System.out.println(myMethod(2344555566666666d));
}
}
