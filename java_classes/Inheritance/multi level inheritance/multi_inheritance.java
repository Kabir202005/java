class car{
    String color;
    String brand;
    public void color(){
        System.out.println("The color of the car is : " + color);
        System.out.println("The brand of the car is : " + brand);
    }
}

class BMW extends car{
    String model;
    public void model(){
        System.out.println("The model of the car is : " + model);
    }
}

class X1 extends BMW{
    int price;
    public void price(){
        System.out.println("The price of the car is : " + price);
    }
}

public class multi_inheritance{
    public static void main(String args[]){
        X1 SUV = new X1();
        SUV.color = "White";
        SUV.brand = "BMW";
        SUV.model = "X1";
        SUV.price = 5000000;

        SUV.color();
        SUV.model();
        SUV.price();
    }
}

