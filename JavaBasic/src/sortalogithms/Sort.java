package sortlogithms;

public class Sort {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2, 6, 5, 7, 8};
        System.out.println();
        printArray(selectionSort(array));
        System.out.println();
        bubbleSort(array);
        System.out.println();
        insertSort(array);


    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                    int temp = array[i];
                    array[i] = array[minIdx];
                    array[minIdx] = temp;
                }
            }
        }
        return array;

    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        for (int i = 0; i <= n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIdx]) {
                    maxIdx = j;
                    int temp = array[maxIdx];
                    array[maxIdx] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
