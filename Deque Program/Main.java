public class Main {

    public static void print(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addBack(5);
        deque.addBack(10);
        deque.addBack(27);

        deque.addFront(17);
        deque.addFront(40);

        print(deque.checkData());
        System.out.println();

        deque.deleteBack();

        deque.deleteFront();

        deque.addFront(15);
        deque.addFront(30);

        print(deque.checkData());

    }
}
