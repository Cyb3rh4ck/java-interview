package Question22;

/**
 * 22. How does Java’s garbage collector work when an object becomes unreachable but still has references?
 * Answer:
 * Java’s garbage collector is based on the concept of reachability, not simply the existence of references between objects.
 *
 * The collector starts from a set of known references called GC Roots, which include:
 *
 * Local variables in active stack frames
 *
 * Static fields
 *
 * Active thread references
 *
 * JNI references
 *
 * An object is considered reachable if it can be accessed directly or indirectly from any of these GC Roots.
 *
 * If an object cannot be reached from any GC Root, it is eligible for garbage collection—even if:
 *
 * It still holds references to other unreachable objects
 *
 * It's part of a reference cycle (e.g., A → B → A)
 *
 * This design allows Java to safely collect groups of objects that are no longer in use, regardless of whether they reference each other.
 *
 * Example:
 */

class Node{
    Node next;
}

public class Test {
    public static void main(String[] args) {
        Node node1  = new Node();
        Node node2  = new Node();

        // Break external reference
        node1.next = null;
        node2.next = null;

        // The cycle is unreachable from GC root, si it´s collectible
    }
}

/**
 * Key takeaway:
 * Java handles cyclic references gracefully. The garbage collector doesn’t rely on reference counting—it performs reachability analysis to determine which objects are no longer in use.
 */
