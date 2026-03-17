//abstract class
abstract class Abstract1 {
    public int age = 21;
    public String fname = "Kabir";
    public abstract void study();//abstract method
}
// Subclass(inherit from Abstract1)
class Student extends Abstract1{
    public int graduationyear = 2027;
    public void study(){
        System.out.println("study all day long");
    }
}