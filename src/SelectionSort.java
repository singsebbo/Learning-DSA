// Learning Objective: Selection Sort

class SelectionSort {

    // Performs selection sort on an Array
    static void selectionSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int minimumIndex = i;
            for (int currentIndex = i; currentIndex < size; currentIndex++) {
                if (array[currentIndex] < array[minimumIndex]) {
                    minimumIndex = currentIndex;
                }
            }
            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
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
        int[] array = new int[]{9, 1, 10, 8, 3, 7, 5};
        selectionSort(array);
        printArray(array);
    }

}
