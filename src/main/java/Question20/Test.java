package Question20;

/**
 * 20. What will happen if you try to invoke a static method on a null object reference?
 * Answer:
 * Invoking a static method on a null object reference does not throw a NullPointerException in Java. This is because:
 *
 * Static methods belong to the class, not to any instance. They are resolved at compile-time based on the reference type, not the object itself.
 *
 * Even if the reference is null, the compiler treats the static method call as if it were made on the class itself.
 *
 * Example:
 */

class MyClass {
    static void sayHello() {
        System.out.println("Hello");
    }
}

public class Test {
    public static void main(String[] args) {
        MyClass myClass = null;
        myClass.sayHello(); // This works! Prints: Hello!
    }
}


/**
 * This compiles and runs without error because sayHello() is a static method, and the reference (obj) is only used to access the class—not an actual instance.
 *
 * ⚠️ Note: Although this is allowed, it’s considered poor practice. Static methods should ideally be called using the class name (e.g., MyClass.sayHello()), not an object reference—even if it's not null—for clarity and readability.
 */
