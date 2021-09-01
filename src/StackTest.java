// Learning Objective: Use a Stack

import java.util.Scanner;

class StackTest {

    // Prints the choices for input
    static void inputChoices() {
        System.out.println("================================\n" +
                "0 = Add an element to the stack\n" +
                "1 = Remove the top from the stack\n" +
                "2 = Check if the stack is empty\n" +
                "3 = Check the top of the stack\n" +
                "4 = Display the stack\n" +
                "Anything else = Exit\n" +
                "================================");
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Stack stack = new Stack();
        boolean wantsToContinue = true;
        do {
            inputChoices();
            String choice = cin.next();
            if (choice.compareTo("0") == 0) {
                System.out.println("What number would you like to add to the stack?");
                int input = cin.nextInt();
                stack.push(input);
            } else if (choice.compareTo("1") == 0) {
                System.out.println("You successfully removed " + stack.pop() + " from the stack.");
            } else if (choice.compareTo("2") == 0) {
                if (stack.isEmpty()) {
                    System.out.println("The stack is empty.");
                } else {
                    System.out.println("The stack is not empty.");
                }
            } else if (choice.compareTo("3") == 0) {
                System.out.println("The top of the stack is " + stack.peek() + ".");
            } else if (choice.compareTo("4") == 0) {
                stack.printStack();
            } else {
                wantsToContinue = false;
            }
        } while (wantsToContinue);
        cin.close();
    }

}
