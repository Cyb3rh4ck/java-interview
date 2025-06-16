package Question19;

/**
 * When using the == operator to compare two objects in Java, you are performing a reference comparison, not a value comparison. This means:
 *
 * == returns true only if both references point to the exact same object in memory.
 *
 * If two objects have the same value but are different instances, == will return false because they are not the same reference.
 *
 * To compare the contents or values of objects, use the .equals() method, which can be overridden by classes to define what value equality means.
 */

public class Testf {
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("a");
        System.out.println(a == b); // false (different objects)
        System.out.println(a.equals(b)); // true  (same value)
    }
}

/**
 * Use == for checking if two references point to the same object. Use .equals() for checking if two objects are logically equal in value.
 */
