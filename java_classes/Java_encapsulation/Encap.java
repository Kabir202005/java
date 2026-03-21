package java_classes.Java_encapsulation;    

public class Encap {
    private String name;

    // Getter
    public String getname(){
        return name;
    }
    // Setter
    public void setname(String newname){
        this.name = newname;
    }
    
}

// Example explained
// The get method returns the value of the variable name.

// The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.

// However, as the name variable is declared as private, we cannot access it from outside this class: