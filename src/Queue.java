// Learning Objective: Implementing a Queue

class Queue {

    private int size;
    private int front;
    private int rear;
    private int[] array;

    // Queue Constructor
    Queue() {
        size = 1000;
        front = -1;
        rear = -1;
        array = new int[size];
    }

    // Adds an element to the end of the queue
    public void enqueue(int input) {
        if (isEmpty()) {
            front = 0;
        }
        array[++rear] = input;
    }

    // Removes an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot remove element from an empty queue!");
            System.exit(1);
        } else if (front + 1 > rear) {
            int tempIndex = front;
            front = -1;
            rear = -1;
            return array[tempIndex];
        }
        return array[front++];
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    // Gets the value of the element at the front of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot get the value of the first element from an empty queue!");
            System.exit(1);
        }
        return array[front];
    }

    // Prints the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("There is nothing in the queue.");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        }
    }

}