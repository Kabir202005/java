//"This" Keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
// public class This {
//     int x ; // class variable
//     public This(int x){
//         this.x = x; // refers to the class variable x
//     }
//     public static void main(String[] args){
//         // object of Main and pass the value 5 to the constructor
//         This myObj = new This(5);
//         System.out.println(myObj.x);
//     }
// }

// we can use "This" to call the constructor in the same class

 public class This{
        int modelyear;
        String modelname;
        
        public This(String modelname){
            this(2020,modelname);
            }
        public This(int modelyear, String modelname){
            this.modelyear = modelyear;
            this.modelname = modelname;
            }
        public void printInfo(){
            System.out.println(modelyear + " " + modelname);
            }
        public static void main(String[] args){
            This car1 = new This("Mustang");
            This car2 = new This("AMG");
            car1.printInfo();
            car2.printInfo();
            }} 