class shape{
    public void area(){
        System.out.println("Area of different shapes");
    }
}

class triangle extends shape{
    public void area(int l, int h){
        System.out.println("Area of the triangle is : "+ (0.5)*l*h);
    }
}

public class single_level_inheritance{
    public static void main(String args[]){
        triangle t = new triangle();
        t.area();
        t.area(10,10);
    }
}