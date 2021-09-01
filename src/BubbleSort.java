// Learning Objective: Bubble Sort

class BubbleSort {

    // Performs bubble sort of an array
    static void bubbleSort(int[] array) {
        int size = array.length;
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    int current = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = current;
                }
            }
        } while (!sorted);
    }

    // Prints an array onto one line
    static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Array used for input
        int[] array = new int[]{9, 4, 7, 2, 5, 10, 6, 1};
        bubbleSort(array);
        printArray(array);
    }

}
