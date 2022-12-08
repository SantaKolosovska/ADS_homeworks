package ADS.hw1.singlyCircularlyLinkedList;

import java.util.Locale;

public class Main {

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

        System.out.println("Search for 11");
        System.out.println(scll.search(11));
    }
}
