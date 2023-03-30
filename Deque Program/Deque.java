
/* Create the deque data structure that holds node and functions
   like a linked list.
 */
import java.lang.Exception;
import java.util.ArrayDeque;

public class Deque {
    private Node head = new Node(); // The starting point of the deque that holds no information other than a
    // refrence to the next node.
    private Node tail = new Node(); // The ending point of the dqeue that holds no information other than a refrence
    // to the prev node.
    private int size; // Hold the size of deque.

    public Deque() {
        size = 0;
    }

    public boolean isEmpty() { // Checks the size and sees if the deque is empty. Returns a boolean value.
        if (size == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public void addFront(int data) { // Adding a node at the start of the data deque.
        Node temp1 = new Node(data);

        if (isEmpty()) { // Checks to see if the deque is empty.
            head.setNext(temp1);
            tail.setPrev(temp1);
            ++size; // Increments size to keep track of the total in it.
        }

        else {
            head.nextNode().setPrev(temp1);
            temp1.setNext(head.nextNode());
            head.setNext(temp1);
            ++size;
        }
    }

    public void addBack(int data) { // Adding a node to the end of the deque.
        Node temp1 = new Node(data);

        if (isEmpty()) { // Checks to see if it is empty.
            head.setNext(temp1);
            tail.setPrev(temp1);
            ++size; // Increments size to keep track of the total.
        }

        else {
            tail.prevNode().setNext(temp1);
            temp1.setPrev(tail.prevNode());
            tail.setPrev(temp1);
            ++size;
        }
    }

    public void deleteFront() throws UnsupportedOperationException {
        if (isEmpty()) { // Check if the deque has anything in it. If not throw an exception.
            throw new UnsupportedOperationException("The deque was already empty.");

        }

        else {
            Node temp1 = new Node(head.nextNode()); // Get the first node in the deque.
            --size; // Update the size of deque.

            if (size == 0) { // Check the size of the deque and sets node refrences accordingly.
                head = null;
                tail = null;
                temp1.setNext(null); // Clear the temp 1 node making it not refrence anything so i can be cleaned up.
                temp1.setPrev(null);
            }

            else { // Sets the proper refrences to the nodes.
                head.setNext(temp1.nextNode()); // Set the head node nextNode to the node after temp1.
                temp1.nextNode().setPrev(null); // Set the node after temp1 to reference the head node.
                temp1.setNext(null); // Clear the temp1 node making it not refrence anything so it can be cleaned up.
                temp1.setPrev(null);
            }
        }
    }

    public void deleteBack() throws UnsupportedOperationException {
        if (isEmpty()) {
            throw new UnsupportedOperationException("The deque was already empty.");
        }

        else {
            Node temp1 = new Node(tail.prevNode()); // Get the last node in the deque.
            --size;

            if (size == 0) { // Check the size of deque and sets node refrences accordingly.
                head = null;
                tail = null;
                temp1.setNext(null);
                temp1.setPrev(null);
            }

            else { // Creates the proper refrences to the nodes.
                tail.setPrev(temp1.prevNode());
                temp1.prevNode().setNext(null);
                temp1.setNext(null);
                temp1.setPrev(null);
            }
        }
    }

    public int showSize() { // Returns the size of the data structure.
        return size;
    }

    public int[] checkData() throws ArrayIndexOutOfBoundsException { // Create an int array with all the data from the
                                                                     // nodes.
        if (isEmpty()) { // Checks the size of deque to see it is empty.
            throw new ArrayIndexOutOfBoundsException("The deque is empty.");
        }

        else {
            Node tempNode = head.nextNode(); // Creates a refrence to the first node.

            int tempArray[] = new int[size]; // Sets the array size equal to the size of deque.

            for (int i = 0; i < size; i++) {
                tempArray[i] = tempNode.getData(); // Sets that index equal to the data of the current node.
                tempNode = tempNode.nextNode(); // Increments the node in deque.
            }
            return tempArray;
        }

    }

}