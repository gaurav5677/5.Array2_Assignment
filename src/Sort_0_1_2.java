//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
//        'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
//        Note:
//        You need to change in the given array/list itself. Hence, no need to return or print anything.
public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 2, 1, 0, 0, 0, 1, 2,};
        sortArray(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void sortArray(int[] arr) {
        int nextZero = 0;
        int nextTwo = arr.length - 1;
        int i = 0;
        while (i <= nextTwo) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;
                nextZero++;
            } else if (arr[i] == 2) {
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;

            } else {
                i++;
            }
        }
    }
}
