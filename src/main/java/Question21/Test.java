package Question21;

/**
 * 21. Can we have multiple main() methods in a Java class?
 * Answer:
 * Yes, you can have multiple main() methods in a Java class through method overloading. This means you can define multiple methods with the name main as long as they have different parameter lists.
 *
 * However, only the method with the exact signature:
 *
 * public static void main(String[] args)
 *
 * is recognized by the Java Virtual Machine (JVM) as the entry point of the application when the program is executed.
 *
 * Example:
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main("one","two");
    }

    public static void main(String arg1, String arg2){
        System.out.println("Overloaded main method: "+arg1+", "+arg2);
    }

    public static void main(int x){
        System.out.println("Overloaded main method with int : "+x);
    }
}

/**
 * Note: The overloaded main() methods won’t be executed automatically. You must call them explicitly from within the public static void main(String[] args) method.
 */
