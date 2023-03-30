import java.util.EmptyStackException;
import javax.naming.NoPermissionException;

/* Create a node class that stores data and refrences to nodes
   within the data structure.
 */
public class Node {
    private int data; // Hold the data of the node.
    private Node prev; // Hold the refrence to the previous node.
    private Node next; // Hold the refrence to the next node.

    Node() { // Create a default constructor that accepts nothing and creates a
        data = 0; // node that refrences nothing.
        prev = null;
        next = null;
    }

    Node(int data) { // Create a node that stores data and holds
        this.data = data; // refrences to surrounding nodes.
        this.prev = null;
        this.next = null;
    }

    Node(Node input) { // Create a constructor that accepts nodes to make a copy.
        this.data = input.data;
        this.prev = input.prev;
        this.next = input.next;
    }

    public void setPrev(Node prev) { // Set the previous node.
        this.prev = prev;
    }

    public void setNext(Node next) { // Set the next node.
        this.next = next;
    }

    public Node prevNode() { // Get the previous node.
        return prev;
    }

    public Node nextNode() { // Get the next node.
        return next;
    }

    public int getData() { // Get the data from the node.
        return data;
    }
}
