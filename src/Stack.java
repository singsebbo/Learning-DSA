// Learning Objective: Implementing a Stack

class Stack {

    private int size;
    private int top;
    private int[] array;

    // Stack constructor
    Stack() {
        size = 1000;
        top = -1;
        array = new int[size];
    }

    // Adds to the top of the stack
    public void push(int input) {
        array[++top] = input;
    }

    // Returns and removes from the top of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Cannot remove from an empty stack!");
            System.exit(1);
        }
        return array[top--];
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    // Returns the top of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("There is nothing on the stack!");
            System.exit(1);
        }
        return array[top];
    }

    // Prints the stack
    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
