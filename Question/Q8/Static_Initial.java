import java.util.Scanner;
public class Static_Initial {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int B = sc.nextInt();
    int H = sc.nextInt();

    int area = B * H;

    if(B > 0 && H > 0){
        System.out.println(area);

    }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    sc.close();
    
}
}
