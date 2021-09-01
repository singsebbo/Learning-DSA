// Learning Objective: Insertion Sort

class InsertionSort {

    // Performs insertion sort on an array
    static void insertionSort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int current = array[i];
            for (int j = i; j > 0; j--) {
                if (current < array[j - 1]) {
                    array[j] = array[j - 1];
                    array[j - 1] = current;
                }
            }
        }
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
        int[] array = new int[]{4, 7, 4, 3, 10, 17, 5, 7, 3, 12};
        insertionSort(array);
        printArray(array);
    }

}
