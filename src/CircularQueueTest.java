// Learning Objective: Use a Circular Queue

import java.util.Scanner;

class CircularQueueTest {

    // Shows the user the choices for input
    public static void printChoices() {
        System.out.println("==================================\n" +
                "1 = Add an element to the back of the queue\n" +
                "2 = Remove the first element from the queue\n" +
                "3 = Check if the queue is empty\n" +
                "4 = Check if the queue is full\n" +
                "5 = Check the value of the element in the front of the queue\n" +
                "6 = Print the queue\n" +
                "Anything else = EXIT\n" +
                "==================================");
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("What size would you like the circular queue to be?");
        CircularQueue queue = new CircularQueue(cin.nextInt());
        boolean wantsToContinue = true;
        do {
            printChoices();
            String choice = cin.next();
            if (choice.compareTo("1") == 0) {
                System.out.println("What number would you like to add to the back of the queue?");
                int input = cin.nextInt();
                queue.enqueue(input);
            } else if (choice.compareTo("2") == 0) {
                System.out.println("You successfully removed " + queue.dequeue() + " from the queue.");
            } else if (choice.compareTo("3") == 0) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    System.out.println("The queue is not empty.");
                }
            } else if (choice.compareTo("4") == 0) {
                if (queue.isFull()) {
                    System.out.println("The queue is full.");
                } else {
                    System.out.println("The queue is not full.");
                }
            } else if (choice.compareTo("5") == 0) {
                System.out.println("The front of the queue is " + queue.peek() + ".");
            } else if (choice.compareTo("6") == 0) {
                queue.printQueue();
            } else {
                wantsToContinue = false;
            }
        } while (wantsToContinue);
        cin.close();
    }

}
