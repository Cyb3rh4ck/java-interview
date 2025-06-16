package Question23;

/**
 * 23. Can we define an interface within a class?
 * Answer:
 * Yes, in Java you can define an interface inside a class, and this is called a nested interface.
 *
 * A nested interface is typically used when the interface is tightly coupled to its enclosing class and is not intended to be used independently elsewhere. This enhances encapsulation and logical grouping.
 */

class OuterClass {
    public interface NestedInterface {
        void someMethod();
    }
}

//optional usage example
class InnerImpl implements OuterClass.NestedInterface {

    public void someMethod() {
        System.out.println("InnerImpl.someMethod()");
    }
}

public class Test {
    public static void main(String[] args) {
        OuterClass.NestedInterface ref = new OuterClass().new InnerImpl();
        ref.someMethod();
    }
}
