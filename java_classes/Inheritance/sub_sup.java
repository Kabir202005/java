class sub_sup {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut");
    }
}
class Car extends sub_sup{
    private String modelname = "Mustang";
    public static void main(String[] args){
        Car myfastcar = new Car();
        myfastcar.honk();
        System.out.println(myfastcar.brand+" "+ myfastcar.modelname);
    }
    
}
