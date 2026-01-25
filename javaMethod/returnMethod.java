//if we want to return something from a method, we need to specify the return type on the place of void 
public class returnMethod {
    static int myMethod(int x){
        return x-6;
    }
    public static void main(String[] args){
        System.out.println(myMethod(4));
    }
    
}
