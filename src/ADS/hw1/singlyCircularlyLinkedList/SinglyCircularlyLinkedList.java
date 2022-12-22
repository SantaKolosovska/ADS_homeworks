package ADS.hw1.singlyCircularlyLinkedList;


public class SinglyCircularlyLinkedList {
    private Node lastNode;
    private int currentPosition;

    private static final int MAX_LENGTH = 7;

    private Node[] array = new Node[MAX_LENGTH];

    public SinglyCircularlyLinkedList() {
        lastNode = null;
        currentPosition = 0;
    }


    // addNodeAtBeginning()
    public void addNodeAtBeginning(Node node) {
        array[0] = node;
        node.next = array[1];
    }

    // addNodeAtPosition()
    public void addNodeAtPosition(Node node, int position) {
        array[position] = node;
        node.next = array[position+1];
    }

    // addNodeAtEnd()
    public void addNodeAtEnd(Node node) {
        array[MAX_LENGTH-1] = node;
        node.next = array[0];
    }

    // deleteFirstNode()

    // deleteAtPosition()

    // deleteLastNode()

//    search() – to find an element in the list

//    isEmpty() – to check whether a list is empty

//    display() – to print a list
    class Node {
        private Node next;
        private Object data;

        public Node(Object dataForNode) {
            data = dataForNode;
        }
    }
}
