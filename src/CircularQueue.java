// Learning Objective: Implement a Circular Queue

class CircularQueue {

    private int size;
    private int front;
    private int rear;
    private int[] array;

    // Circular queue constructor
    CircularQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        array = new int[size];
    }

    // Add an element to the back of the queue
    public void enqueue(int input) {
        if (isFull()) {
            System.out.println("Cannot add an element to a full queue!");
            System.exit(1);
        } else if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        array[rear] = input;
    }

    // Remove and return an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot remove an element from an empty queue!");
            System.exit(1);
        } else if (front == rear) {
            int tempIndex = front;
            front = -1;
            rear = -1;
            return array[tempIndex];
        }
        front = (front + 1) % size;
        return array[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        if (front != -1) {
            return false;
        }
        return true;
    }

    // Check if the queue is full
    public boolean isFull() {
        if (front == 0 && rear + 1 == size || front == rear + 1) {
            return true;
        }
        return false;
    }

    // Returns the front value of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot check the value of the front of an empty queue!");
            System.exit(1);
        }
        return array[front];
    }

    // Print the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("There is nothing in the queue.");
        } else {
            System.out.println("");
            for (int i = front; i == rear; i = (i + 1) % size) {
                System.out.print(array[i] + " ");
            }
            System.out.print(array[rear]);
            System.out.println("");
        }
    }

}
