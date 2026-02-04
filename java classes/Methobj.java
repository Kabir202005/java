public class Methobj {
    // create a fullThrottle method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    // create a speed method and add a parameter
    public void speed(int maxspeed){
        System.out.println("Max speed is: "+maxspeed);
    }
    public static void main(String[] args){
        Methobj mycar = new Methobj();//create an object of Mthobj
        mycar.fullThrottle();
        mycar.speed(200);
    }
}
