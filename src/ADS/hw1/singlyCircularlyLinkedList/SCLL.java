package ADS.hw1.singlyCircularlyLinkedList;

import java.util.NoSuchElementException;

public class SCLL {

    private Node tail;

    private Node head;

    public SCLL() {
    }

    public void addNodeAtBeginning(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            Node oldHead = head;
            head = newNode;
            head.next = oldHead;
        }

        tail.next = head;
    }

    public void addNodeAtPosition(Object data, int position) {
        Node newNode = new Node(data);
        int counter = 1;

        Node currentNode = head;

        while (currentNode.next != head) {
            if (counter == position - 1) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
            counter++;
        }
    }

    public void addNodeAtEnd(Object data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = newNode;
            head = tail;
            tail.next = head;
        } else {
            Node oldTail = tail;
            tail = newNode;
            tail.next = head;
            oldTail.next = newNode;
        }
    }

    public void deleteFirstNode() {
        if (head != null && head.next == null) {
            head.data = null;
            head = null;
        }

        if (head != null) {
            Node newHead = head.next;
            head.data = null;
            head.next = null;
            head = newHead;
            tail.next = head;
        }
    }

    public void deleteAtPosition(int position) {
        int counter = 1;

        Node currentNode = head;

        while (currentNode.next != head) {
            if (counter == position - 1) {
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
            counter++;
        }
    }

    public void deleteLastNode() {
        Node currentNode = head;

        if (head != null) {
            do {
                currentNode = currentNode.next;
                if (currentNode == head && currentNode == tail) {
                    currentNode = head;
                    currentNode.data = null;
                    currentNode.next = null;
                    head = null;
                    tail = null;
                    break;
                }
            } while (currentNode.next != tail);

            tail = currentNode;
            currentNode.next = head;
        } else {
            System.err.println("List is empty, deletion is not possible");
        }
    }

    public Object search(Object object) {
        Node currentNode = head;
        if (head != null) {
            while (!currentNode.data.equals(object)) {
                currentNode = currentNode.next;
                if (currentNode.next == head) {
                    break;
                }
            }
            if (currentNode.data.equals(object)) {
                return currentNode.data;
            } else {
                throw new NoSuchElementException(object.toString() + " is not present in the list");
            }
        } else {
            throw new NoSuchElementException("The list is empty, searching not possible");
        }

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        if (head != null && head.data != null) {
            System.out.println(head.data);
            Node currentNode = head.next;
            while (currentNode != head && currentNode != null && currentNode.data != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    class Node {
        private Node next;
        private Object data;

        public Node(Object dataForNode) {
            data = dataForNode;
        }
    }

    public static void main(String[] args) {
        SCLL scll = new SCLL();

        System.out.println("");
        System.out.println("Is list empty after initialization: " + scll.isEmpty());    // isEmpty

        scll.addNodeAtBeginning(1); // addNodeAtBeginning
        scll.addNodeAtEnd(2);       // addNodeAtEnd
        scll.addNodeAtEnd(3);
        scll.addNodeAtEnd(9);
        scll.addNodeAtPosition(4, 4);   // addNodeAtPosition

        System.out.println("");
        System.out.println("Is list empty after adding nodes: " + scll.isEmpty());

        System.out.println("");
        System.out.println("Display list ");
        scll.display();     // display

        scll.deleteLastNode();      // deleteLastNode
        System.out.println("");
        System.out.println("After deleting last node");
        scll.display();

        scll.deleteFirstNode();     // deleteFirstNode
        System.out.println("");
        System.out.println("After deleting first node");
        scll.display();

        scll.deleteAtPosition(2);
        System.out.println("");
        System.out.println("After deleting at position 2");
        scll.display();

        System.out.println("");
        System.out.println("Search for 4");
        System.out.println("Node found: " + scll.search(4));    // search
    }

}

