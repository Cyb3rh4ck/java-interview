package Question18;

/**
 * 18. What happens if you call super() in a constructor of a class, but there is no explicit call to super()?
 *
 * Answer:
 * Explicit call to super(): If you explicitly call super() in a constructor, it invokes the no-argument constructor of the superclass.
 * No explicit call to super(): If there's no explicit call to super() in the constructor of a class, Java automatically inserts a call to super() at the beginning of the constructor.
 * This means:
 * - If the superclass does not have a no-argument
 * constructor, and you don't explicitly call another superclass constructor, you'll get a compile-time error because Java can't insert the default super() call.
 * - If the superclass has a no-argument constructor (either explicitly defined or provided by default if no constructors are defined), then the compiler will insert super() at the start of your constructor .
 */

public class Test {
    public static void main(String[] args) {
        new Subclass();
    }
}
