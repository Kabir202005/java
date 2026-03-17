public class Final {
    final int x = 10;
    final int y = 30;
    public static void main(String[] args){
        Final obj =  new Final();
        obj.x = 40;
        obj.y = 50;
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}

/*  Will generate an error
           ^
Final.java:6: error: cannot assign a value to final variable x
        obj.x = 40;
           ^
Final.java:7: error: cannot assign a value to final variable y
        obj.y = 50;

*/