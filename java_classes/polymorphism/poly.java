public class poly {// This class is the parent class of dog and pig and it has a method call animal sound
    public void animalsound(){
        System.out.println("The animal makes a sound: ");
    }
}
class pig extends poly{
    public void animalsound(){
        System.out.println("The pig says: wee wee");
    }
}
class dog extends poly{
    public void animalsound(){
        System.out.println("The dog says: bow bow");
    }
}
class Main{
    public static void main(String[] args){
        poly animal = new poly();
        poly mypig = new pig();    
        poly mydog = new dog();

        animal.animalsound();
        mypig.animalsound();
        mydog.animalsound();
    }
}
    

