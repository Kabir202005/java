interface area{
    public void area(int r);
}
interface perimeter{
    public void perimeter(int r);
}
class circle implements area, perimeter{
    int r;
    public void area(int r){
        System.out.println("Area of circle is: "+(3.14)*r*r);
    }
    public void perimeter(int r){
        System.out.println("Perimeter of circle is: "+(2*3.14*r));
    }
    public void display(){
        area(r);
        perimeter(r);
    }
}
public class multiple{
    public static void main(String args[]){
        circle c = new circle();
        c.r = 5;
        c.display();
    }
}