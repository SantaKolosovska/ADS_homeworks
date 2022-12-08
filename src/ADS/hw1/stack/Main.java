package ADS.hw1;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Display stack: ");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

        System.out.println("");
        System.out.println("Elements popped from stack: " + stack.pop().toString() + ", " + stack.pop().toString());
        System.out.println("Display stack after popping: ");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

        System.out.println("");
        System.out.println("Clear stack");
        stack.clear();
        System.out.println("Display stack after clear(): ");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println("");
        System.out.println("Stack after adding 7 elements");
        System.out.println("Display stack: ");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

    }
}
