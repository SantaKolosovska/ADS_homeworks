package ADS.hw1.stack;

public class Stack {

    final static int MAX_ELEMENTS = 7;
    Object[] array = new Object[MAX_ELEMENTS];
    private static int currentPosition = 0;

    public void push(Object object) {
        if (currentPosition < MAX_ELEMENTS) {
            array[currentPosition] = object;
            currentPosition++;
        } else {
            System.err.println("Stack is full, insertion is not possible");
        }
    }

    public Object pop() {
        Object poppedObject = null;
        if (currentPosition==0) {
            System.err.println("Stack is empty");
        } else {
            poppedObject = array[currentPosition - 1];
            currentPosition--;
        }
        return poppedObject;
    }

    public boolean isEmpty() {
        if (currentPosition==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (currentPosition==MAX_ELEMENTS) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        String stackString = "";
        for (int i = 0; i < currentPosition; i++) {
            stackString = stackString + array[i].toString() + " ";
        }
        System.out.println(stackString);
    }

    public void clear() {
        currentPosition = 0;
    }

    public int size() {
        return currentPosition;
    }

    // test functionality
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("* Display stack *");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

        System.out.println("");
        System.out.println("* Elements popped from stack: " + stack.pop().toString() + ", " + stack.pop().toString() + " *");
        System.out.println("Display stack after popping: ");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

        System.out.println("");
        System.out.println("* Clear stack *");
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
        System.out.println("* Stack after adding 7 elements *");
        System.out.println("Display stack: ");
        stack.display();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

    }

}
