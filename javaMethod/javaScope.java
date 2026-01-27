// Scope are known as the variables are only accesible inside the region where they are defined.
public class javaScope {
    public static void main(String[] args){
        // Here code cannot use x
        int x = 3;
        // Here code can use x
        System.out.println(x);
    }
}
// In Java Scope we also have Block Scope and Loop Scope

// BLOCK SCOPE

// - A block of code refers to the code between the curly braces{}.
// - Variables declared inside a block of code are only accessible within that block.


/*  public class javaScope {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

    // Code here CANNOT use x

  }
}
  */


// LOOP SCOPE

// - variables declared inside a loop are only accessible within that loop.

/*public class Main {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.out.println(i); // i is accessible here
    }

    // i is NOT accessible here
  }
} */