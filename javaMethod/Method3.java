public class Method3 {
    static void Checkage(int age) {

        if(age<18){
            System.out.println("Access denied");
        }else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[]args){
        Checkage(20);
    }
    
}
