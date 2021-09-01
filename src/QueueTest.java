// Learning Objective: Use a Queue

import java.util.Scanner;

class QueueTest {

    // Prints the choices for input
    static void inputChoices() {
        System.out.println("================================\n" +
                "0 = Add an element to the back of the queue\n" +
                "1 = Remove the front element from the queue\n" +
                "2 = Check if the queue is empty\n" +
                "3 = Check the front of the queue\n" +
                "4 = Display the queue\n" +
                "Anything else = Exit\n" +
                "================================");
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Queue queue = new Queue();
        boolean wantsToContinue = true;
        do {
            inputChoices();
            String choice = cin.next();
            if (choice.compareTo("0") == 0) {
                System.out.println("What number would you like to add to the back of the queue?");
                int input = cin.nextInt();
                queue.enqueue(input);
            } else if (choice.compareTo("1") == 0) {
                System.out.println("You successfully removed " + queue.dequeue() + " from the queue.");
            } else if (choice.compareTo("2") == 0) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    System.out.println("The queue is not empty.");
                }
            } else if (choice.compareTo("3") == 0) {
                System.out.println("The front of the queue is " + queue.peek() + ".");
            } else if (choice.compareTo("4") == 0) {
                queue.printQueue();
            } else {
                wantsToContinue = false;
            }
        } while (wantsToContinue);
        cin.close();
    }

}
